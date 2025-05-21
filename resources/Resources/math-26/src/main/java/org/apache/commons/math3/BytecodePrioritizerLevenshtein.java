package org.apache.commons.math3;

import java.io.*;
import java.nio.file.*;
import java.util.*;

import org.objectweb.asm.util.Printer;

public class BytecodePrioritizerLevenshtein {
    private static final Set<String> IGNORED_OPCODES = new HashSet<>(Arrays.asList(
        "nop","return","ireturn","lreturn","freturn","dreturn","areturn",
        "astore_0","astore_1","astore_2","astore_3",
        "aload_0","aload_1","aload_2","aload_3"
    ));

    private static final Path COVERAGE_CSV = Paths.get( 
        "C:/Users/marya/Downloads/Resources/Resources/math.26f..branch.coverage.csv"
    );
    private static final Path BIN_DIR = Paths.get( 
        "C:/Users/marya/Downloads/Resources/Resources/math-26/bytecodebins"
    );
    private static final Path OUTPUT_CSV = Paths.get( 
        "C:/Users/marya/Downloads/Resources/Resources/math-26/fast_bytecode_levenshtein.csv"
    );

    private static final int SHINGLE_SIZE = 4;

    public static void main(String[] args) throws IOException {
        long start = System.nanoTime();

        Set<String> coverageTests = readCoverageTests();
        Map<String, List<String>> opcodeSeqs = readOpcodeSequences();

        for (String id : coverageTests) {
            opcodeSeqs.putIfAbsent(id, new ArrayList<>());
        }

        if (opcodeSeqs.isEmpty()) return;

        List<String> prioritized = runFastLevenshtein(opcodeSeqs);

        try (BufferedWriter w = Files.newBufferedWriter(OUTPUT_CSV)) {
            w.write("test_case\n");
            for (String tc : prioritized) {
                w.write(tc);
                w.newLine();
            }
        }

        double duration = (System.nanoTime() - start) / 1e9;
        System.out.printf("Levenshtein completed in %.3f seconds%n", duration);
    }

    private static Set<String> readCoverageTests() throws IOException {
        Set<String> tests = new LinkedHashSet<>();
        try (BufferedReader br = Files.newBufferedReader(COVERAGE_CSV)) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] parts = line.split(",");
                String tc = parts[0].trim().replace("\"", "");
                tests.add(tc);
            }
        }
        return tests;
    }

    private static Map<String, List<String>> readOpcodeSequences() throws IOException {
        Map<String, List<String>> map = new LinkedHashMap<>();
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(BIN_DIR, "*.bin")) {
            for (Path path : ds) {
                String fileKey = path.getFileName().toString().replace(".bin", "");
                String testId = fileKey.replace("__", "::");
                List<String> ops = new ArrayList<>();
                for (String line : Files.readAllLines(path)) {
                    for (String hex : line.trim().split("\\s+")) {
                        try {
                            int b = Integer.parseInt(hex, 16);
                            String name = Printer.OPCODES[b];
                            if (name != null && !name.startsWith("aload") && !name.startsWith("astore") && !"nop".equals(name)) {
                                ops.add(name);
                            }
                        } catch (NumberFormatException ignored) {}
                    }
                }
                map.put(testId, ops);
            }
        }
        return map;
    }

    private static List<String> runFastLevenshtein(Map<String, List<String>> seqMap) {
        List<String> pool = new ArrayList<>(seqMap.keySet());
        Collections.shuffle(pool);
        List<String> prioritized = new ArrayList<>();
        String first = pool.remove(0);
        prioritized.add(first);

        Map<String, Double> maxSim = new HashMap<>();
        for (String cand : pool) {
            maxSim.put(cand, levenshteinSimilarity(seqMap.get(cand), seqMap.get(first)));
        }

        while (!pool.isEmpty()) {
            String next = Collections.min(maxSim.entrySet(), Map.Entry.comparingByValue()).getKey();
            pool.remove(next);
            maxSim.remove(next);
            prioritized.add(next);

            for (String cand : pool) {
                double sim = levenshteinSimilarity(seqMap.get(cand), seqMap.get(next));
                maxSim.merge(cand, sim, Math::max);
            }
        }
        return prioritized;
    }

    private static double levenshteinSimilarity(List<String> a, List<String> b) {
        int dist = levenshteinDistance(a, b);
        int maxLen = Math.max(a.size(), b.size());
        return (maxLen == 0) ? 1.0 : 1.0 - (double) dist / maxLen;
    }

    private static int levenshteinDistance(List<String> a, List<String> b) {
        int n = a.size(), m = b.size();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) dp[i][0] = i;
        for (int j = 0; j <= m; j++) dp[0][j] = j;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a.get(i - 1).equals(b.get(j - 1))) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(
                        Math.min(dp[i - 1][j], dp[i][j - 1]),
                        dp[i - 1][j - 1]
                    );
                }
            }
        }
        return dp[n][m];
    }
}