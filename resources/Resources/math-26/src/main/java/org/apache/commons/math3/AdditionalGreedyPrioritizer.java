package org.apache.commons.math3;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class AdditionalGreedyPrioritizer {

    public static void main(String[] args) {
        String coverageCsv = 
            "C:/Users/marya/Downloads/Resources/Resources/math.26f..branch.coverage.csv";
        String outputCsv   = 
            "C:/Users/marya/Downloads/Resources/Resources/math-26/additional_greedy_prioritization.csv";

        long startTime = System.nanoTime();

        try {
         
            List<String> headerCols;
            List<Integer> branchCols = new ArrayList<>();
            try (BufferedReader reader = Files.newBufferedReader(Paths.get(coverageCsv))) {
                String headerLine = reader.readLine();
                if (headerLine == null) {
                    throw new IOException("Empty coverage file: " + coverageCsv);
                }
                headerCols = Arrays.asList(headerLine.split(",", -1));
                for (int i = 1; i < headerCols.size(); i++) {
                    branchCols.add(i);
                }
            }

            Map<String, Set<String>> coverageMap = new LinkedHashMap<>();
            try (BufferedReader reader = Files.newBufferedReader(Paths.get(coverageCsv))) {
                reader.readLine(); 
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.trim().isEmpty()) continue;
                    String[] parts = line.split(",", -1);
                    String testId = parts[0].replace("\"", "").trim();
                    Set<String> covered = new HashSet<>();
                    for (int idx : branchCols) {
                        if (idx < parts.length && !parts[idx].trim().isEmpty()) {
                            try {
                                double val = Double.parseDouble(parts[idx].trim());
                                if (val > 0) {
                                    covered.add(headerCols.get(idx).trim());
                                }
                            } catch (NumberFormatException ignored) {}
                        }
                    }
                    coverageMap.put(testId, covered);
                }
            }

  
            Set<String> uncovered = new HashSet<>();
            for (Set<String> cov : coverageMap.values()) {
                uncovered.addAll(cov);
            }

            List<String> remaining = new ArrayList<>(coverageMap.keySet());
            List<Result> ordering = new ArrayList<>();

            while (true) {
                String bestTest = null;
                int bestNew = 0;
                for (String test : remaining) {
                    Set<String> cov = new HashSet<>(coverageMap.get(test));
                    cov.retainAll(uncovered);
                    int newly = cov.size();
                    if (newly > bestNew) {
                        bestNew = newly;
                        bestTest = test;
                    }
                }
                if (bestTest == null || bestNew == 0) {
                    break;
                }
                ordering.add(new Result(bestTest, bestNew));
                remaining.remove(bestTest);
                uncovered.removeAll(coverageMap.get(bestTest));
            }

    
            remaining.sort((a, b) -> 
                Integer.compare(coverageMap.get(b).size(), coverageMap.get(a).size())
            );
            for (String test : remaining) {
                ordering.add(new Result(test, 0));
            }
            try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputCsv))) {
                writer.write("test_case,additional_coverage\n");
                for (Result r : ordering) {
                    writer.write(String.format("\"%s\",%d\n", r.testCase, r.additionalCoverage));
                }
            }

            System.out.println(" Output saved to: " + outputCsv);

        } catch (IOException e) {
            System.err.println(" Error during prioritization: " + e.getMessage());
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        double durationSeconds = (endTime - startTime) / 1_000_000_000.0;
        System.out.printf("️ Runtime: %.3f seconds%n", durationSeconds);
    }

    private static class Result {
        final String testCase;
        final int additionalCoverage;

        Result(String testCase, int additionalCoverage) {
            this.testCase = testCase;
            this.additionalCoverage = additionalCoverage;
        }
    }
}
