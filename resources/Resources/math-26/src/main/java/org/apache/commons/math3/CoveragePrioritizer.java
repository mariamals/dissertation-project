
package org.apache.commons.math3;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
public class CoveragePrioritizer {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
 
        String coverageCsv = "C:/Users/marya/Downloads/Resources/Resources/math.26f..branch.coverage.csv";
        String outputCsv = "C:/Users/marya/Downloads/Resources/Resources/math-26/coverage_prioritized.csv";
    
        try {
            List<Integer> branchCols = new ArrayList<>();
            List<String> headers;
            try (BufferedReader reader = Files.newBufferedReader(Paths.get(coverageCsv))) {
                String headerLine = reader.readLine();
                if (headerLine == null) {
                    System.err.println("Empty coverage file: " + coverageCsv);
                    return;
                }
                headers = Arrays.asList(headerLine.split(","));
                for (int i = 1; i < headers.size(); i++) {
                    branchCols.add(i);
                }
            }

            Map<String, Integer> coverageCount = new LinkedHashMap<>();
            try (BufferedReader reader = Files.newBufferedReader(Paths.get(coverageCsv))) {
                reader.readLine(); 
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.trim().isEmpty()) continue;
                    String[] parts = line.split(",", -1);
                    String testId = parts[0].replace("\"", "").trim();
                    int count = 0;
                    for (int idx : branchCols) {
                        if (idx < parts.length && !parts[idx].trim().isEmpty()) {
                            try {
                                if (Double.parseDouble(parts[idx].trim()) > 0) {
                                    count++;
                                }
                            } catch (NumberFormatException ignored) {}
                        }
                    }
                    coverageCount.put(testId, count);
                }
            }

       
            List<Map.Entry<String, Integer>> sorted = new ArrayList<>(coverageCount.entrySet());
            sorted.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));


            try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputCsv))) {
                writer.write("test_case,covered_branches\n");
                for (Map.Entry<String, Integer> e : sorted) {
                    writer.write(String.format("\"%s\",%d\n", e.getKey(), e.getValue()));
                }
            }

            System.out.println("coverage prioritization complete! Output: " + outputCsv);

        } catch (IOException ex) {
            System.err.println(" Error: " + ex.getMessage());
            ex.printStackTrace();
        }

    
        long endTime = System.nanoTime();
        double durationSeconds = (endTime - startTime) / 1_000_000_000.0;
        System.out.printf("Total runtime: %.3f seconds%n", durationSeconds);
    }
}
