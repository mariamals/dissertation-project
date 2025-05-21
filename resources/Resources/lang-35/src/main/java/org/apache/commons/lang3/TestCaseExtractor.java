package org.apache.commons.lang3;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class TestCaseExtractor {

    private static final Path COVERAGE_CSV = Paths.get(
        "C:/Users/marya/Downloads/Resources/Resources/lang.35f.branch.coverage.csv"
    );
    private static final Path BIN_DIR = Paths.get(
        "C:/Users/marya/Downloads/Resources/Resources/lang-35/bytecodebins"
    );
    private static final Path SRC_DIR = Paths.get(
        "C:/Users/marya/Downloads/Resources/Resources/lang-35/src/test/java"
    );
    private static final Path INPUT_TXT = Paths.get(
        "C:/Users/marya/Downloads/Resources/Resources/lang.35f.test-cases.txt"
    );
    private static final Path OUTPUT_CSV = Paths.get(
        "C:/Users/marya/Downloads/Resources/Resources/lang-35/parsed_test_cases.csv"
    );

    

        public static void main(String[] args) throws IOException {
           
            List<String> branches = new ArrayList<>();
            Map<String, CoverageInfo> coverageMap = readCoverage(COVERAGE_CSV, branches);
            List<TestInfo> tests = extractTestCases(INPUT_TXT, coverageMap);
    
            tests.sort(Comparator.comparing(t -> t.id));
            try (BufferedWriter w = Files.newBufferedWriter(OUTPUT_CSV)) {
              
                w.write("test_case");
                for (String b : branches) w.write("," + b);
                //rows
                w.write(",covered,total,coverage_percent,opcode_count,bytecode_hex\n");
               
                for (TestInfo t : tests) {
                    w.write("\"" + t.id + "\"");
    
                    int coveredCount = 0;
                    for (String b : branches) {
                        boolean hit = t.coverage.getOrDefault(b, 0.0) > 0;
                        w.write("," + (hit ? "1" : "0"));
                        if (hit) coveredCount++;
                    }
                    int totalBranches = branches.size();
                    w.write("," + coveredCount);
                    w.write("," + totalBranches);
                    w.write(String.format(",%.4f", totalBranches>0 ? (double)coveredCount/totalBranches : 0.0));
    
                    w.write("," + t.opcodeCount);
                    w.write(",\"" + t.bytecodeHex + "\"\n");
                }
            }
            System.out.println("Parsed " + tests.size() + " tests → " + OUTPUT_CSV);
        }
    
        private static Map<String, CoverageInfo> readCoverage(Path csv, List<String> branches) throws IOException {
            Map<String, CoverageInfo> map = new HashMap<>();
            try (BufferedReader r = Files.newBufferedReader(csv)) {
                String header = r.readLine();
                if (header == null) return map;
                String[] cols = header.split(",", -1);
                for (int i = 1; i < cols.length; i++) {
                    branches.add(cols[i].trim());
                }
                String line;
                while ((line = r.readLine()) != null) {
                    if (line.trim().isEmpty()) continue;
                    String[] parts = line.split(",", -1);
                    String id = parts[0].replace("\"","").trim();
                    Map<String, Double> cov = new HashMap<>();
                    for (int i = 1; i < parts.length && i <= branches.size(); i++) {
                        try {
                            cov.put(branches.get(i-1), Double.parseDouble(parts[i].trim()));
                        } catch (NumberFormatException ignored) {}
                    }
                    map.put(id, new CoverageInfo(cov));
                }
            }
            return map;
        }
    
        private static List<TestInfo> extractTestCases(
                Path txt, Map<String, CoverageInfo> coverageMap
        ) throws IOException {
            List<TestInfo> list = new ArrayList<>();
            try (BufferedReader r = Files.newBufferedReader(txt)) {
                String line, currentClass = null;
                while ((line = r.readLine()) != null) {
                    line = line.trim();
                    if (line.startsWith("Class name:")) {
                        currentClass = line.substring("Class name:".length()).trim();
                    } else if (line.startsWith("Method name:") && currentClass != null) {
                        String method = line.substring("Method name:".length()).trim();
                        String id = currentClass + "::" + method;
    
                      
                        CoverageInfo ci = coverageMap.getOrDefault(id, new CoverageInfo());
    
                    
                        Path bin = BIN_DIR.resolve(id.replace("::","__") + ".bin");
                        int opCount = 0;
                        StringBuilder hex = new StringBuilder();
                        if (Files.exists(bin)) {
                            for (String l : Files.readAllLines(bin)) {
                                for (String tok : l.trim().split("\\s+")) {
                                    if (!tok.isEmpty()) {
                                        hex.append(tok).append(' ');
                                        opCount++;
                                    }
                                }
                            }
                        }
    
                        list.add(new TestInfo(id, ci.coverage, opCount, hex.toString().trim()));
                    }
                }
            }
            return list;
        }
    
        private static class CoverageInfo {
            final Map<String, Double> coverage;
            CoverageInfo() { this.coverage = Collections.emptyMap(); }
            CoverageInfo(Map<String, Double> cov) { this.coverage = cov; }
        }
    
        private static class TestInfo {
            final String id;
            final Map<String, Double> coverage;
            final int opcodeCount;
            final String bytecodeHex;
            TestInfo(String id, Map<String, Double> coverage, int opCount, String hex) {
                this.id = id;
                this.coverage = coverage;
                this.opcodeCount = opCount;
                this.bytecodeHex = hex;
            }
        }
    }
    