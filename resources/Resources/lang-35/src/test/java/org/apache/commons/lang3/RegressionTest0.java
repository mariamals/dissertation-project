package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        long[] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray3 = org.apache.commons.lang3.ArrayUtils.add(longArray0, (-1), (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        float[] floatArray0 = null;
        java.lang.Float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray0);
        org.junit.Assert.assertNull(floatArray1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int[] intArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.Object[] objArray0 = null;
        java.lang.Object[] objArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isSameLength(objArray0, objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray6, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, true, false]");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray0, (-1), (int) (short) 10);
        org.junit.Assert.assertNull(booleanArray3);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.ArrayUtils.subarray(strArray0, 1, 1);
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        short[] shortArray2 = new short[] { (short) 1, (short) 100 };
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray2);
        short[] shortArray4 = null;
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray2, shortArray4);
        java.lang.Short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray4);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(shortArray6);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        boolean[] booleanArray0 = new boolean[] {};
        boolean[] booleanArray1 = new boolean[] {};
        boolean[] booleanArray2 = new boolean[] {};
        boolean[][] booleanArray3 = new boolean[][] { booleanArray0, booleanArray1, booleanArray2 };
        boolean[] booleanArray5 = new boolean[] {};
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, false, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean[][] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray3, (-1), booleanArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[]");
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[]");
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        double[] doubleArray0 = null;
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.lang.Integer[] intArray0 = null;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, (int) '#');
        org.junit.Assert.assertNull(intArray2);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray3 = org.apache.commons.lang3.ArrayUtils.remove(longArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean[] booleanArray7 = new boolean[] {};
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray7, false, 0);
        java.lang.Boolean[] booleanArray15 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray15, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray17);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray7, booleanArray17);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray19);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray19, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, (int) '#', (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        float[] floatArray3 = new float[] {};
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, 0.0f);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray3, (float) (byte) -1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray0, floatArray3);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.remove(floatArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        short[] shortArray0 = null;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        org.junit.Assert.assertNull(shortArray1);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        int[] intArray6 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.clone(intArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(intArray7, (int) (short) 0);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(intArray7, 100);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        int[] intArray0 = null;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 10);
        org.junit.Assert.assertNull(intArray2);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        byte[] byteArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        char[] charArray3 = new char[] { '4', '#', 'a' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.subarray(charArray3, 0, (int) (byte) 1);
        char[] charArray12 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.clone(charArray12);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray12);
        java.lang.Class<?> wildcardClass15 = charArray6.getClass();
        char[] charArray19 = new char[] { '4', '#', 'a' };
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.subarray(charArray19, 0, (int) (byte) 1);
        char[] charArray28 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.clone(charArray28);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.addAll(charArray22, charArray28);
        java.lang.Class<?> wildcardClass31 = charArray22.getClass();
        char[] charArray35 = new char[] { '4', '#', 'a' };
        char[] charArray38 = org.apache.commons.lang3.ArrayUtils.subarray(charArray35, 0, (int) (byte) 1);
        char[] charArray44 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray45 = org.apache.commons.lang3.ArrayUtils.clone(charArray44);
        char[] charArray46 = org.apache.commons.lang3.ArrayUtils.addAll(charArray38, charArray44);
        java.lang.Class<?> wildcardClass47 = charArray38.getClass();
        char[] charArray51 = new char[] { '4', '#', 'a' };
        char[] charArray54 = org.apache.commons.lang3.ArrayUtils.subarray(charArray51, 0, (int) (byte) 1);
        char[] charArray60 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray61 = org.apache.commons.lang3.ArrayUtils.clone(charArray60);
        char[] charArray62 = org.apache.commons.lang3.ArrayUtils.addAll(charArray54, charArray60);
        java.lang.Class<?> wildcardClass63 = charArray54.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray64 = new java.lang.reflect.AnnotatedElement[] { wildcardClass15, wildcardClass31, wildcardClass47, wildcardClass63 };
        boolean boolean65 = org.apache.commons.lang3.ArrayUtils.isEmpty(annotatedElementArray64);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, #, a]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4, #, a]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "4a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "4a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[4, a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[4, #, a]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[4]");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "4a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "4a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[4, a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[4, #, a]");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[4]");
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), "4a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), "4a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[4, a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(annotatedElementArray64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) '4', (int) (byte) 10);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) (byte) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.remove(byteArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        char[] charArray3 = new char[] { '4', '#', 'a' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.subarray(charArray3, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 4, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, #, a]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        float[] floatArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) (byte) 1);
        float[] floatArray10 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray10);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) 0, 0);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray0, 10.0f, (int) '4');
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        long[] longArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        byte[][] byteArray0 = new byte[][] {};
        byte[] byteArray3 = new byte[] { (byte) 100 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray3, (int) '4', (int) (byte) 10);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray3, (int) (byte) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[][] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray0, 10, byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, 0L);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.clone(longArray1);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray6 = org.apache.commons.lang3.ArrayUtils.remove(longArray4, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        int[] intArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 1 };
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray2, (java.lang.Object) 1L);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        java.lang.Object[] objArray7 = org.apache.commons.lang3.ArrayUtils.toArray((java.lang.Object[]) byteArray2);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray7, (java.lang.Object) 1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, 0L);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.add(longArray1, (long) 10);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray7 = org.apache.commons.lang3.ArrayUtils.remove(longArray5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10]");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.lang.Byte[] byteArray0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray0);
        org.junit.Assert.assertNull(byteArray1);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) (byte) -1);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray0, (float) 100L);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray6);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.add(booleanArray6, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, true, false, true]");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        char[] charArray0 = null;
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        org.junit.Assert.assertNull(charArray1);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        int[] intArray0 = null;
        int[] intArray7 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.clone(intArray7);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray8, 10, 4);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray8);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 10, -1, 0, 1, 35]");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        short[] shortArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray0, (short) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        int[] intArray6 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.clone(intArray6);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray7, 10, 4);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray7, (int) (byte) 0, (int) (short) 100);
        java.lang.Boolean[] booleanArray18 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray18, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray20);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) int13, (java.lang.Object) booleanArray20);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        short[] shortArray0 = null;
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray0);
        org.junit.Assert.assertNull(shortArray1);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        boolean[] booleanArray0 = null;
        java.lang.Boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray0);
        org.junit.Assert.assertNull(booleanArray1);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        float[] floatArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.lang.String[] strArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = org.apache.commons.lang3.ArrayUtils.remove(strArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        float[] floatArray0 = null;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) (short) -1);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) (short) 10);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.remove(byteArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray3 = org.apache.commons.lang3.ArrayUtils.add(charArray0, (int) (byte) 10, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        byte[] byteArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray8, false);
        boolean[] booleanArray11 = new boolean[] {};
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, false, 0);
        java.lang.Boolean[] booleanArray19 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray19, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray21);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray11, booleanArray21);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray10, booleanArray23);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray23);
        java.lang.Boolean[] booleanArray30 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray30, false);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray30, false);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray34);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray23, booleanArray34);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray39 = org.apache.commons.lang3.ArrayUtils.add(booleanArray34, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (int) (short) 0, 0);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.add(byteArray9, (byte) 10);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray9, (byte) 0, (int) (byte) 100);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray9, (byte) 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 0, 10, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[] longArray7 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[] longArray15 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[] longArray19 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[][] longArray20 = new java.lang.Long[][] { longArray3, longArray7, longArray11, longArray15, longArray19 };
        java.lang.Long[] longArray21 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[][] longArray22 = org.apache.commons.lang3.ArrayUtils.add(longArray20, longArray21);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray21);
        java.lang.Class<?> wildcardClass24 = longArray23.getClass();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        float[] floatArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray0, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.String str1 = org.apache.commons.lang3.ArrayUtils.toString(obj0);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        boolean[] booleanArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.lang.Double[] doubleArray0 = new java.lang.Double[] {};
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray3);
        double[] doubleArray6 = new double[] { 100.0d };
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, (double) 10.0f);
        double[] doubleArray11 = new double[] { 3, 4 };
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray6, doubleArray11);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray11, (double) 10.0f, 0, 0.0d);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray11);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray19 = org.apache.commons.lang3.ArrayUtils.add((java.lang.Object[]) doubleArray0, 0, (java.lang.Object) doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: array element type mismatch");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[3.0, 4.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[3.0, 4.0]");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.lang.String[] strArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        java.util.Map<java.lang.Object, java.lang.Object> objMap1 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) strArray0);
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(objMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.Object[] objArray0 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap1 = org.apache.commons.lang3.ArrayUtils.toMap(objArray0);
        org.junit.Assert.assertNull(objMap1);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) (byte) -1);
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) int4, obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        int[] intArray6 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.clone(intArray6);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.add(intArray6, (int) (byte) 0, (int) (byte) 1);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.remove(intArray6, (int) (short) 1);
        int[] intArray13 = null;
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray12, intArray13);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) (short) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.lang.Object[] objArray0 = null;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray1, (int) '#', 0);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(objArray0, (java.lang.Object) 0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.add(booleanArray0, true);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, (int) (short) 0);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[true]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        short[] shortArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray0, (short) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        double[] doubleArray0 = null;
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, (double) (-1), (double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        long[] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray2 = org.apache.commons.lang3.ArrayUtils.remove(longArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.io.Serializable[] serializableArray0 = null;
        java.io.Serializable[] serializableArray1 = org.apache.commons.lang3.ArrayUtils.clone(serializableArray0);
        org.junit.Assert.assertNull(serializableArray1);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        float[] floatArray0 = null;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray0, (float) (short) 100);
        org.junit.Assert.assertNull(floatArray2);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        double[] doubleArray3 = new double[] { 'a', 10, 1.0d };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (short) 0, (double) 10.0f);
        double[] doubleArray7 = null;
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray7);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.add(doubleArray3, (int) '4', (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[97.0, 10.0, 1.0]");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) (byte) 1);
        float[] floatArray10 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray10);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray10, (int) (short) 1, (int) '#');
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(floatArray10, (float) 4);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        int[] intArray2 = new int[] { 'a', (byte) 0 };
        int[] intArray5 = new int[] { 'a', (byte) 0 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        int[] intArray13 = new int[] { (short) 1, '#', 'a', (byte) 100, (short) 1, ' ' };
        int[] intArray20 = new int[] { (short) 1, '#', 'a', (byte) 100, (short) 1, ' ' };
        int[] intArray27 = new int[] { (short) 1, '#', 'a', (byte) 100, (short) 1, ' ' };
        int[][] intArray28 = new int[][] { intArray13, intArray20, intArray27 };
        int[][] intArray29 = org.apache.commons.lang3.ArrayUtils.addAll(intArray6, intArray28);
        int[] intArray36 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray37 = org.apache.commons.lang3.ArrayUtils.clone(intArray36);
        int[] intArray40 = org.apache.commons.lang3.ArrayUtils.add(intArray36, (int) (byte) 0, (int) (byte) 1);
        int[] intArray47 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray48 = org.apache.commons.lang3.ArrayUtils.clone(intArray47);
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.contains(intArray48, (int) (short) 0);
        int[] intArray52 = org.apache.commons.lang3.ArrayUtils.add(intArray48, (int) 'a');
        int[] intArray53 = org.apache.commons.lang3.ArrayUtils.clone(intArray48);
        int[] intArray54 = org.apache.commons.lang3.ArrayUtils.addAll(intArray36, intArray53);
        int[][] intArray55 = org.apache.commons.lang3.ArrayUtils.add(intArray28, intArray53);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap56 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) intArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '[I@a4e2199', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[97, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 35, 97, 100, 1, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 35, 97, 100, 1, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 35, 97, 100, 1, 32]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[1, 1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[1, 10, -1, 0, 1, 35, 97]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1, 10, -1, 0, 1, 35, 1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray55);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        int[] intArray6 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.clone(intArray6);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.add(intArray6, (int) (byte) 0, (int) (byte) 1);
        int[] intArray17 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.clone(intArray17);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray6, intArray17);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray17, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        char[] charArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(charArray0, ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.lang.Double[] doubleArray0 = null;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { false, true };
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2, false);
        char[] charArray8 = new char[] { '4', '#', 'a' };
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.subarray(charArray8, 0, (int) (byte) 1);
        char[] charArray17 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.clone(charArray17);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.addAll(charArray11, charArray17);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray11, '#');
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray2, (java.lang.Object) charArray11, 0);
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.subarray(charArray11, 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray29 = org.apache.commons.lang3.ArrayUtils.add(charArray26, (int) ' ', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #, a]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4, a, #, #, 4, #]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[]");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = org.apache.commons.lang3.ArrayUtils.remove(intArray0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        int[] intArray6 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.clone(intArray6);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.add(intArray6, (int) (byte) 0, (int) (byte) 1);
        java.lang.String str12 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray6, "");
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray6, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{1,10,-1,0,1,35}" + "'", str12, "{1,10,-1,0,1,35}");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 10, -1, 1, 35]");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray8, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray10);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray10);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray10, true, 0);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray10, false);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, true, false, true]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.lang.Short[] shortArray6 = new java.lang.Short[] { (short) -1, (short) 100, (short) -1, (short) 0, (short) 100, (short) 1 };
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.remove(shortArray8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[-1, 100, -1, 0, 100, 1]");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        char[] charArray5 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.clone(charArray5);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(charArray5, '4');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.clone(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray11 = org.apache.commons.lang3.ArrayUtils.remove(charArray9, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, #, #, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, #, 4, #]");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) '4', (int) (byte) 10);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray1, (byte) 0);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        java.lang.Class<?> wildcardClass8 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) (byte) 1);
        float[] floatArray10 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray10);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray10, (int) (short) 1, (int) '#');
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.clone(floatArray10);
        float[] floatArray16 = new float[] {};
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.add(floatArray16, 0.0f);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(floatArray16, (float) (byte) 1);
        float[] floatArray26 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray16, floatArray26);
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray26, (int) (short) 1, (int) '#');
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.clone(floatArray26);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray10, floatArray31);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray10, (float) 10);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray37 = org.apache.commons.lang3.ArrayUtils.add(floatArray10, (int) ' ', 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[0.0, 0.0, 100.0, -1.0, 35.0]");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray6, false);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, true, false]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        short[] shortArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        int[] intArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) (byte) 1);
        float[] floatArray10 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray10);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray10, (int) (short) 1, (int) '#');
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.clone(floatArray10);
        float[] floatArray16 = new float[] {};
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.add(floatArray16, 0.0f);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(floatArray16, (float) (byte) 1);
        float[] floatArray26 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray16, floatArray26);
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray26, (int) (short) 1, (int) '#');
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.clone(floatArray26);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray10, floatArray31);
        int int34 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray31, (float) '#');
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) (byte) 1);
        float[] floatArray10 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray10);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray10, (int) (short) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[0.0, 100.0, -1.0, 35.0]");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 100.0d };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray2, (double) 10.0f);
        double[] doubleArray7 = new double[] { 3, 4 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray2, doubleArray7);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray7, (double) 10.0f, 0, 0.0d);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray7);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray7);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray7, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { false, true };
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2, false);
        char[] charArray8 = new char[] { '4', '#', 'a' };
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.subarray(charArray8, 0, (int) (byte) 1);
        char[] charArray17 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.clone(charArray17);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.addAll(charArray11, charArray17);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray11, '#');
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray2, (java.lang.Object) charArray11, 0);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2);
        java.lang.Byte[] byteArray27 = new java.lang.Byte[] { (byte) 0, (byte) 1 };
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray27);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray27);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray30);
        double[] doubleArray33 = new double[] { 100.0d };
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray33, (double) 10.0f);
        double[] doubleArray38 = new double[] { 3, 4 };
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray33, doubleArray38);
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray38, (double) 10.0f, 0, 0.0d);
        double[] doubleArray44 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray38);
        double[] doubleArray45 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray30, doubleArray38);
        long[] longArray47 = new long[] {};
        long[] longArray48 = org.apache.commons.lang3.ArrayUtils.clone(longArray47);
        int int50 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray48, 0L);
        long[] longArray51 = org.apache.commons.lang3.ArrayUtils.clone(longArray48);
        long[] longArray52 = null;
        long[] longArray53 = org.apache.commons.lang3.ArrayUtils.addAll(longArray51, longArray52);
        java.lang.Object[] objArray54 = org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY;
        byte[] byteArray56 = new byte[] { (byte) 100 };
        byte[] byteArray59 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray56, (int) '4', (int) (byte) 10);
        byte[] byteArray62 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray56, (int) (byte) 100, (int) (byte) 0);
        java.lang.Byte[] byteArray63 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray62);
        int int64 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) byteArray62);
        int int65 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray54, (java.lang.Object) byteArray62);
        java.lang.Byte[] byteArray66 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray62);
        java.lang.Object[] objArray67 = new java.lang.Object[] { booleanArray2, byteArray29, doubleArray45, 1L, longArray52, byteArray66 };
        java.lang.Object obj68 = null;
        boolean boolean69 = org.apache.commons.lang3.ArrayUtils.contains(objArray67, obj68);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #, a]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4, a, #, #, 4, #]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, true]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 1]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 1]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[3.0, 4.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[3.0, 4.0]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[100]");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[]");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[]");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[[false, true], [0, 1], [3.0, 4.0], 1, null, []]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        float[] floatArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        short[] shortArray2 = new short[] { (short) 1, (short) 100 };
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray2);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray2, (short) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.remove(shortArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        long[] longArray0 = null;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.add(longArray0, 100L);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(longArray0, 0L);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        double[] doubleArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.lang.Float[] floatArray0 = null;
        float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0);
        org.junit.Assert.assertNull(floatArray1);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) (byte) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.lang.Short[] shortArray6 = new java.lang.Short[] { (short) -1, (short) 100, (short) -1, (short) 0, (short) 100, (short) 1 };
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6, (short) 100);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray8, (short) 1);
        java.lang.Short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray8);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.add(shortArray8, (-1), (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[-1, 100, -1, 0, 100, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(shortArray11);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean[] booleanArray14 = new boolean[] { true, false, true, true, false };
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray14, false);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) false, (java.lang.Object) boolean16);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, false, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) '4', (int) (byte) 10);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray1, (byte) 0);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.remove(byteArray1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100]");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        long[] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray3 = org.apache.commons.lang3.ArrayUtils.add(longArray0, 5, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        int[] intArray0 = null;
        int[] intArray1 = org.apache.commons.lang3.ArrayUtils.clone(intArray0);
        org.junit.Assert.assertNull(intArray1);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray8, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray10);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray10);
        java.lang.Boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray0);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray13, true);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) booleanArray15, (java.lang.Object) 0.0f);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        double[] doubleArray3 = new double[] { 'a', 10, 1.0d };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (short) 0, (double) 10.0f);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, 0.0d);
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        char[] charArray3 = new char[] { '4', '#', 'a' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.subarray(charArray3, 0, (int) (byte) 1);
        char[] charArray7 = null;
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray3, charArray7);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, #, a]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.remove(floatArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        char[] charArray5 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.clone(charArray5);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray5, (int) (short) 0, '4');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray11 = org.apache.commons.lang3.ArrayUtils.remove(charArray9, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, #, #, 4, #]");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        boolean[] booleanArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, true, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        long[] longArray0 = null;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray0, (long) (short) 10);
        org.junit.Assert.assertNull(longArray2);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        short[] shortArray2 = new short[] { (byte) 1, (short) 0 };
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray2, (short) (byte) 10);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray2, (short) 0);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.remove(shortArray6, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[1, 1]");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        char[] charArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray0, 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, (long) '#');
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray3, (long) '4', 1);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_ARRAY;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.add(booleanArray0, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        double[] doubleArray1 = new double[] { 100.0d };
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) 10.0f);
        double[] doubleArray6 = new double[] { 3, 4 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray6);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, (double) 10.0f, 0, 0.0d);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray6, (double) (byte) -1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray2 = org.apache.commons.lang3.ArrayUtils.remove(charArray0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 1L, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 1 };
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 1]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        double[] doubleArray3 = new double[] { 'a', 10, 1.0d };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (short) 0, (double) 10.0f);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, 0.0d);
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray9, (double) 5);
        java.lang.Class<?> wildcardClass12 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray0);
        double[] doubleArray3 = new double[] { 100.0d };
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 10.0f);
        double[] doubleArray8 = new double[] { 3, 4 };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray3, doubleArray8);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) 10.0f, 0, 0.0d);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray8);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) 3);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, (double) 10.0f, (double) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[3.0, 4.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[3.0, 4.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray8, false);
        boolean[] booleanArray11 = new boolean[] {};
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, false, 0);
        java.lang.Boolean[] booleanArray19 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray19, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray21);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray11, booleanArray21);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray10, booleanArray23);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray23);
        java.lang.Boolean[] booleanArray30 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray30, false);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray30, false);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray34);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray23, booleanArray34);
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray23, false, (int) 'a');
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        int[] intArray0 = null;
        org.apache.commons.lang3.ArrayUtils.reverse(intArray0);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) '4', (int) (byte) 10);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) (byte) 100, (int) (byte) 0);
        java.lang.Byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray1);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray1, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.remove(byteArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        long[] longArray0 = null;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray0, (long) (byte) 0);
        org.junit.Assert.assertNull(longArray2);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        int[] intArray0 = null;
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, (int) '#', 0);
        org.junit.Assert.assertNull(intArray3);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, (int) '#', 0);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 3, (double) 5);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        double[] doubleArray1 = new double[] { 100.0d };
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) 10.0f);
        double[] doubleArray6 = new double[] { 3, 4 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray6);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) (byte) 100, 4);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray1);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray1, (double) 1L);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        char[] charArray5 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.clone(charArray5);
        char[] charArray12 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.clone(charArray12);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(charArray12, '4');
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.clone(charArray12);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray12);
        java.lang.String str19 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) charArray17, "{1,10,-1,0,1,35}");
        org.apache.commons.lang3.ArrayUtils.reverse(charArray17);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, #, #, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#4##a#4##a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#4##a#4##a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, 4, #, #, a, #, 4, #, #, a]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{a,#,#,4,#,a,#,#,4,#}" + "'", str19, "{a,#,#,4,#,a,#,#,4,#}");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 5, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.lang.Object[] objArray0 = null;
        org.apache.commons.lang3.ArrayUtils.reverse(objArray0);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.lang.Long[] longArray0 = null;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, (long) (byte) 10);
        org.junit.Assert.assertNull(longArray2);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, 0L);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.clone(longArray1);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray1, 10, (long) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        long[] longArray0 = null;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray0, (long) '#');
        org.junit.Assert.assertNull(longArray2);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        double[] doubleArray0 = null;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        char[] charArray5 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.clone(charArray5);
        char[] charArray12 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.clone(charArray12);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(charArray12, '4');
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.clone(charArray12);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray12);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray6);
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.subarray(charArray6, 10, 1);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray24 = org.apache.commons.lang3.ArrayUtils.add(charArray21, (int) (byte) 100, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, #, #, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "a##4#a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "a##4#a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[a, #, #, 4, #, a, #, #, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[]");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.lang.Double[] doubleArray0 = new java.lang.Double[] {};
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0, (double) 2);
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray3);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) 2, (int) '4', 10.0d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        char[] charArray5 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.clone(charArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, '#');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.clone(charArray6);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray6, ' ');
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(charArray6, 'a');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, #, #, 4, #]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, #, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (-1L), (double) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.subarray(longArray0, (int) (byte) 10, (int) (short) 0);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) 1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) 1);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        double[] doubleArray1 = new double[] { 100.0d };
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) 10.0f);
        double[] doubleArray6 = new double[] { 3, 4 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray6);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, (double) 10.0f, 0, 0.0d);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, 10.0d, 3, 0.0d);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray6, 0.0d);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, (double) 0L, (int) (byte) 100, 10.0d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        char[] charArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray0, 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray6, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[false, false, true]");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 1 };
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray2, (java.lang.Object) 1L);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.remove(byteArray6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1]");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) '4', (int) (byte) 10);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) (byte) 100, (int) (byte) 0);
        java.lang.Byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray1);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray1, (byte) 100);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray1);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray1, (byte) 10, 3);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.lang.Object[] objArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY;
        byte[] byteArray2 = new byte[] { (byte) 100 };
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray2, (int) '4', (int) (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray2, (int) (byte) 100, (int) (byte) 0);
        java.lang.Byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray8);
        int int10 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) byteArray8);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray0, (java.lang.Object) byteArray8);
        java.lang.Byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray8);
        java.lang.Byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray8);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray8, (byte) 10);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray8, (byte) 100);
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        long[] longArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, (float) (byte) -1);
        short[] shortArray5 = new short[] { (byte) 1, (short) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray5, (short) (byte) 10);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray5, (short) 0);
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray9, (short) (byte) 1);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 100, (int) '#');
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray11, (short) (byte) 100);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) floatArray0, (java.lang.Object) (byte) 100);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[1]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[1, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        double[] doubleArray1 = new double[] { 100.0d };
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) 10.0f);
        double[] doubleArray6 = new double[] { 3, 4 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray6);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, (double) 10.0f, 0, 0.0d);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, 10.0d, 3, 0.0d);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray6, (double) (-1.0f));
        java.lang.String str20 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) (-1.0f), "");
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[3.0, 4.0]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1.0" + "'", str20, "-1.0");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, 1L);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, 0L, 0);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        short[] shortArray2 = new short[] { (byte) 1, (short) 0 };
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray2, (short) (byte) 10);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray2, (short) 0);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) 1);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray8, (short) (byte) 100, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.add(shortArray8, 4, (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[1, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        float[] floatArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        int[] intArray6 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.clone(intArray6);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.add(intArray6, (int) (byte) 0, (int) (byte) 1);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.remove(intArray6, (int) (short) 1);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, -1, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.lang.Short[] shortArray0 = null;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray0, (short) 10);
        org.junit.Assert.assertNull(shortArray2);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) (byte) 1);
        float[] floatArray10 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray10);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray11, (float) 'a');
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.add(floatArray13, (int) 'a', 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[0.0, 0.0, 100.0, -1.0, 35.0]");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        java.lang.Object obj1 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) floatArray0, obj1);
        java.lang.Class<?> wildcardClass3 = floatArray0.getClass();
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.lang.Float[] floatArray0 = null;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, 0.0f);
        org.junit.Assert.assertNull(floatArray2);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        char[] charArray3 = new char[] { '4', '#', 'a' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.subarray(charArray3, 0, (int) (byte) 1);
        char[] charArray12 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.clone(charArray12);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray12);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray14, '#', (int) 'a');
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray14);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray14);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray14);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray14);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray14, '4');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, #, a]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#4##a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#4##a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, 4, #, #, a, 4]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, 0L);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, (long) 2);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray1);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        int[] intArray1 = new int[] { 10 };
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, (int) '4');
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray8, false);
        boolean[] booleanArray11 = new boolean[] {};
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, false, 0);
        java.lang.Boolean[] booleanArray19 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray19, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray21);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray11, booleanArray21);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray10, booleanArray23);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray23);
        java.lang.Boolean[] booleanArray30 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray30, false);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray30, false);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray34);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray23, booleanArray34);
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray23, false);
        boolean[] booleanArray40 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray23, true);
        boolean[] booleanArray43 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray40, (int) 'a', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray45 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray43, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray40), "[false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray43), "[]");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_ARRAY;
        boolean[] booleanArray1 = new boolean[] {};
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray1, false, 0);
        java.lang.Boolean[] booleanArray9 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray9, false);
        boolean[] booleanArray12 = new boolean[] {};
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray12, false, 0);
        java.lang.Boolean[] booleanArray20 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray20, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray22);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray12, booleanArray22);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray11, booleanArray24);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray1, booleanArray24);
        java.lang.Boolean[] booleanArray31 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray31, false);
        boolean[] booleanArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray31, false);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray35);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray24, booleanArray35);
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray24, false);
        boolean[] booleanArray41 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray24, true);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray24);
        int int45 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray24, false, (int) (byte) 100);
        boolean[] booleanArray46 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray24);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray48 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[true, false, true, false]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray35), "[false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray41), "[false, false, true]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(booleanArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray46), "[true, false, true, false]");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.lang.Short[] shortArray0 = new java.lang.Short[] {};
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray0, (short) (byte) 0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.clone(shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.remove(shortArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[]");
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[]");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.lang.Byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.remove(byteArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        short[] shortArray4 = new short[] { (short) -1, (byte) 1, (short) 0, (byte) 100 };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(shortArray4, (short) 10);
        short[] shortArray7 = null;
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray7);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.remove(shortArray7, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[-1, 1, 0, 100]");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray2 = new double[] { 100.0d };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray2, (double) 10.0f);
        double[] doubleArray7 = new double[] { 3, 4 };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray2, doubleArray7);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray2, (double) 0.0f);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray10, 0, (int) (short) 1);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray10, (double) 100, (int) (byte) -1, (double) 2);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray0, (java.lang.Object) 2);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        float[] floatArray0 = null;
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray0);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        double[] doubleArray0 = null;
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, (int) (byte) 10, 5);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.lang.CharSequence[] charSequenceArray0 = null;
        java.lang.CharSequence[] charSequenceArray1 = org.apache.commons.lang3.ArrayUtils.toArray(charSequenceArray0);
        org.junit.Assert.assertNull(charSequenceArray1);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray8, false);
        boolean[] booleanArray11 = new boolean[] {};
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, false, 0);
        java.lang.Boolean[] booleanArray19 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray19, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray21);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray11, booleanArray21);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray10, booleanArray23);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray23);
        java.lang.Boolean[] booleanArray30 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray30, false);
        boolean[] booleanArray33 = new boolean[] {};
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray33, false, 0);
        java.lang.Boolean[] booleanArray41 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray43 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray41, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray43);
        boolean[] booleanArray45 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray33, booleanArray43);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray32, booleanArray45);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray23, booleanArray32);
        java.lang.Class<?> wildcardClass48 = booleanArray32.getClass();
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertNotNull(booleanArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray43), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray45), "[false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        double[] doubleArray1 = new double[] { 100.0d };
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) 10.0f);
        double[] doubleArray6 = new double[] { 3, 4 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray6);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray1, (double) 0.0f);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.add(doubleArray1, (double) (short) 10);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray11, 1.0d, (double) 3);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        byte[] byteArray0 = null;
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray0, 4, (int) (short) -1);
        org.junit.Assert.assertNull(byteArray3);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.lang3.ArrayUtils arrayUtils0 = new org.apache.commons.lang3.ArrayUtils();
        java.lang.String str1 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) arrayUtils0);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        float[] floatArray3 = new float[] {};
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, 0.0f);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray3, (float) (byte) -1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray0, floatArray3);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, 5, 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        char[] charArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        char[] charArray5 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.clone(charArray5);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray5, (int) (short) 0, '4');
        java.lang.String str11 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) charArray5, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, #, #, 4, #]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{a,#,#,4,#}" + "'", str11, "{a,#,#,4,#}");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        double[] doubleArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        double[] doubleArray1 = new double[] { 100.0d };
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) 10.0f);
        double[] doubleArray6 = new double[] { 3, 4 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray6);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray1, (double) 0.0f);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, 0.0d, 1, (double) 1L);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray1);
        int int15 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) doubleArray1);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray1, (double) 1L);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) (byte) 1);
        float[] floatArray10 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray10);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray10, (int) (short) 1, (int) '#');
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.clone(floatArray10);
        float[] floatArray16 = new float[] {};
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.add(floatArray16, 0.0f);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(floatArray16, (float) (byte) 1);
        float[] floatArray26 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray16, floatArray26);
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray26, (int) (short) 1, (int) '#');
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.clone(floatArray26);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray10, floatArray31);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.add(floatArray10, (int) (short) -1, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) '4', (int) (byte) 10);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) (byte) 100, (int) (byte) 0);
        java.lang.Byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray7);
        int int9 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) byteArray7);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray7, (int) (short) -1, (int) (byte) 1);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray7, (byte) -1, (int) (short) 100);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray7);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray8, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray10);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray10);
        java.lang.Boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray0);
        java.lang.Float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray14);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray14, (float) (byte) 10);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.clone(floatArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[] serializableArray19 = org.apache.commons.lang3.ArrayUtils.add((java.io.Serializable[]) booleanArray13, (java.io.Serializable) floatArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: [F");
        } catch (java.lang.ArrayStoreException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[]");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, 0L);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.add(longArray1, (long) 10);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray1, 0L);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, (long) 2);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray11 = org.apache.commons.lang3.ArrayUtils.remove(longArray9, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[] longArray7 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[] longArray15 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[] longArray19 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[][] longArray20 = new java.lang.Long[][] { longArray3, longArray7, longArray11, longArray15, longArray19 };
        java.lang.Long[] longArray21 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[][] longArray22 = org.apache.commons.lang3.ArrayUtils.add(longArray20, longArray21);
        float[] floatArray23 = new float[] {};
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.add(floatArray23, 0.0f);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(floatArray23, (float) (byte) 1);
        float[] floatArray33 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray23, floatArray33);
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.clone(floatArray33);
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) longArray22, (java.lang.Object) floatArray35, (int) (short) 10);
        float[] floatArray40 = org.apache.commons.lang3.ArrayUtils.add(floatArray35, 0, (float) 2);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray42 = org.apache.commons.lang3.ArrayUtils.remove(floatArray40, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[2.0, 0.0, 0.0, 100.0, -1.0, 35.0]");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[] longArray7 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[] longArray15 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[] longArray19 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[][] longArray20 = new java.lang.Long[][] { longArray3, longArray7, longArray11, longArray15, longArray19 };
        java.lang.Long[] longArray21 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[][] longArray22 = org.apache.commons.lang3.ArrayUtils.add(longArray20, longArray21);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray21);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray23, 10L, 0);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.add(longArray1, 0, (long) (byte) 1);
        long[] longArray5 = new long[] {};
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.clone(longArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray6, 0L, (int) (byte) 0);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.addAll(longArray4, longArray6);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray12 = org.apache.commons.lang3.ArrayUtils.remove(longArray6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[1]");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        float[] floatArray0 = null;
        float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.clone(floatArray0);
        org.junit.Assert.assertNull(floatArray1);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (int) (short) 0, 0);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.add(byteArray9, (byte) 10);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.clone(byteArray11);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray12, (byte) -1, (int) (short) 10);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(byteArray12, (byte) 100);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 0, 10, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[] longArray7 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[] longArray15 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[] longArray19 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[][] longArray20 = new java.lang.Long[][] { longArray3, longArray7, longArray11, longArray15, longArray19 };
        java.lang.Long[] longArray21 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[][] longArray22 = org.apache.commons.lang3.ArrayUtils.add(longArray20, longArray21);
        float[] floatArray23 = new float[] {};
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.add(floatArray23, 0.0f);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(floatArray23, (float) (byte) 1);
        float[] floatArray33 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray23, floatArray33);
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.clone(floatArray33);
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) longArray22, (java.lang.Object) floatArray35, (int) (short) 10);
        java.lang.Integer[][] intArray38 = null;
        long[] longArray39 = new long[] {};
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.clone(longArray39);
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray40, 0L);
        long[] longArray43 = org.apache.commons.lang3.ArrayUtils.clone(longArray40);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray45 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray46 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray47 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray48 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray49 = new java.lang.Integer[] {};
        java.lang.Integer[][] intArray50 = new java.lang.Integer[][] { intArray44, intArray45, intArray46, intArray47, intArray48, intArray49 };
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 3, 1, 1, (-1), 2, (-1) };
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 3, 1, 1, (-1), 2, (-1) };
        java.lang.Integer[][] intArray65 = new java.lang.Integer[][] { intArray57, intArray64 };
        java.lang.Integer[][] intArray66 = org.apache.commons.lang3.ArrayUtils.addAll(intArray50, intArray65);
        boolean boolean67 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) longArray43, (java.lang.Object) intArray65);
        java.lang.Integer[][] intArray68 = org.apache.commons.lang3.ArrayUtils.addAll(intArray38, intArray65);
        int int69 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray22, (java.lang.Object) intArray38);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        double[] doubleArray1 = new double[] { 100.0d };
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) 10.0f);
        double[] doubleArray6 = new double[] { 3, 4 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray6);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray1, (double) 0.0f);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.add(doubleArray1, (double) (short) 10);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray12);
        double[] doubleArray15 = new double[] { 100.0d };
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray15, (double) 10.0f);
        double[] doubleArray20 = new double[] { 3, 4 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray15, doubleArray20);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray20, (double) 10.0f, 0, 0.0d);
        double[] doubleArray26 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray20);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray12, doubleArray20);
        double[] doubleArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray12, (double) 5);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) (short) 10, (java.lang.Object) doubleArray29);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray29, (double) 1.0f, (double) 0L);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[3.0, 4.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[3.0, 4.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.add(longArray1, 0, (long) (byte) 1);
        long[] longArray5 = new long[] {};
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.clone(longArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray6, 0L, (int) (byte) 0);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.addAll(longArray4, longArray6);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.add(longArray10, (int) (short) 0, (long) (short) 0);
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.clone(longArray10);
        long[] longArray15 = null;
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray14, longArray15);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray19 = org.apache.commons.lang3.ArrayUtils.add(longArray14, 4, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[0, 1]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[] longArray7 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[] longArray15 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[] longArray19 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[][] longArray20 = new java.lang.Long[][] { longArray3, longArray7, longArray11, longArray15, longArray19 };
        java.lang.Long[] longArray21 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[][] longArray22 = org.apache.commons.lang3.ArrayUtils.add(longArray20, longArray21);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray21);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray23, (long) (short) 0);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_ARRAY;
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray26, false);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray23, (java.lang.Object) false);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 1L, (double) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.lang.Double[] doubleArray0 = new java.lang.Double[] {};
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0, (double) 2);
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray3);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (-1L), (int) (byte) 0, 100.0d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        float[] floatArray5 = new float[] { (byte) 0, 0.0f, (byte) -1, 100.0f, 10 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(floatArray5, 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.add(floatArray5, (int) (byte) -1, (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, 0.0, -1.0, 100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        long[] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray3 = org.apache.commons.lang3.ArrayUtils.add(longArray0, (int) (byte) 100, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        double[] doubleArray1 = new double[] { 100.0d };
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) 10.0f);
        double[] doubleArray6 = new double[] { 3, 4 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, (double) (-1));
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        int[] intArray3 = new int[] { '4', (short) 100, (short) 10 };
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.clone(intArray3);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.clone(intArray3);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.subarray(intArray3, 5, (int) '4');
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray3, (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 100, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 1 };
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray11, (int) (short) 0, 0);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray4, byteArray14);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray14);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 10, 0, 10, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) (byte) 100, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        char[] charArray3 = new char[] { '4', '#', 'a' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.subarray(charArray3, 0, (int) (byte) 1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(charArray6, 'a');
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, '#');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, #, a]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        double[] doubleArray0 = null;
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, (double) 3, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.lang.Object obj0 = null;
        int int1 = org.apache.commons.lang3.ArrayUtils.getLength(obj0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        long[] longArray0 = null;
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toObject(longArray0);
        org.junit.Assert.assertNull(longArray1);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) (byte) 1);
        float[] floatArray10 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray10);
        float[] floatArray12 = new float[] {};
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.add(floatArray12, 0.0f);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(floatArray12, (float) (byte) 1);
        float[] floatArray22 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray12, floatArray22);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray12, (float) 0, 0);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray12, (int) (short) 100, (int) '#');
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray11, floatArray29);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.add(floatArray29, (int) (short) 10, (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        byte[] byteArray0 = null;
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray0);
        org.junit.Assert.assertNull(byteArray1);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.lang.Byte[][] byteArray0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray1);
        java.lang.Byte[][] byteArray3 = org.apache.commons.lang3.ArrayUtils.add(byteArray0, byteArray2);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.remove(byteArray5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        double[] doubleArray3 = new double[] { 'a', 10, 1.0d };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (short) 0, (double) 10.0f);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, 0.0d);
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray9);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray10, (double) 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.lang.Float[] floatArray1 = new java.lang.Float[] { 10.0f };
        java.lang.Float[] floatArray3 = new java.lang.Float[] { 10.0f };
        java.lang.Float[][] floatArray4 = new java.lang.Float[][] { floatArray1, floatArray3 };
        java.lang.Float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        java.lang.Float[][] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, floatArray5);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray6);
        java.lang.Float[] floatArray9 = new java.lang.Float[] { 10.0f };
        java.lang.Float[] floatArray11 = new java.lang.Float[] { 10.0f };
        java.lang.Float[][] floatArray12 = new java.lang.Float[][] { floatArray9, floatArray11 };
        java.lang.Float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        java.lang.Float[][] floatArray14 = org.apache.commons.lang3.ArrayUtils.add(floatArray12, floatArray13);
        java.lang.Float[][] floatArray15 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray6, floatArray12);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[][]) floatArray12);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ArrayUtils.toString(obj0, "{a,#,#,4,#}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{a,#,#,4,#}" + "'", str2, "{a,#,#,4,#}");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        char[] charArray5 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.clone(charArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, '#');
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray6, 'a');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, #, #, 4, #]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        int[] intArray1 = new int[] { 10 };
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray1, (int) '4');
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(intArray1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = org.apache.commons.lang3.ArrayUtils.add(intArray1, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        long[] longArray0 = null;
        long[] longArray1 = null;
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.add(longArray1, (long) (short) 100);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.addAll(longArray0, longArray1);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100]");
        org.junit.Assert.assertNull(longArray4);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        double[] doubleArray0 = null;
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray0);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray0);
        double[] doubleArray3 = new double[] { 100.0d };
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 10.0f);
        double[] doubleArray8 = new double[] { 3, 4 };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray3, doubleArray8);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) 10.0f, 0, 0.0d);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray8);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) 5);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (short) -1, (double) 10.0f);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[3.0, 4.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[3.0, 4.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) (byte) 1);
        float[] floatArray10 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray10);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.remove(floatArray11, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0, 0.0, 100.0, -1.0, 35.0]");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, 0L);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.clone(longArray1);
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.subarray(longArray1, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray10 = org.apache.commons.lang3.ArrayUtils.add(longArray1, (int) (short) 100, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[]");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.lang.Object obj0 = null;
        int[] intArray7 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.clone(intArray7);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.add(intArray7, (int) (byte) 0, (int) (byte) 1);
        int[] intArray18 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.clone(intArray18);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray7, intArray18);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.subarray(intArray7, (int) (byte) 1, (int) (byte) 100);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray23, 0);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEquals(obj0, (java.lang.Object) 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, -1, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        java.lang.Object[] objArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isSameLength(objArray0, objArray1);
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        double[] doubleArray3 = new double[] { 'a', 10, 1.0d };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (short) 0, (double) 10.0f);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, 0.0d);
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        java.lang.Double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.add(doubleArray11, (int) '#', 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[97.0, 10.0, 1.0]");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        short[] shortArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray0);
        org.junit.Assert.assertNull(booleanArray1);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        double[] doubleArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) (byte) 1);
        float[] floatArray10 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray10);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray10, (int) (short) 1, (int) '#');
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.clone(floatArray10);
        float[] floatArray16 = new float[] {};
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.add(floatArray16, 0.0f);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(floatArray16, (float) (byte) 1);
        float[] floatArray26 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray16, floatArray26);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.clone(floatArray26);
        int int29 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) floatArray28);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray28, (float) ' ', (int) (short) 0);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray15, floatArray28);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray28, 1.0f, (int) (byte) -1);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        int[] intArray6 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.clone(intArray6);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.add(intArray6, (int) (byte) 0, (int) (byte) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray6, (int) (byte) -1, (int) (short) 0);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.add(intArray6, (int) (short) 1);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray15, 10, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 10, -1, 0, 1, 35, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray0);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray0, false);
        boolean[] booleanArray7 = new boolean[] {};
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray7, false, 0);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray7, true);
        boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray7);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.add(booleanArray13, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[]");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        float[] floatArray5 = new float[] { 1, (byte) 0, 6, (short) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray5, 100, (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[1.0, 0.0, 6.0, 1.0, 1.0]");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        double[] doubleArray3 = new double[] { 'a', 10, 1.0d };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (short) 0, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.add(doubleArray3, (int) (short) 10, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        short[] shortArray0 = null;
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray0);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        long[] longArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(longArray0, 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) '4', (int) (byte) 10);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray1, (byte) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray1, (byte) 10, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.util.Map<java.lang.Object, java.lang.Object> objMap1 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) longArray0);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, (long) '#');
        java.util.Map<java.lang.Object, java.lang.Object> objMap4 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) longArray0);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(objMap1);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(objMap4);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) '#', (double) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, (double) 1L);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, 10.0d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { false, true };
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2, false);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray4, 1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, (int) (short) -1);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true]");
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray0);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray0, false);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray0, true, (int) (byte) 10);
        java.lang.Boolean[] booleanArray17 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray17, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray19);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray19);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray0, booleanArray19);
        boolean[] booleanArray23 = null;
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray23);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray23, true);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[true, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray3, (int) (short) -1, (int) ' ');
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 0, 100]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        short[] shortArray4 = new short[] { (short) -1, (byte) 1, (short) 0, (byte) 100 };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(shortArray4, (short) 10);
        short[] shortArray11 = new short[] { (short) -1, (byte) 1, (short) 0, (byte) 100 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(shortArray11, (short) 10);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray4, shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.add(shortArray4, (short) (byte) -1);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray4, (int) '4', (int) ' ');
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[-1, 1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[]");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, (int) '#', 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (-1L), (int) 'a', (double) '#');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (-1.0f));
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (int) (short) 0, 0);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.add(byteArray9, (byte) 10);
        byte[] byteArray13 = new byte[] { (byte) 100 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray13, (int) '4', (int) (byte) 10);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray13, (int) (byte) 100, (int) (byte) 0);
        java.lang.Byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray19);
        int int21 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) byteArray19);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray19, (int) (short) -1, (int) (byte) 1);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray9, byteArray19);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 0, 10, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 0, 1, 10, 10, 1 };
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.clone(intArray8);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.remove(intArray9, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 10, 10, 1]");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        char[] charArray0 = null;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray0, 'a');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        char[] charArray5 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.clone(charArray5);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray5, (int) (short) 0, '4');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray5, 2, '#');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray15 = org.apache.commons.lang3.ArrayUtils.add(charArray12, 100, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a###4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a###4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, #, #, 4, #]");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 0L, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray7, (int) '#', 0);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray4, (java.lang.Object) '#');
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, true, false]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        boolean[] booleanArray0 = null;
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray5, false);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray5, false);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray9, false);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray0, booleanArray9);
        boolean[] booleanArray13 = new boolean[] {};
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray13, false, 0);
        java.lang.Boolean[] booleanArray21 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray21, false);
        boolean[] booleanArray24 = new boolean[] {};
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray24, false, 0);
        java.lang.Boolean[] booleanArray32 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray32, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray34);
        boolean[] booleanArray36 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray24, booleanArray34);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray23, booleanArray36);
        boolean[] booleanArray38 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray13, booleanArray36);
        java.lang.Boolean[] booleanArray43 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray45 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray43, false);
        boolean[] booleanArray46 = new boolean[] {};
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray46, false, 0);
        java.lang.Boolean[] booleanArray54 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray56 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray54, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray56);
        boolean[] booleanArray58 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray46, booleanArray56);
        boolean boolean59 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray45, booleanArray58);
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray36, booleanArray45);
        boolean[] booleanArray61 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray45);
        boolean boolean62 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray45);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray36), "[false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray38), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray43);
        org.junit.Assert.assertNotNull(booleanArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray45), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray46), "[]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(booleanArray54);
        org.junit.Assert.assertNotNull(booleanArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray56), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray58), "[false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(booleanArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray61), "[false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) (byte) -1);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray0, 0.0f);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, 0.0f);
        float[] floatArray9 = new float[] {};
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.add(floatArray9, 0.0f);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray9, (float) (byte) -1);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray9, 0.0f);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray9, 0.0f);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray9);
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray9);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.add(floatArray19, 10, (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[]");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 0, 1, 10, 10, 1 };
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray7, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = org.apache.commons.lang3.ArrayUtils.remove(intArray7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 1, 10, 10, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 0, 1, 10, 10, 1 };
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray7, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(intArray7);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 10, 10, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        double[] doubleArray3 = new double[] { 'a', 10, 1.0d };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (short) 0, (double) 10.0f);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, 0.0d);
        double[] doubleArray12 = new double[] { 'a', 10, 1.0d };
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray12, (double) (short) 0, (double) 10.0f);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray12, 0.0d);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray12);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray18);
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray18, 0.0d);
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray18, (int) ' ', 10);
        double[] doubleArray26 = new double[] { 100.0d };
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray26, (double) 10.0f);
        double[] doubleArray31 = new double[] { 3, 4 };
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray26, doubleArray31);
        java.lang.Double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray31);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray31, (double) (-1L), 0, (double) (byte) 100);
        double[] doubleArray38 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray18, doubleArray31);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray31, (double) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 10.0, 97.0, 1.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 10.0, 97.0, 1.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0, 97.0, 1.0, 10.0, 97.0, 3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        boolean[] booleanArray0 = null;
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray0);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        long[] longArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, 10L, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0);
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, (float) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.remove(floatArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        double[] doubleArray0 = null;
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (short) -1, 5, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        byte[] byteArray0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.clone(byteArray0);
        org.junit.Assert.assertNull(byteArray1);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray8, false);
        boolean[] booleanArray11 = new boolean[] {};
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, false, 0);
        java.lang.Boolean[] booleanArray19 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray19, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray21);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray11, booleanArray21);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray10, booleanArray23);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray23);
        java.lang.Boolean[] booleanArray30 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray30, false);
        boolean[] booleanArray33 = new boolean[] {};
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray33, false, 0);
        java.lang.Boolean[] booleanArray41 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray43 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray41, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray43);
        boolean[] booleanArray45 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray33, booleanArray43);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray32, booleanArray45);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray23, booleanArray32);
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray23, false);
        int int51 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray23, true);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertNotNull(booleanArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray43), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray45), "[false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray11 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray17 = new boolean[] { false, false, false, true, true };
        boolean[][] booleanArray18 = new boolean[][] { booleanArray5, booleanArray11, booleanArray17 };
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 0, 0, 1, 10, 10, 1 };
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray25);
        double[] doubleArray30 = new double[] { 'a', 10, 1.0d };
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray30, (double) (short) 0, (double) 10.0f);
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray30, 0.0d);
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) intArray25, (java.lang.Object) int35);
        boolean[][] booleanArray37 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray18, (java.lang.Object) intArray25);
        java.lang.Object[] objArray38 = null;
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) booleanArray37, objArray38);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.lang.Object[] objArray0 = null;
        float[] floatArray1 = new float[] {};
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, 0.0f);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, (float) (byte) -1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, 0.0f);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(floatArray8, (-1.0f));
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray0, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray8, false);
        boolean[] booleanArray11 = new boolean[] {};
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, false, 0);
        java.lang.Boolean[] booleanArray19 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray19, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray21);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray11, booleanArray21);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray10, booleanArray23);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray23);
        java.lang.Boolean[] booleanArray30 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray30, false);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray30, false);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray34);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray23, booleanArray34);
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray23, false);
        boolean[] booleanArray41 = org.apache.commons.lang3.ArrayUtils.add(booleanArray23, 0, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray44 = org.apache.commons.lang3.ArrayUtils.add(booleanArray41, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray41), "[true, false, true, false, true]");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) '4', (int) (byte) 10);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) (byte) 100, (int) (byte) 0);
        java.lang.Byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray7);
        int int9 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) byteArray7);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray7, (int) (short) -1, (int) (byte) 1);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) 100);
        java.lang.Byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray12, byteArray17);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray1, (byte) 1, (int) (short) -1);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray1, (byte) -1, 0);
        java.lang.String str9 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) (byte) -1, "{0,0,1,10,10,1}");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) '4', (int) (byte) 10);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) (byte) 100, (int) (byte) 0);
        java.lang.Byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray1);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray1, (byte) 100);
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray17, (int) (short) 0, 0);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray20, (byte) -1);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray1, byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.remove(byteArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 10, 0, 10, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100]");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.add(booleanArray0, 0, false);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[false]");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[] longArray7 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[] longArray15 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[] longArray19 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.lang.Long[][] longArray20 = new java.lang.Long[][] { longArray3, longArray7, longArray11, longArray15, longArray19 };
        java.lang.Long[] longArray21 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[][] longArray22 = org.apache.commons.lang3.ArrayUtils.add(longArray20, longArray21);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray21);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray25 = org.apache.commons.lang3.ArrayUtils.remove(longArray23, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[]");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        int[] intArray3 = new int[] { '4', (short) 100, (short) 10 };
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.clone(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = org.apache.commons.lang3.ArrayUtils.remove(intArray3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 100, 10]");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.lang.Object[] objArray0 = null;
        short[] shortArray3 = new short[] { (byte) 1, (short) 0 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray3, (short) (byte) 10);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray3, (short) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray3, (short) 100);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray3, (short) (byte) -1);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray3, (short) (byte) 10);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray13, (short) 1);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray0, (java.lang.Object) int15, 7);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.add(booleanArray6, (int) (short) 0, true);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, true, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray8, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray10);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray10);
        java.lang.Boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray0);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray13, true);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray15);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray16);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray16, true);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        double[] doubleArray3 = new double[] { 'a', 10, 1.0d };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (short) 0, (double) 10.0f);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, 0.0d);
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray9, (double) 100L);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[97.0, 10.0, 1.0]");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.lang.Boolean[] booleanArray0 = null;
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0, false);
        org.junit.Assert.assertNull(booleanArray2);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.lang.Long[] longArray0 = null;
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        org.junit.Assert.assertNull(longArray1);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        short[] shortArray2 = new short[] { (short) 1, (short) 100 };
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray2);
        java.lang.Short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(shortArray4);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        short[] shortArray5 = new short[] { (byte) -1, (byte) 1, (short) -1, (byte) 0, (byte) 100 };
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray5, (short) (byte) 0, 0);
        short[] shortArray14 = new short[] { (byte) 10, (short) -1, (byte) -1, (short) 100, (byte) -1 };
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.clone(shortArray14);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray15);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray5, shortArray15);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray17, (short) 10);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray17, (short) (byte) 1, 4);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, 1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[10, -1, -1, 100, -1]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[-1, 100, -1, -1, 10]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[-1, 1, -1, 0, 100, -1, 100, -1, -1, 10]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[-1, 1, -1, 0, 100, -1, 100, -1, -1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) '4', (int) (byte) 10);
        java.lang.Byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray4);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.util.Map<java.lang.Object, java.lang.Object> objMap1 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) longArray0);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, 10L);
        double[] doubleArray7 = new double[] { 'a', 10, 1.0d };
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray7, (double) (short) 0, (double) 10.0f);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray7, 0.0d);
        double[] doubleArray16 = new double[] { 'a', 10, 1.0d };
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray16, (double) (short) 0, (double) 10.0f);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray16, 0.0d);
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray7, doubleArray16);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray16, (double) (short) -1);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray0, (java.lang.Object) int24, (int) (byte) -1);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(objMap1);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 10.0, 1.0, 97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.add(longArray1, 0, (long) (byte) 1);
        long[] longArray5 = new long[] {};
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.clone(longArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray6, 0L, (int) (byte) 0);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.addAll(longArray4, longArray6);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.add(longArray10, (int) (short) 0, (long) (short) 0);
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.clone(longArray10);
        long[] longArray15 = new long[] {};
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.clone(longArray15);
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.add(longArray16, 0, (long) (byte) 1);
        long[] longArray20 = new long[] {};
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.clone(longArray20);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray21, 0L, (int) (byte) 0);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.addAll(longArray19, longArray21);
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.add(longArray25, (int) (short) 0, (long) (short) 0);
        long[] longArray29 = new long[] {};
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.clone(longArray29);
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.add(longArray30, 0, (long) (byte) 1);
        long[] longArray34 = new long[] {};
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.clone(longArray34);
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray35, 0L, (int) (byte) 0);
        long[] longArray39 = org.apache.commons.lang3.ArrayUtils.addAll(longArray33, longArray35);
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.addAll(longArray25, longArray39);
        long[] longArray41 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray40);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray44 = org.apache.commons.lang3.ArrayUtils.add(longArray40, 4, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[0, 1]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[1]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[1]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[1]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[0, 1]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[1]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[1]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[1, 1]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[1, 1, 1]");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray8, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray10);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray10);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray0);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray0);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray14);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray15, 6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[]");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.add(longArray1, 0, (long) (byte) 1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray1);
        long[] longArray6 = new long[] {};
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.clone(longArray6);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray7, (long) '#');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray1, longArray7);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.clone(longArray7);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray7, (long) 0);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(longArray13, (long) 1);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.add(longArray1, 0, (long) (byte) 1);
        long[] longArray5 = new long[] {};
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.clone(longArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray6, 0L, (int) (byte) 0);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.addAll(longArray4, longArray6);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.add(longArray10, (int) (short) 0, (long) (short) 0);
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.clone(longArray10);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray10, 1L);
        java.lang.Long[] longArray17 = org.apache.commons.lang3.ArrayUtils.toObject(longArray10);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray10);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[0, 1]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        int[] intArray0 = null;
        java.lang.Integer[] intArray1 = org.apache.commons.lang3.ArrayUtils.toObject(intArray0);
        org.junit.Assert.assertNull(intArray1);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        double[] doubleArray3 = new double[] { 'a', 10, 1.0d };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (short) 0, (double) 10.0f);
        double[] doubleArray7 = null;
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray7);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray7, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[97.0, 10.0, 1.0]");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.lang.Object[] objArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY;
        byte[] byteArray2 = new byte[] { (byte) 100 };
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray2, (int) '4', (int) (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray2, (int) (byte) 100, (int) (byte) 0);
        java.lang.Byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray8);
        int int10 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) byteArray8);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray0, (java.lang.Object) byteArray8);
        java.lang.Byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray8);
        java.lang.Byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray8);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray8, (byte) 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 0, 1, 10, 10, 1 };
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray7, (int) (byte) 10);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray7, 0, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 1, 10, 10, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        int[] intArray3 = new int[] { 1, (-1), (short) -1 };
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.add(intArray3, 0, (int) (byte) 0);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, (int) (byte) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray6);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (int) (short) 0, 0);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 1);
        java.lang.Class<?> wildcardClass12 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 0, 10, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 1 };
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray11, (int) (short) 0, 0);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray4, byteArray14);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray14, (byte) 100, (-1));
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 10, 0, 10, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.lang.Short[] shortArray0 = null;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray0);
        org.junit.Assert.assertNull(shortArray1);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100.0f, (double) 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        float[] floatArray0 = null;
        float[] floatArray1 = null;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray1);
        org.junit.Assert.assertNull(floatArray2);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray1 = null;
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray1);
        org.junit.Assert.assertNull(booleanArray2);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, (float) (byte) -1);
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray8, false);
        boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.add(booleanArray8, (int) (short) 1, false);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray13, false);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        byte[] byteArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray0, (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        double[] doubleArray1 = new double[] { 100.0d };
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) 10.0f);
        double[] doubleArray6 = new double[] { 3, 4 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray6);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray6, (double) 10L, 0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (int) (byte) 0, (short) 10);
        java.lang.Short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray3);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray4);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10]");
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10]");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        char[] charArray5 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.clone(charArray5);
        char[] charArray12 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.clone(charArray12);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(charArray12, '4');
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.clone(charArray12);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray12);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray12, 'a', (int) (byte) 100);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray12);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, #, #, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "a##4#a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "a##4#a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[a, #, #, 4, #, a, #, #, 4, #]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray8, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray10);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray10);
        java.lang.Boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray0);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray13, true);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray15);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray16);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.add(booleanArray17, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[]");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.lang.Comparable[][] comparableArray1 = new java.lang.Comparable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Comparable<java.lang.String>[][] strComparableArray2 = (java.lang.Comparable<java.lang.String>[][]) comparableArray1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String>[][] strComparableArray4 = org.apache.commons.lang3.ArrayUtils.remove(strComparableArray2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableArray1);
        org.junit.Assert.assertNotNull(strComparableArray2);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) (byte) 1);
        float[] floatArray10 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray10);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.clone(floatArray0);
        float[] floatArray13 = new float[] {};
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.add(floatArray13, 0.0f);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(floatArray13, (float) (byte) 1);
        float[] floatArray23 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray13, floatArray23);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.clone(floatArray23);
        int int26 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) floatArray25);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray12, floatArray25);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray12);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        double[] doubleArray0 = null;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, 0.0d);
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        double[] doubleArray0 = null;
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, 0.0d, (double) 6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray8, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray10);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray10);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray0);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray0);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray14);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray14, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[]");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        short[] shortArray5 = new short[] { (byte) 10, (short) -1, (byte) -1, (short) 100, (byte) -1 };
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.clone(shortArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.remove(shortArray6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, -1, -1, 100, -1]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 100, -1, -1, 10]");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 5, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        char[] charArray3 = new char[] { '4', '#', 'a' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.subarray(charArray3, 0, (int) (byte) 1);
        char[] charArray12 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.clone(charArray12);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray12);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray14, '#', (int) 'a');
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray14);
        java.lang.Character[] charArray19 = org.apache.commons.lang3.ArrayUtils.toObject(charArray14);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray21 = org.apache.commons.lang3.ArrayUtils.remove(charArray14, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, #, a]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, a, #, #, 4, #]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray19);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        short[] shortArray2 = new short[] { (short) 1, (short) 100 };
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray2);
        short[] shortArray4 = null;
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray2, shortArray4);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray2, (short) -1);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.clone(shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.remove(shortArray2, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[100, 1]");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.add(longArray1, 0, (long) (byte) 1);
        long[] longArray5 = new long[] {};
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.clone(longArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray6, 0L, (int) (byte) 0);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.addAll(longArray4, longArray6);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.add(longArray10, (int) (short) 0, (long) (short) 0);
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.clone(longArray10);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray10, 1L);
        java.lang.Long[] longArray17 = org.apache.commons.lang3.ArrayUtils.toObject(longArray10);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray19 = org.apache.commons.lang3.ArrayUtils.remove(longArray10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[0, 1]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(longArray17);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        byte[] byteArray0 = null;
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray0, (byte) 1);
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray6);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, false, false, false]");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray1, 0L, (int) (byte) 0);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, (long) 7);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.add(booleanArray0, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray3, (int) (short) -1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.remove(byteArray6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 0, 100]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 100]");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { false, true };
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2, false);
        char[] charArray8 = new char[] { '4', '#', 'a' };
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.subarray(charArray8, 0, (int) (byte) 1);
        char[] charArray17 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.clone(charArray17);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.addAll(charArray11, charArray17);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray11, '#');
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray2, (java.lang.Object) charArray11, 0);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray11, 'a');
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray11, 'a');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray29 = org.apache.commons.lang3.ArrayUtils.remove(charArray11, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #, a]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4, a, #, #, 4, #]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) '4', (int) (byte) 10);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.clone(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.add(byteArray5, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (int) (short) 10, (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) (short) 100, (int) (byte) 1);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray0, (long) 0);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0]");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, 0L);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.clone(longArray1);
        long[] longArray5 = null;
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.addAll(longArray4, longArray5);
        long[] longArray7 = new long[] {};
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.clone(longArray7);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.subarray(longArray7, (int) (byte) 10, (int) (short) 0);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray11, (long) 0);
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray6, longArray13);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray14);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.add(longArray14, (long) 5);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray17);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[5]");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.add(longArray1, 0, (long) (byte) 1);
        long[] longArray5 = new long[] {};
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.clone(longArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray6, 0L, (int) (byte) 0);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.addAll(longArray4, longArray6);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.add(longArray10, (int) (short) 0, (long) (short) 0);
        java.lang.Long[] longArray14 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.util.Map<java.lang.Object, java.lang.Object> objMap15 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) longArray14);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray14, 10L);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray17, 0L, 2);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray10, longArray17);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray17);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[0, 1]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertNotNull(objMap15);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.lang.String[] strArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        short[] shortArray3 = new short[] { (short) 1, (short) 100 };
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray3);
        short[] shortArray5 = null;
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray0, (java.lang.Object) shortArray5, 0);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray0);
        java.lang.String[] strArray10 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        java.lang.Character[] charArray16 = new java.lang.Character[] { '4', ' ', '#', '#', '4' };
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray16, 'a');
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) strArray10, (java.lang.Object[]) charArray16);
        java.lang.String[] strArray20 = org.apache.commons.lang3.ArrayUtils.addAll(strArray0, strArray10);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isEmpty(strArray10);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4 ##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4 ##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4,  , #, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        double[] doubleArray1 = new double[] { 100.0d };
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) 10.0f);
        double[] doubleArray6 = new double[] { 3, 4 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray6);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, (double) 10.0f, 0, 0.0d);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray12, 0.0d, (int) '4');
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray8, false);
        boolean[] booleanArray11 = new boolean[] {};
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, false, 0);
        java.lang.Boolean[] booleanArray19 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray19, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray21);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray11, booleanArray21);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray10, booleanArray23);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray23);
        java.lang.Boolean[] booleanArray30 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray30, false);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray30, false);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray34);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray23, booleanArray34);
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray23);
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray37, false);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[false, true, false, true]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        short[] shortArray4 = new short[] { (short) -1, (byte) 1, (short) 0, (byte) 100 };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(shortArray4, (short) 10);
        short[] shortArray11 = new short[] { (short) -1, (byte) 1, (short) 0, (byte) 100 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(shortArray11, (short) 10);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray4, shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.add(shortArray4, (short) (byte) 1);
        short[] shortArray22 = new short[] { (byte) -1, (byte) 1, (short) -1, (byte) 0, (byte) 100 };
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray22, (short) (byte) 0, 0);
        short[] shortArray28 = new short[] { (short) 1, (short) 100 };
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray28);
        short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray22, shortArray28);
        short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray16, shortArray30);
        short[] shortArray34 = new short[] { (short) 1, (short) 100 };
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray34);
        short[] shortArray36 = null;
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray34, shortArray36);
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray34, (short) -1);
        short[] shortArray40 = org.apache.commons.lang3.ArrayUtils.clone(shortArray34);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray31, shortArray34);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[-1, 1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 1, 0, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[-1, 1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[100, 1]");
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[-1, 1, -1, 0, 100, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[-1, 1, 0, 100, 1, -1, 1, -1, 0, 100, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) '4', (int) (byte) 10);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) (byte) 100, (int) (byte) 0);
        java.lang.Byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray7);
        int int9 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) byteArray7);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray7, (int) (short) -1, (int) (byte) 1);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) 100);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray12, (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { false, true };
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2, false);
        char[] charArray8 = new char[] { '4', '#', 'a' };
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.subarray(charArray8, 0, (int) (byte) 1);
        char[] charArray17 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.clone(charArray17);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.addAll(charArray11, charArray17);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray11, '#');
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray2, (java.lang.Object) charArray11, 0);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray11, 'a');
        char[] charArray28 = org.apache.commons.lang3.ArrayUtils.add(charArray25, (int) (short) 1, 'a');
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray25, 'a', (int) (byte) -1);
        java.lang.String str33 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) charArray25, "{52,100,10}");
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #, a]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4, a, #, #, 4, #]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[4, a]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "{4}" + "'", str33, "{4}");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.add(longArray1, 0, (long) (byte) 1);
        java.lang.Byte[] byteArray10 = new java.lang.Byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) 1 };
        java.lang.Byte[] byteArray16 = new java.lang.Byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) 1 };
        java.lang.Byte[][] byteArray17 = new java.lang.Byte[][] { byteArray10, byteArray16 };
        java.lang.Byte[][] byteArray18 = org.apache.commons.lang3.ArrayUtils.toArray(byteArray17);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) (byte) 1, (java.lang.Object) byteArray17);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, 0L);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.clone(longArray1);
        long[] longArray5 = null;
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.addAll(longArray4, longArray5);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.subarray(longArray4, 0, (int) (byte) 10);
        java.lang.Long[] longArray10 = org.apache.commons.lang3.ArrayUtils.toObject(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray12 = org.apache.commons.lang3.ArrayUtils.remove(longArray4, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
        org.junit.Assert.assertNotNull(longArray10);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        char[] charArray3 = new char[] { '4', '#', 'a' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.subarray(charArray3, 0, (int) (byte) 1);
        char[] charArray12 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.clone(charArray12);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray12);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray14, '#', (int) 'a');
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray14);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray14);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray14, ' ');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, #, a]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, a, #, #, 4, #]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.lang.Long[] longArray6 = new java.lang.Long[] { 1L, 10L, 10L, 0L, (-1L), (-1L) };
        java.lang.Long[] longArray13 = new java.lang.Long[] { 1L, 10L, 10L, 0L, (-1L), (-1L) };
        java.lang.Long[] longArray20 = new java.lang.Long[] { 1L, 10L, 10L, 0L, (-1L), (-1L) };
        java.lang.Long[] longArray27 = new java.lang.Long[] { 1L, 10L, 10L, 0L, (-1L), (-1L) };
        java.lang.Long[] longArray34 = new java.lang.Long[] { 1L, 10L, 10L, 0L, (-1L), (-1L) };
        java.lang.Long[] longArray41 = new java.lang.Long[] { 1L, 10L, 10L, 0L, (-1L), (-1L) };
        java.lang.Long[][] longArray42 = new java.lang.Long[][] { longArray6, longArray13, longArray20, longArray27, longArray34, longArray41 };
        java.lang.Long[][] longArray45 = org.apache.commons.lang3.ArrayUtils.subarray(longArray42, 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long[][] longArray47 = org.apache.commons.lang3.ArrayUtils.remove(longArray45, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertNotNull(longArray45);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        boolean[] booleanArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray0, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray8, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray10);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray10);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray0);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray0);
        java.lang.Boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray14);
        java.lang.Boolean[] booleanArray18 = new java.lang.Boolean[] { false, true };
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray18, false);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray18, false);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray18, true);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) booleanArray15, (java.lang.Object) booleanArray18);
        java.lang.Boolean[] booleanArray30 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray30, false);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray30, false);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) booleanArray30);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray18, (java.lang.Object) booleanArray30, (int) '4');
        boolean[] booleanArray39 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray30, true);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[false, true]");
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, true]");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, true]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(booleanArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray39), "[true, false, false, false]");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        float[] floatArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) 'a', 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        double[] doubleArray1 = new double[] { 100.0d };
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) 10.0f);
        double[] doubleArray6 = new double[] { 3, 4 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray6);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, (double) 10.0f, 0, 0.0d);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, 10.0d, 3, 0.0d);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray6, (double) (-1.0f));
        double[] doubleArray20 = new double[] { 100.0d };
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray20, (double) 10.0f);
        double[] doubleArray25 = new double[] { 3, 4 };
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray20, doubleArray25);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray18, doubleArray25);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray27, (double) (byte) 10, (double) 10);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[3.0, 4.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[3.0, 4.0, 3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = org.apache.commons.lang3.ArrayUtils.add(intArray0, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        double[] doubleArray1 = new double[] { 100.0d };
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) 10.0f);
        double[] doubleArray6 = new double[] { 3, 4 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray6);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray1, (double) 0.0f);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray9, 0, (int) (short) 1);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray9, (double) 100, (int) (byte) -1, (double) 2);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray9, 1.0d, 0);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray9, (double) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray0, false, 0);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray0, 3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[]");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray0);
        double[] doubleArray3 = new double[] { 100.0d };
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 10.0f);
        double[] doubleArray8 = new double[] { 3, 4 };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray3, doubleArray8);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) 10.0f, 0, 0.0d);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray8);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) 5);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.add(doubleArray17, 3, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[3.0, 4.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[3.0, 4.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.lang.Double[] doubleArray0 = new java.lang.Double[] {};
        java.lang.Double[] doubleArray1 = new java.lang.Double[] {};
        java.lang.Double[] doubleArray2 = new java.lang.Double[] {};
        java.lang.Double[] doubleArray3 = new java.lang.Double[] {};
        java.lang.Double[][] doubleArray4 = new java.lang.Double[][] { doubleArray0, doubleArray1, doubleArray2, doubleArray3 };
        java.lang.Double[] doubleArray9 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 100.0d };
        java.lang.Double[][] doubleArray10 = new java.lang.Double[][] { doubleArray9 };
        java.lang.Double[][] doubleArray11 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray4, doubleArray10);
        java.lang.Double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray13, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double[][] doubleArray16 = org.apache.commons.lang3.ArrayUtils.add(doubleArray10, (int) '4', doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, 0L);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.clone(longArray1);
        java.lang.Integer[] intArray5 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray6 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray7 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray8 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray9 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray10 = new java.lang.Integer[] {};
        java.lang.Integer[][] intArray11 = new java.lang.Integer[][] { intArray5, intArray6, intArray7, intArray8, intArray9, intArray10 };
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 3, 1, 1, (-1), 2, (-1) };
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 3, 1, 1, (-1), 2, (-1) };
        java.lang.Integer[][] intArray26 = new java.lang.Integer[][] { intArray18, intArray25 };
        java.lang.Integer[][] intArray27 = org.apache.commons.lang3.ArrayUtils.addAll(intArray11, intArray26);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) longArray4, (java.lang.Object) intArray26);
        java.lang.Long[] longArray29 = org.apache.commons.lang3.ArrayUtils.toObject(longArray4);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray33 = org.apache.commons.lang3.ArrayUtils.add(longArray4, (int) (short) 100, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(longArray29);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        short[] shortArray9 = new short[] { (byte) 1, (short) 0 };
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) (byte) 10);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray9, (short) 0);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray9, (short) 100);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray9, (short) 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray4, (java.lang.Object) (short) 0);
        java.lang.Boolean[] booleanArray23 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray23, false);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) booleanArray4, (java.lang.Object[]) booleanArray23);
        boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, false, true, false]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[false, false, false, true]");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        double[] doubleArray3 = new double[] { 'a', 10, 1.0d };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (short) 0, (double) 10.0f);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, 0.0d);
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray9, (double) 5);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray9, (double) ' ');
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray9);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray9, (double) 4);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray16, (double) ' ', 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        int[] intArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(intArray0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) '4', (int) (byte) 10);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) (byte) 100, (int) (byte) 0);
        java.lang.Byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.remove(byteArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, 0L);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.clone(longArray1);
        long[] longArray5 = null;
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.addAll(longArray4, longArray5);
        long[] longArray7 = new long[] {};
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.clone(longArray7);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.subarray(longArray7, (int) (byte) 10, (int) (short) 0);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray11, (long) 0);
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray6, longArray13);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray14);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.add(longArray14, (long) 5);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray19 = org.apache.commons.lang3.ArrayUtils.remove(longArray17, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[5]");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        int[] intArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) (byte) -1);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray0, 0.0f);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.clone(floatArray0);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray0, (int) 'a', 0);
        java.lang.Class<?> wildcardClass11 = floatArray0.getClass();
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) (byte) 1);
        float[] floatArray10 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray10);
        float[] floatArray12 = new float[] {};
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.add(floatArray12, 0.0f);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(floatArray12, (float) (byte) 1);
        float[] floatArray22 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray12, floatArray22);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray12, (float) 0, 0);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray12, (int) (short) 100, (int) '#');
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray11, floatArray29);
        float[] floatArray31 = new float[] {};
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.add(floatArray31, 0.0f);
        float[] floatArray34 = new float[] {};
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.add(floatArray34, 0.0f);
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray34, (float) (byte) -1);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray31, floatArray34);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray29, floatArray34);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray42 = org.apache.commons.lang3.ArrayUtils.remove(floatArray29, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[0.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[0.0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray8, false);
        boolean[] booleanArray11 = new boolean[] {};
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, false, 0);
        java.lang.Boolean[] booleanArray19 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray19, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray21);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray11, booleanArray21);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray10, booleanArray23);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray23);
        java.lang.Boolean[] booleanArray30 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray30, false);
        boolean[] booleanArray33 = new boolean[] {};
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray33, false, 0);
        java.lang.Boolean[] booleanArray41 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray43 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray41, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray43);
        boolean[] booleanArray45 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray33, booleanArray43);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray32, booleanArray45);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray23, booleanArray32);
        int int49 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray32, false);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertNotNull(booleanArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray43), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray45), "[false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 6, (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (int) (short) 0, 0);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.add(byteArray9, (byte) 10);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.add(byteArray9, (byte) 10);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray9, byteArray14);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 0, 10, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        double[] doubleArray3 = new double[] { 'a', 10, 1.0d };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (short) 0, (double) 10.0f);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, 0.0d);
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        java.lang.Double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray10, (double) 10.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 10.0, 1.0]");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        byte[] byteArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 0, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        double[][] doubleArray0 = null;
        java.lang.Object obj1 = null;
        double[][] doubleArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, obj1);
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        char[] charArray0 = null;
        char[] charArray1 = org.apache.commons.lang3.ArrayUtils.clone(charArray0);
        org.junit.Assert.assertNull(charArray1);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (int) (short) 0, 0);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.add(byteArray9, (byte) 10);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.add(byteArray11, (byte) 1);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray11, (int) '#', (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 0, 10, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        boolean[] booleanArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, true, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        char[] charArray3 = new char[] { '4', '#', 'a' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.subarray(charArray3, 0, (int) (byte) 1);
        char[] charArray12 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.clone(charArray12);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray12);
        java.lang.Class<?> wildcardClass15 = charArray6.getClass();
        double[] doubleArray17 = new double[] { 100.0d };
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray17, (double) 10.0f);
        double[] doubleArray22 = new double[] { 3, 4 };
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray17, doubleArray22);
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray17, (double) 0.0f);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray17, 0.0d, 1, (double) 1L);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray17);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) wildcardClass15, (java.lang.Object) doubleArray17);
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray17, (double) 0L, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, #, a]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.lang.Byte[][] byteArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { false, true };
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2, false);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray4, true);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        double[] doubleArray3 = new double[] { 'a', 10, 1.0d };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (short) 0, (double) 10.0f);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, 0.0d, (double) (byte) 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) 1);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        long[] longArray0 = null;
        long[] longArray1 = new long[] {};
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.clone(longArray1);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray2, 0L);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.clone(longArray2);
        java.lang.Integer[] intArray6 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray7 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray8 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray9 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray10 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray11 = new java.lang.Integer[] {};
        java.lang.Integer[][] intArray12 = new java.lang.Integer[][] { intArray6, intArray7, intArray8, intArray9, intArray10, intArray11 };
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 3, 1, 1, (-1), 2, (-1) };
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 3, 1, 1, (-1), 2, (-1) };
        java.lang.Integer[][] intArray27 = new java.lang.Integer[][] { intArray19, intArray26 };
        java.lang.Integer[][] intArray28 = org.apache.commons.lang3.ArrayUtils.addAll(intArray12, intArray27);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) longArray5, (java.lang.Object) intArray27);
        java.lang.Long[] longArray30 = org.apache.commons.lang3.ArrayUtils.toObject(longArray5);
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray30, (long) 10);
        long[] longArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray30, (long) ' ');
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray0, longArray34);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) (byte) -1);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray0, 0.0f);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.clone(floatArray0);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray8);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray0, floatArray8);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.remove(floatArray0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        boolean[] booleanArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray0, false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) (byte) 1);
        float[] floatArray10 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray10);
        float[] floatArray12 = new float[] {};
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.add(floatArray12, 0.0f);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(floatArray12, (float) (byte) 1);
        float[] floatArray22 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray12, floatArray22);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray12, (float) 0, 0);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray12, (int) (short) 100, (int) '#');
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray11, floatArray29);
        float[] floatArray31 = new float[] {};
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.add(floatArray31, 0.0f);
        float[] floatArray34 = new float[] {};
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.add(floatArray34, 0.0f);
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray34, (float) (byte) -1);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray31, floatArray34);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray29, floatArray34);
        float[] floatArray41 = new float[] {};
        float[] floatArray43 = org.apache.commons.lang3.ArrayUtils.add(floatArray41, 0.0f);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray34, floatArray43);
        java.lang.Float[] floatArray45 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray34);
        float[] floatArray47 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray45, (float) 100L);
        int int50 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray47, (float) '#', 1);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[0.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[0.0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[]");
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray47), "[]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 0, 1, 10, 10, 1 };
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        double[] doubleArray11 = new double[] { 'a', 10, 1.0d };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray11, (double) (short) 0, (double) 10.0f);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray11, 0.0d);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) intArray6, (java.lang.Object) int16);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.remove(intArray18, 2);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray18);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 10, 10, 1, 0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0, 10, 10, 1]");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        int[] intArray0 = null;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, 2);
        org.junit.Assert.assertNull(intArray2);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray8, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray10);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray10);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray0);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray0);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray14);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray14, false, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.add(booleanArray14, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.lang.Byte[] byteArray2 = new java.lang.Byte[] { (byte) 0, (byte) 1 };
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        short[] shortArray7 = new short[] { (short) 1, (short) 100 };
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray7);
        short[] shortArray9 = null;
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray7, shortArray9);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray4, (java.lang.Object) shortArray9, 0);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray4);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray2, (java.lang.Object) strArray4);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray2, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (int) ' ', (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 1]");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 1]");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        byte[] byteArray0 = null;
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.add(byteArray0, (int) (short) 0, (byte) 1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.add(longArray1, 0, (long) (byte) 1);
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.remove(longArray4, 0);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray9 = org.apache.commons.lang3.ArrayUtils.remove(longArray4, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) (byte) -1);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray0, 0.0f);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.clone(floatArray0);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray0, (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.remove(floatArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[]");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray1 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray2 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray3 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray4 = new java.lang.Integer[] {};
        java.lang.Integer[] intArray5 = new java.lang.Integer[] {};
        java.lang.Integer[][] intArray6 = new java.lang.Integer[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 3, 1, 1, (-1), 2, (-1) };
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 3, 1, 1, (-1), 2, (-1) };
        java.lang.Integer[][] intArray21 = new java.lang.Integer[][] { intArray13, intArray20 };
        java.lang.Integer[][] intArray22 = org.apache.commons.lang3.ArrayUtils.addAll(intArray6, intArray21);
        java.lang.Object obj23 = null;
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) intArray6, obj23, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, 0L);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.add(longArray1, (long) 10);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray1, 100L);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray10 = org.apache.commons.lang3.ArrayUtils.add(longArray1, (int) (short) 100, (long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        float[] floatArray0 = null;
        float[] floatArray1 = new float[] {};
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, 0.0f);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(floatArray1, (float) (byte) 1);
        float[] floatArray11 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray1, floatArray11);
        float[] floatArray13 = new float[] {};
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.add(floatArray13, 0.0f);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(floatArray13, (float) (byte) 1);
        float[] floatArray23 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray13, floatArray23);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray13, (float) 0, 0);
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray13, (int) (short) 100, (int) '#');
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray12, floatArray30);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray0, floatArray30);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray0 = null;
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray1 = org.apache.commons.lang3.ArrayUtils.toArray(annotatedElementArray0);
        org.junit.Assert.assertNull(annotatedElementArray1);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) '4', (int) (byte) 10);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) (byte) 100, (int) (byte) 0);
        java.lang.Byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray1);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray1, (byte) 100);
        int int11 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) byteArray10);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray10);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray10);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        long[] longArray5 = new long[] { 7, (short) 0, 1L, 100L, 10 };
        long[] longArray11 = new long[] { 7, (short) 0, 1L, 100L, 10 };
        long[] longArray17 = new long[] { 7, (short) 0, 1L, 100L, 10 };
        long[] longArray23 = new long[] { 7, (short) 0, 1L, 100L, 10 };
        long[] longArray29 = new long[] { 7, (short) 0, 1L, 100L, 10 };
        long[] longArray35 = new long[] { 7, (short) 0, 1L, 100L, 10 };
        long[][] longArray36 = new long[][] { longArray5, longArray11, longArray17, longArray23, longArray29, longArray35 };
        long[] longArray42 = new long[] { (byte) 1, 1, 100L, 100, (byte) 0 };
        long[] longArray48 = new long[] { (byte) 1, 1, 100L, 100, (byte) 0 };
        long[] longArray54 = new long[] { (byte) 1, 1, 100L, 100, (byte) 0 };
        long[] longArray60 = new long[] { (byte) 1, 1, 100L, 100, (byte) 0 };
        long[] longArray66 = new long[] { (byte) 1, 1, 100L, 100, (byte) 0 };
        long[] longArray72 = new long[] { (byte) 1, 1, 100L, 100, (byte) 0 };
        long[][] longArray73 = new long[][] { longArray42, longArray48, longArray54, longArray60, longArray66, longArray72 };
        long[][] longArray74 = org.apache.commons.lang3.ArrayUtils.addAll(longArray36, longArray73);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[7, 0, 1, 100, 10]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[7, 0, 1, 100, 10]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[7, 0, 1, 100, 10]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[7, 0, 1, 100, 10]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[7, 0, 1, 100, 10]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[7, 0, 1, 100, 10]");
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[1, 1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[1, 1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[1, 1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[1, 1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[1, 1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray72), "[1, 1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertNotNull(longArray74);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ArrayUtils.toString(obj0, "{52,100,10}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{52,100,10}" + "'", str2, "{52,100,10}");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 0, 1, 10, 10, 1 };
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        short[] shortArray12 = new short[] { (byte) 1, (short) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray12, (short) (byte) 10);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray12, (short) 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray12, (short) 100);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray12, (short) 0);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray12, (short) (byte) -1);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) intArray6, (java.lang.Object) int22, 3);
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 1, 10, 10, 1]");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        boolean[][][] booleanArray0 = null;
        boolean[][][] booleanArray3 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray0, (int) (byte) 0, 0);
        org.junit.Assert.assertNull(booleanArray3);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, (int) '#', 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (-1L), (int) 'a', (double) '#');
        java.lang.String str8 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.lang.Long[][][] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long[][][] longArray2 = org.apache.commons.lang3.ArrayUtils.remove(longArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        byte[] byteArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        double[] doubleArray3 = new double[] { 'a', 10, 1.0d };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (short) 0, (double) 10.0f);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, 0.0d);
        double[] doubleArray12 = new double[] { 'a', 10, 1.0d };
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray12, (double) (short) 0, (double) 10.0f);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray12, 0.0d);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray12);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray18);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) 10);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray18, (double) 1L, 7, (double) 10.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 10.0, 97.0, 1.0, 10.0, 97.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray6);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray6, false);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray9, true, (int) 'a');
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false, true, false]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        float[] floatArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray1, 0L);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.add(longArray1, (long) 10);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray1, 0L);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray1, (long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray11 = org.apache.commons.lang3.ArrayUtils.remove(longArray1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.util.Map[] mapArray1 = new java.util.Map[0];
        @SuppressWarnings("unchecked")
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray2 = (java.util.Map<java.lang.Object, java.lang.Object>[]) mapArray1;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray4 = org.apache.commons.lang3.ArrayUtils.remove(objMapArray2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mapArray1);
        org.junit.Assert.assertNotNull(objMapArray2);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray8);
        java.lang.Boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray8);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray11, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false, false, false, true]");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        double[] doubleArray2 = new double[] { 100.0f, ' ' };
        double[] doubleArray5 = new double[] { 100.0f, ' ' };
        double[] doubleArray8 = new double[] { 100.0f, ' ' };
        double[][] doubleArray9 = new double[][] { doubleArray2, doubleArray5, doubleArray8 };
        double[][][] doubleArray10 = new double[][][] { doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            double[][][] doubleArray12 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.lang.Class<?>[] wildcardClassArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        java.lang.Class<?>[] wildcardClassArray1 = org.apache.commons.lang3.ArrayUtils.clone(wildcardClassArray0);
        java.lang.Class<?> wildcardClass2 = wildcardClassArray1.getClass();
        org.junit.Assert.assertNotNull(wildcardClassArray0);
        org.junit.Assert.assertNotNull(wildcardClassArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        float[][][] floatArray0 = null;
        float[][] floatArray1 = new float[][] {};
        float[][] floatArray2 = new float[][] {};
        float[][] floatArray3 = new float[][] {};
        float[][] floatArray4 = new float[][] {};
        float[][] floatArray5 = new float[][] {};
        float[][] floatArray6 = new float[][] {};
        float[][][] floatArray7 = new float[][][] { floatArray1, floatArray2, floatArray3, floatArray4, floatArray5, floatArray6 };
        float[][][] floatArray8 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray7);
        float[][][] floatArray9 = null;
        float[][] floatArray10 = new float[][] {};
        float[][] floatArray11 = new float[][] {};
        float[][] floatArray12 = new float[][] {};
        float[][] floatArray13 = new float[][] {};
        float[][] floatArray14 = new float[][] {};
        float[][] floatArray15 = new float[][] {};
        float[][][] floatArray16 = new float[][][] { floatArray10, floatArray11, floatArray12, floatArray13, floatArray14, floatArray15 };
        float[][][] floatArray17 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray9, floatArray16);
        float[][][] floatArray18 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray9);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertNull(floatArray18);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0);
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, (float) (byte) 10);
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.clone(floatArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray4, (float) (short) 0);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        int[] intArray3 = new int[] { 1, (-1), (short) -1 };
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.add(intArray3, 0, (int) (byte) 0);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(intArray6, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.lang.Float[] floatArray1 = new java.lang.Float[] { 10.0f };
        java.lang.Float[] floatArray3 = new java.lang.Float[] { 10.0f };
        java.lang.Float[][] floatArray4 = new java.lang.Float[][] { floatArray1, floatArray3 };
        java.lang.Float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        java.lang.Float[][] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, floatArray5);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray7);
        double[] doubleArray10 = new double[] { 100.0d };
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, (double) 10.0f);
        double[] doubleArray15 = new double[] { 3, 4 };
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray10, doubleArray15);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray15, (double) 10.0f, 0, 0.0d);
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray15);
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray7, doubleArray15);
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray7, (double) 5);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray7, 1.0d, (double) 2);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) floatArray6, (java.lang.Object) 1.0d, (int) (short) 1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[3.0, 4.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[3.0, 4.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        byte[] byteArray0 = null;
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray0, (byte) -1);
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 0, 1, 10, 10, 1 };
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        java.lang.Integer[] intArray14 = new java.lang.Integer[] { 0, 0, 1, 10, 10, 1 };
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray14);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray15, (-1));
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray15);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray7, intArray15);
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.subarray(intArray15, (-1), (int) ' ');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 1, 10, 10, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 1, 10, 10, 1]");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray8, false);
        boolean[] booleanArray11 = new boolean[] {};
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, false, 0);
        java.lang.Boolean[] booleanArray19 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray19, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray21);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray11, booleanArray21);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray10, booleanArray23);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray23);
        java.lang.Boolean[] booleanArray30 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray30, false);
        boolean[] booleanArray33 = new boolean[] {};
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray33, false, 0);
        java.lang.Boolean[] booleanArray41 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray43 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray41, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray43);
        boolean[] booleanArray45 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray33, booleanArray43);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray32, booleanArray45);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray23, booleanArray32);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray50 = org.apache.commons.lang3.ArrayUtils.add(booleanArray32, 6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertNotNull(booleanArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray43), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray45), "[false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray8);
        java.lang.Boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray8);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, true);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray12, false, 4);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray12, false);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, false, false, true]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, (int) '#', 0);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (-1.0d));
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) '4');
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (-1.0d), (int) (short) 100, (double) 4);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) (byte) 1);
        float[] floatArray10 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray10);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray10, (int) (short) 1, (int) '#');
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray14, 0.0f, 0);
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray14, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.add(floatArray19, (int) (short) 100, (float) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[100.0, -1.0, 35.0]");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.lang.Float[] floatArray0 = new java.lang.Float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.remove(floatArray2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        char[] charArray0 = null;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray0, '4');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.lang.Object[] objArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY;
        byte[] byteArray2 = new byte[] { (byte) 100 };
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray2, (int) '4', (int) (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray2, (int) (byte) 100, (int) (byte) 0);
        java.lang.Byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray8);
        int int10 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) byteArray8);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray0, (java.lang.Object) byteArray8);
        java.lang.Byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray8);
        long[] longArray13 = new long[] {};
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.clone(longArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray14, 0L);
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.add(longArray14, (long) 10);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray14, 0L);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray14, (long) (short) 1);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray12, (java.lang.Object) (short) 1, 4);
        java.lang.Object obj25 = null;
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray12, obj25);
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (int) (short) 0, 0);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray9);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray9, (int) ' ', (int) (short) -1);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray9, (byte) 0, (int) (byte) 0);
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray23, (int) (short) 0, 0);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.add(byteArray26, (byte) 10);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.clone(byteArray28);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray9, byteArray29);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.remove(byteArray29, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 0, 10, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 10, 0, 10, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[10]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[10]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[10]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray0);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray0, false);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.add(booleanArray0, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.lang.Class<?>[] wildcardClassArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        short[] shortArray6 = new short[] { (byte) 10, (short) -1, (byte) -1, (short) 100, (byte) -1 };
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) wildcardClassArray0, (java.lang.Object) shortArray7, 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement[] annotatedElementArray11 = org.apache.commons.lang3.ArrayUtils.remove((java.lang.reflect.AnnotatedElement[]) wildcardClassArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassArray0);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, -1, -1, 100, -1]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[10, -1, -1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray0);
        double[] doubleArray3 = new double[] { 100.0d };
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 10.0f);
        double[] doubleArray8 = new double[] { 3, 4 };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray3, doubleArray8);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) 10.0f, 0, 0.0d);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray8);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) 5);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[3.0, 4.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[3.0, 4.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        double[] doubleArray3 = new double[] { 'a', 10, 1.0d };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (short) 0, (double) 10.0f);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, 0.0d);
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[97.0, 1.0]");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        double[] doubleArray1 = new double[] { 100.0d };
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) 10.0f);
        double[] doubleArray6 = new double[] { 3, 4 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray6);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, (double) 10.0f, 0, 0.0d);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray6);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, 10.0d, 3, 0.0d);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray6, (double) (-1.0f));
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray18, (double) (byte) 100, 4);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray18, (double) (byte) 1, (double) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.util.Map<java.lang.Object, java.lang.Object> objMap1 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) longArray0);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, 10L);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        long[] longArray6 = new long[] {};
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.clone(longArray6);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) (short) 100, (int) (byte) 1);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.add(longArray6, (long) (short) -1);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray5, longArray12);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(objMap1);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.util.Map<java.lang.Object, java.lang.Object> objMap1 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) longArray0);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, 10L);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, (long) 4);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) 'a');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(longArray6, (long) (byte) 100);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(objMap1);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        double[] doubleArray3 = new double[] { 'a', 10, 1.0d };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (short) 0, (double) 10.0f);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, 0.0d);
        double[] doubleArray12 = new double[] { 'a', 10, 1.0d };
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray12, (double) (short) 0, (double) 10.0f);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray12, 0.0d);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray12);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray18);
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray18, 0.0d);
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray18, (int) ' ', 10);
        double[] doubleArray26 = new double[] { 100.0d };
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray26, (double) 10.0f);
        double[] doubleArray31 = new double[] { 3, 4 };
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray26, doubleArray31);
        java.lang.Double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray31);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray31, (double) (-1L), 0, (double) (byte) 100);
        double[] doubleArray38 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray18, doubleArray31);
        double[] doubleArray39 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray42 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray39, (int) '#', 0);
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray39, (double) 10L, 0, (double) (short) 100);
        double[] doubleArray50 = new double[] { 'a', 10, 1.0d };
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray50, (double) (short) 0, (double) 10.0f);
        int int55 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray50, 0.0d);
        double[] doubleArray59 = new double[] { 'a', 10, 1.0d };
        boolean boolean62 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray59, (double) (short) 0, (double) 10.0f);
        int int64 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray59, 0.0d);
        double[] doubleArray65 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray50, doubleArray59);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray65);
        double[] doubleArray68 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray65, 0.0d);
        double[] doubleArray71 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray65, (int) ' ', 10);
        double[] doubleArray72 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray39, doubleArray71);
        double[] doubleArray73 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray31, doubleArray71);
        int int76 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray73, (double) 100, 10);
        boolean boolean78 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray73, (double) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 10.0, 97.0, 1.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 10.0, 97.0, 1.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0, 97.0, 1.0, 10.0, 97.0, 3.0, 4.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[1.0, 10.0, 97.0, 1.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[1.0, 10.0, 97.0, 1.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        double[] doubleArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        char[] charArray5 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.clone(charArray5);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(charArray5, '4');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.toObject(charArray5);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray10, '#');
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, #, #, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, #, 4, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.util.Map<java.lang.Object, java.lang.Object> objMap1 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) longArray0);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, 10L);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, 0L);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray3, (long) (short) 0, 0);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(objMap1);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.util.Map<java.lang.Object, java.lang.Object> objMap1 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) longArray0);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, 10L);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray3, 0L, 2);
        java.lang.Long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toObject(longArray3);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray7, (-1L));
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray11 = org.apache.commons.lang3.ArrayUtils.remove(longArray9, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(objMap1);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) (byte) -1);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray0, 0.0f);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.clone(floatArray0);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray0, 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.remove(floatArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[]");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, (float) (byte) -1);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray2, (float) 0L, (int) '4');
        java.lang.String str7 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) 0L, "{1,10,-1,0,1,35}");
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        int[] intArray6 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.clone(intArray6);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.add(intArray6, (int) (byte) 0, (int) (byte) 1);
        int[] intArray17 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.clone(intArray17);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray6, intArray17);
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.subarray(intArray6, (int) (short) -1, (int) (byte) -1);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray22, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.lang.Object[] objArray0 = null;
        float[] floatArray1 = new float[] {};
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, 0.0f);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, (float) (byte) -1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, 0.0f);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, 0.0f);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray1);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(objArray0, (java.lang.Object) boolean10);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray8, false);
        boolean[] booleanArray11 = new boolean[] {};
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, false, 0);
        java.lang.Boolean[] booleanArray19 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray19, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray21);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray11, booleanArray21);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray10, booleanArray23);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray23);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray0);
        boolean[] booleanArray27 = null;
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray0, booleanArray27);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray27);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        int[] intArray3 = new int[] { '4', (short) 100, (short) 10 };
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.clone(intArray3);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.clone(intArray3);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.clone(intArray5);
        java.lang.String str8 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray6, "");
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray6, (int) 'a', 0);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray6, (int) (short) 10, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 100, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 100, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{52,100,10}" + "'", str8, "{52,100,10}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, (int) '#');
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, (int) (byte) 10);
        java.lang.Integer[] intArray5 = new java.lang.Integer[] {};
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray5, (int) '#');
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray5, (int) (byte) 10);
        int[] intArray16 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.clone(intArray16);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray17, 10, 4);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray17, (int) (byte) 0, (int) (short) 100);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.addAll(intArray9, intArray17);
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.addAll(intArray4, intArray17);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(intArray17, (int) 'a');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, 4, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        double[] doubleArray1 = new double[] { 100.0d };
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) 10.0f);
        double[] doubleArray6 = new double[] { 3, 4 };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray6);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray1, (double) 0.0f);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray9, (int) (short) 0, 2);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0]");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        float[][] floatArray0 = null;
        float[] floatArray6 = new float[] { (byte) 10, (-1.0f), (byte) 10, ' ', 10L };
        float[] floatArray12 = new float[] { (byte) 10, (-1.0f), (byte) 10, ' ', 10L };
        float[] floatArray18 = new float[] { (byte) 10, (-1.0f), (byte) 10, ' ', 10L };
        float[] floatArray24 = new float[] { (byte) 10, (-1.0f), (byte) 10, ' ', 10L };
        float[] floatArray30 = new float[] { (byte) 10, (-1.0f), (byte) 10, ' ', 10L };
        float[][] floatArray31 = new float[][] { floatArray6, floatArray12, floatArray18, floatArray24, floatArray30 };
        float[][] floatArray32 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray31);
        java.util.Map<java.lang.Object, java.lang.Object> objMap33 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) floatArray0);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0, -1.0, 10.0, 32.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, -1.0, 10.0, 32.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[10.0, -1.0, 10.0, 32.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[10.0, -1.0, 10.0, 32.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[10.0, -1.0, 10.0, 32.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertNull(objMap33);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { false, true };
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2, false);
        char[] charArray8 = new char[] { '4', '#', 'a' };
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.subarray(charArray8, 0, (int) (byte) 1);
        char[] charArray17 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.clone(charArray17);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.addAll(charArray11, charArray17);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray11, '#');
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray2, (java.lang.Object) charArray11, 0);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray11, 'a');
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.clone(charArray25);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray26);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray26);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #, a]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4, a, #, #, 4, #]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { true, false, false, false, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray5, true);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray5);
        java.lang.Boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray8);
        java.lang.Boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap11 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) booleanArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, 'true', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, false, false, false, false]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertNotNull(booleanArray10);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        float[] floatArray0 = null;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (float) '#');
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(floatArray2, (float) 2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[35.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        short[] shortArray0 = null;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) 0);
        org.junit.Assert.assertNull(shortArray2);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.lang.Object[] objArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY;
        byte[] byteArray2 = new byte[] { (byte) 100 };
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray2, (int) '4', (int) (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray2, (int) (byte) 100, (int) (byte) 0);
        java.lang.Byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray8);
        int int10 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) byteArray8);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray0, (java.lang.Object) byteArray8);
        byte[] byteArray13 = new byte[] { (byte) 100 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray13, (int) '4', (int) (byte) 10);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray8, byteArray16);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray17, (byte) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray17);
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        int[] intArray6 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.clone(intArray6);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.add(intArray6, (int) (byte) 0, (int) (byte) 1);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.add(intArray6, 0);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.add(intArray12, 5, 2);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray12, (int) (byte) 0, 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 10, -1, 0, 1, 35, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 10, -1, 0, 1, 2, 35, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        int[] intArray0 = null;
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, 0, 10);
        org.junit.Assert.assertNull(intArray3);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.lang.Short[] shortArray4 = new java.lang.Short[] { (short) -1, (short) 0, (short) 10, (short) 0 };
        java.lang.Short[][] shortArray5 = new java.lang.Short[][] { shortArray4 };
        java.lang.Character[] charArray13 = new java.lang.Character[] { 'a', '4', ' ', '4', ' ', ' ' };
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray13);
        java.lang.Short[] shortArray21 = new java.lang.Short[] { (short) 10, (short) -1, (short) 10, (short) -1, (short) 0, (short) 0 };
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray21, (short) (byte) -1);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray21);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) charArray13, (java.lang.Object[]) shortArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short[][] shortArray26 = org.apache.commons.lang3.ArrayUtils.add(shortArray5, (int) (short) 100, shortArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "a4 4  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "a4 4  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[a, 4,  , 4,  ,  ]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[10, -1, 10, -1, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[10, -1, 10, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.lang.Object[] objArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY;
        byte[] byteArray2 = new byte[] { (byte) 100 };
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray2, (int) '4', (int) (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray2, (int) (byte) 100, (int) (byte) 0);
        java.lang.Byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray8);
        int int10 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) byteArray8);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray0, (java.lang.Object) byteArray8);
        byte[] byteArray13 = new byte[] { (byte) 100 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray13, (int) '4', (int) (byte) 10);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray8, byteArray16);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray24, (int) (short) 0, 0);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray27);
        byte[] byteArray31 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray27, (int) ' ', (int) (short) -1);
        byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.add(byteArray27, (byte) 1);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray8, byteArray33);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray8);
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-1, 10, 0, 10, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        char[] charArray0 = null;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.add(charArray0, '#');
        char[] charArray8 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.clone(charArray8);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray9, '#');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.clone(charArray9);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray9, ' ');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.clone(charArray9);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray9, '#');
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.addAll(charArray2, charArray9);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray21 = org.apache.commons.lang3.ArrayUtils.add(charArray2, (int) (byte) 10, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[#]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, #, 4, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "a#4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "a#4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[a, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "#a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "#a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, a, #, #, 4, #]");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        char[] charArray3 = new char[] { '4', '#', 'a' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.subarray(charArray3, 0, (int) (byte) 1);
        char[] charArray12 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.clone(charArray12);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray12);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray14, '4');
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.clone(charArray14);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, #, a]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, a, #, #, 4, #]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, a, #, #, 4, #]");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        char[] charArray3 = new char[] { '4', '#', 'a' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.subarray(charArray3, 0, (int) (byte) 1);
        char[] charArray12 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.clone(charArray12);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray12);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray14, '#', (int) 'a');
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray14);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray14);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray14);
        char[] charArray26 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.clone(charArray26);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.add(charArray26, (int) (short) 0, '4');
        char[] charArray33 = org.apache.commons.lang3.ArrayUtils.add(charArray26, 2, '#');
        char[] charArray34 = org.apache.commons.lang3.ArrayUtils.addAll(charArray14, charArray26);
        char[] charArray36 = org.apache.commons.lang3.ArrayUtils.add(charArray14, '4');
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray36, 'a');
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, #, a]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#4##a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#4##a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, 4, #, #, a, 4]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "4a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "4a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[4, a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "a###4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "a###4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[a, #, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "#4##a4a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "#4##a4a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[#, 4, #, #, a, 4, a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "#4##a44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "#4##a44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[#, 4, #, #, a, 4, 4]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) 100, (short) -1, (short) 100 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) 10);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap7 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) shortArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '100', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[100, -1, 100]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, -1, 100]");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        double[] doubleArray3 = new double[] { 'a', 10, 1.0d };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (short) 0, (double) 10.0f);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, 0.0d);
        double[] doubleArray12 = new double[] { 'a', 10, 1.0d };
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray12, (double) (short) 0, (double) 10.0f);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray12, 0.0d);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray12);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray18);
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray18, 0.0d);
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray18, (int) ' ', 10);
        double[] doubleArray26 = new double[] { 100.0d };
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray26, (double) 10.0f);
        double[] doubleArray31 = new double[] { 3, 4 };
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray26, doubleArray31);
        java.lang.Double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray31);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray31, (double) (-1L), 0, (double) (byte) 100);
        double[] doubleArray38 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray18, doubleArray31);
        int int42 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, 100.0d, (-1), (double) 100);
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray18, (double) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 10.0, 97.0, 1.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 10.0, 97.0, 1.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 10.0, 97.0, 1.0, 10.0, 97.0, 3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        short[] shortArray2 = new short[] { (short) 1, (short) 100 };
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray2);
        short[] shortArray4 = null;
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray2, shortArray4);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray2, (short) -1);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.clone(shortArray2);
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray2, 0, 0);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.add(shortArray2, (short) 1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[100, 1]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[100, 1, 1]");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray8, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray10);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray10);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray0);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray0);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray14);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray15, false);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray17, true);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.lang.Short[] shortArray0 = new java.lang.Short[] {};
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray0, (short) (byte) 0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.clone(shortArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(shortArray3, (short) (byte) 10);
        short[] shortArray8 = new short[] { (byte) 1, (short) 0 };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray8, (short) (byte) 10);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray8, (short) 0);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray3, shortArray8);
        short[] shortArray19 = new short[] { (byte) -1, (byte) 1, (short) -1, (byte) 0, (byte) 100 };
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray19, (short) (byte) 0, 0);
        short[] shortArray28 = new short[] { (byte) 10, (short) -1, (byte) -1, (short) 100, (byte) -1 };
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.clone(shortArray28);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray29);
        short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray19, shortArray29);
        short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray3, shortArray31);
        short[] shortArray35 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray32, 0, 1);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[]");
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[-1, 1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[10, -1, -1, 100, -1]");
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[-1, 100, -1, -1, 10]");
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[-1, 1, -1, 0, 100, -1, 100, -1, -1, 10]");
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[-1, 1, -1, 0, 100, -1, 100, -1, -1, 10]");
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[-1]");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray8, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray10);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray10);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray0);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray0);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray0);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray15, true, 6);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.lang.Class<?>[] wildcardClassArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        java.lang.Class<?>[] wildcardClassArray1 = org.apache.commons.lang3.ArrayUtils.clone(wildcardClassArray0);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = org.apache.commons.lang3.ArrayUtils.toArray((java.lang.reflect.AnnotatedElement[]) wildcardClassArray0);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) wildcardClassArray0);
        org.junit.Assert.assertNotNull(wildcardClassArray0);
        org.junit.Assert.assertNotNull(wildcardClassArray1);
        org.junit.Assert.assertNotNull(annotatedElementArray2);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        short[] shortArray0 = null;
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray0, (int) (short) 10, 2);
        org.junit.Assert.assertNull(shortArray3);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        java.lang.Long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toObject(longArray0);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray2, (long) (-1));
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        long[] longArray0 = null;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.add(longArray0, (long) (byte) 1);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray2, 0L);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        boolean[] booleanArray0 = null;
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray5, false);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray5, false);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray9, false);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray0, booleanArray9);
        boolean[] booleanArray13 = new boolean[] {};
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray13, false, 0);
        java.lang.Boolean[] booleanArray21 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray21, false);
        boolean[] booleanArray24 = new boolean[] {};
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray24, false, 0);
        java.lang.Boolean[] booleanArray32 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray32, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray34);
        boolean[] booleanArray36 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray24, booleanArray34);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray23, booleanArray36);
        boolean[] booleanArray38 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray13, booleanArray36);
        java.lang.Boolean[] booleanArray43 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray45 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray43, false);
        boolean[] booleanArray46 = new boolean[] {};
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray46, false, 0);
        java.lang.Boolean[] booleanArray54 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray56 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray54, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray56);
        boolean[] booleanArray58 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray46, booleanArray56);
        boolean boolean59 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray45, booleanArray58);
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray36, booleanArray45);
        boolean[] booleanArray61 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray45);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray61);
        int int64 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray61, false);
        boolean boolean66 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray61, false);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray36), "[false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray38), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray43);
        org.junit.Assert.assertNotNull(booleanArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray45), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray46), "[]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(booleanArray54);
        org.junit.Assert.assertNotNull(booleanArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray56), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray58), "[false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(booleanArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray61), "[true, false, false, false]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, (int) '#', 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 10L, 0, (double) (short) 100);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray8);
        double[] doubleArray11 = new double[] { 100.0d };
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray11, (double) 10.0f);
        double[] doubleArray16 = new double[] { 3, 4 };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray11, doubleArray16);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray16, (double) 10.0f, 0, 0.0d);
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray16);
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray8, doubleArray16);
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray8, (double) 3);
        double[] doubleArray28 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray25, 0, 0);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.add(doubleArray28, (double) (byte) 10);
        double[] doubleArray31 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray30);
        double[] doubleArray33 = new double[] { 100.0d };
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray33, (double) 10.0f);
        java.lang.Double[] doubleArray36 = new java.lang.Double[] {};
        double[] doubleArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray36);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray33, doubleArray37);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray33, 0.0d, (double) 100.0f);
        double[] doubleArray42 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray31, doubleArray33);
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray33, (double) 4);
        int int47 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray33, (double) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[3.0, 4.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[3.0, 4.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[3.0, 4.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray8);
        java.lang.Boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray8);
        boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray8, (int) (byte) 100, 7);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.add(booleanArray13, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[]");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        double[] doubleArray3 = new double[] { 'a', 10, 1.0d };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (short) 0, (double) 10.0f);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, 0.0d);
        double[] doubleArray12 = new double[] { 'a', 10, 1.0d };
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray12, (double) (short) 0, (double) 10.0f);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray12, 0.0d);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray12);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray18);
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray18, 0.0d);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) 6, (double) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 10.0, 97.0, 1.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 10.0, 97.0, 1.0, 10.0, 97.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        short[] shortArray5 = new short[] { (byte) 10, (short) -1, (byte) -1, (short) 100, (byte) -1 };
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.clone(shortArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray6);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, -1, -1, 100, -1]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 100, -1, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        short[] shortArray2 = new short[] { (byte) 1, (short) 0 };
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray2, (short) (byte) 10);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray2, (short) 0);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) 1);
        java.lang.Short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray6);
        java.lang.Short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray6);
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[1, 1]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[1]");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray0, (float) (byte) -1);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray0, 0.0f);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.clone(floatArray0);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.add(floatArray7, (int) (short) 1, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[]");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.lang.String[] strArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        java.lang.Character[] charArray6 = new java.lang.Character[] { '4', ' ', '#', '#', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, 'a');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) strArray0, (java.lang.Object[]) charArray6);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, ' ');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.subarray(charArray13, 10, (int) (byte) 10);
        char[] charArray17 = null;
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.addAll(charArray13, charArray17);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray17, '#', (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4 ##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4 ##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4,  , #, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 ##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 ##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  , #, #, 4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4 ##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4 ##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  , #, #, 4]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 ##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 ##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  , #, #, 4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4 ##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4 ##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4,  , #, #, 4]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        int[] intArray6 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.clone(intArray6);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.add(intArray6, (int) (byte) 0, (int) (byte) 1);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, (int) (byte) -1);
        int[] intArray19 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.clone(intArray19);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.add(intArray19, (int) (byte) 0, (int) (byte) 1);
        java.lang.String str25 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray19, "");
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.subarray(intArray19, 10, 3);
        int[] intArray29 = org.apache.commons.lang3.ArrayUtils.addAll(intArray6, intArray19);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray29, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "{1,10,-1,0,1,35}" + "'", str25, "{1,10,-1,0,1,35}");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 10, -1, 0, 1, 35, 1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 9 + "'", int31 == 9);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        char[] charArray0 = null;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.add(charArray0, '#');
        char[] charArray8 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.clone(charArray8);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray9, '#');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.clone(charArray9);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray9, ' ');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.clone(charArray9);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray9, '#');
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.addAll(charArray2, charArray9);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray20 = org.apache.commons.lang3.ArrayUtils.remove(charArray2, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 7, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[#]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, #, 4, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "a#4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "a#4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[a, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "#a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "#a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, a, #, #, 4, #]");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        long[] longArray0 = null;
        org.apache.commons.lang3.ArrayUtils.reverse(longArray0);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        short[] shortArray2 = new short[] { (byte) 1, (short) 0 };
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray2, (short) (byte) 10);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray2, (short) 0);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray2, (short) 100);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray2, (short) (byte) -1);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        double[] doubleArray3 = new double[] { 'a', 10, 1.0d };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (short) 0, (double) 10.0f);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, 0.0d);
        double[] doubleArray12 = new double[] { 'a', 10, 1.0d };
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray12, (double) (short) 0, (double) 10.0f);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray12, 0.0d);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray12);
        java.lang.Double[] doubleArray19 = new java.lang.Double[] {};
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray19, (double) 2);
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray19);
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray12, doubleArray22);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[97.0, 10.0, 1.0, 97.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        char[] charArray3 = new char[] { '4', '#', 'a' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.subarray(charArray3, 0, (int) (byte) 1);
        char[] charArray12 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.clone(charArray12);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray12);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray14, '#', (int) 'a');
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray14);
        java.lang.Character[] charArray19 = org.apache.commons.lang3.ArrayUtils.toObject(charArray14);
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray19);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, #, a]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, a, #, #, 4, #]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4, a, #, #, 4, #]");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (int) (short) -1, (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray0);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray0, false);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (int) (short) 0, 0);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.add(byteArray9, (byte) 10);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray9, (byte) 100);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray9, (byte) 1, (int) (short) 10);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 0, 10, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        short[] shortArray2 = new short[] { (short) 1, (short) 100 };
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray2);
        short[] shortArray4 = null;
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray2, shortArray4);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray2, (short) -1);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.clone(shortArray2);
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray2, 0, 0);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(shortArray11, (short) -1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[100, 1]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.lang.String[] strArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        java.lang.Character[] charArray6 = new java.lang.Character[] { '4', ' ', '#', '#', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, 'a');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) strArray0, (java.lang.Object[]) charArray6);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4 ##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4 ##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4,  , #, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 ##4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 ##4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  , #, #, 4]");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) (byte) 1);
        float[] floatArray10 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray10);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.clone(floatArray10);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray10);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[35.0, -1.0, 100.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[0.0, 0.0, 100.0, -1.0, 35.0]");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        long[] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray3 = org.apache.commons.lang3.ArrayUtils.add(longArray0, (int) ' ', (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) (byte) 1);
        float[] floatArray10 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray10);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray11, (float) 'a');
        int[] intArray20 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.clone(intArray20);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.add(intArray20, (int) (byte) 0, (int) (byte) 1);
        int[] intArray31 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.clone(intArray31);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.contains(intArray32, (int) (short) 0);
        int[] intArray36 = org.apache.commons.lang3.ArrayUtils.add(intArray32, (int) 'a');
        int[] intArray37 = org.apache.commons.lang3.ArrayUtils.clone(intArray32);
        int[] intArray38 = org.apache.commons.lang3.ArrayUtils.addAll(intArray20, intArray37);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) floatArray13, (java.lang.Object) intArray38);
        float[] floatArray40 = org.apache.commons.lang3.ArrayUtils.clone(floatArray13);
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray40, 0.0f);
        float[] floatArray43 = new float[] {};
        float[] floatArray45 = org.apache.commons.lang3.ArrayUtils.add(floatArray43, 0.0f);
        float[] floatArray46 = new float[] {};
        float[] floatArray48 = org.apache.commons.lang3.ArrayUtils.add(floatArray46, 0.0f);
        int int50 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray46, (float) (byte) -1);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray43, floatArray46);
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray43);
        float[] floatArray53 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray40, floatArray43);
        int int56 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray43, 0.0f, (int) 'a');
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 10, -1, 0, 1, 35, 97]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 10, -1, 0, 1, 35, 1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[]");
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray45), "[0.0]");
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray46), "[]");
        org.junit.Assert.assertNotNull(floatArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray48), "[0.0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 0, 1, 10, 10, 1 };
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray7, (-1));
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.clone(intArray7);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(intArray10, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 1, 10, 10, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 1, 10, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.lang.Integer[] intArray0 = null;
        int[] intArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0);
        org.junit.Assert.assertNull(intArray1);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        boolean[] booleanArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray0, true, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ArrayUtils.toString(obj0, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0);
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, (float) 10L);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.remove(floatArray3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray3 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray4 = new java.lang.reflect.AnnotatedElement[][] { annotatedElementArray0, annotatedElementArray1, annotatedElementArray2, annotatedElementArray3 };
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ArrayUtils.clone(wildcardClassArray6);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray8 = org.apache.commons.lang3.ArrayUtils.toArray((java.lang.reflect.AnnotatedElement[]) wildcardClassArray6);
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray9 = org.apache.commons.lang3.ArrayUtils.add(annotatedElementArray4, 1, (java.lang.reflect.AnnotatedElement[]) wildcardClassArray6);
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        org.junit.Assert.assertNotNull(annotatedElementArray1);
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        org.junit.Assert.assertNotNull(annotatedElementArray3);
        org.junit.Assert.assertNotNull(annotatedElementArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(annotatedElementArray8);
        org.junit.Assert.assertNotNull(annotatedElementArray9);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        float[] floatArray0 = null;
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray0, (int) '4', 0);
        org.junit.Assert.assertNull(floatArray3);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        int[] intArray6 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.clone(intArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, (int) (short) 1);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, (int) (byte) 10);
        int[] intArray18 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.clone(intArray18);
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.add(intArray18, (int) (byte) 0, (int) (byte) 1);
        int[] intArray29 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.clone(intArray29);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray18, intArray29);
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray18, (int) (short) 1, 3);
        java.lang.Integer[] intArray35 = org.apache.commons.lang3.ArrayUtils.toObject(intArray18);
        int[] intArray42 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray43 = org.apache.commons.lang3.ArrayUtils.clone(intArray42);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.contains(intArray43, (int) (short) 0);
        int[] intArray47 = org.apache.commons.lang3.ArrayUtils.add(intArray43, (int) 'a');
        int[] intArray48 = org.apache.commons.lang3.ArrayUtils.clone(intArray43);
        int int50 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray48, (int) (short) 0);
        int[] intArray51 = org.apache.commons.lang3.ArrayUtils.addAll(intArray18, intArray48);
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray6, intArray18);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, 10, -1, 0, 1, 35, 97]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, 10, -1, 0, 1, 35, 1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.subarray(longArray0, (int) (byte) 10, (int) (short) 0);
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray4, (long) 0);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(longArray4, (long) (byte) 1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(longArray4, 10L);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.lang.Short[] shortArray6 = new java.lang.Short[] { (short) 10, (short) -1, (short) 10, (short) -1, (short) 0, (short) 0 };
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6, (short) (byte) -1);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6);
        int int10 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) shortArray9);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray9, (short) 0);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[10, -1, 10, -1, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[10, -1, 10, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.add(longArray1, 0, (long) (byte) 1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray1);
        long[] longArray6 = new long[] {};
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.clone(longArray6);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray7, (long) '#');
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray1, longArray7);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray12 = org.apache.commons.lang3.ArrayUtils.remove(longArray7, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '4', ' ', '4', ' ', ' ' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray7, '#', (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a4 4  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a4 4  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, 4,  , 4,  ,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, (float) (byte) -1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray2);
        float[] floatArray4 = new float[] {};
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, 0.0f);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(floatArray4, (float) (byte) 1);
        float[] floatArray14 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray14);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray14, (int) (short) 1, (int) '#');
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.clone(floatArray14);
        float[] floatArray20 = new float[] {};
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.add(floatArray20, 0.0f);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(floatArray20, (float) (byte) 1);
        float[] floatArray30 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray20, floatArray30);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray30, (int) (short) 1, (int) '#');
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.clone(floatArray30);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray14, floatArray35);
        float[] floatArray38 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray14, (float) 10);
        float[] floatArray39 = null;
        float[] floatArray40 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray14, floatArray39);
        float[] floatArray42 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray40, 0.0f);
        float[] floatArray43 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray2, floatArray42);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray42), "[0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[0.0, 100.0, -1.0, 35.0]");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        short[] shortArray5 = new short[] { (byte) -1, (byte) 1, (short) -1, (byte) 0, (byte) 100 };
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray5, (short) (byte) 0, 0);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray5, (short) -1, (-1));
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray5, (short) (byte) 10, 7);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, 1, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, 0.0f);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) (byte) 1);
        float[] floatArray10 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray10);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray10, (int) (short) 1, (int) '#');
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.clone(floatArray10);
        float[] floatArray16 = new float[] {};
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.add(floatArray16, 0.0f);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(floatArray16, (float) (byte) 1);
        float[] floatArray26 = new float[] { (byte) 0, 0.0f, 100.0f, (-1L), '#' };
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray16, floatArray26);
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray26, (int) (short) 1, (int) '#');
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.clone(floatArray26);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray10, floatArray31);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray10, (float) 10);
        float[] floatArray35 = null;
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray10, floatArray35);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray35);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[0.0, 0.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[0.0, 0.0, 100.0, -1.0, 35.0]");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0);
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, (float) 10L);
        char[] charArray7 = new char[] { '4', '#', 'a' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.subarray(charArray7, 0, (int) (byte) 1);
        char[] charArray16 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.clone(charArray16);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.addAll(charArray10, charArray16);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray18, '#', (int) 'a');
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray18);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray18);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray18);
        char[] charArray30 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.clone(charArray30);
        char[] charArray34 = org.apache.commons.lang3.ArrayUtils.add(charArray30, (int) (short) 0, '4');
        char[] charArray37 = org.apache.commons.lang3.ArrayUtils.add(charArray30, 2, '#');
        char[] charArray38 = org.apache.commons.lang3.ArrayUtils.addAll(charArray18, charArray30);
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray18, 'a');
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) floatArray0, (java.lang.Object) 'a', (-1));
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, #, a]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "#4##a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "#4##a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, 4, #, #, a, 4]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "4a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "4a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[4, a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "a###4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "a###4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[a, #, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "#4##a4a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "#4##a4a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[#, 4, #, #, a, 4, a, #, #, 4, #]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) (byte) 10);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, 0L);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) '4', (int) (byte) 10);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.clone(byteArray4);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.add(byteArray4, (byte) -1);
        java.lang.Class<?> wildcardClass8 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.util.Map<java.lang.Object, java.lang.Object> objMap1 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) longArray0);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, 10L);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray3, 0L, 2);
        java.lang.Long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toObject(longArray3);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(objMap1);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray6, (int) (short) 0, 0);
        byte[] byteArray10 = null;
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray6, byteArray10);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray12, (int) '#', 0);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) byteArray6, (java.lang.Object) doubleArray15);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 100);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray18, 0, (int) (short) 10);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.add(byteArray18, (byte) 0);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray18, (byte) 0, 2);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 0, 10, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 10, 0, 10, 0, 0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 10, 0, 10, 0, 0, 100]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 10, 0, 10, 0, 0, 100]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, 10, 0, 10, 0, 0, 100, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        int[] intArray6 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.clone(intArray6);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.add(intArray6, (int) (byte) 0, (int) (byte) 1);
        int[] intArray17 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.clone(intArray17);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray6, intArray17);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray6, (int) (short) 1, 3);
        java.lang.Integer[] intArray23 = org.apache.commons.lang3.ArrayUtils.toObject(intArray6);
        int[] intArray24 = null;
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.addAll(intArray6, intArray24);
        java.lang.Integer[] intArray26 = org.apache.commons.lang3.ArrayUtils.toObject(intArray24);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNull(intArray26);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 0, 1, 10, 10, 1 };
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        java.lang.Integer[] intArray8 = org.apache.commons.lang3.ArrayUtils.toObject(intArray7);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray8);
        int[] intArray16 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.clone(intArray16);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.add(intArray16, (int) (byte) 0, (int) (byte) 1);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray16, (int) (byte) -1);
        int[] intArray29 = new int[] { (short) 1, (short) 10, (byte) -1, (byte) 0, (short) 1, '#' };
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.clone(intArray29);
        int[] intArray33 = org.apache.commons.lang3.ArrayUtils.add(intArray29, (int) (byte) 0, (int) (byte) 1);
        java.lang.String str35 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray29, "");
        int[] intArray38 = org.apache.commons.lang3.ArrayUtils.subarray(intArray29, 10, 3);
        int[] intArray39 = org.apache.commons.lang3.ArrayUtils.addAll(intArray16, intArray29);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray39);
        int[] intArray41 = org.apache.commons.lang3.ArrayUtils.clone(intArray39);
        int[] intArray42 = org.apache.commons.lang3.ArrayUtils.addAll(intArray9, intArray41);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.contains(intArray41, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1, 1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "{1,10,-1,0,1,35}" + "'", str35, "{1,10,-1,0,1,35}");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1, 10, -1, 0, 1, 35, 1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, 10, -1, 0, 1, 35, 1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[0, 0, 1, 10, 10, 1, 1, 10, -1, 0, 1, 35, 1, 10, -1, 0, 1, 35]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        long[] longArray0 = new long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        java.lang.Long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toObject(longArray0);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray8 = org.apache.commons.lang3.ArrayUtils.add(longArray0, 4, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        short[] shortArray2 = new short[] { (byte) 1, (short) 0 };
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray2, (short) (byte) 10);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray2, (short) 0);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray2, (short) 100);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray2, (short) 0);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray2);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray2, (short) 0, 0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.add(booleanArray0, false);
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray0, false);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[false]");
        org.junit.Assert.assertNull(booleanArray4);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        boolean[] booleanArray0 = new boolean[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 0);
        java.lang.Boolean[] booleanArray8 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray8, false);
        boolean[] booleanArray11 = new boolean[] {};
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, false, 0);
        java.lang.Boolean[] booleanArray19 = new java.lang.Boolean[] { true, false, true, false };
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray19, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray21);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray11, booleanArray21);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray10, booleanArray23);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray23);
        java.lang.Boolean[] booleanArray30 = new java.lang.Boolean[] { false, false, false, true };
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray30, false);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray30, false);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray34);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray23, booleanArray34);
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray23, false);
        boolean[] booleanArray41 = org.apache.commons.lang3.ArrayUtils.add(booleanArray23, 0, true);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray23);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray41), "[true, false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 0, 0, 1, 10, 10, 1 };
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.clone(intArray8);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = org.apache.commons.lang3.ArrayUtils.remove(intArray13, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 10, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 1, 10, 10, 1]");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        char[] charArray0 = null;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.add(charArray0, '4');
        char[] charArray6 = new char[] { '4', '#', 'a' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.subarray(charArray6, 0, (int) (byte) 1);
        char[] charArray15 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.clone(charArray15);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.addAll(charArray9, charArray15);
        java.lang.Character[] charArray18 = org.apache.commons.lang3.ArrayUtils.toObject(charArray9);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray18);
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.addAll(charArray0, charArray19);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray22 = org.apache.commons.lang3.ArrayUtils.remove(charArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, #, a]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4]");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4]");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.lang.Object[] objArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY;
        byte[] byteArray2 = new byte[] { (byte) 100 };
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray2, (int) '4', (int) (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray2, (int) (byte) 100, (int) (byte) 0);
        java.lang.Byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray8);
        int int10 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) byteArray8);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray0, (java.lang.Object) byteArray8);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray8, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.add(byteArray13, (int) ' ', (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.lang.String[] strArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        java.util.Map<java.lang.Object, java.lang.Object> objMap1 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) strArray0);
        boolean[] booleanArray7 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray13 = new boolean[] { false, false, false, true, true };
        boolean[] booleanArray19 = new boolean[] { false, false, false, true, true };
        boolean[][] booleanArray20 = new boolean[][] { booleanArray7, booleanArray13, booleanArray19 };
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 0, 0, 1, 10, 10, 1 };
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray27);
        double[] doubleArray32 = new double[] { 'a', 10, 1.0d };
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray32, (double) (short) 0, (double) 10.0f);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray32, 0.0d);
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) intArray27, (java.lang.Object) int37);
        boolean[][] booleanArray39 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray20, (java.lang.Object) intArray27);
        int[] intArray40 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray27);
        java.lang.CharSequence[] charSequenceArray41 = org.apache.commons.lang3.ArrayUtils.removeElement((java.lang.CharSequence[]) strArray0, (java.lang.Object) intArray27);
        java.lang.Byte[] byteArray44 = new java.lang.Byte[] { (byte) 0, (byte) 1 };
        byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray44);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray44, (java.lang.Object) 1L);
        byte[] byteArray48 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray44);
        byte[] byteArray50 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray44, (byte) 10);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) intArray27, (java.lang.Object) byteArray44);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(objMap1);
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 0, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[97.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(booleanArray39);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 0, 1, 10, 10, 1]");
        org.junit.Assert.assertNotNull(charSequenceArray41);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[0, 1]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[0, 1]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) '4', (int) (byte) 10);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) (byte) 100, (int) (byte) 0);
        java.lang.Byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray1);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray1, (byte) 100);
        int int11 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) byteArray10);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray10, (byte) 10, 5);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.add(byteArray10, (-1), (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { false, true };
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray2, false);
        char[] charArray8 = new char[] { '4', '#', 'a' };
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.subarray(charArray8, 0, (int) (byte) 1);
        char[] charArray17 = new char[] { 'a', '#', '#', '4', '#' };
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.clone(charArray17);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.addAll(charArray11, charArray17);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray11, '#');
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray2, (java.lang.Object) charArray11, 0);
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.subarray(charArray11, 100, (int) (short) -1);
        char[] charArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray11, '#');
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray28, '#', 3);
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.clone(charArray28);
        java.lang.Character[] charArray33 = org.apache.commons.lang3.ArrayUtils.toObject(charArray32);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray36 = org.apache.commons.lang3.ArrayUtils.add(charArray32, (int) 'a', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #, a]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[a, #, #, 4, #]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4a##4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4a##4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4, a, #, #, 4, #]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[4]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[4]");
        org.junit.Assert.assertNotNull(charArray33);
    }
}

