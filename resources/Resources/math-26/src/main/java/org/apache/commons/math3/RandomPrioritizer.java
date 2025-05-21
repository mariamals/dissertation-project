package org.apache.commons.math3;

import java.io.*;
import java.util.*;


public class RandomPrioritizer {
    private static final String PRASED_CSV =
        "C:/Users/marya/Downloads/Resources/Resources/math-26/parsed_test_cases.csv";
    private static final String OUTPUT_CSV =
        "C:/Users/marya/Downloads/Resources/Resources/math-26/random_prioritized.csv";
    public static void main(String[] args) throws IOException {
        long startTime = System.nanoTime();

   
        List<String> allTests = readCoverageTestNames(PRASED_CSV);
        System.out.println("Prased tests loaded: " + allTests.size());

        Collections.shuffle(allTests, new Random(System.currentTimeMillis()));


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_CSV))) {
            writer.write("test_case\n");
            for (String test : allTests) {
                writer.write(test + "\n");
            }
        }

        System.out.println("Random baseline ordering written to: " + OUTPUT_CSV);
        double duration = (System.nanoTime() - startTime) / 1_000_000_000.0;
        System.out.printf("Total runtime: %.3f seconds%n", duration);
    }

    private static List<String> readCoverageTestNames(String csvPath) throws IOException {
        List<String> tests = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(csvPath))) {
            reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String testCase = line.split(",", -1)[0].replace("\"", "").trim();
                    tests.add(testCase);
                }
            }
        }
        return tests;
    }
}
