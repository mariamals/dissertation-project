package org.apache.commons.lang3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class CoveragePrioritizer {

    public static void main(String[] args) throws IOException {
        long start = System.nanoTime();

        Path inputCsv  = Paths.get("C:/Users/marya/Downloads/Resources/Resources/lang-35/parsed_test_cases.csv");
        Path outputCsv = Paths.get("C:/Users/marya/Downloads/Resources/Resources/lang-35/coverage_prioritized.csv");

        try (BufferedReader reader = Files.newBufferedReader(inputCsv)) {
            String headerLine = reader.readLine();
            String[] headers = headerLine.split(",", -1);
            int pctIdx = -1;
            for (int i = 0; i < headers.length; i++) {
                if ("coverage_percent".equals(headers[i].trim())) {
                    pctIdx = i;
                    break;
                }
            }


            List<Map.Entry<String, Double>> list = new ArrayList<Map.Entry<String, Double>>();
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] parts = line.split(",", -1);
                String testId = parts[0].replace("\"", "").trim();
                double pct = 0.0;
                try {
                    pct = Double.parseDouble(parts[pctIdx]);
                } catch (NumberFormatException ignored) {}
                list.add(new AbstractMap.SimpleEntry<String, Double>(testId, pct));
            }

            list.sort(Comparator.<Map.Entry<String, Double>>comparingDouble(Map.Entry::getValue)
                .reversed()
                .thenComparing(Map.Entry::getKey)
            );

            try (BufferedWriter writer = Files.newBufferedWriter(outputCsv)) {
                writer.write("test_case,coverage_percent");
                writer.newLine();
                for (Map.Entry<String, Double> e : list) {
                    writer.write(String.format("\"%s\",%.4f", e.getKey(), e.getValue()));
                    writer.newLine();
                }
            }
        }

        double runtime = (System.nanoTime() - start) / 1_000_000_000.0;
        System.out.printf("Total runtime: %.3f seconds%n", runtime);
    }
}
