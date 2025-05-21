package org.apache.commons.lang3;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class TextualPrioritizerCosine {

    private static final Path TEXT_SRC_ROOT = Paths.get(
        "C:/Users/marya/Downloads/Resources/Resources/lang-35/src/test/java/org/apache/commons/lang3"
    );
    private static final Path PARSED_TESTS = Paths.get(
        "C:/Users/marya/Downloads/Resources/Resources/lang-35/parsed_test_cases.csv"
    );
    private static final Path OUTPUT_CSV = Paths.get(
        "C:/Users/marya/Downloads/Resources/Resources/lang-35/textual_prioritized.csv"
    );

    private static final int HASH_DIM = 2048;
    private static final int N_GRAM   = 2;

    public static void main(String[] args) throws IOException {
        long start = System.nanoTime();

        List<String> testCases = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(PARSED_TESTS)) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;
                testCases.add(line.split(",", 2)[0].replace("\"", "").trim());
            }
        }

        Map<String,BitSet> textBits = new LinkedHashMap<>();
        for (String tc : testCases) {
            String className = tc.split("::",2)[0] + ".java";
            Optional<Path> found = Files.walk(TEXT_SRC_ROOT)
                .filter(p -> p.getFileName().toString().equals(className))
                .findFirst();

            if (!found.isPresent()) {
                System.err.println("Missing source for " + tc + " (looking for " + className + ")");
                continue;
            }

            BitSet bits = new BitSet(HASH_DIM);
            Deque<String> window = new ArrayDeque<>(N_GRAM);

            for (String srcLine : Files.readAllLines(found.get())) {
                for (String tok : srcLine.split("\\W+")) {
                    if (tok.isEmpty()) continue;
                    window.addLast(tok);
                    if (window.size() == N_GRAM) {
                        StringBuilder sb = new StringBuilder();
                        for (String w : window) sb.append(w).append('_');
                        String gram = sb.substring(0, sb.length()-1);
                        int h = (gram.hashCode() & 0x7fffffff) % HASH_DIM;
                        bits.set(h);
                        window.removeFirst();
                    }
                }
            }

            textBits.put(tc, bits);
        }

        List<String> pool = new ArrayList<>(textBits.keySet());
        if (pool.isEmpty()) {
            System.err.println("No test sources found, aborting.");
            return;
        }

        Random rnd = new Random();
        String first = pool.remove(rnd.nextInt(pool.size()));

        List<String> ordered = new ArrayList<>();
        ordered.add(first);

        Map<String,Double> maxSim = new HashMap<>();
        BitSet fv = textBits.get(first);
        for (String t : pool) {
            maxSim.put(t, cosine(textBits.get(t), fv));
        }

        while (!maxSim.isEmpty()) {
            double min = Collections.min(maxSim.values());
            List<String> ties = new ArrayList<>();
            for (Map.Entry<String,Double> e : maxSim.entrySet()) {
                if (Double.compare(e.getValue(), min) == 0) ties.add(e.getKey());
            }
            String next = ties.get(rnd.nextInt(ties.size()));
            ordered.add(next);
            pool.remove(next);
            maxSim.remove(next);

            BitSet nv = textBits.get(next);
            for (String t : new ArrayList<>(pool)) {
                double sim = cosine(textBits.get(t), nv);
                maxSim.merge(t, sim, Math::max);
            }
        }

        try (BufferedWriter w = Files.newBufferedWriter(OUTPUT_CSV)) {
            w.write("test_case\n");
            for (String t : ordered) {
                w.write(t);
                w.newLine();
            }
        }

        System.out.printf("Textual Cosine completed in %.3f s%n",
            (System.nanoTime() - start) / 1e9);
    }

    private static double cosine(BitSet a, BitSet b) {
        BitSet c = (BitSet) a.clone();
        c.and(b);
        int dot = c.cardinality(), na = a.cardinality(), nb = b.cardinality();
        return (na == 0 || nb == 0)
            ? 0.0
            : dot / (Math.sqrt((double) na) * Math.sqrt((double) nb));
    }
}
