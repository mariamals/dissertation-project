package org.apache.commons.math3;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BytecodePrioritizerMinHash {

    private static final Path COVERAGE_CSV = Paths.get(
         "C:/Users/marya/Downloads/Resources/Resources/math.26f..branch.coverage.csv"
    );
    private static final Path BIN_DIR = Paths.get("C:/Users/marya/Downloads/Resources/Resources/math-26/bytecodebins"
    );
   private static final Path OUTPUT_CSV = Paths.get("C:/Users/marya/Downloads/Resources/Resources/math-26/fast_bytecode_minhash.csv"
    );

    private static final int SHINGLE_SIZE = 3;
    private static final int SIGNATURE_SIZE = 512;

    private static final Set<String> IGNORED_OPCODES = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(
        "nop", "return", "ireturn", "lreturn", "freturn", "dreturn", "areturn",
        "aload_0", "aload_1", "aload_2", "aload_3",
        "astore_0", "astore_1", "astore_2", "astore_3"
    )));

    public static void main(String[] args) throws IOException {
        long start = System.nanoTime();

        Set<String> wanted = readCoverage(COVERAGE_CSV);
        Map<String, List<String>> opcodeMap = loadOpcodeSequences(BIN_DIR, wanted);

        for (String id : wanted) {
            opcodeMap.putIfAbsent(id, new ArrayList<>());
        }

        if (opcodeMap.isEmpty()) return;

        Map<String, int[]> signatures = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : opcodeMap.entrySet()) {
            signatures.put(entry.getKey(), computeMinHash(entry.getValue()));
        }

        List<String> ordering = fastOrder(signatures);

        try (BufferedWriter writer = Files.newBufferedWriter(OUTPUT_CSV)) {
            writer.write("test_case\n");
            for (String id : ordering) {
                writer.write(id.replace("__", "::"));
                writer.newLine();
            }
        }

        double duration = (System.nanoTime() - start) / 1e9;
        System.out.printf("MinHash completed in %.3f seconds%n", duration);
    }

    private static Set<String> readCoverage(Path csv) throws IOException {
        Set<String> ids = new LinkedHashSet<>();
        try (BufferedReader br = Files.newBufferedReader(csv)) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String id = line.split(",", 2)[0].replace("\"", "").trim().replace("::", "__");
                ids.add(id);
            }
        }
        return ids;
    }

    private static Map<String, List<String>> loadOpcodeSequences(Path dir, Set<String> wanted) throws IOException {
        Map<String, List<String>> map = new LinkedHashMap<>();
        try (Stream<Path> files = Files.list(dir)) {
            List<Path> filtered = files
                .filter(p -> p.toString().endsWith(".bin"))
                .collect(Collectors.toList());

            for (Path path : filtered) {
                String id = path.getFileName().toString().replace(".bin", "");
                if (!wanted.contains(id)) continue;

                List<String> opcodes = Files.readAllLines(path).stream()
                    .flatMap(line -> Arrays.stream(line.trim().split("\\s+")).map(String::toLowerCase))
                    .filter(tok -> !tok.isEmpty() && !IGNORED_OPCODES.contains(tok))
                    .collect(Collectors.toList());

                map.put(id, opcodes);
            }
        }
        return map;
    }

    private static int[] computeMinHash(List<String> ops) {
        Set<String> shingles = new HashSet<>();
        for (int i = 0; i + SHINGLE_SIZE <= ops.size(); i++) {
            shingles.add(String.join("_", ops.subList(i, i + SHINGLE_SIZE)));
        }

        int[] sig = new int[SIGNATURE_SIZE];
        Arrays.fill(sig, Integer.MAX_VALUE);

        for (int i = 0; i < SIGNATURE_SIZE; i++) {
            int seed = i * 0x9e3779b9;
            for (String sh : shingles) {
                int hash = sh.hashCode() ^ seed;
                if (hash < sig[i]) sig[i] = hash;
            }
        }
        return sig;
    }

    private static List<String> fastOrder(Map<String, int[]> sigMap) {
        List<String> pool = new ArrayList<>(sigMap.keySet());
        Collections.shuffle(pool, new Random());
        List<String> ordered = new ArrayList<>();

        String first = pool.remove(0);
        ordered.add(first);

        Map<String, Double> maxSim = new HashMap<>();
        for (String test : pool) {
            maxSim.put(test, similarity(sigMap.get(test), sigMap.get(first)));
        }

        while (!pool.isEmpty()) {
            String next = Collections.min(maxSim.entrySet(), Map.Entry.comparingByValue()).getKey();
            pool.remove(next);
            maxSim.remove(next);
            ordered.add(next);
            for (String test : pool) {
                double sim = similarity(sigMap.get(test), sigMap.get(next));
                maxSim.merge(test, sim, Math::max);
            }
        }

        return ordered;
    }

    private static double similarity(int[] a, int[] b) {
        int match = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) match++;
        }
        return (double) match / a.length;
    }
}
