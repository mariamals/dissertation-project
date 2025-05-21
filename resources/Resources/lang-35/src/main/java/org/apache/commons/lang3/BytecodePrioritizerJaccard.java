package org.apache.commons.lang3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BytecodePrioritizerJaccard {

   
    private static final Path BIN_DIR = Paths.get(
        "C:/Users/marya/Downloads/Resources/Resources/lang-35/bytecodebins"
    );
  
    private static final Path COVERAGE_CSV = Paths.get(
        "C:/Users/marya/Downloads/Resources/Resources/lang-35/coverage_prioritized.csv"
    );
   
    private static final Path OUTPUT_CSV = Paths.get(
        "C:/Users/marya/Downloads/Resources/Resources/lang-35/fast_bytecode_jaccard.csv"
    );

    private static final int SHINGLE_SIZE = 4; // ,2, 3, 2, 1, i tried
    private static final int SIGNATURE_SIZE = 256;

    private static final Set<String> IGNORED_OPCODES = new HashSet<>(Arrays.asList(
        "nop", "return", "ireturn", "lreturn", "freturn", "dreturn", "areturn",
        "aload_0", "aload_1", "aload_2", "aload_3",
        "astore_0", "astore_1", "astore_2", "astore_3"
    ));

    public static void main(String[] args) throws IOException {
        long t0 = System.nanoTime();

        Set<String> wanted = readCoverage(COVERAGE_CSV);
        Map<String, Set<String>> shingleSets = loadShingles(BIN_DIR, wanted);
        Map<String, int[]> signatures = computeMinHashSignatures(shingleSets);

        List<String> prioritized = fastOrder(signatures);

        try (BufferedWriter writer = Files.newBufferedWriter(OUTPUT_CSV)) {
            writer.write("test_case\n");
            for (String id : prioritized) {
                writer.write(id.replace("__", "::"));
                writer.newLine();
            }
        }

        double duration = (System.nanoTime() - t0) / 1e9;
        System.out.printf("FAST-MinHash-Jaccard completed in %.3f seconds%n", duration);
    }

    private static Set<String> readCoverage(Path csv) throws IOException {
        Set<String> ids = new LinkedHashSet<>();
        try (BufferedReader br = Files.newBufferedReader(csv)) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String id = line.split(",", 2)[0]
                        .replace("\"", "")
                        .trim()
                        .replace("::", "__");
                    ids.add(id);
                }
            }
        }
        return ids;
    }

    private static Map<String, Set<String>> loadShingles(Path dir, Set<String> wanted) throws IOException {
        Map<String, Set<String>> map = new LinkedHashMap<>();

        try (Stream<Path> files = Files.list(dir)) {
            List<Path> binFiles = files
                .filter(f -> f.toString().endsWith(".bin"))
                .collect(Collectors.toList());

            for (Path p : binFiles) {
                String id = p.getFileName().toString().replace(".bin", "");
                if (!wanted.contains(id)) continue;

                List<String> ops = new ArrayList<>();
                for (String line : Files.readAllLines(p)) {
                    for (String tok : line.trim().split("\\s+")) {
                        tok = tok.toLowerCase().trim();
                        if (!tok.isEmpty() && !IGNORED_OPCODES.contains(tok)) {
                            ops.add(tok);
                        }
                    }
                }

                Set<String> sh = new HashSet<>();
                for (int i = 0; i + SHINGLE_SIZE <= ops.size(); i++) {
                    sh.add(String.join("_", ops.subList(i, i + SHINGLE_SIZE)));
                }

                map.put(id, sh);
            }
        }

        for (String id : wanted) {
            map.putIfAbsent(id, new HashSet<String>());
        }

        return map;
    }

    private static Map<String, int[]> computeMinHashSignatures(Map<String, Set<String>> sets) {
        Map<String, int[]> signatures = new LinkedHashMap<>();
        for (Map.Entry<String, Set<String>> entry : sets.entrySet()) {
            int[] sig = new int[SIGNATURE_SIZE];
            Arrays.fill(sig, Integer.MAX_VALUE);
            for (int i = 0; i < SIGNATURE_SIZE; i++) {
                int seed = i * 0x9e3779b9; 
                for (String token : entry.getValue()) {
                    int hash = token.hashCode() ^ seed;
                    if (hash < sig[i]) sig[i] = hash;
                }
            }
            signatures.put(entry.getKey(), sig);
        }
        return signatures;
    }

    private static List<String> fastOrder(Map<String, int[]> sigMap) {
        List<String> pool = new ArrayList<>(sigMap.keySet());
        Collections.shuffle(pool);
        List<String> ordered = new ArrayList<>();

        String first = pool.remove(0);
        ordered.add(first);

        Map<String, Double> maxSim = new HashMap<>();
        for (String t : pool)
            maxSim.put(t, jaccard(sigMap.get(t), sigMap.get(first)));

        while (!pool.isEmpty()) {
            String next = Collections.min(maxSim.entrySet(), Map.Entry.comparingByValue()).getKey();
            pool.remove(next);
            maxSim.remove(next);
            ordered.add(next);
            for (String t : pool) {
                double sim = jaccard(sigMap.get(t), sigMap.get(next));
                maxSim.put(t, Math.max(maxSim.get(t), sim));
            }
        }
        return ordered;
    }

    private static double jaccard(int[] a, int[] b) {
        int match = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) match++;
        }
        return (double) match / a.length;
    }
}
