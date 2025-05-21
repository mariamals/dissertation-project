package org.apache.commons.lang3;

import java.io.*;
import java.util.*;

public class APFDCalculator {

    
    private static final String MUTATION_CSV =
        "C:\\Users\\marya\\Downloads\\Resources\\Resources\\lang.35f.mutation.csv";

    private static final Map<String, String> PRIORITIZATION_PATHS = new LinkedHashMap<>();
    static {
        PRIORITIZATION_PATHS.put("Alphabetically",         "C:\\Users\\marya\\Downloads\\Resources\\Resources\\lang-35\\parsed_test_cases.csv");
        PRIORITIZATION_PATHS.put("Coverage",         "C:\\Users\\marya\\Downloads\\Resources\\Resources\\lang-35\\coverage_prioritized.csv");
        PRIORITIZATION_PATHS.put("Random",           "C:\\Users\\marya\\Downloads\\Resources\\Resources\\lang-35\\random_prioritized.csv");
        PRIORITIZATION_PATHS.put("AdditionalGreedy", "C:\\Users\\marya\\Downloads\\Resources\\Resources\\lang-35\\additional_greedy_prioritization.csv");
        PRIORITIZATION_PATHS.put("FASTMinHash",      "C:\\Users\\marya\\Downloads\\Resources\\Resources\\lang-35\\fast_bytecode_prioritized_minhash.csv");
        PRIORITIZATION_PATHS.put("FASTCosine",       "C:\\Users\\marya\\Downloads\\Resources\\Resources\\lang-35\\fast_bytecode_cosine.csv");
        PRIORITIZATION_PATHS.put("FASTJaccard",       "C:\\Users\\marya\\Downloads\\Resources\\Resources\\lang-35\\fast_bytecode_jaccard.csv");
        PRIORITIZATION_PATHS.put("FASTLevenshtein",       "C:\\Users\\marya\\Downloads\\Resources\\Resources\\lang-35\\fast_bytecode_leven.csv");
        PRIORITIZATION_PATHS.put("HybridGreedyFast", "C:\\Users\\marya\\Downloads\\Resources\\Resources\\lang-35\\hybrid_fast_minhash_prioritized.csv");
        PRIORITIZATION_PATHS.put("Textual",       "C:\\Users\\marya\\Downloads\\Resources\\Resources\\lang-35\\textual_prioritized.csv");
    }

    public static void main(String[] args) {
        try {
            Map<String,boolean[]> killMap = readMutationMatrix(MUTATION_CSV);
            int m = killMap.values().stream().findFirst().orElse(new boolean[0]).length;
            System.out.printf("Tests in mutation matrix: %d, Mutants: %d%n",
                              killMap.size(), m);

            for (java.util.Map.Entry<String, String> e : PRIORITIZATION_PATHS.entrySet()) {
                String name  = e.getKey();
                List<String> order = readPrioritizedTests(e.getValue());
                System.out.printf("%s prioritized tests loaded: %d%n",
                                  name, order.size());


                if ("Random".equalsIgnoreCase(name)) {
                    Collections.shuffle(order, new Random());
                }

                double apfd = computeAPFD(order, killMap, m);
                System.out.printf("%s APFD: %.6f%n", name, apfd);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static Map<String,boolean[]> readMutationMatrix(String csv)
            throws IOException {

        Map<String,boolean[]> map = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csv))) {
            String[] hdr = br.readLine().split(",", -1);
            int m = hdr.length - 1;

            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] raw = line.split(",", -1);
                String id = raw[0].replace("\"","").trim(); 
                boolean[] row = new boolean[m];
                int cols = Math.min(m, raw.length - 1);
                for (int j = 1; j <= cols; j++)
                    row[j-1] = "1".equals(raw[j].trim());
                map.put(id, row);
            }
        }
        return map;
    }

    
    private static List<String> readPrioritizedTests(String csv) throws IOException {
        List<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csv))) {
            br.readLine();                        
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                list.add(line.split(",",2)[0].replaceAll("^\"|\"$","").trim());
            }
        }
        return list;
    }

    private static double computeAPFD(List<String> ordered,
                                      Map<String,boolean[]> killMap,
                                      int m) {

        
        List<String> filtered = new ArrayList<>();
        for (String id : ordered) {
            boolean[] row = killMap.get(id);
            if (row != null) {
                for (boolean b : row) {             
                    if (b) { filtered.add(id); break; }
                }
            }
        }

        int n = filtered.size();
        if (n == 0 || m == 0) return Double.NaN;

        int[] first = new int[m];
        Arrays.fill(first, n);

        for (int i = 0; i < n; i++) {
            boolean[] row = killMap.get(filtered.get(i));
            for (int j = 0; j < m; j++)
                if (row[j] && first[j] == n) first[j] = i + 1;
        }

        long sum = 0;
        for (int pos : first) sum += pos;
        return 1.0 - (double) sum / (n * m) + 1.0 / (2 * n);
    }
}

