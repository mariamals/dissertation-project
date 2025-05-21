
package org.apache.commons.math3;
import org.objectweb.asm.*;
import java.io.*;
import java.nio.file.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class BytecodeExtractor {
  
        private static final Path TEST_CLASSES_DIR = Paths.get(
            "C:\\Users\\marya\\Downloads\\Resources\\Resources\\math-26\\target\\test-classes\\org\\apache\\commons\\math3\\fraction"
        );
        private static final Path OUTPUT_BIN_DIR = Paths.get(
            "C:\\Users\\marya\\Downloads\\Resources\\Resources\\math-26\\bytecodebins"
        );
       
        private static final Set<String> WANTED_CLASSES =
        Collections.unmodifiableSet(new HashSet<>(Arrays.asList(
            "ClassUtilsTest",
            "ClassUtils_ESTest",
            "PatternOptionBuilderTest",
            "RegressionTest0",
            "RegressionTest1",
            "RegressionTest2",
            "RegressionTest3"
        )));
    
        public static void main(String[] args) throws IOException {
            
            Files.createDirectories(OUTPUT_BIN_DIR);
    
            try (Stream<Path> paths = Files.walk(TEST_CLASSES_DIR)) {
                paths
                    .filter(p -> p.toString().endsWith(".class"))
                    .forEach(BytecodeExtractor::processClassFile);
            }
    
            System.out.println(" Extraction complete " + OUTPUT_BIN_DIR);
        }
    
        private static void processClassFile(Path classFile) {
            String fileName = classFile.getFileName().toString();  
            String simpleName = fileName.replace(".class", "");
    
            if (!WANTED_CLASSES.contains(simpleName)) {
                return;
            }
    
            try (InputStream is = Files.newInputStream(classFile)) {
                ClassReader reader = new ClassReader(is);
                reader.accept(new MethodDumper(simpleName), 0);
            } catch (IOException e) {
                System.err.println(" Couldn’t read " + classFile + ": " + e.getMessage());
            }
        }
    
        private static class MethodDumper extends ClassVisitor {
            private final String className;
    
            MethodDumper(String className) {
                super(Opcodes.ASM9);
                this.className = className;
            }
    
            @Override
            public MethodVisitor visitMethod(int access, String methodName,
                                             String descriptor, String signature,
                                             String[] exceptions) {

                return new MethodVisitor(Opcodes.ASM9) {
                    private final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    
                    @Override
                    public void visitInsn(int opcode)      { buffer.write(opcode); }
                    @Override
                    public void visitIntInsn(int opcode, int operand) { buffer.write(opcode); }
                    @Override
                    public void visitVarInsn(int opcode, int var)     { buffer.write(opcode); }
                    @Override
                    public void visitTypeInsn(int opcode, String t)   { buffer.write(opcode); }
                    @Override
                    public void visitFieldInsn(int opcode, String o, String n, String d) {
                        buffer.write(opcode);
                    }
                    @Override
                    public void visitMethodInsn(int opcode, String owner, String name,
                                                String desc, boolean isInterface) {
                        buffer.write(opcode);
                    }
    
                    @Override
                    public void visitEnd() {
                        String safeMethod = methodName.replace("<", "_").replace(">", "_");
                        String outName = className + "__" + safeMethod + ".bin";
                        Path outFile = OUTPUT_BIN_DIR.resolve(outName);
    
                        try (BufferedWriter w = Files.newBufferedWriter(outFile)) {
                            byte[] bytes = buffer.toByteArray();
                            
                            for (byte b : bytes) {
                                w.write(String.format("%02X ", b));
                            }
                        } catch (IOException e) {
                            System.err.println("Failed writing " + outName + ": " + e.getMessage());
                        }
                    }
                };
            }
        }
    }
    