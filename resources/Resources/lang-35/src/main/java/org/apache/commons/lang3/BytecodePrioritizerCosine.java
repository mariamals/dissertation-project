package org.apache.commons.lang3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class BytecodePrioritizerCosine {


    private static final Path PARSED_TESTS = Paths.get(
        "C:/Users/marya/Downloads/Resources/Resources/lang-35/parsed_test_cases.csv"
    );
    private static final Path BIN_FOLDER   = Paths.get(
        "C:/Users/marya/Downloads/Resources/Resources/lang-35/bytecodebins"
    );
    private static final Path OUTPUT_CSV   = Paths.get(
        "C:/Users/marya/Downloads/Resources/Resources/lang-35/fast_bytecode_cosine.csv"
    );

    private static final int HASH_DIM = 2048;   
    private static final int N_GRAM    = 3;      

   
    private static final Set<String> IGNORE = new HashSet<String>(Arrays.asList(
        "nop","return","ireturn","lreturn","freturn","dreturn","areturn",
        "astore_0","astore_1","astore_2","astore_3",
        "aload_0","aload_1","aload_2","aload_3"
    ));


    public static void main(String[] args) throws IOException {

        long start = System.nanoTime();

     
        List<String> ids = readTestIds();
        Map<String,BitSet> bytecodeVectors = buildBytecodeVectors(ids);
        List<String> ordering = fastOrder(bytecodeVectors);

        BufferedWriter writer = Files.newBufferedWriter(OUTPUT_CSV);
        writer.write("test_case");
        writer.newLine();
        for (String id : ordering) {
            writer.write(id);
            writer.newLine();
        }
        writer.close();

        double secs = (System.nanoTime() - start) / 1e9;
        System.out.printf("Bytecode finished in %.3f s%n", secs);
    }

  

    private static List<String> readTestIds() throws IOException {
        List<String> list = new ArrayList<String>();
        BufferedReader br = Files.newBufferedReader(PARSED_TESTS);
        br.readLine(); 
        String line;
        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) {
                continue;
            }
            String id = line.split(",", 2)[0].replace("\"", "").trim();
            list.add(id);
        }
        br.close();
        return list;
    }


    private static Map<String,BitSet> buildBytecodeVectors(List<String> ids) throws IOException {
        Map<String,BitSet> map = new LinkedHashMap<String,BitSet>();
        for (String id : ids) {
            String safeId = id.replace("::", "__");
            Path bin = BIN_FOLDER.resolve(safeId + ".bin");

            BitSet bits = new BitSet(HASH_DIM);
            if (Files.exists(bin)) {
                Deque<String> window = new ArrayDeque<String>(N_GRAM);
                List<String> lines = Files.readAllLines(bin);
                for (String line : lines) {
                    String[] toks = line.trim().split("\\s+");
                    for (String tok : toks) {
                        String op = tok.toLowerCase();
                        if (IGNORE.contains(op)) {
                            continue;
                        }
                        window.addLast(op);
                        if (window.size() == N_GRAM) {
                            StringBuilder sb = new StringBuilder();
                            for (String w : window) {
                                sb.append(w).append("_");
                            }
                            String gram = sb.substring(0, sb.length() - 1);
                            int h = (gram.hashCode() & 0x7fffffff) % HASH_DIM;
                            bits.set(h);
                            window.removeFirst();
                        }
                    }
                }
            }
            map.put(id, bits);  
        }
        return map;
    }

    private static List<String> fastOrder(Map<String,BitSet> vec) {
        List<String> pool = new ArrayList<String>(vec.keySet());
        Random rnd = new Random(System.nanoTime());
        int idx = rnd.nextInt(pool.size());
        String first = pool.remove(idx);

        List<String> ord = new ArrayList<String>();
        ord.add(first);

        Map<String,Double> maxSim = new HashMap<String,Double>();
        BitSet fv = vec.get(first);
        for (String t : pool) {
            maxSim.put(t, cosine(vec.get(t), fv));
        }

        while (!pool.isEmpty()) {
            double min = Double.MAX_VALUE;
            for (Map.Entry<String,Double> e : maxSim.entrySet()) {
                if (e.getValue() < min) {
                    min = e.getValue();
                }
            }

            List<String> ties = new ArrayList<String>();
            for (Map.Entry<String,Double> e : maxSim.entrySet()) {
                if (Double.compare(e.getValue(), min) == 0) {
                    ties.add(e.getKey());
                }
            }

            String next = ties.get(rnd.nextInt(ties.size()));
            ord.add(next);
            pool.remove(next);
            maxSim.remove(next);

            BitSet nv = vec.get(next);
            for (String t : pool) {
                double s = cosine(vec.get(t), nv);
                double prev = maxSim.get(t);
                if (s > prev) {
                    maxSim.put(t, s);
                }
            }
        }

        return ord;
    }

    private static double cosine(BitSet a, BitSet b) {
        BitSet c = (BitSet) a.clone();
        c.and(b);
        int dot = c.cardinality();
        int na  = a.cardinality();
        int nb  = b.cardinality();
        if (na == 0 || nb == 0) {
            return 0.0;
        }
        return dot / (Math.sqrt((double) na) * Math.sqrt((double) nb));
    }
}
