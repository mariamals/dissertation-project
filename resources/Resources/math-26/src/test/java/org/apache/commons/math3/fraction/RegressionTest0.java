package org.apache.commons.math3.fraction;

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
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_REAL_VECTOR;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_REAL_VECTOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_FORMAT_INSTANCE_AS_REAL_VECTOR));
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES));
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.add(fraction1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.FUNCTION;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.FUNCTION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.FUNCTION));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-1), 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction -1/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 2);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NORMALIZE_INFINITE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NORMALIZE_INFINITE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NORMALIZE_INFINITE));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int int2 = org.apache.commons.math3.util.FastMath.max(2, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM));
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(fraction1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        double double0 = org.apache.commons.math3.util.FastMath.E;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 2.718281828459045d + "'", double0 == 2.718281828459045d);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        byte byte1 = fraction0.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ASSYMETRIC_EIGEN_NOT_SUPPORTED;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ASSYMETRIC_EIGEN_NOT_SUPPORTED + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ASSYMETRIC_EIGEN_NOT_SUPPORTED));
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 10/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.5f, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_FEASIBLE_SOLUTION;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = localizedFormats0.getLocalizedString(locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_FEASIBLE_SOLUTION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_FEASIBLE_SOLUTION));
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.DISCRETE_CUMULATIVE_PROBABILITY_RETURNED_NAN;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DISCRETE_CUMULATIVE_PROBABILITY_RETURNED_NAN + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DISCRETE_CUMULATIVE_PROBABILITY_RETURNED_NAN));
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_TOO_LARGE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_TOO_LARGE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_TOO_LARGE));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((long) (byte) -1, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-11L) + "'", long2 == (-11L));
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException2 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) 100);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext3 = new org.apache.commons.math3.exception.util.ExceptionContext((java.lang.Throwable) notPositiveException2);
        java.util.Set<java.lang.String> strSet4 = exceptionContext3.getKeys();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_MANY_ELEMENTS_TO_DISCARD_FROM_ARRAY;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_MANY_ELEMENTS_TO_DISCARD_FROM_ARRAY + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_MANY_ELEMENTS_TO_DISCARD_FROM_ARRAY));
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        double double1 = org.apache.commons.math3.util.FastMath.exp(100.00499987500625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7015910473799814E43d + "'", double1 == 2.7015910473799814E43d);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_NUMBER_OF_POINTS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_NUMBER_OF_POINTS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_NUMBER_OF_POINTS));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CONTRACTION_CRITERIA_SMALLER_THAN_EXPANSION_FACTOR;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CONTRACTION_CRITERIA_SMALLER_THAN_EXPANSION_FACTOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CONTRACTION_CRITERIA_SMALLER_THAN_EXPANSION_FACTOR));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_THIRDS;
        org.junit.Assert.assertNotNull(fraction0);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        double double1 = org.apache.commons.math3.util.FastMath.signum(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow(100, 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1661992960 + "'", int2 == 1661992960);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger4 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger0, 0L);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger4);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException4 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction3);
        java.lang.String str5 = notPositiveException4.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.math3.exception.NotPositiveException: 0.4 is smaller than the minimum (0)" + "'", str5, "org.apache.commons.math3.exception.NotPositiveException: 0.4 is smaller than the minimum (0)");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.DISTRIBUTION_NOT_LOADED;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DISTRIBUTION_NOT_LOADED + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DISTRIBUTION_NOT_LOADED));
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(100);
        short short3 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_DEFINITE_MATRIX;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_DEFINITE_MATRIX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_DEFINITE_MATRIX));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (-52.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_NUMBER_OF_SUCCESSES;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_NUMBER_OF_SUCCESSES + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_NUMBER_OF_SUCCESSES));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number) 0L, (java.lang.Number) 0.0d, false);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException6 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats4, (java.lang.Number) 100);
        numberIsTooLargeException3.addSuppressed((java.lang.Throwable) notPositiveException6);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext8 = new org.apache.commons.math3.exception.util.ExceptionContext((java.lang.Throwable) numberIsTooLargeException3);
        java.lang.Number number9 = numberIsTooLargeException3.getArgument();
        boolean boolean10 = numberIsTooLargeException3.getBoundIsAllowed();
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 0L + "'", number9, 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        double double1 = org.apache.commons.math3.util.FastMath.log10(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (-1.0f), Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (-10L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(100);
        long long2 = fraction1.longValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.FUNCTION_NOT_DIFFERENTIABLE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.FUNCTION_NOT_DIFFERENTIABLE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.FUNCTION_NOT_DIFFERENTIABLE));
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.math3.exception.ConvergenceException convergenceException0 = new org.apache.commons.math3.exception.ConvergenceException();
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.61512051684126d + "'", double1 == 4.61512051684126d);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NAN_NOT_ALLOWED;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NAN_NOT_ALLOWED + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NAN_NOT_ALLOWED));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.add(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.multiply(fraction6);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.25d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.MISMATCHED_LOESS_ABSCISSA_ORDINATE_ARRAYS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.MISMATCHED_LOESS_ABSCISSA_ORDINATE_ARRAYS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.MISMATCHED_LOESS_ABSCISSA_ORDINATE_ARRAYS));
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SYMMETRIC_MATRIX;
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException6 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction3, (java.lang.Number) 100, true);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math3.exception.util.LocalizedFormats.CROSSING_BOUNDARY_LOOPS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_COMPLEX_MODULE;
        java.lang.Number number10 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException12 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats8, (java.lang.Number) (byte) 100, number10, false);
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int14 = fraction13.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException17 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction16);
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction18.negate();
        org.apache.commons.math3.fraction.FractionField fractionField20 = fraction19.getField();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats21 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_ADDITION;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats22 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_ABSCISSA;
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.TWO_THIRDS;
        java.lang.Object[] objArray24 = new java.lang.Object[] { (byte) 100, fraction16, fractionField20, localizedFormats21, localizedFormats22, fraction23 };
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException25 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) numberIsTooSmallException6, (org.apache.commons.math3.exception.util.Localizable) localizedFormats7, objArray24);
        boolean boolean26 = numberIsTooSmallException6.getBoundIsAllowed();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SYMMETRIC_MATRIX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SYMMETRIC_MATRIX));
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CROSSING_BOUNDARY_LOOPS + "'", localizedFormats7.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CROSSING_BOUNDARY_LOOPS));
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_COMPLEX_MODULE + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_COMPLEX_MODULE));
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fractionField20);
        org.junit.Assert.assertTrue("'" + localizedFormats21 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_ADDITION + "'", localizedFormats21.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_ADDITION));
        org.junit.Assert.assertTrue("'" + localizedFormats22 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_ABSCISSA + "'", localizedFormats22.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_ABSCISSA));
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 0.2f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5848035505473238d + "'", double1 == 0.5848035505473238d);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        double double1 = org.apache.commons.math3.util.FastMath.abs(7.26310292903031E31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.26310292903031E31d + "'", double1 == 7.26310292903031E31d);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) (short) 1);
        java.lang.String str4 = fraction0.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2 / 5" + "'", str4, "2 / 5");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger6 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger2, bigInteger5);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger8 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger2, (-11L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: exponent (-11)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.negate();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction1);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.multiply(100);
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException11 = new org.apache.commons.math3.exception.NumberIsTooLargeException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction6, (java.lang.Number) fraction7, true);
        org.apache.commons.math3.fraction.Fraction fraction14 = new org.apache.commons.math3.fraction.Fraction((int) '#', (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction6.add(fraction14);
        int int16 = fraction15.intValue();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.7015910473799814E43d, (int) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.2808418909780554E72d + "'", double2 == 4.2808418909780554E72d);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_DECREASING_NUMBER_OF_POINTS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_DECREASING_NUMBER_OF_POINTS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_DECREASING_NUMBER_OF_POINTS));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.math3.exception.NotPositiveException notPositiveException1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) 1.0000000000000002d);
        java.lang.Number number2 = notPositiveException1.getArgument();
        org.junit.Assert.assertEquals("'" + number2 + "' != '" + 1.0000000000000002d + "'", number2, 1.0000000000000002d);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_BOUNDS_QUANTILE_VALUE;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = localizedFormats0.getLocalizedString(locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_BOUNDS_QUANTILE_VALUE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_BOUNDS_QUANTILE_VALUE));
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((int) (short) 1, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.SAME_SIGN_AT_ENDPOINTS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.SAME_SIGN_AT_ENDPOINTS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.SAME_SIGN_AT_ENDPOINTS));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient((int) (byte) 1, 149);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: must have n >= k for binomial coefficient (n, k), got k = 149, n = 1");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) 10.0f, 52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 10 to fraction (-9/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger6 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger2, bigInteger5);
        java.math.BigInteger bigInteger7 = null;
        java.math.BigInteger bigInteger9 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger7, (long) 0);
        java.math.BigInteger bigInteger10 = null;
        java.math.BigInteger bigInteger12 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger10, (long) 0);
        java.math.BigInteger bigInteger13 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger9, bigInteger12);
        java.math.BigInteger bigInteger14 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger2, bigInteger9);
        java.math.BigInteger bigInteger16 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger2, 0);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger16);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        double double0 = org.apache.commons.math3.util.FastMath.random();
// flaky:         org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.051810728108834914d + "'", double0 == 0.051810728108834914d);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.29577951308232d) + "'", double1 == (-57.29577951308232d));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((long) 100, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 110L + "'", long2 == 110L);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException5 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.subtract(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction4.add((int) (short) 0);
        byte byte9 = fraction8.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 8L, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException5 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.subtract(fraction4);
        long long7 = fraction0.longValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.pow((long) 3, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2984622845537545263L) + "'", long2 == (-2984622845537545263L));
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException4 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.divide(fraction5);
        byte byte7 = fraction5.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) (short) 1);
        int int4 = fraction3.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        double double1 = org.apache.commons.math3.util.FastMath.asin(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 36);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.abs();
        float float2 = fraction0.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int4 = fraction3.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException7 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction0.divide(fraction6);
        java.lang.String str9 = fraction0.toString();
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction0.multiply(35);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 2" + "'", str9, "1 / 2");
        org.junit.Assert.assertNotNull(fraction11);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((long) (short) 1, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (-52.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9155040003582885E22d) + "'", double1 == (-1.9155040003582885E22d));
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException3 = new org.apache.commons.math3.fraction.FractionConversionException((double) (byte) -1, 100L, (long) (-1));
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext4 = fractionConversionException3.getContext();
        java.lang.Object obj6 = exceptionContext4.getValue("hi!");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_COMPUTE_COVARIANCE_SINGULAR_PROBLEM;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats9 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_SHAPE;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats10 = org.apache.commons.math3.exception.util.LocalizedFormats.CONVERGENCE_FAILED;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.WHOLE_FORMAT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats12 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_FIXED_LENGTH_CHROMOSOME;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats14 = org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats15 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL;
        java.lang.String str16 = localizedFormats15.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats17 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats18 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO;
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException20 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction19);
        java.lang.Object[] objArray22 = new java.lang.Object[] { localizedFormats15, localizedFormats17, localizedFormats18, fraction19, (-10L) };
        java.lang.Object[] objArray23 = org.apache.commons.math3.exception.util.ArgUtils.flatten(objArray22);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException24 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats14, objArray22);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats25 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats26 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException28 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats26, (java.lang.Number) 100);
        org.apache.commons.math3.exception.util.Localizable localizable29 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats30 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA;
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException32 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats30, objArray31);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException33 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) notPositiveException28, localizable29, objArray31);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException34 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException24, (org.apache.commons.math3.exception.util.Localizable) localizedFormats25, objArray31);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException35 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats13, objArray31);
        org.apache.commons.math3.exception.ConvergenceException convergenceException36 = new org.apache.commons.math3.exception.ConvergenceException((org.apache.commons.math3.exception.util.Localizable) localizedFormats12, objArray31);
        org.apache.commons.math3.fraction.Fraction fraction37 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction37.reciprocal();
        java.lang.Object[] objArray39 = new java.lang.Object[] { 52.0f, localizedFormats9, localizedFormats10, localizedFormats11, localizedFormats12, fraction38 };
        exceptionContext4.addMessage((org.apache.commons.math3.exception.util.Localizable) localizedFormats7, objArray39);
        org.junit.Assert.assertNotNull(exceptionContext4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_COMPUTE_COVARIANCE_SINGULAR_PROBLEM + "'", localizedFormats7.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_COMPUTE_COVARIANCE_SINGULAR_PROBLEM));
        org.junit.Assert.assertTrue("'" + localizedFormats9 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_SHAPE + "'", localizedFormats9.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_SHAPE));
        org.junit.Assert.assertTrue("'" + localizedFormats10 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CONVERGENCE_FAILED + "'", localizedFormats10.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CONVERGENCE_FAILED));
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.WHOLE_FORMAT + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.WHOLE_FORMAT));
        org.junit.Assert.assertTrue("'" + localizedFormats12 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_FIXED_LENGTH_CHROMOSOME + "'", localizedFormats12.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_FIXED_LENGTH_CHROMOSOME));
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA));
        org.junit.Assert.assertTrue("'" + localizedFormats14 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT + "'", localizedFormats14.equals(org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT));
        org.junit.Assert.assertTrue("'" + localizedFormats15 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL + "'", localizedFormats15.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "too small integration interval: length = {0}" + "'", str16, "too small integration interval: length = {0}");
        org.junit.Assert.assertTrue("'" + localizedFormats17 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES + "'", localizedFormats17.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES));
        org.junit.Assert.assertTrue("'" + localizedFormats18 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO + "'", localizedFormats18.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO));
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertTrue("'" + localizedFormats25 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME + "'", localizedFormats25.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME));
        org.junit.Assert.assertTrue("'" + localizedFormats26 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats26.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertTrue("'" + localizedFormats30 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA + "'", localizedFormats30.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[52.0, NOT_POSITIVE_SHAPE, CONVERGENCE_FAILED, WHOLE_FORMAT, INVALID_FIXED_LENGTH_CHROMOSOME, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[52.0, NOT_POSITIVE_SHAPE, CONVERGENCE_FAILED, WHOLE_FORMAT, INVALID_FIXED_LENGTH_CHROMOSOME, 4]");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) (-2L), 0.0d, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -2 to fraction (3/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.negate();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.subtract(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.abs();
        byte byte5 = fraction4.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((long) (-1), (-10L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 32/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL;
        java.lang.String str3 = localizedFormats2.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException7 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction6);
        java.lang.Object[] objArray9 = new java.lang.Object[] { localizedFormats2, localizedFormats4, localizedFormats5, fraction6, (-10L) };
        java.lang.Object[] objArray10 = org.apache.commons.math3.exception.util.ArgUtils.flatten(objArray9);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException11 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, objArray9);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats12 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException15 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats13, (java.lang.Number) 100);
        org.apache.commons.math3.exception.util.Localizable localizable16 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats17 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA;
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException19 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats17, objArray18);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException20 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) notPositiveException15, localizable16, objArray18);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException21 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException11, (org.apache.commons.math3.exception.util.Localizable) localizedFormats12, objArray18);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException22 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray18);
        java.lang.Throwable[] throwableArray23 = mathIllegalStateException22.getSuppressed();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT));
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "too small integration interval: length = {0}" + "'", str3, "too small integration interval: length = {0}");
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO));
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertTrue("'" + localizedFormats12 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME + "'", localizedFormats12.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME));
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertTrue("'" + localizedFormats17 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA + "'", localizedFormats17.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.pow(0L, 110L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        long long2 = org.apache.commons.math3.util.FastMath.min(43L, (-43L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-43L) + "'", long2 == (-43L));
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 2/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        int int1 = org.apache.commons.math3.util.FastMath.abs(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException5 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.subtract(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction4.add((int) (byte) 0);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.EVALUATIONS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.EVALUATIONS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.EVALUATIONS));
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException3 = new org.apache.commons.math3.fraction.FractionConversionException((double) (byte) -1, 100L, (long) (-1));
        java.lang.String str4 = fractionConversionException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.math3.fraction.FractionConversionException: illegal state: Overflow trying to convert -1 to fraction (100/-1)" + "'", str4, "org.apache.commons.math3.fraction.FractionConversionException: illegal state: Overflow trying to convert -1 to fraction (100/-1)");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.negate();
        org.apache.commons.math3.fraction.Fraction fraction2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.subtract(fraction2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.negate();
        float float2 = fraction1.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.abs();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.2f) + "'", float2 == (-0.2f));
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        double double1 = org.apache.commons.math3.util.FastMath.acos(5.197683183284627E21d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10, 10);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply(100);
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException7 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number) 10, (java.lang.Number) fraction5, false);
        boolean boolean8 = numberIsTooLargeException7.getBoundIsAllowed();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext9 = new org.apache.commons.math3.exception.util.ExceptionContext((java.lang.Throwable) numberIsTooLargeException7);
        java.util.Set<java.lang.String> strSet10 = exceptionContext9.getKeys();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 149);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.5258789E-5f + "'", float1 == 1.5258789E-5f);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) '4', 0.0d, 13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 52 to fraction (-51/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        int int1 = org.apache.commons.math3.util.FastMath.abs(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        double double1 = org.apache.commons.math3.util.FastMath.tan(100.00499987500625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5805096102872436d) + "'", double1 == (-0.5805096102872436d));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT;
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.subtract(fraction4);
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException7 = new org.apache.commons.math3.exception.NumberIsTooLargeException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) 1661992960, (java.lang.Number) fraction5, false);
        java.lang.Number number8 = numberIsTooLargeException7.getArgument();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 1661992960 + "'", number8, 1661992960);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_DEFINITE_OPERATOR;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = localizedFormats0.getLocalizedString(locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_DEFINITE_OPERATOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_DEFINITE_OPERATOR));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018268069E13d + "'", double1 == 7.896296018268069E13d);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(0.0d, (double) 166199296000L, (int) (byte) 100);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.993222846126381d + "'", double1 == 2.993222846126381d);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.negate();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) (byte) 0);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.abs();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS;
        boolean boolean3 = fraction1.equals((java.lang.Object) localizedFormats2);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction1.getField();
        java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.fraction.Fraction>> wildcardClass5 = fractionField4.getRuntimeClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        float float1 = org.apache.commons.math3.util.FastMath.signum(35.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(36, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 36/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(9L, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 90L + "'", long2 == 90L);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 100/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((long) (byte) 1, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int6 = fraction4.compareTo(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction4.divide((int) '4');
        int int9 = fraction2.compareTo(fraction8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction11 = fraction2.divide(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 8/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 8L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0794415416798357d + "'", double1 == 2.0794415416798357d);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog((int) (short) 0, 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: must have n >= k for binomial coefficient (n, k), got k = 35, n = 0");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble((int) 'a', 8);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4452020882E11d + "'", double2 == 1.4452020882E11d);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.2425230239169618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2425230239169618d + "'", double1 == 1.2425230239169618d);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(4.2808418909780554E72d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 4,280,841,890,978,055,400,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000 to fraction (9,223,372,036,854,775,807/1)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.subtract(fraction2);
        short short5 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 35 + "'", short5 == (short) 35);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 0.9913289158005998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.9155040003582885E22d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        double double1 = org.apache.commons.math3.util.FastMath.cos(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-2L), (-10.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.0f) + "'", float2 == (-10.0f));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (-32L), (double) 32L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.negate();
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.subtract(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.add(1661992960);
        java.lang.String str6 = fraction5.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-279969794 / 5" + "'", str6, "-279969794 / 5");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.subtract(fraction2);
        long long5 = fraction4.longValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(558.9999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.7563905186483d + "'", double1 == 9.7563905186483d);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient((int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        int int1 = fraction0.getNumerator();
        float float2 = fraction0.floatValue();
        short short3 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.2f + "'", float2 == 0.2f);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_KNOT_VALUES;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_KNOT_VALUES + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_STRICTLY_INCREASING_KNOT_VALUES));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((-4435000799265758143L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4435000799265758143L) + "'", long2 == (-4435000799265758143L));
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException0 = new org.apache.commons.math3.exception.NullArgumentException();
        java.lang.String str1 = nullArgumentException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.commons.math3.exception.NullArgumentException: null is not allowed" + "'", str1, "org.apache.commons.math3.exception.NullArgumentException: null is not allowed");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.negate();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction1);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.multiply(100);
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException11 = new org.apache.commons.math3.exception.NumberIsTooLargeException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction6, (java.lang.Number) fraction7, true);
        boolean boolean12 = numberIsTooLargeException11.getBoundIsAllowed();
        java.lang.Number number13 = numberIsTooLargeException11.getArgument();
        java.lang.Throwable[] throwableArray14 = numberIsTooLargeException11.getSuppressed();
        boolean boolean15 = numberIsTooLargeException11.getBoundIsAllowed();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(number13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow(36, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.DIFFERENT_ROWS_LENGTHS;
        java.lang.String str1 = localizedFormats0.getSourceString();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIFFERENT_ROWS_LENGTHS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIFFERENT_ROWS_LENGTHS));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "some rows have length {0} while others have length {1}" + "'", str1, "some rows have length {0} while others have length {1}");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        double double1 = org.apache.commons.math3.util.FastMath.acos(4.61512051684126d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_REGRESSION;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = localizedFormats0.getLocalizedString(locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_REGRESSION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_ENOUGH_DATA_REGRESSION));
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-57.29577951308232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.0d, (double) 166199296000L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.66199296E11d + "'", double2 == 1.66199296E11d);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ARITHMETIC_EXCEPTION;
        java.lang.String str1 = localizedFormats0.getSourceString();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARITHMETIC_EXCEPTION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARITHMETIC_EXCEPTION));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arithmetic exception" + "'", str1, "arithmetic exception");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.negate();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction1);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.multiply(100);
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException11 = new org.apache.commons.math3.exception.NumberIsTooLargeException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction6, (java.lang.Number) fraction7, true);
        org.apache.commons.math3.fraction.Fraction fraction14 = new org.apache.commons.math3.fraction.Fraction((int) '#', (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction6.add(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction17 = new org.apache.commons.math3.fraction.Fraction((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction18.negate();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.subtract(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction15.subtract(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction20.multiply((int) 'a');
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction23.negate();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5515679276951895d + "'", double1 == 1.5515679276951895d);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        long long1 = org.apache.commons.math3.util.FastMath.round(100.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction((int) '#', 1);
        byte byte3 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 35 + "'", byte3 == (byte) 35);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INDEX_NOT_POSITIVE;
        java.lang.Object[] objArray1 = null;
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException2 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray1);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INDEX_NOT_POSITIVE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INDEX_NOT_POSITIVE));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        boolean boolean1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo(20L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSION;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException2 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) 32.0d);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSION));
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10, 10);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.multiply(100);
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException7 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number) 10, (java.lang.Number) fraction5, false);
        java.lang.String str8 = numberIsTooLargeException7.toString();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math3.exception.NumberIsTooLargeException: 10 is larger than, or equal to, the maximum (20)" + "'", str8, "org.apache.commons.math3.exception.NumberIsTooLargeException: 10 is larger than, or equal to, the maximum (20)");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(0L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.abs();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS;
        boolean boolean3 = fraction1.equals((java.lang.Object) localizedFormats2);
        double double4 = fraction1.doubleValue();
        java.lang.String str5 = fraction1.toString();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 / 2" + "'", str5, "1 / 2");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException4 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.divide(fraction5);
        byte byte7 = fraction3.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.URL_CONTAINS_NO_DATA;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException4 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) 100L, (java.lang.Number) 2.154434690031884d, false);
        java.lang.Number number5 = numberIsTooSmallException4.getMin();
        java.lang.Number number6 = numberIsTooSmallException4.getArgument();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext7 = new org.apache.commons.math3.exception.util.ExceptionContext((java.lang.Throwable) numberIsTooSmallException4);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.URL_CONTAINS_NO_DATA + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.URL_CONTAINS_NO_DATA));
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 2.154434690031884d + "'", number5, 2.154434690031884d);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 100L + "'", number6, 100L);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.negate();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.divide(1661992960);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction1.divide((int) (short) 100);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 52L, (double) 36);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.972007862845807E61d + "'", double2 == 5.972007862845807E61d);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException0 = new org.apache.commons.math3.exception.MathArithmeticException();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext1 = mathArithmeticException0.getContext();
        java.util.Set<java.lang.String> strSet2 = exceptionContext1.getKeys();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL;
        java.lang.String str6 = localizedFormats5.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO;
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException10 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction9);
        java.lang.Object[] objArray12 = new java.lang.Object[] { localizedFormats5, localizedFormats7, localizedFormats8, fraction9, (-10L) };
        java.lang.Object[] objArray13 = org.apache.commons.math3.exception.util.ArgUtils.flatten(objArray12);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException14 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats4, objArray12);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats15 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats16 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException18 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats16, (java.lang.Number) 100);
        org.apache.commons.math3.exception.util.Localizable localizable19 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats20 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA;
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException22 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats20, objArray21);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException23 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) notPositiveException18, localizable19, objArray21);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException24 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException14, (org.apache.commons.math3.exception.util.Localizable) localizedFormats15, objArray21);
        exceptionContext1.setValue("shape must be positive ({0})", (java.lang.Object) mathIllegalStateException14);
        java.lang.Throwable throwable26 = exceptionContext1.getThrowable();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats27 = org.apache.commons.math3.exception.util.LocalizedFormats.VECTOR_LENGTH_MISMATCH;
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException28 = new org.apache.commons.math3.exception.NullArgumentException();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats29 = org.apache.commons.math3.exception.util.LocalizedFormats.UNMATCHED_ODE_IN_EXPANDED_SET;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats30 = org.apache.commons.math3.exception.util.LocalizedFormats.FRACTION;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats31 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL;
        java.lang.String str32 = localizedFormats31.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats33 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats34 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO;
        org.apache.commons.math3.fraction.Fraction fraction35 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException36 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction35);
        java.lang.Object[] objArray38 = new java.lang.Object[] { localizedFormats31, localizedFormats33, localizedFormats34, fraction35, (-10L) };
        java.lang.Object[] objArray39 = org.apache.commons.math3.exception.util.ArgUtils.flatten(objArray38);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException40 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats30, objArray38);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException41 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) nullArgumentException28, (org.apache.commons.math3.exception.util.Localizable) localizedFormats29, objArray38);
        exceptionContext1.addMessage((org.apache.commons.math3.exception.util.Localizable) localizedFormats27, objArray38);
        java.lang.Object obj44 = exceptionContext1.getValue("denominator must be different from 0");
        org.junit.Assert.assertNotNull(exceptionContext1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "too small integration interval: length = {0}" + "'", str6, "too small integration interval: length = {0}");
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES + "'", localizedFormats7.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES));
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertTrue("'" + localizedFormats15 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME + "'", localizedFormats15.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME));
        org.junit.Assert.assertTrue("'" + localizedFormats16 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats16.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertTrue("'" + localizedFormats20 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA + "'", localizedFormats20.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(throwable26);
        org.junit.Assert.assertEquals(throwable26.getLocalizedMessage(), "arithmetic exception: vector length mismatch: got TOO_SMALL_INTEGRATION_INTERVAL but expected NOT_SUBTRACTION_COMPATIBLE_MATRICES");
        org.junit.Assert.assertEquals(throwable26.getMessage(), "arithmetic exception: vector length mismatch: got TOO_SMALL_INTEGRATION_INTERVAL but expected NOT_SUBTRACTION_COMPATIBLE_MATRICES");
        org.junit.Assert.assertEquals(throwable26.toString(), "org.apache.commons.math3.exception.MathArithmeticException: arithmetic exception: vector length mismatch: got TOO_SMALL_INTEGRATION_INTERVAL but expected NOT_SUBTRACTION_COMPATIBLE_MATRICES");
        org.junit.Assert.assertTrue("'" + localizedFormats27 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.VECTOR_LENGTH_MISMATCH + "'", localizedFormats27.equals(org.apache.commons.math3.exception.util.LocalizedFormats.VECTOR_LENGTH_MISMATCH));
        org.junit.Assert.assertTrue("'" + localizedFormats29 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNMATCHED_ODE_IN_EXPANDED_SET + "'", localizedFormats29.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNMATCHED_ODE_IN_EXPANDED_SET));
        org.junit.Assert.assertTrue("'" + localizedFormats30 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.FRACTION + "'", localizedFormats30.equals(org.apache.commons.math3.exception.util.LocalizedFormats.FRACTION));
        org.junit.Assert.assertTrue("'" + localizedFormats31 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL + "'", localizedFormats31.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "too small integration interval: length = {0}" + "'", str32, "too small integration interval: length = {0}");
        org.junit.Assert.assertTrue("'" + localizedFormats33 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES + "'", localizedFormats33.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES));
        org.junit.Assert.assertTrue("'" + localizedFormats34 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO + "'", localizedFormats34.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO));
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble(0, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: must have n >= k for binomial coefficient (n, k), got k = 52, n = 0");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((int) (byte) 35, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL;
        java.lang.String str3 = localizedFormats2.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException7 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction6);
        java.lang.Object[] objArray9 = new java.lang.Object[] { localizedFormats2, localizedFormats4, localizedFormats5, fraction6, (-10L) };
        java.lang.Object[] objArray10 = org.apache.commons.math3.exception.util.ArgUtils.flatten(objArray9);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException11 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, objArray9);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats12 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException15 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats13, (java.lang.Number) 100);
        org.apache.commons.math3.exception.util.Localizable localizable16 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats17 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA;
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException19 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats17, objArray18);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException20 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) notPositiveException15, localizable16, objArray18);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException21 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException11, (org.apache.commons.math3.exception.util.Localizable) localizedFormats12, objArray18);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException22 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray18);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext23 = mathIllegalStateException22.getContext();
        exceptionContext23.setValue("2 / 5", (java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT));
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "too small integration interval: length = {0}" + "'", str3, "too small integration interval: length = {0}");
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO));
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertTrue("'" + localizedFormats12 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME + "'", localizedFormats12.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME));
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertTrue("'" + localizedFormats17 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA + "'", localizedFormats17.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(exceptionContext23);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow(1, 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(5.197683183284627E21d, (int) (byte) 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 5,197,683,183,284,627,000,000 to fraction (9,223,372,036,854,775,807/1)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.negate();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction1);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.multiply(100);
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException11 = new org.apache.commons.math3.exception.NumberIsTooLargeException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction6, (java.lang.Number) fraction7, true);
        org.apache.commons.math3.fraction.Fraction fraction14 = new org.apache.commons.math3.fraction.Fraction((int) '#', (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction6.add(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction17 = new org.apache.commons.math3.fraction.Fraction((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction18.negate();
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.subtract(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction15.subtract(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction20.multiply((int) 'a');
        long long24 = fraction20.longValue();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 35L + "'", long24 == 35L);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 45, (double) 36);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0d + "'", double2 == 9.0d);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(3, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (byte) 35);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_LENGTH;
        java.lang.String str1 = localizedFormats0.getSourceString();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_LENGTH + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_LENGTH));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "length must be positive ({0})" + "'", str1, "length must be positive ({0})");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.pow((long) 45, 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2068960118261646993L + "'", long2 == 2068960118261646993L);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OUT_OF_RANGE_LEFT));
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.0d, 7.896296018268069E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        int int2 = fraction1.getNumerator();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) int2);
        java.math.BigInteger bigInteger4 = null;
        java.math.BigInteger bigInteger6 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger4, (long) 0);
        java.math.BigInteger bigInteger7 = null;
        java.math.BigInteger bigInteger9 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger7, (long) 0);
        java.math.BigInteger bigInteger10 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger6, bigInteger9);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException11 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) bigInteger9);
        byte byte12 = bigInteger9.byteValue();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(7.26310292903031E31d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 72,631,029,290,303,100,000,000,000,000,000 to fraction (9,223,372,036,854,775,807/1)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        int int1 = org.apache.commons.math3.util.FastMath.round(43.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 43 + "'", int1 == 43);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.2676506002282294E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.782955149376719d) + "'", double1 == (-1.782955149376719d));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.abs();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        int int6 = fraction4.compareTo(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction4.divide((int) '4');
        int int9 = fraction2.compareTo(fraction8);
        java.lang.String str10 = fraction8.toString();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 / 104" + "'", str10, "1 / 104");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.negate();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.subtract(fraction2);
        int int4 = fraction3.getDenominator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.5515679276951895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2534738882134033d + "'", double1 == 2.2534738882134033d);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(57.29577951308232d, (-0.7504915783575618d), 1594323);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 57.296 to fraction (2,919,286,372/50,951,159)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681398d + "'", double1 == 0.5403023058681398d);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(5, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 485 + "'", int2 == 485);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.lang.Number number0 = null;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.abs();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.add(fraction6);
        int int8 = fraction1.compareTo(fraction5);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException10 = new org.apache.commons.math3.exception.NumberIsTooSmallException(number0, (java.lang.Number) int8, false);
        java.lang.Number number11 = numberIsTooSmallException10.getMin();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + (-1) + "'", number11, (-1));
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, (double) 45);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.subtract(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.subtract(fraction4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.divide(0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 2/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        long long2 = org.apache.commons.math3.util.FastMath.max((-1L), 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.pow(0L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.abs();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS;
        boolean boolean3 = fraction1.equals((java.lang.Object) localizedFormats2);
        org.apache.commons.math3.fraction.Fraction fraction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction5 = fraction1.add(fraction4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.233403117511217d) + "'", double1 == (-1.233403117511217d));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(0, (int) ' ');
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((long) 100, (long) 8);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 800L + "'", long2 == 800L);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.abs();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS;
        boolean boolean3 = fraction1.equals((java.lang.Object) localizedFormats2);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.abs();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.add(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction1.add(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction8.multiply(149);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 35.0f, Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(485, (int) (short) 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException2 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) 100);
        org.apache.commons.math3.exception.util.Localizable localizable3 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA;
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException6 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats4, objArray5);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException7 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) notPositiveException2, localizable3, objArray5);
        boolean boolean8 = notPositiveException2.getBoundIsAllowed();
        java.lang.Number number9 = notPositiveException2.getMin();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA));
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 0 + "'", number9, 0);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 10/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_INTERVAL_INITIAL_VALUE_PARAMETERS;
        java.lang.String str1 = localizedFormats0.getSourceString();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_INTERVAL_INITIAL_VALUE_PARAMETERS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_INTERVAL_INITIAL_VALUE_PARAMETERS));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "invalid interval, initial value parameters:  lower={0}, initial={1}, upper={2}" + "'", str1, "invalid interval, initial value parameters:  lower={0}, initial={1}, upper={2}");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-50.0d), (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 50.0d + "'", double2 == 50.0d);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((-43L), (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-41L) + "'", long2 == (-41L));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) '#', (int) (byte) 10);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 0.2f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19739556271548866d + "'", double1 == 0.19739556271548866d);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) (short) 1);
        int int2 = fraction1.getDenominator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134034E13d + "'", double1 == 3.948148009134034E13d);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.reciprocal();
        short short2 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 4 + "'", short2 == (short) 4);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.add((int) (short) 0);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.reciprocal();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 4, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.5707963267948966d), 2.0794415416798357d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948963d) + "'", double2 == (-1.5707963267948963d));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        double double1 = org.apache.commons.math3.util.ArithmeticUtils.factorialLog((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.104412573075516d + "'", double1 == 15.104412573075516d);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.428182669496151d) + "'", double1 == (-0.428182669496151d));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException2 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) 100);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext3 = new org.apache.commons.math3.exception.util.ExceptionContext((java.lang.Throwable) notPositiveException2);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.FAILED_BRACKETING;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats6 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL;
        java.lang.String str7 = localizedFormats6.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats9 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO;
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException11 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction10);
        java.lang.Object[] objArray13 = new java.lang.Object[] { localizedFormats6, localizedFormats8, localizedFormats9, fraction10, (-10L) };
        java.lang.Object[] objArray14 = org.apache.commons.math3.exception.util.ArgUtils.flatten(objArray13);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException15 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats5, objArray14);
        exceptionContext3.setValue("null is not allowed", (java.lang.Object) localizedFormats5);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.FAILED_BRACKETING + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.FAILED_BRACKETING));
        org.junit.Assert.assertTrue("'" + localizedFormats6 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL + "'", localizedFormats6.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "too small integration interval: length = {0}" + "'", str7, "too small integration interval: length = {0}");
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES));
        org.junit.Assert.assertTrue("'" + localizedFormats9 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO + "'", localizedFormats9.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO));
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        int int2 = org.apache.commons.math3.util.FastMath.max(35, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        double double1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble(45);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1962222086548034E56d + "'", double1 == 1.1962222086548034E56d);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(0L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-100L) + "'", long2 == (-100L));
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-1), 2);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int5 = fraction4.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException8 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction3.subtract(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction7.add((int) (short) 0);
        int int12 = fraction2.compareTo(fraction11);
        java.lang.String str13 = fraction11.toString();
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException16 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number) fraction11, (java.lang.Number) 0.5558738409986911d, true);
        java.lang.Number number17 = numberIsTooLargeException16.getArgument();
        java.lang.Number number18 = numberIsTooLargeException16.getMax();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2 / 5" + "'", str13, "2 / 5");
        org.junit.Assert.assertNotNull(number17);
        org.junit.Assert.assertEquals("'" + number18 + "' != '" + 0.5558738409986911d + "'", number18, 0.5558738409986911d);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1833.4649444186343d + "'", double1 == 1833.4649444186343d);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException3 = new org.apache.commons.math3.fraction.FractionConversionException((double) (byte) -1, 100L, (long) (-1));
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext4 = fractionConversionException3.getContext();
        java.lang.Object obj6 = exceptionContext4.getValue("hi!");
        exceptionContext4.setValue("", (java.lang.Object) (-0.8414709848078965d));
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.abs();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.add(fraction15);
        org.apache.commons.math3.fraction.FractionField fractionField17 = fraction15.getField();
        exceptionContext4.setValue("hi!", (java.lang.Object) fraction15);
        org.junit.Assert.assertNotNull(exceptionContext4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fractionField17);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (short) 4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger6 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger2, bigInteger5);
        java.math.BigInteger bigInteger7 = null;
        java.math.BigInteger bigInteger9 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger7, (long) 0);
        java.math.BigInteger bigInteger10 = null;
        java.math.BigInteger bigInteger12 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger10, (long) 0);
        java.math.BigInteger bigInteger13 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger9, bigInteger12);
        java.math.BigInteger bigInteger14 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger2, bigInteger9);
        java.math.BigInteger bigInteger16 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger9, 100);
        java.math.BigInteger bigInteger18 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger16, (int) (short) 100);
        java.math.BigInteger bigInteger20 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger16, 35);
        java.lang.Class<?> wildcardClass21 = bigInteger16.getClass();
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        double double1 = org.apache.commons.math3.util.FastMath.abs(5.972007862845807E61d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.972007862845807E61d + "'", double1 == 5.972007862845807E61d);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger6 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger2, bigInteger5);
        java.math.BigInteger bigInteger7 = null;
        java.math.BigInteger bigInteger9 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger7, (long) 0);
        java.math.BigInteger bigInteger10 = null;
        java.math.BigInteger bigInteger12 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger10, (long) 0);
        java.math.BigInteger bigInteger13 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger9, bigInteger12);
        java.math.BigInteger bigInteger14 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger2, bigInteger9);
        java.math.BigInteger bigInteger16 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger2, (int) (short) 100);
        java.math.BigInteger bigInteger18 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger16, (long) (short) 10);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigInteger18);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((-1), 2);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int6 = fraction5.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException9 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction4.subtract(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction8.add((int) (short) 0);
        int int13 = fraction3.compareTo(fraction12);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException15 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) 9.0d, (java.lang.Number) fraction12, true);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException0 = new org.apache.commons.math3.exception.MathArithmeticException();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext1 = mathArithmeticException0.getContext();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext2 = mathArithmeticException0.getContext();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext3 = mathArithmeticException0.getContext();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext4 = mathArithmeticException0.getContext();
        org.junit.Assert.assertNotNull(exceptionContext1);
        org.junit.Assert.assertNotNull(exceptionContext2);
        org.junit.Assert.assertNotNull(exceptionContext3);
        org.junit.Assert.assertNotNull(exceptionContext4);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-1), 2);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int5 = fraction4.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException8 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction3.subtract(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction7.add((int) (short) 0);
        int int12 = fraction2.compareTo(fraction11);
        double double13 = fraction2.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.abs();
        float float17 = fraction15.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int19 = fraction18.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction18.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException22 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction21);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction15.divide(fraction21);
        java.lang.String str24 = fraction15.toString();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction14.subtract(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction2.multiply(fraction15);
        byte byte27 = fraction2.byteValue();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.5d) + "'", double13 == (-0.5d));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1 / 2" + "'", str24, "1 / 2");
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 0 + "'", byte27 == (byte) 0);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.INFINITE_ARRAY_ELEMENT;
        java.lang.String str1 = localizedFormats0.getSourceString();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INFINITE_ARRAY_ELEMENT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INFINITE_ARRAY_ELEMENT));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Array contains an infinite element, {0} at index {1}" + "'", str1, "Array contains an infinite element, {0} at index {1}");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(0.0d);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        java.lang.Class<?> wildcardClass1 = localizedFormats0.getClass();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        int int2 = org.apache.commons.math3.util.FastMath.min(149, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.abs();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(1);
        int int4 = fraction3.getDenominator();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction7 = new org.apache.commons.math3.fraction.Fraction((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.negate();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.subtract(fraction8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction11 = fraction3.divide(fraction8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: the fraction to divide by must not be zero: 0/1");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        float float1 = org.apache.commons.math3.util.FastMath.abs(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0d, (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_WINDOW_SIZE;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_WINDOW_SIZE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_WINDOW_SIZE));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 35L);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 8);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(20, 45);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((long) (byte) 35, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 30L + "'", long2 == 30L);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        double double1 = fraction0.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(0);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException5 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) double1, (java.lang.Number) 0, true);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25d + "'", double1 == 0.25d);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-0.2f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.TWO_OR_MORE_VALUES_IN_CATEGORY_REQUIRED;
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.subtract(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.add(1661992960);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException9 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) 4.2808418909780554E72d, (java.lang.Number) fraction7, true);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction10.abs();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats12 = org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS;
        boolean boolean13 = fraction11.equals((java.lang.Object) localizedFormats12);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField14 = fraction11.getField();
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.abs();
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction15.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.add(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction11.add(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction22 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction22.multiply(100);
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction26 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction26.abs();
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction26.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction30 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction29.add(fraction30);
        int int32 = fraction25.compareTo(fraction29);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction24.subtract(fraction25);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction25.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction36 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction36.abs();
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction36.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction40 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction39.add(fraction40);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats42 = org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED;
        org.apache.commons.math3.fraction.Fraction fraction43 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction43.negate();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException45 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats42, (java.lang.Number) fraction43);
        org.apache.commons.math3.fraction.Fraction fraction48 = new org.apache.commons.math3.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction49 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction49.multiply(100);
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException53 = new org.apache.commons.math3.exception.NumberIsTooLargeException((org.apache.commons.math3.exception.util.Localizable) localizedFormats42, (java.lang.Number) fraction48, (java.lang.Number) fraction49, true);
        org.apache.commons.math3.fraction.Fraction fraction56 = new org.apache.commons.math3.fraction.Fraction((int) '#', (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction57 = fraction48.add(fraction56);
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction39.multiply(fraction57);
        org.apache.commons.math3.fraction.Fraction fraction59 = fraction25.add(fraction58);
        org.apache.commons.math3.fraction.Fraction fraction60 = fraction11.divide(fraction58);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction61 = fraction7.add(fraction60);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TWO_OR_MORE_VALUES_IN_CATEGORY_REQUIRED + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TWO_OR_MORE_VALUES_IN_CATEGORY_REQUIRED));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + localizedFormats12 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS + "'", localizedFormats12.equals(org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fractionField14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction39);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + localizedFormats42 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED + "'", localizedFormats42.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED));
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction57);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(fraction60);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        double double1 = org.apache.commons.math3.util.FastMath.abs(50.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.0d + "'", double1 == 50.0d);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(100);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.abs();
        float float5 = fraction3.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int7 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException10 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction9);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction3.divide(fraction9);
        float float12 = fraction9.floatValue();
        boolean boolean13 = fraction2.equals((java.lang.Object) fraction9);
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction9.multiply((int) (short) 10);
        byte byte16 = fraction9.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.4f + "'", float12 == 0.4f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog((int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: must have n >= k for binomial coefficient (n, k), got k = 97, n = 1");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL;
        java.lang.String str2 = localizedFormats1.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats3 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException6 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction5);
        java.lang.Object[] objArray8 = new java.lang.Object[] { localizedFormats1, localizedFormats3, localizedFormats4, fraction5, (-10L) };
        java.lang.Object[] objArray9 = org.apache.commons.math3.exception.util.ArgUtils.flatten(objArray8);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException10 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray8);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats12 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException14 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats12, (java.lang.Number) 100);
        org.apache.commons.math3.exception.util.Localizable localizable15 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats16 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA;
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException18 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats16, objArray17);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException19 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) notPositiveException14, localizable15, objArray17);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException20 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException10, (org.apache.commons.math3.exception.util.Localizable) localizedFormats11, objArray17);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext21 = mathIllegalStateException20.getContext();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "too small integration interval: length = {0}" + "'", str2, "too small integration interval: length = {0}");
        org.junit.Assert.assertTrue("'" + localizedFormats3 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES + "'", localizedFormats3.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES));
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME));
        org.junit.Assert.assertTrue("'" + localizedFormats12 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats12.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertTrue("'" + localizedFormats16 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA + "'", localizedFormats16.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA));
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(exceptionContext21);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(2L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 64L + "'", long2 == 64L);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow((int) '#', (long) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-86196911) + "'", int2 == (-86196911));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SYMMETRIC_MATRIX;
        org.apache.commons.math3.fraction.Fraction fraction4 = new org.apache.commons.math3.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException7 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, (java.lang.Number) fraction4, (java.lang.Number) 100, true);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.CROSSING_BOUNDARY_LOOPS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats9 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_COMPLEX_MODULE;
        java.lang.Number number11 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException13 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats9, (java.lang.Number) (byte) 100, number11, false);
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int15 = fraction14.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException18 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction17);
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction19.negate();
        org.apache.commons.math3.fraction.FractionField fractionField21 = fraction20.getField();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats22 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_ADDITION;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats23 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_ABSCISSA;
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.TWO_THIRDS;
        java.lang.Object[] objArray25 = new java.lang.Object[] { (byte) 100, fraction17, fractionField21, localizedFormats22, localizedFormats23, fraction24 };
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException26 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) numberIsTooSmallException7, (org.apache.commons.math3.exception.util.Localizable) localizedFormats8, objArray25);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException27 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray25);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_FRACTION));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SYMMETRIC_MATRIX + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SYMMETRIC_MATRIX));
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CROSSING_BOUNDARY_LOOPS + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CROSSING_BOUNDARY_LOOPS));
        org.junit.Assert.assertTrue("'" + localizedFormats9 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_COMPLEX_MODULE + "'", localizedFormats9.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_COMPLEX_MODULE));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fractionField21);
        org.junit.Assert.assertTrue("'" + localizedFormats22 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_ADDITION + "'", localizedFormats22.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_ADDITION));
        org.junit.Assert.assertTrue("'" + localizedFormats23 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_ABSCISSA + "'", localizedFormats23.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_REAL_FINITE_ABSCISSA));
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX;
        java.lang.String str1 = localizedFormats0.getSourceString();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_ELEMENT_AT_INDEX));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "element {0} is negative: {1}" + "'", str1, "element {0} is negative: {1}");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_POLYNOMIAL_DEGREE;
        java.lang.Class<?> wildcardClass1 = localizedFormats0.getClass();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_POLYNOMIAL_DEGREE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_POLYNOMIAL_DEGREE));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.FOUR_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(100);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.FractionField fractionField4 = fraction3.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        boolean boolean1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo(10L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        int int2 = fraction1.getNumerator();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) int2);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException5 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) 1.0000000000000002d);
        notPositiveException3.addSuppressed((java.lang.Throwable) notPositiveException5);
        java.lang.Number number7 = notPositiveException5.getMin();
        boolean boolean8 = notPositiveException5.getBoundIsAllowed();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 0 + "'", number7, 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(2.154434690031884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.abs();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException5 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction4);
        byte byte7 = fraction6.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(0.0d, 8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 0 to fraction (1/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((-2L), 64L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 64L + "'", long2 == 64L);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        double double2 = org.apache.commons.math3.util.FastMath.min((-1.5707963267948966d), 1.0000000414175474d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int2 = fraction1.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction1.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.divide(fraction6);
        byte byte8 = fraction7.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SYMMETRIC_MATRIX;
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException6 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction3, (java.lang.Number) 100, true);
        java.lang.Number number7 = numberIsTooSmallException6.getArgument();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SYMMETRIC_MATRIX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SYMMETRIC_MATRIX));
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.113407146813537d) + "'", double1 == (-1.113407146813537d));
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply((int) (short) 1);
        long long6 = fraction5.longValue();
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField7 = fraction5.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(fractionField7);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        int int2 = fraction1.getNumerator();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) int2);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException5 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) 1.0000000000000002d);
        notPositiveException3.addSuppressed((java.lang.Throwable) notPositiveException5);
        boolean boolean7 = notPositiveException5.getBoundIsAllowed();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext8 = notPositiveException5.getContext();
        java.lang.Throwable throwable9 = exceptionContext8.getThrowable();
        java.lang.String str10 = throwable9.toString();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(exceptionContext8);
        org.junit.Assert.assertNotNull(throwable9);
        org.junit.Assert.assertEquals(throwable9.getLocalizedMessage(), "1 is smaller than the minimum (0)");
        org.junit.Assert.assertEquals(throwable9.getMessage(), "1 is smaller than the minimum (0)");
        org.junit.Assert.assertEquals(throwable9.toString(), "org.apache.commons.math3.exception.NotPositiveException: 1 is smaller than the minimum (0)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math3.exception.NotPositiveException: 1 is smaller than the minimum (0)" + "'", str10, "org.apache.commons.math3.exception.NotPositiveException: 1 is smaller than the minimum (0)");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((-41L), (long) 45);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.AT_LEAST_ONE_COLUMN;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = localizedFormats0.getLocalizedString(locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.AT_LEAST_ONE_COLUMN + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.AT_LEAST_ONE_COLUMN));
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.reciprocal();
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException4 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.divide(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction3.multiply((int) (short) 10);
        short short9 = fraction3.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 43L, (float) 149);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 43.0f + "'", float2 == 43.0f);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 280L, (float) 1661992960L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 280.0f + "'", float2 == 280.0f);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(0);
        int int3 = fraction2.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 35L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(0.48121182505960347d);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 4);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5874010519681996d + "'", double1 == 1.5874010519681996d);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.abs();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS;
        boolean boolean3 = fraction1.equals((java.lang.Object) localizedFormats2);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction5.abs();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.add(fraction9);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction1.add(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction11.multiply((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(fractionField4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        double double1 = org.apache.commons.math3.util.FastMath.cos(7.26310292903031E31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16319341667373385d + "'", double1 == 0.16319341667373385d);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.DIFFERENT_ORIG_AND_PERMUTED_DATA;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL;
        java.lang.String str3 = localizedFormats2.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException7 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction6);
        java.lang.Object[] objArray9 = new java.lang.Object[] { localizedFormats2, localizedFormats4, localizedFormats5, fraction6, (-10L) };
        java.lang.Object[] objArray10 = org.apache.commons.math3.exception.util.ArgUtils.flatten(objArray9);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException11 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, objArray9);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats12 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException15 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats13, (java.lang.Number) 100);
        org.apache.commons.math3.exception.util.Localizable localizable16 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats17 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA;
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException19 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats17, objArray18);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException20 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) notPositiveException15, localizable16, objArray18);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException21 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException11, (org.apache.commons.math3.exception.util.Localizable) localizedFormats12, objArray18);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException22 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray18);
        java.lang.Throwable[] throwableArray23 = nullArgumentException22.getSuppressed();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIFFERENT_ORIG_AND_PERMUTED_DATA + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIFFERENT_ORIG_AND_PERMUTED_DATA));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT));
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "too small integration interval: length = {0}" + "'", str3, "too small integration interval: length = {0}");
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO));
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertTrue("'" + localizedFormats12 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME + "'", localizedFormats12.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME));
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertTrue("'" + localizedFormats17 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA + "'", localizedFormats17.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((int) (short) 4, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_SELECTED_COLUMN_INDEX_ARRAY;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_SELECTED_COLUMN_INDEX_ARRAY + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_SELECTED_COLUMN_INDEX_ARRAY));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException4 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction3);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.divide(fraction5);
        double double7 = fraction3.percentageValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow((int) (byte) 35, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-86196911) + "'", int2 == (-86196911));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.abs();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.add(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction6.negate();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction4.add(fraction7);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException9 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction7);
        int int10 = fraction7.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException4 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) (-0.017453292519943295d), (java.lang.Number) 10.000000000000002d, true);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_DIMENSION;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats6 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException8 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats6, (java.lang.Number) 100);
        org.apache.commons.math3.exception.util.Localizable localizable9 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats10 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA;
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException12 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats10, objArray11);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException13 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) notPositiveException8, localizable9, objArray11);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException14 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) numberIsTooSmallException4, (org.apache.commons.math3.exception.util.Localizable) localizedFormats5, objArray11);
        java.lang.Number number15 = numberIsTooSmallException4.getMin();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_DIMENSION + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_DIMENSION));
        org.junit.Assert.assertTrue("'" + localizedFormats6 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats6.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertTrue("'" + localizedFormats10 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA + "'", localizedFormats10.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + 10.000000000000002d + "'", number15, 10.000000000000002d);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(100);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.add(fraction8);
        int int10 = fraction3.compareTo(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction2.subtract(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction3.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction14.abs();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.add(fraction18);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats20 = org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED;
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction21.negate();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException23 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats20, (java.lang.Number) fraction21);
        org.apache.commons.math3.fraction.Fraction fraction26 = new org.apache.commons.math3.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction27.multiply(100);
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException31 = new org.apache.commons.math3.exception.NumberIsTooLargeException((org.apache.commons.math3.exception.util.Localizable) localizedFormats20, (java.lang.Number) fraction26, (java.lang.Number) fraction27, true);
        org.apache.commons.math3.fraction.Fraction fraction34 = new org.apache.commons.math3.fraction.Fraction((int) '#', (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction26.add(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction17.multiply(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction3.add(fraction36);
        double double38 = fraction37.doubleValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + localizedFormats20 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED + "'", localizedFormats20.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED));
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 18.00769230769231d + "'", double38 == 18.00769230769231d);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        double double1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble((int) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6313083693369503E35d + "'", double1 == 2.6313083693369503E35d);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.FOUR_FIFTHS;
        short short1 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.FAILED_BRACKETING;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL;
        java.lang.String str2 = localizedFormats1.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats3 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException6 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction5);
        java.lang.Object[] objArray8 = new java.lang.Object[] { localizedFormats1, localizedFormats3, localizedFormats4, fraction5, (-10L) };
        java.lang.Object[] objArray9 = org.apache.commons.math3.exception.util.ArgUtils.flatten(objArray8);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException10 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray9);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA;
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException13 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats11, objArray12);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext14 = mathIllegalArgumentException13.getContext();
        mathIllegalStateException10.addSuppressed((java.lang.Throwable) mathIllegalArgumentException13);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.FAILED_BRACKETING + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.FAILED_BRACKETING));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "too small integration interval: length = {0}" + "'", str2, "too small integration interval: length = {0}");
        org.junit.Assert.assertTrue("'" + localizedFormats3 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES + "'", localizedFormats3.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES));
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(exceptionContext14);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(8L, (long) 1594323);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1594315L) + "'", long2 == (-1594315L));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        boolean boolean1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo((long) 1661992960);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.negate();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction1);
        org.apache.commons.math3.fraction.Fraction fraction6 = new org.apache.commons.math3.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.multiply(100);
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException11 = new org.apache.commons.math3.exception.NumberIsTooLargeException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) fraction6, (java.lang.Number) fraction7, true);
        boolean boolean12 = numberIsTooLargeException11.getBoundIsAllowed();
        java.lang.Number number13 = numberIsTooLargeException11.getArgument();
        java.lang.Throwable[] throwableArray14 = numberIsTooLargeException11.getSuppressed();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats15 = org.apache.commons.math3.exception.util.LocalizedFormats.TWO_OR_MORE_VALUES_IN_CATEGORY_REQUIRED;
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction17.negate();
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction17.subtract(fraction19);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction20.add(1661992960);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException24 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats15, (java.lang.Number) 4.2808418909780554E72d, (java.lang.Number) fraction22, true);
        numberIsTooLargeException11.addSuppressed((java.lang.Throwable) numberIsTooSmallException24);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats26 = org.apache.commons.math3.exception.util.LocalizedFormats.ILL_CONDITIONED_OPERATOR;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats27 = org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats28 = org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats29 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL;
        java.lang.String str30 = localizedFormats29.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats31 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats32 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO;
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException34 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction33);
        java.lang.Object[] objArray36 = new java.lang.Object[] { localizedFormats29, localizedFormats31, localizedFormats32, fraction33, (-10L) };
        java.lang.Object[] objArray37 = org.apache.commons.math3.exception.util.ArgUtils.flatten(objArray36);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException38 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats28, objArray36);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats39 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats40 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException42 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats40, (java.lang.Number) 100);
        org.apache.commons.math3.exception.util.Localizable localizable43 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats44 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA;
        java.lang.Object[] objArray45 = new java.lang.Object[] {};
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException46 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats44, objArray45);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException47 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) notPositiveException42, localizable43, objArray45);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException48 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException38, (org.apache.commons.math3.exception.util.Localizable) localizedFormats39, objArray45);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException49 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats27, objArray45);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException50 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) numberIsTooLargeException11, (org.apache.commons.math3.exception.util.Localizable) localizedFormats26, objArray45);
        java.util.Locale locale51 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str52 = localizedFormats26.getLocalizedString(locale51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(number13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertTrue("'" + localizedFormats15 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TWO_OR_MORE_VALUES_IN_CATEGORY_REQUIRED + "'", localizedFormats15.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TWO_OR_MORE_VALUES_IN_CATEGORY_REQUIRED));
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + localizedFormats26 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ILL_CONDITIONED_OPERATOR + "'", localizedFormats26.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ILL_CONDITIONED_OPERATOR));
        org.junit.Assert.assertTrue("'" + localizedFormats27 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS + "'", localizedFormats27.equals(org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS));
        org.junit.Assert.assertTrue("'" + localizedFormats28 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT + "'", localizedFormats28.equals(org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT));
        org.junit.Assert.assertTrue("'" + localizedFormats29 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL + "'", localizedFormats29.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "too small integration interval: length = {0}" + "'", str30, "too small integration interval: length = {0}");
        org.junit.Assert.assertTrue("'" + localizedFormats31 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES + "'", localizedFormats31.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES));
        org.junit.Assert.assertTrue("'" + localizedFormats32 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO + "'", localizedFormats32.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO));
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertTrue("'" + localizedFormats39 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME + "'", localizedFormats39.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME));
        org.junit.Assert.assertTrue("'" + localizedFormats40 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats40.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertTrue("'" + localizedFormats44 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA + "'", localizedFormats44.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA));
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.abs();
        float float2 = fraction0.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int4 = fraction3.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException7 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction0.divide(fraction6);
        int int9 = fraction6.intValue();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction6.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction12.negate();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.subtract(fraction13);
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.multiply((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction6.add(fraction13);
        int int18 = fraction6.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException3 = new org.apache.commons.math3.fraction.FractionConversionException(0.33667481938672716d, (-2L), 100L);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SAMPLES;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.abs();
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction1.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction4.add(fraction5);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED;
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction8.negate();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException10 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats7, (java.lang.Number) fraction8);
        org.apache.commons.math3.fraction.Fraction fraction13 = new org.apache.commons.math3.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction14.multiply(100);
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException18 = new org.apache.commons.math3.exception.NumberIsTooLargeException((org.apache.commons.math3.exception.util.Localizable) localizedFormats7, (java.lang.Number) fraction13, (java.lang.Number) fraction14, true);
        org.apache.commons.math3.fraction.Fraction fraction21 = new org.apache.commons.math3.fraction.Fraction((int) '#', (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction13.add(fraction21);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction4.multiply(fraction22);
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction25.negate();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction24.subtract(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction26.multiply((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction22.multiply(fraction26);
        int int31 = fraction30.getNumerator();
        float float32 = fraction30.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.FOUR_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction35 = new org.apache.commons.math3.fraction.Fraction(100);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction33.multiply(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction35.multiply((int) '4');
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException40 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) float32, (java.lang.Number) fraction35, false);
        java.lang.Class<?> wildcardClass41 = numberIsTooSmallException40.getClass();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SAMPLES + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SAMPLES));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED + "'", localizedFormats7.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED));
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.48121182505960347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.FractionField fractionField1 = fraction0.getField();
        org.apache.commons.math3.fraction.Fraction fraction2 = fractionField1.getZero();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fractionField1);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.math3.exception.util.Localizable localizable0 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED;
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException4 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, (java.lang.Number) fraction2);
        org.apache.commons.math3.fraction.Fraction fraction7 = new org.apache.commons.math3.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction8.multiply(100);
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException12 = new org.apache.commons.math3.exception.NumberIsTooLargeException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, (java.lang.Number) fraction7, (java.lang.Number) fraction8, true);
        boolean boolean13 = numberIsTooLargeException12.getBoundIsAllowed();
        java.lang.Number number14 = numberIsTooLargeException12.getArgument();
        java.lang.Throwable[] throwableArray15 = numberIsTooLargeException12.getSuppressed();
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException16 = new org.apache.commons.math3.exception.MathArithmeticException(localizable0, (java.lang.Object[]) throwableArray15);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext17 = mathArithmeticException16.getContext();
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(exceptionContext17);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        boolean boolean1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo(2L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(3628800.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 10L, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number) 0L, (java.lang.Number) 0.0d, false);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException6 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats4, (java.lang.Number) 100);
        numberIsTooLargeException3.addSuppressed((java.lang.Throwable) notPositiveException6);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext8 = new org.apache.commons.math3.exception.util.ExceptionContext((java.lang.Throwable) numberIsTooLargeException3);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats10 = org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS;
        exceptionContext8.setValue("", (java.lang.Object) localizedFormats10);
        java.util.Set<java.lang.String> strSet12 = exceptionContext8.getKeys();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_TOO_LARGE_BOUND_EXCLUDED;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats14 = org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats15 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL;
        java.lang.String str16 = localizedFormats15.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats17 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats18 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO;
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException20 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction19);
        java.lang.Object[] objArray22 = new java.lang.Object[] { localizedFormats15, localizedFormats17, localizedFormats18, fraction19, (-10L) };
        java.lang.Object[] objArray23 = org.apache.commons.math3.exception.util.ArgUtils.flatten(objArray22);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException24 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats14, objArray22);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats25 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats26 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException28 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats26, (java.lang.Number) 100);
        org.apache.commons.math3.exception.util.Localizable localizable29 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats30 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA;
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException32 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats30, objArray31);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException33 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) notPositiveException28, localizable29, objArray31);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException34 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException24, (org.apache.commons.math3.exception.util.Localizable) localizedFormats25, objArray31);
        exceptionContext8.addMessage((org.apache.commons.math3.exception.util.Localizable) localizedFormats13, objArray31);
        java.lang.Object[] objArray36 = org.apache.commons.math3.exception.util.ArgUtils.flatten(objArray31);
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertTrue("'" + localizedFormats10 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS + "'", localizedFormats10.equals(org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS));
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_TOO_LARGE_BOUND_EXCLUDED + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_TOO_LARGE_BOUND_EXCLUDED));
        org.junit.Assert.assertTrue("'" + localizedFormats14 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT + "'", localizedFormats14.equals(org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT));
        org.junit.Assert.assertTrue("'" + localizedFormats15 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL + "'", localizedFormats15.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "too small integration interval: length = {0}" + "'", str16, "too small integration interval: length = {0}");
        org.junit.Assert.assertTrue("'" + localizedFormats17 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES + "'", localizedFormats17.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES));
        org.junit.Assert.assertTrue("'" + localizedFormats18 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO + "'", localizedFormats18.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO));
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertTrue("'" + localizedFormats25 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME + "'", localizedFormats25.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME));
        org.junit.Assert.assertTrue("'" + localizedFormats26 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats26.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertTrue("'" + localizedFormats30 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA + "'", localizedFormats30.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(2, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number) 0L, (java.lang.Number) 0.0d, false);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException6 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats4, (java.lang.Number) 100);
        numberIsTooLargeException3.addSuppressed((java.lang.Throwable) notPositiveException6);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext8 = new org.apache.commons.math3.exception.util.ExceptionContext((java.lang.Throwable) numberIsTooLargeException3);
        boolean boolean9 = numberIsTooLargeException3.getBoundIsAllowed();
        boolean boolean10 = numberIsTooLargeException3.getBoundIsAllowed();
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(100);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.add(fraction8);
        int int10 = fraction3.compareTo(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction2.subtract(fraction3);
        byte byte12 = fraction3.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CONTINUED_FRACTION_NAN_DIVERGENCE;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = localizedFormats0.getLocalizedString(locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CONTINUED_FRACTION_NAN_DIVERGENCE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CONTINUED_FRACTION_NAN_DIVERGENCE));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.ONE_QUARTER;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction1.reciprocal();
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException4 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number) (-0.8414709848078965d), (java.lang.Number) fraction2, false);
        java.lang.Number number5 = numberIsTooLargeException4.getMax();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.5558738409986911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5049095795929396d + "'", double1 == 0.5049095795929396d);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.pow((long) 3, (int) (short) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 81L + "'", long2 == 81L);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5091784786580567d + "'", double1 == 2.5091784786580567d);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OBSERVED_COUNTS_ALL_ZERO;
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OBSERVED_COUNTS_ALL_ZERO + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OBSERVED_COUNTS_ALL_ZERO));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog((int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        int int2 = fraction1.getNumerator();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) int2);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException5 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) 1.0000000000000002d);
        notPositiveException3.addSuppressed((java.lang.Throwable) notPositiveException5);
        java.lang.String str7 = notPositiveException5.toString();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math3.exception.NotPositiveException: 1 is smaller than the minimum (0)" + "'", str7, "org.apache.commons.math3.exception.NotPositiveException: 1 is smaller than the minimum (0)");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.993222846126381d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6940658945086007E-21d + "'", double1 == 1.6940658945086007E-21d);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.abs();
        float float2 = fraction0.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int4 = fraction3.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException7 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction0.divide(fraction6);
        int int9 = fraction6.intValue();
        int int10 = fraction6.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.4651773501465964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        int int2 = org.apache.commons.math3.util.FastMath.min(97, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math3.util.ArithmeticUtils.factorial((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: arithmetic exception");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (byte) -1, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_BLOCK_LENGTH;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = localizedFormats0.getLocalizedString(locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_BLOCK_LENGTH + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_BLOCK_LENGTH));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((double) 1L, (double) (short) 1, (int) (byte) 1);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.negate();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.divide(1661992960);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction3.subtract(fraction5);
        int int9 = fraction5.getDenominator();
        byte byte10 = fraction5.byteValue();
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10, 10);
        short short3 = fraction2.shortValue();
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.7504915783575618d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2950876742312516d + "'", double1 == 1.2950876742312516d);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException2 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) 100);
        boolean boolean3 = notPositiveException2.getBoundIsAllowed();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, (double) 97L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger6 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger2, bigInteger5);
        java.math.BigInteger bigInteger7 = null;
        java.math.BigInteger bigInteger9 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger7, (long) 0);
        java.math.BigInteger bigInteger10 = null;
        java.math.BigInteger bigInteger12 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger10, (long) 0);
        java.math.BigInteger bigInteger13 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger9, bigInteger12);
        java.math.BigInteger bigInteger14 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger2, bigInteger13);
        short short15 = bigInteger13.shortValue();
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.abs();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.add(fraction4);
        org.apache.commons.math3.fraction.FractionField fractionField6 = fraction4.getField();
        java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.fraction.Fraction>> wildcardClass7 = fractionField6.getRuntimeClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException2 = new org.apache.commons.math3.fraction.FractionConversionException((double) (-41L), 1594322);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger6 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger2, bigInteger5);
        java.math.BigInteger bigInteger7 = null;
        java.math.BigInteger bigInteger9 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger7, (long) 0);
        java.math.BigInteger bigInteger10 = null;
        java.math.BigInteger bigInteger12 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger10, (long) 0);
        java.math.BigInteger bigInteger13 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger9, bigInteger12);
        java.math.BigInteger bigInteger14 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger2, bigInteger9);
        java.math.BigInteger bigInteger16 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger2, (int) (short) 100);
        java.math.BigInteger bigInteger18 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger16, 43);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigInteger18);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.subtract(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.subtract(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction11 = new org.apache.commons.math3.fraction.Fraction((-1), 2);
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int14 = fraction13.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction13.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException17 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction16);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction12.subtract(fraction16);
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction16.add((int) (short) 0);
        int int21 = fraction11.compareTo(fraction20);
        java.lang.String str22 = fraction20.toString();
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException25 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number) fraction20, (java.lang.Number) 0.5558738409986911d, true);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction8.divide(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction4.divide(fraction26);
        int int28 = fraction27.getNumerator();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2 / 5" + "'", str22, "2 / 5");
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        long long1 = org.apache.commons.math3.util.ArithmeticUtils.factorial(1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(35.61538461538461d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.61538461538461d + "'", double2 == 35.61538461538461d);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((double) (-86196912), (int) (short) 35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -86,196,912 to fraction (86,196,913/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5872139151569291d) + "'", double1 == (-0.5872139151569291d));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number) 0L, (java.lang.Number) 0.0d, false);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException6 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats4, (java.lang.Number) 100);
        numberIsTooLargeException3.addSuppressed((java.lang.Throwable) notPositiveException6);
        java.lang.Number number8 = numberIsTooLargeException3.getArgument();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats9 = org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT;
        org.apache.commons.math3.fraction.Fraction fraction11 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction11.negate();
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction11.subtract(fraction13);
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException16 = new org.apache.commons.math3.exception.NumberIsTooLargeException((org.apache.commons.math3.exception.util.Localizable) localizedFormats9, (java.lang.Number) 1661992960, (java.lang.Number) fraction14, false);
        numberIsTooLargeException3.addSuppressed((java.lang.Throwable) numberIsTooLargeException16);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext18 = new org.apache.commons.math3.exception.util.ExceptionContext((java.lang.Throwable) numberIsTooLargeException3);
        java.lang.Class<?> wildcardClass19 = numberIsTooLargeException3.getClass();
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 0L + "'", number8, 0L);
        org.junit.Assert.assertTrue("'" + localizedFormats9 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT + "'", localizedFormats9.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.8414709848078965d), 32.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-1), 2);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int5 = fraction4.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException8 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction3.subtract(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction7.add((int) (short) 0);
        int int12 = fraction2.compareTo(fraction11);
        double double13 = fraction2.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction2.negate();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.5d) + "'", double13 == (-0.5d));
        org.junit.Assert.assertNotNull(fraction14);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-1), 2);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int5 = fraction4.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException8 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction3.subtract(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction7.add((int) (short) 0);
        int int12 = fraction2.compareTo(fraction11);
        java.math.BigInteger bigInteger13 = null;
        java.math.BigInteger bigInteger15 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger13, (long) 0);
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.multiply(0);
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException22 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number) bigInteger13, (java.lang.Number) fraction18, false);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction2.multiply(fraction18);
        int int24 = fraction23.getDenominator();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-10), 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(6.0d, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 6 to fraction (-5/9,223,372,036,854,775,807)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.math3.exception.NotPositiveException notPositiveException1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) 1.0000000000000002d);
        java.lang.Number number2 = notPositiveException1.getArgument();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext3 = notPositiveException1.getContext();
        java.lang.Number number4 = notPositiveException1.getArgument();
        org.junit.Assert.assertEquals("'" + number2 + "' != '" + 1.0000000000000002d + "'", number2, 1.0000000000000002d);
        org.junit.Assert.assertNotNull(exceptionContext3);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 1.0000000000000002d + "'", number4, 1.0000000000000002d);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (-1594315L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-86196912));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.GCD_OVERFLOW_64_BITS;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = localizedFormats0.getLocalizedString(locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.GCD_OVERFLOW_64_BITS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.GCD_OVERFLOW_64_BITS));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException0 = new org.apache.commons.math3.exception.MathArithmeticException();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext1 = mathArithmeticException0.getContext();
        java.util.Set<java.lang.String> strSet2 = exceptionContext1.getKeys();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL;
        java.lang.String str6 = localizedFormats5.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats7 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats8 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO;
        org.apache.commons.math3.fraction.Fraction fraction9 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException10 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction9);
        java.lang.Object[] objArray12 = new java.lang.Object[] { localizedFormats5, localizedFormats7, localizedFormats8, fraction9, (-10L) };
        java.lang.Object[] objArray13 = org.apache.commons.math3.exception.util.ArgUtils.flatten(objArray12);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException14 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats4, objArray12);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats15 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats16 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException18 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats16, (java.lang.Number) 100);
        org.apache.commons.math3.exception.util.Localizable localizable19 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats20 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA;
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException22 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats20, objArray21);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException23 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) notPositiveException18, localizable19, objArray21);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException24 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException14, (org.apache.commons.math3.exception.util.Localizable) localizedFormats15, objArray21);
        exceptionContext1.setValue("shape must be positive ({0})", (java.lang.Object) mathIllegalStateException14);
        java.lang.Object obj27 = exceptionContext1.getValue("1 / 104");
        org.junit.Assert.assertNotNull(exceptionContext1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "too small integration interval: length = {0}" + "'", str6, "too small integration interval: length = {0}");
        org.junit.Assert.assertTrue("'" + localizedFormats7 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES + "'", localizedFormats7.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES));
        org.junit.Assert.assertTrue("'" + localizedFormats8 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO + "'", localizedFormats8.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO));
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertTrue("'" + localizedFormats15 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME + "'", localizedFormats15.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME));
        org.junit.Assert.assertTrue("'" + localizedFormats16 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats16.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertTrue("'" + localizedFormats20 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA + "'", localizedFormats20.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(100);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.abs();
        float float5 = fraction3.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int7 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException10 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction9);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction3.divide(fraction9);
        float float12 = fraction9.floatValue();
        boolean boolean13 = fraction2.equals((java.lang.Object) fraction9);
        double double14 = fraction2.doubleValue();
        int int15 = fraction2.intValue();
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField16 = fraction2.getField();
        java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.fraction.Fraction>> wildcardClass17 = fractionField16.getRuntimeClass();
        java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.fraction.Fraction>> wildcardClass18 = fractionField16.getRuntimeClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.4f + "'", float12 == 0.4f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertNotNull(fractionField16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 0, (int) 'a');
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.pow(0L, 90L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.FOUR_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(100);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(fraction2);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.multiply((int) '4');
        org.apache.commons.math3.fraction.FractionField fractionField6 = fraction2.getField();
        org.apache.commons.math3.fraction.Fraction fraction7 = fractionField6.getOne();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.add((int) (byte) 0);
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fractionField6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.reciprocal();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) (-43L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((-2.3639197341146732E18d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert -2,363,919,734,114,673,200 to fraction (-2,363,919,734,114,673,152/1)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException0 = new org.apache.commons.math3.exception.NullArgumentException();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext1 = new org.apache.commons.math3.exception.util.ExceptionContext((java.lang.Throwable) nullArgumentException0);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.math3.exception.NotPositiveException notPositiveException1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) 90L);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext2 = notPositiveException1.getContext();
        org.junit.Assert.assertNotNull(exceptionContext2);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.5596856728972892d, (-0.428182669496151d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.838726818815035d + "'", double2 == 1.838726818815035d);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((-1), 2);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int6 = fraction5.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction5.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException9 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction8);
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction4.subtract(fraction8);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction8.add((int) (short) 0);
        int int13 = fraction3.compareTo(fraction12);
        java.lang.String str14 = fraction12.toString();
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException17 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number) fraction12, (java.lang.Number) 0.5558738409986911d, true);
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction0.divide(fraction12);
        int int19 = fraction18.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2 / 5" + "'", str14, "2 / 5");
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 1.2676506E30f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(8.6196911E7d, (double) 485);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.619691099999999E7d + "'", double2 == 8.619691099999999E7d);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(3.948148009134034E13d, 13);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.234322849082601E17d + "'", double2 == 3.234322849082601E17d);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.MAP_MODIFIED_WHILE_ITERATING;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = localizedFormats0.getLocalizedString(locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.MAP_MODIFIED_WHILE_ITERATING + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.MAP_MODIFIED_WHILE_ITERATING));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.2425230239169618d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2425230239169618d + "'", double2 == 1.2425230239169618d);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        boolean boolean2 = fraction0.equals((java.lang.Object) 128.0f);
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.abs();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply((int) (byte) 10);
        short short6 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL;
        java.lang.String str2 = localizedFormats1.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats3 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO;
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException6 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction5);
        java.lang.Object[] objArray8 = new java.lang.Object[] { localizedFormats1, localizedFormats3, localizedFormats4, fraction5, (-10L) };
        java.lang.Object[] objArray9 = org.apache.commons.math3.exception.util.ArgUtils.flatten(objArray8);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException10 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray8);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext11 = mathIllegalStateException10.getContext();
        java.util.Set<java.lang.String> strSet12 = exceptionContext11.getKeys();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "too small integration interval: length = {0}" + "'", str2, "too small integration interval: length = {0}");
        org.junit.Assert.assertTrue("'" + localizedFormats3 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES + "'", localizedFormats3.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES));
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO));
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertNotNull(exceptionContext11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.2124676738864985E28d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4874366117204788E14d + "'", double1 == 1.4874366117204788E14d);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException2 = new org.apache.commons.math3.fraction.FractionConversionException((double) 35.0f, 100);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.negate();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.subtract(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction0.subtract(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction4.negate();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.5000000000000001d, 10.000000953674316d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04995839096546285d + "'", double2 == 0.04995839096546285d);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-1), 2);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int5 = fraction4.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException8 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction3.subtract(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction7.add((int) (short) 0);
        int int12 = fraction2.compareTo(fraction11);
        double double13 = fraction2.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction16 = fraction15.abs();
        float float17 = fraction15.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int19 = fraction18.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction18.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException22 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction21);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction15.divide(fraction21);
        java.lang.String str24 = fraction15.toString();
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction14.subtract(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction2.multiply(fraction15);
        org.apache.commons.math3.fraction.Fraction fraction27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction28 = fraction26.multiply(fraction27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.5d) + "'", double13 == (-0.5d));
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1 / 2" + "'", str24, "1 / 2");
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger6 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger2, bigInteger5);
        java.math.BigInteger bigInteger7 = null;
        java.math.BigInteger bigInteger9 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger7, (long) 0);
        java.math.BigInteger bigInteger10 = null;
        java.math.BigInteger bigInteger12 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger10, (long) 0);
        java.math.BigInteger bigInteger13 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger9, bigInteger12);
        java.math.BigInteger bigInteger14 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger2, bigInteger9);
        java.math.BigInteger bigInteger16 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger2, 14900);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger16);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException2 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) 100);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext3 = new org.apache.commons.math3.exception.util.ExceptionContext((java.lang.Throwable) notPositiveException2);
        java.lang.Object obj5 = null;
        exceptionContext3.setValue("too small integration interval: length = {0}", obj5);
        java.math.BigInteger bigInteger8 = null;
        java.math.BigInteger bigInteger10 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger8, (long) 0);
        java.math.BigInteger bigInteger11 = null;
        java.math.BigInteger bigInteger13 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger11, (long) 0);
        java.math.BigInteger bigInteger14 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger10, bigInteger13);
        java.math.BigInteger bigInteger15 = null;
        java.math.BigInteger bigInteger17 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger15, (long) 0);
        java.math.BigInteger bigInteger18 = null;
        java.math.BigInteger bigInteger20 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger18, (long) 0);
        java.math.BigInteger bigInteger21 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger17, bigInteger20);
        java.math.BigInteger bigInteger22 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger10, bigInteger21);
        org.apache.commons.math3.fraction.Fraction fraction23 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction24 = fraction23.negate();
        org.apache.commons.math3.fraction.FractionField fractionField25 = fraction24.getField();
        org.apache.commons.math3.fraction.Fraction fraction26 = fractionField25.getOne();
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction26.multiply(13);
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction29.multiply(100);
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction33 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction33.abs();
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction33.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction37 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction36.add(fraction37);
        int int39 = fraction32.compareTo(fraction36);
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction31.subtract(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction42 = fraction32.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction43 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction44 = fraction43.abs();
        org.apache.commons.math3.fraction.Fraction fraction46 = fraction43.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction47 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction46.add(fraction47);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats49 = org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED;
        org.apache.commons.math3.fraction.Fraction fraction50 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction51 = fraction50.negate();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException52 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats49, (java.lang.Number) fraction50);
        org.apache.commons.math3.fraction.Fraction fraction55 = new org.apache.commons.math3.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction56 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction58 = fraction56.multiply(100);
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException60 = new org.apache.commons.math3.exception.NumberIsTooLargeException((org.apache.commons.math3.exception.util.Localizable) localizedFormats49, (java.lang.Number) fraction55, (java.lang.Number) fraction56, true);
        org.apache.commons.math3.fraction.Fraction fraction63 = new org.apache.commons.math3.fraction.Fraction((int) '#', (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction64 = fraction55.add(fraction63);
        org.apache.commons.math3.fraction.Fraction fraction65 = fraction46.multiply(fraction64);
        org.apache.commons.math3.fraction.Fraction fraction66 = fraction32.add(fraction65);
        org.apache.commons.math3.fraction.Fraction fraction67 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int68 = fraction67.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction70 = fraction67.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction72 = fraction67.multiply((int) (short) 1);
        long long73 = fraction72.longValue();
        org.apache.commons.math3.fraction.Fraction fraction74 = fraction32.divide(fraction72);
        org.apache.commons.math3.fraction.Fraction fraction75 = fraction28.multiply(fraction74);
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException77 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number) bigInteger10, (java.lang.Number) fraction74, true);
        exceptionContext3.setValue("org.apache.commons.math3.fraction.FractionConversionException: illegal state: Overflow trying to convert -1 to fraction (100/-1)", (java.lang.Object) fraction74);
        java.lang.Object obj80 = exceptionContext3.getValue("real format");
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fractionField25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction42);
        org.junit.Assert.assertNotNull(fraction43);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction46);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
        org.junit.Assert.assertTrue("'" + localizedFormats49 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED + "'", localizedFormats49.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED));
        org.junit.Assert.assertNotNull(fraction50);
        org.junit.Assert.assertNotNull(fraction51);
        org.junit.Assert.assertNotNull(fraction56);
        org.junit.Assert.assertNotNull(fraction58);
        org.junit.Assert.assertNotNull(fraction64);
        org.junit.Assert.assertNotNull(fraction65);
        org.junit.Assert.assertNotNull(fraction66);
        org.junit.Assert.assertNotNull(fraction67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertNotNull(fraction70);
        org.junit.Assert.assertNotNull(fraction72);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertNotNull(fraction74);
        org.junit.Assert.assertNotNull(fraction75);
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.4210854715202004E-14d, (double) (-172393822L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.72393822E8d) + "'", double2 == (-1.72393822E8d));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(20);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply((int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction0.multiply((int) (short) 1);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats6 = org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED;
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.negate();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException9 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats6, (java.lang.Number) fraction7);
        org.apache.commons.math3.fraction.Fraction fraction12 = new org.apache.commons.math3.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.multiply(100);
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException17 = new org.apache.commons.math3.exception.NumberIsTooLargeException((org.apache.commons.math3.exception.util.Localizable) localizedFormats6, (java.lang.Number) fraction12, (java.lang.Number) fraction13, true);
        org.apache.commons.math3.fraction.Fraction fraction20 = new org.apache.commons.math3.fraction.Fraction((int) '#', (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction12.add(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction23 = new org.apache.commons.math3.fraction.Fraction((int) '#');
        org.apache.commons.math3.fraction.Fraction fraction24 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction24.negate();
        org.apache.commons.math3.fraction.Fraction fraction26 = fraction23.subtract(fraction24);
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction21.subtract(fraction26);
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction26.multiply((int) 'a');
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction0.subtract(fraction26);
        org.apache.commons.math3.fraction.FractionField fractionField31 = fraction26.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + localizedFormats6 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED + "'", localizedFormats6.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction24);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction26);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fractionField31);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, (float) 48);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(1661992960, (int) (short) 35);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_SQUARE_MATRIX;
        java.lang.Class<?> wildcardClass1 = localizedFormats0.getClass();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_SQUARE_MATRIX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_SQUARE_MATRIX));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(100, (-1));
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException3 = new org.apache.commons.math3.fraction.FractionConversionException(2.3639197341146732E18d, (long) 1594322, (long) 97);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        double double1 = org.apache.commons.math3.util.ArithmeticUtils.factorialLog(48);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 140.67392364823428d + "'", double1 == 140.67392364823428d);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.abs();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-51.999996f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number) 0L, (java.lang.Number) 0.0d, false);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException6 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats4, (java.lang.Number) 100);
        numberIsTooLargeException3.addSuppressed((java.lang.Throwable) notPositiveException6);
        boolean boolean8 = notPositiveException6.getBoundIsAllowed();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats9 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_DEFINITE_MATRIX;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats10 = org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL;
        java.lang.String str12 = localizedFormats11.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats14 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO;
        org.apache.commons.math3.fraction.Fraction fraction15 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException16 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction15);
        java.lang.Object[] objArray18 = new java.lang.Object[] { localizedFormats11, localizedFormats13, localizedFormats14, fraction15, (-10L) };
        java.lang.Object[] objArray19 = org.apache.commons.math3.exception.util.ArgUtils.flatten(objArray18);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException20 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats10, objArray18);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats21 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats22 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException24 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats22, (java.lang.Number) 100);
        org.apache.commons.math3.exception.util.Localizable localizable25 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats26 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA;
        java.lang.Object[] objArray27 = new java.lang.Object[] {};
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException28 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats26, objArray27);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException29 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) notPositiveException24, localizable25, objArray27);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException30 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException20, (org.apache.commons.math3.exception.util.Localizable) localizedFormats21, objArray27);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException31 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats9, objArray27);
        notPositiveException6.addSuppressed((java.lang.Throwable) mathIllegalArgumentException31);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext33 = new org.apache.commons.math3.exception.util.ExceptionContext((java.lang.Throwable) mathIllegalArgumentException31);
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + localizedFormats9 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_DEFINITE_MATRIX + "'", localizedFormats9.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_DEFINITE_MATRIX));
        org.junit.Assert.assertTrue("'" + localizedFormats10 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT + "'", localizedFormats10.equals(org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT));
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "too small integration interval: length = {0}" + "'", str12, "too small integration interval: length = {0}");
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES));
        org.junit.Assert.assertTrue("'" + localizedFormats14 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO + "'", localizedFormats14.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO));
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertTrue("'" + localizedFormats21 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME + "'", localizedFormats21.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME));
        org.junit.Assert.assertTrue("'" + localizedFormats22 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats22.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertTrue("'" + localizedFormats26 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA + "'", localizedFormats26.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger3 = null;
        java.math.BigInteger bigInteger5 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger3, (long) 0);
        java.math.BigInteger bigInteger6 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger2, bigInteger5);
        java.math.BigInteger bigInteger7 = null;
        java.math.BigInteger bigInteger9 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger7, (long) 0);
        java.math.BigInteger bigInteger10 = null;
        java.math.BigInteger bigInteger12 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger10, (long) 0);
        java.math.BigInteger bigInteger13 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger9, bigInteger12);
        java.math.BigInteger bigInteger14 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger2, bigInteger9);
        java.math.BigInteger bigInteger16 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger2, (int) (short) 100);
        java.math.BigInteger bigInteger17 = null;
        java.math.BigInteger bigInteger19 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger17, (long) 0);
        java.math.BigInteger bigInteger20 = null;
        java.math.BigInteger bigInteger22 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger20, (long) 0);
        java.math.BigInteger bigInteger23 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger19, bigInteger22);
        java.math.BigInteger bigInteger24 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger16, bigInteger22);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger26 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger22, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: exponent (-1)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigInteger24);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 0, 148);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble(5, 135);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException; message: must have n >= k for binomial coefficient (n, k), got k = 135, n = 5");
        } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.math3.fraction.FractionConversionException fractionConversionException3 = new org.apache.commons.math3.fraction.FractionConversionException((double) (byte) -1, 100L, (long) (-1));
        java.lang.Throwable[] throwableArray4 = fractionConversionException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: zero denominator in fraction 1/0");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        int int2 = fraction1.getNumerator();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) int2);
        java.math.BigInteger bigInteger4 = null;
        java.math.BigInteger bigInteger6 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger4, (long) 0);
        java.math.BigInteger bigInteger7 = null;
        java.math.BigInteger bigInteger9 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger7, (long) 0);
        java.math.BigInteger bigInteger10 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger6, bigInteger9);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException11 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) bigInteger9);
        java.math.BigInteger bigInteger12 = null;
        java.math.BigInteger bigInteger14 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger12, (long) 0);
        java.math.BigInteger bigInteger15 = null;
        java.math.BigInteger bigInteger17 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger15, (long) 0);
        java.math.BigInteger bigInteger18 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger14, bigInteger17);
        java.math.BigInteger bigInteger19 = null;
        java.math.BigInteger bigInteger21 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger19, (long) 0);
        java.math.BigInteger bigInteger22 = null;
        java.math.BigInteger bigInteger24 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger22, (long) 0);
        java.math.BigInteger bigInteger25 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger21, bigInteger24);
        java.math.BigInteger bigInteger26 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger14, bigInteger21);
        java.math.BigInteger bigInteger28 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger26, (int) (byte) 100);
        java.math.BigInteger bigInteger29 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger9, bigInteger26);
        java.math.BigInteger bigInteger30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger31 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger9, bigInteger30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger29);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((double) 100.0f);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        int int2 = fraction1.getNumerator();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) int2);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException5 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) 1.0000000000000002d);
        notPositiveException3.addSuppressed((java.lang.Throwable) notPositiveException5);
        boolean boolean7 = notPositiveException5.getBoundIsAllowed();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext8 = notPositiveException5.getContext();
        java.lang.Throwable throwable9 = exceptionContext8.getThrowable();
        java.lang.Throwable throwable10 = exceptionContext8.getThrowable();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SAMPLES;
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction12.abs();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.add(fraction16);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats18 = org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED;
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction19.negate();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException21 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats18, (java.lang.Number) fraction19);
        org.apache.commons.math3.fraction.Fraction fraction24 = new org.apache.commons.math3.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.multiply(100);
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException29 = new org.apache.commons.math3.exception.NumberIsTooLargeException((org.apache.commons.math3.exception.util.Localizable) localizedFormats18, (java.lang.Number) fraction24, (java.lang.Number) fraction25, true);
        org.apache.commons.math3.fraction.Fraction fraction32 = new org.apache.commons.math3.fraction.Fraction((int) '#', (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction24.add(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction15.multiply(fraction33);
        org.apache.commons.math3.fraction.Fraction fraction35 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction36 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction36.negate();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction35.subtract(fraction37);
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction37.multiply((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction33.multiply(fraction37);
        int int42 = fraction41.getNumerator();
        float float43 = fraction41.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction44 = org.apache.commons.math3.fraction.Fraction.FOUR_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction46 = new org.apache.commons.math3.fraction.Fraction(100);
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction44.multiply(fraction46);
        org.apache.commons.math3.fraction.Fraction fraction49 = fraction46.multiply((int) '4');
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException51 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats11, (java.lang.Number) float43, (java.lang.Number) fraction46, false);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats52 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_FIXED_LENGTH_CHROMOSOME;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats53 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats54 = org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats55 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL;
        java.lang.String str56 = localizedFormats55.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats57 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats58 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO;
        org.apache.commons.math3.fraction.Fraction fraction59 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException60 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction59);
        java.lang.Object[] objArray62 = new java.lang.Object[] { localizedFormats55, localizedFormats57, localizedFormats58, fraction59, (-10L) };
        java.lang.Object[] objArray63 = org.apache.commons.math3.exception.util.ArgUtils.flatten(objArray62);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException64 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats54, objArray62);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats65 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats66 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException68 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats66, (java.lang.Number) 100);
        org.apache.commons.math3.exception.util.Localizable localizable69 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats70 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA;
        java.lang.Object[] objArray71 = new java.lang.Object[] {};
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException72 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats70, objArray71);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException73 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) notPositiveException68, localizable69, objArray71);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException74 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException64, (org.apache.commons.math3.exception.util.Localizable) localizedFormats65, objArray71);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException75 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats53, objArray71);
        org.apache.commons.math3.exception.ConvergenceException convergenceException76 = new org.apache.commons.math3.exception.ConvergenceException((org.apache.commons.math3.exception.util.Localizable) localizedFormats52, objArray71);
        java.lang.Object[] objArray77 = org.apache.commons.math3.exception.util.ArgUtils.flatten(objArray71);
        exceptionContext8.addMessage((org.apache.commons.math3.exception.util.Localizable) localizedFormats11, objArray71);
        java.lang.Object[] objArray79 = org.apache.commons.math3.exception.util.ArgUtils.flatten(objArray71);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(exceptionContext8);
        org.junit.Assert.assertNotNull(throwable9);
        org.junit.Assert.assertEquals(throwable9.getLocalizedMessage(), "1 is smaller than the minimum (0): number of samples ({0})");
        org.junit.Assert.assertEquals(throwable9.getMessage(), "1 is smaller than the minimum (0): number of samples ({0})");
        org.junit.Assert.assertEquals(throwable9.toString(), "org.apache.commons.math3.exception.NotPositiveException: 1 is smaller than the minimum (0): number of samples ({0})");
        org.junit.Assert.assertNotNull(throwable10);
        org.junit.Assert.assertEquals(throwable10.getLocalizedMessage(), "1 is smaller than the minimum (0): number of samples ({0})");
        org.junit.Assert.assertEquals(throwable10.getMessage(), "1 is smaller than the minimum (0): number of samples ({0})");
        org.junit.Assert.assertEquals(throwable10.toString(), "org.apache.commons.math3.exception.NotPositiveException: 1 is smaller than the minimum (0): number of samples ({0})");
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SAMPLES + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SAMPLES));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + localizedFormats18 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED + "'", localizedFormats18.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED));
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.0f + "'", float43 == 0.0f);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + localizedFormats52 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_FIXED_LENGTH_CHROMOSOME + "'", localizedFormats52.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_FIXED_LENGTH_CHROMOSOME));
        org.junit.Assert.assertTrue("'" + localizedFormats53 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA + "'", localizedFormats53.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA));
        org.junit.Assert.assertTrue("'" + localizedFormats54 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT + "'", localizedFormats54.equals(org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT));
        org.junit.Assert.assertTrue("'" + localizedFormats55 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL + "'", localizedFormats55.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "too small integration interval: length = {0}" + "'", str56, "too small integration interval: length = {0}");
        org.junit.Assert.assertTrue("'" + localizedFormats57 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES + "'", localizedFormats57.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES));
        org.junit.Assert.assertTrue("'" + localizedFormats58 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO + "'", localizedFormats58.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO));
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertTrue("'" + localizedFormats65 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME + "'", localizedFormats65.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME));
        org.junit.Assert.assertTrue("'" + localizedFormats66 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats66.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertTrue("'" + localizedFormats70 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA + "'", localizedFormats70.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA));
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[]");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[]");
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[]");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.04995839096546285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04999999523162889d + "'", double1 == 0.04999999523162889d);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction(0.19739556271548866d, (int) 'a');
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(32);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow((int) (short) 10, 64L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 2984622845537545263L, (double) 43);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.98462266E18f + "'", float2 == 2.98462266E18f);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger0, (-11L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: exponent (-11)");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(20.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.689503868988906d + "'", double1 == 3.689503868988906d);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.4201670368266409d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-0.99999994f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6321205369012336d) + "'", double1 == (-0.6321205369012336d));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_DATA_FOR_T_STATISTIC;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats3 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA;
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException5 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats3, objArray4);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext6 = mathIllegalArgumentException5.getContext();
        java.lang.Object[] objArray7 = new java.lang.Object[] { mathIllegalArgumentException5 };
        org.apache.commons.math3.exception.ConvergenceException convergenceException8 = new org.apache.commons.math3.exception.ConvergenceException((org.apache.commons.math3.exception.util.Localizable) localizedFormats2, objArray7);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException9 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, objArray7);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException10 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray7);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_DATA_FOR_T_STATISTIC + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INSUFFICIENT_DATA_FOR_T_STATISTIC));
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2 + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.DIMENSIONS_MISMATCH_2x2));
        org.junit.Assert.assertTrue("'" + localizedFormats3 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA + "'", localizedFormats3.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(exceptionContext6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[org.apache.commons.math3.exception.MathIllegalArgumentException: no data]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[org.apache.commons.math3.exception.MathIllegalArgumentException: no data]");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.abs();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.add(fraction4);
        int int6 = fraction4.intValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        int int1 = fraction0.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.divide((int) (byte) 1);
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField4 = fraction0.getField();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fractionField4);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException0 = new org.apache.commons.math3.exception.MathArithmeticException();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext1 = mathArithmeticException0.getContext();
        java.lang.Object obj3 = exceptionContext1.getValue("99 / 5");
        org.junit.Assert.assertNotNull(exceptionContext1);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.abs();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction3.add(fraction4);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats6 = org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED;
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction7.negate();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException9 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats6, (java.lang.Number) fraction7);
        org.apache.commons.math3.fraction.Fraction fraction12 = new org.apache.commons.math3.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction13.multiply(100);
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException17 = new org.apache.commons.math3.exception.NumberIsTooLargeException((org.apache.commons.math3.exception.util.Localizable) localizedFormats6, (java.lang.Number) fraction12, (java.lang.Number) fraction13, true);
        org.apache.commons.math3.fraction.Fraction fraction20 = new org.apache.commons.math3.fraction.Fraction((int) '#', (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction12.add(fraction20);
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction3.multiply(fraction21);
        short short23 = fraction22.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + localizedFormats6 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED + "'", localizedFormats6.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 17 + "'", short23 == (short) 17);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.pow(100L, 280L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.pow(0L, 48);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-1), 2);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int5 = fraction4.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException8 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction3.subtract(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction7.add((int) (short) 0);
        int int12 = fraction2.compareTo(fraction11);
        java.math.BigInteger bigInteger13 = null;
        java.math.BigInteger bigInteger15 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger13, (long) 0);
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.multiply(0);
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException22 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number) bigInteger13, (java.lang.Number) fraction18, false);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction2.multiply(fraction18);
        java.lang.String str24 = fraction23.toString();
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1 / 52" + "'", str24, "-1 / 52");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        int int2 = fraction1.getNumerator();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) int2);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException5 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) 1.0000000000000002d);
        notPositiveException3.addSuppressed((java.lang.Throwable) notPositiveException5);
        boolean boolean7 = notPositiveException3.getBoundIsAllowed();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(20, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        double double1 = org.apache.commons.math3.util.FastMath.acos(102400.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow(2, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 52L, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, (float) 149);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.233403117511217d + "'", double1 == 1.233403117511217d);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(35L, (long) 43);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1505L + "'", long2 == 1505L);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        long long1 = org.apache.commons.math3.util.FastMath.abs(2984622845537545263L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2984622845537545263L + "'", long1 == 2984622845537545263L);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.0531466636290331E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.981120987628614d + "'", double1 == 32.981120987628614d);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE;
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        int int2 = fraction1.getNumerator();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException3 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) int2);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException5 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) 1.0000000000000002d);
        notPositiveException3.addSuppressed((java.lang.Throwable) notPositiveException5);
        boolean boolean7 = notPositiveException5.getBoundIsAllowed();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext8 = notPositiveException5.getContext();
        java.lang.Throwable throwable9 = exceptionContext8.getThrowable();
        java.lang.Throwable throwable10 = exceptionContext8.getThrowable();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SAMPLES;
        org.apache.commons.math3.fraction.Fraction fraction12 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction12.abs();
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction12.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction15.add(fraction16);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats18 = org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED;
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction19.negate();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException21 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats18, (java.lang.Number) fraction19);
        org.apache.commons.math3.fraction.Fraction fraction24 = new org.apache.commons.math3.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction25 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction25.multiply(100);
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException29 = new org.apache.commons.math3.exception.NumberIsTooLargeException((org.apache.commons.math3.exception.util.Localizable) localizedFormats18, (java.lang.Number) fraction24, (java.lang.Number) fraction25, true);
        org.apache.commons.math3.fraction.Fraction fraction32 = new org.apache.commons.math3.fraction.Fraction((int) '#', (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction24.add(fraction32);
        org.apache.commons.math3.fraction.Fraction fraction34 = fraction15.multiply(fraction33);
        org.apache.commons.math3.fraction.Fraction fraction35 = org.apache.commons.math3.fraction.Fraction.MINUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction36 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction36.negate();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction35.subtract(fraction37);
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction37.multiply((int) (byte) -1);
        org.apache.commons.math3.fraction.Fraction fraction41 = fraction33.multiply(fraction37);
        int int42 = fraction41.getNumerator();
        float float43 = fraction41.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction44 = org.apache.commons.math3.fraction.Fraction.FOUR_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction46 = new org.apache.commons.math3.fraction.Fraction(100);
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction44.multiply(fraction46);
        org.apache.commons.math3.fraction.Fraction fraction49 = fraction46.multiply((int) '4');
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException51 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats11, (java.lang.Number) float43, (java.lang.Number) fraction46, false);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats52 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_FIXED_LENGTH_CHROMOSOME;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats53 = org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats54 = org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats55 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL;
        java.lang.String str56 = localizedFormats55.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats57 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats58 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO;
        org.apache.commons.math3.fraction.Fraction fraction59 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException60 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction59);
        java.lang.Object[] objArray62 = new java.lang.Object[] { localizedFormats55, localizedFormats57, localizedFormats58, fraction59, (-10L) };
        java.lang.Object[] objArray63 = org.apache.commons.math3.exception.util.ArgUtils.flatten(objArray62);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException64 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats54, objArray62);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats65 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats66 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException68 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats66, (java.lang.Number) 100);
        org.apache.commons.math3.exception.util.Localizable localizable69 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats70 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA;
        java.lang.Object[] objArray71 = new java.lang.Object[] {};
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException72 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats70, objArray71);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException73 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) notPositiveException68, localizable69, objArray71);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException74 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException64, (org.apache.commons.math3.exception.util.Localizable) localizedFormats65, objArray71);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException75 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats53, objArray71);
        org.apache.commons.math3.exception.ConvergenceException convergenceException76 = new org.apache.commons.math3.exception.ConvergenceException((org.apache.commons.math3.exception.util.Localizable) localizedFormats52, objArray71);
        java.lang.Object[] objArray77 = org.apache.commons.math3.exception.util.ArgUtils.flatten(objArray71);
        exceptionContext8.addMessage((org.apache.commons.math3.exception.util.Localizable) localizedFormats11, objArray71);
        java.lang.Object obj80 = exceptionContext8.getValue("arithmetic exception");
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE));
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(exceptionContext8);
        org.junit.Assert.assertNotNull(throwable9);
        org.junit.Assert.assertEquals(throwable9.getLocalizedMessage(), "1 is smaller than the minimum (0): number of samples ({0})");
        org.junit.Assert.assertEquals(throwable9.getMessage(), "1 is smaller than the minimum (0): number of samples ({0})");
        org.junit.Assert.assertEquals(throwable9.toString(), "org.apache.commons.math3.exception.NotPositiveException: 1 is smaller than the minimum (0): number of samples ({0})");
        org.junit.Assert.assertNotNull(throwable10);
        org.junit.Assert.assertEquals(throwable10.getLocalizedMessage(), "1 is smaller than the minimum (0): number of samples ({0})");
        org.junit.Assert.assertEquals(throwable10.getMessage(), "1 is smaller than the minimum (0): number of samples ({0})");
        org.junit.Assert.assertEquals(throwable10.toString(), "org.apache.commons.math3.exception.NotPositiveException: 1 is smaller than the minimum (0): number of samples ({0})");
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SAMPLES + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_SAMPLES));
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertTrue("'" + localizedFormats18 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED + "'", localizedFormats18.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED));
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertNotNull(fraction34);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertNotNull(fraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.0f + "'", float43 == 0.0f);
        org.junit.Assert.assertNotNull(fraction44);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction49);
        org.junit.Assert.assertTrue("'" + localizedFormats52 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_FIXED_LENGTH_CHROMOSOME + "'", localizedFormats52.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_FIXED_LENGTH_CHROMOSOME));
        org.junit.Assert.assertTrue("'" + localizedFormats53 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA + "'", localizedFormats53.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CANNOT_COMPUTE_BETA_DENSITY_AT_1_FOR_SOME_BETA));
        org.junit.Assert.assertTrue("'" + localizedFormats54 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT + "'", localizedFormats54.equals(org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT));
        org.junit.Assert.assertTrue("'" + localizedFormats55 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL + "'", localizedFormats55.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "too small integration interval: length = {0}" + "'", str56, "too small integration interval: length = {0}");
        org.junit.Assert.assertTrue("'" + localizedFormats57 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES + "'", localizedFormats57.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES));
        org.junit.Assert.assertTrue("'" + localizedFormats58 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO + "'", localizedFormats58.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO));
        org.junit.Assert.assertNotNull(fraction59);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertTrue("'" + localizedFormats65 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME + "'", localizedFormats65.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME));
        org.junit.Assert.assertTrue("'" + localizedFormats66 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats66.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertTrue("'" + localizedFormats70 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA + "'", localizedFormats70.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA));
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[]");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[]");
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.5258789E-5f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.5258789E-5f + "'", float1 == 1.5258789E-5f);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(148, 52);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        double double2 = org.apache.commons.math3.util.FastMath.log(1145.9155902616465d, 1.5515679276951895d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.062360665503421286d + "'", double2 == 0.062360665503421286d);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(0, (int) (short) 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_DEFINITE_MATRIX;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL;
        java.lang.String str3 = localizedFormats2.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException7 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction6);
        java.lang.Object[] objArray9 = new java.lang.Object[] { localizedFormats2, localizedFormats4, localizedFormats5, fraction6, (-10L) };
        java.lang.Object[] objArray10 = org.apache.commons.math3.exception.util.ArgUtils.flatten(objArray9);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException11 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, objArray9);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats12 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException15 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats13, (java.lang.Number) 100);
        org.apache.commons.math3.exception.util.Localizable localizable16 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats17 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA;
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException19 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats17, objArray18);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException20 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) notPositiveException15, localizable16, objArray18);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException21 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException11, (org.apache.commons.math3.exception.util.Localizable) localizedFormats12, objArray18);
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException22 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray18);
        java.lang.Object[] objArray23 = org.apache.commons.math3.exception.util.ArgUtils.flatten(objArray18);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_DEFINITE_MATRIX + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NON_POSITIVE_DEFINITE_MATRIX));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT));
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "too small integration interval: length = {0}" + "'", str3, "too small integration interval: length = {0}");
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO));
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertTrue("'" + localizedFormats12 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME + "'", localizedFormats12.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME));
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertTrue("'" + localizedFormats17 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA + "'", localizedFormats17.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((long) (byte) 35, 64L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CLASS_DOESNT_IMPLEMENT_COMPARABLE;
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException4 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number) 0L, (java.lang.Number) 0.0d, false);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException7 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats5, (java.lang.Number) 100);
        numberIsTooLargeException4.addSuppressed((java.lang.Throwable) notPositiveException7);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext9 = new org.apache.commons.math3.exception.util.ExceptionContext((java.lang.Throwable) numberIsTooLargeException4);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats11 = org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS;
        exceptionContext9.setValue("", (java.lang.Object) localizedFormats11);
        java.util.Set<java.lang.String> strSet13 = exceptionContext9.getKeys();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats14 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_TOO_LARGE_BOUND_EXCLUDED;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats15 = org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats16 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL;
        java.lang.String str17 = localizedFormats16.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats18 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats19 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO;
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException21 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction20);
        java.lang.Object[] objArray23 = new java.lang.Object[] { localizedFormats16, localizedFormats18, localizedFormats19, fraction20, (-10L) };
        java.lang.Object[] objArray24 = org.apache.commons.math3.exception.util.ArgUtils.flatten(objArray23);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException25 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats15, objArray23);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats26 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats27 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException29 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats27, (java.lang.Number) 100);
        org.apache.commons.math3.exception.util.Localizable localizable30 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats31 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA;
        java.lang.Object[] objArray32 = new java.lang.Object[] {};
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException33 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats31, objArray32);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException34 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) notPositiveException29, localizable30, objArray32);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException35 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException25, (org.apache.commons.math3.exception.util.Localizable) localizedFormats26, objArray32);
        exceptionContext9.addMessage((org.apache.commons.math3.exception.util.Localizable) localizedFormats14, objArray32);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException37 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray32);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CLASS_DOESNT_IMPLEMENT_COMPARABLE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CLASS_DOESNT_IMPLEMENT_COMPARABLE));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertTrue("'" + localizedFormats11 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS + "'", localizedFormats11.equals(org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS));
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + localizedFormats14 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_TOO_LARGE_BOUND_EXCLUDED + "'", localizedFormats14.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_TOO_LARGE_BOUND_EXCLUDED));
        org.junit.Assert.assertTrue("'" + localizedFormats15 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT + "'", localizedFormats15.equals(org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT));
        org.junit.Assert.assertTrue("'" + localizedFormats16 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL + "'", localizedFormats16.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "too small integration interval: length = {0}" + "'", str17, "too small integration interval: length = {0}");
        org.junit.Assert.assertTrue("'" + localizedFormats18 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES + "'", localizedFormats18.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES));
        org.junit.Assert.assertTrue("'" + localizedFormats19 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO + "'", localizedFormats19.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO));
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertTrue("'" + localizedFormats26 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME + "'", localizedFormats26.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME));
        org.junit.Assert.assertTrue("'" + localizedFormats27 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats27.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertTrue("'" + localizedFormats31 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA + "'", localizedFormats31.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        int int2 = org.apache.commons.math3.util.FastMath.max(26, 1594323);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1594323 + "'", int2 == 1594323);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 459L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(0, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.negate();
        org.apache.commons.math3.fraction.FractionField fractionField2 = fraction1.getField();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.negate();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction1.subtract(fraction3);
        short short6 = fraction1.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fractionField2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.644483341943245d + "'", double1 == 4.644483341943245d);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 110L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 110.0d + "'", double1 == 110.0d);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.divide((int) ' ');
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 35.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats1 = org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats3 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL;
        java.lang.String str4 = localizedFormats3.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats6 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO;
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException8 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction7);
        java.lang.Object[] objArray10 = new java.lang.Object[] { localizedFormats3, localizedFormats5, localizedFormats6, fraction7, (-10L) };
        java.lang.Object[] objArray11 = org.apache.commons.math3.exception.util.ArgUtils.flatten(objArray10);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException12 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats2, objArray10);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats14 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException16 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats14, (java.lang.Number) 100);
        org.apache.commons.math3.exception.util.Localizable localizable17 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats18 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA;
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException20 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats18, objArray19);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException21 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) notPositiveException16, localizable17, objArray19);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException22 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException12, (org.apache.commons.math3.exception.util.Localizable) localizedFormats13, objArray19);
        org.apache.commons.math3.exception.NullArgumentException nullArgumentException23 = new org.apache.commons.math3.exception.NullArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats1, objArray19);
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException24 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray19);
        java.lang.String str25 = mathArithmeticException24.toString();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1 + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ARRAY_SIZES_SHOULD_HAVE_DIFFERENCE_1));
        org.junit.Assert.assertTrue("'" + localizedFormats1 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS + "'", localizedFormats1.equals(org.apache.commons.math3.exception.util.LocalizedFormats.WRONG_NUMBER_OF_POINTS));
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT));
        org.junit.Assert.assertTrue("'" + localizedFormats3 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL + "'", localizedFormats3.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "too small integration interval: length = {0}" + "'", str4, "too small integration interval: length = {0}");
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES));
        org.junit.Assert.assertTrue("'" + localizedFormats6 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO + "'", localizedFormats6.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO));
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME));
        org.junit.Assert.assertTrue("'" + localizedFormats14 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats14.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertTrue("'" + localizedFormats18 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA + "'", localizedFormats18.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.apache.commons.math3.exception.MathArithmeticException: array sizes should have difference 1 ({0} != {1} + 1)" + "'", str25, "org.apache.commons.math3.exception.MathArithmeticException: array sizes should have difference 1 ({0} != {1} + 1)");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((long) (byte) 0, (long) 48);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((-1), 2);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_HALF;
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int5 = fraction4.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException8 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction7);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction3.subtract(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction7.add((int) (short) 0);
        int int12 = fraction2.compareTo(fraction11);
        java.math.BigInteger bigInteger13 = null;
        java.math.BigInteger bigInteger15 = org.apache.commons.math3.util.ArithmeticUtils.pow(bigInteger13, (long) 0);
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.getReducedFraction(2, (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction20 = fraction18.multiply(0);
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException22 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number) bigInteger13, (java.lang.Number) fraction18, false);
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction2.multiply(fraction18);
        org.apache.commons.math3.fraction.Fraction fraction27 = new org.apache.commons.math3.fraction.Fraction((double) 7.6293945E-6f, (double) (short) 4, 45);
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction18.subtract(fraction27);
        org.apache.commons.math3.fraction.Fraction fraction29 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction29.multiply(100);
        org.apache.commons.math3.fraction.Fraction fraction32 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction33 = fraction32.abs();
        float float34 = fraction32.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction35 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int36 = fraction35.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction38 = fraction35.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException39 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction38);
        org.apache.commons.math3.fraction.Fraction fraction40 = fraction32.divide(fraction38);
        float float41 = fraction38.floatValue();
        boolean boolean42 = fraction31.equals((java.lang.Object) fraction38);
        double double43 = fraction31.doubleValue();
        int int44 = fraction31.intValue();
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField45 = fraction31.getField();
        org.apache.commons.math3.fraction.Fraction fraction47 = fraction31.add((int) (short) 0);
        org.apache.commons.math3.fraction.Fraction fraction48 = fraction28.subtract(fraction31);
        org.apache.commons.math3.fraction.Fraction fraction49 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction50 = fraction28.add(fraction49);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: fraction");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction31);
        org.junit.Assert.assertNotNull(fraction32);
        org.junit.Assert.assertNotNull(fraction33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.5f + "'", float34 == 0.5f);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(fraction38);
        org.junit.Assert.assertNotNull(fraction40);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 0.4f + "'", float41 == 0.4f);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 20.0d + "'", double43 == 20.0d);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 20 + "'", int44 == 20);
        org.junit.Assert.assertNotNull(fractionField45);
        org.junit.Assert.assertNotNull(fraction47);
        org.junit.Assert.assertNotNull(fraction48);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.abs();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats2 = org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS;
        boolean boolean3 = fraction1.equals((java.lang.Object) localizedFormats2);
        double double4 = fraction1.doubleValue();
        org.apache.commons.math3.fraction.Fraction fraction5 = org.apache.commons.math3.fraction.Fraction.THREE_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.add((int) (short) 0);
        int int8 = fraction1.compareTo(fraction5);
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction5.abs();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + localizedFormats2 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS + "'", localizedFormats2.equals(org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.LCM_OVERFLOW_32_BITS;
        java.lang.String str1 = localizedFormats0.getSourceString();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LCM_OVERFLOW_32_BITS + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LCM_OVERFLOW_32_BITS));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "overflow: lcm({0}, {1}) is 2^31" + "'", str1, "overflow: lcm({0}, {1}) is 2^31");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.CONTRACTION_CRITERIA_SMALLER_THAN_EXPANSION_FACTOR;
        java.lang.Object[] objArray1 = null;
        org.apache.commons.math3.exception.MathArithmeticException mathArithmeticException2 = new org.apache.commons.math3.exception.MathArithmeticException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray1);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats3 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO_PLUS_ONE;
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction6.abs();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction10 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction9.add(fraction10);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction9.abs();
        org.apache.commons.math3.fraction.Fraction fraction13 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction13.abs();
        float float15 = fraction13.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction16 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int17 = fraction16.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction16.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException20 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction19);
        org.apache.commons.math3.fraction.Fraction fraction21 = fraction13.divide(fraction19);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats22 = org.apache.commons.math3.exception.util.LocalizedFormats.FRACTION;
        java.lang.Object[] objArray23 = new java.lang.Object[] { 43.0f, 'a', fraction12, fraction13, localizedFormats22 };
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException24 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats3, objArray23);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException25 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, objArray23);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.CONTRACTION_CRITERIA_SMALLER_THAN_EXPANSION_FACTOR + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.CONTRACTION_CRITERIA_SMALLER_THAN_EXPANSION_FACTOR));
        org.junit.Assert.assertTrue("'" + localizedFormats3 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO_PLUS_ONE + "'", localizedFormats3.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO_PLUS_ONE));
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertNotNull(fraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertTrue("'" + localizedFormats22 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.FRACTION + "'", localizedFormats22.equals(org.apache.commons.math3.exception.util.LocalizedFormats.FRACTION));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[43.0, a, 1 / 2, 1 / 2, FRACTION]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[43.0, a, 1 / 2, 1 / 2, FRACTION]");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.017453292447995462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017455064964259824d + "'", double1 == 0.017455064964259824d);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.abs();
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction0.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException5 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction4);
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction0.multiply(fraction4);
        byte byte7 = fraction4.byteValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_ADDITION;
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.subtract(fraction4);
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction5.add(1661992960);
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException9 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) 90L, (java.lang.Number) fraction5, false);
        java.lang.Number number10 = numberIsTooSmallException9.getMin();
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext11 = numberIsTooSmallException9.getContext();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_ADDITION + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.OVERFLOW_IN_ADDITION));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(exceptionContext11);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((long) (byte) 1, 64L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number) 210L, (java.lang.Number) (short) 100, true);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction2 = fraction0.multiply(100);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.abs();
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction4.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction8 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction7.add(fraction8);
        int int10 = fraction3.compareTo(fraction7);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction2.subtract(fraction3);
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction3.divide((int) '4');
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction15 = fraction14.abs();
        org.apache.commons.math3.fraction.Fraction fraction17 = fraction14.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction18 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction19 = fraction17.add(fraction18);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats20 = org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED;
        org.apache.commons.math3.fraction.Fraction fraction21 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction22 = fraction21.negate();
        org.apache.commons.math3.exception.NotPositiveException notPositiveException23 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats20, (java.lang.Number) fraction21);
        org.apache.commons.math3.fraction.Fraction fraction26 = new org.apache.commons.math3.fraction.Fraction((int) ' ', (int) '4');
        org.apache.commons.math3.fraction.Fraction fraction27 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction29 = fraction27.multiply(100);
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException31 = new org.apache.commons.math3.exception.NumberIsTooLargeException((org.apache.commons.math3.exception.util.Localizable) localizedFormats20, (java.lang.Number) fraction26, (java.lang.Number) fraction27, true);
        org.apache.commons.math3.fraction.Fraction fraction34 = new org.apache.commons.math3.fraction.Fraction((int) '#', (int) (short) 1);
        org.apache.commons.math3.fraction.Fraction fraction35 = fraction26.add(fraction34);
        org.apache.commons.math3.fraction.Fraction fraction36 = fraction17.multiply(fraction35);
        org.apache.commons.math3.fraction.Fraction fraction37 = fraction3.add(fraction36);
        org.apache.commons.math3.fraction.Fraction fraction39 = fraction3.add((-10));
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fraction15);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertTrue("'" + localizedFormats20 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED + "'", localizedFormats20.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TRUST_REGION_STEP_FAILED));
        org.junit.Assert.assertNotNull(fraction21);
        org.junit.Assert.assertNotNull(fraction22);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction29);
        org.junit.Assert.assertNotNull(fraction35);
        org.junit.Assert.assertNotNull(fraction36);
        org.junit.Assert.assertNotNull(fraction37);
        org.junit.Assert.assertNotNull(fraction39);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_COMPLEX_MODULE;
        java.lang.Number number2 = null;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException4 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) (byte) 100, number2, false);
        boolean boolean5 = numberIsTooSmallException4.getBoundIsAllowed();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_COMPLEX_MODULE + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NEGATIVE_COMPLEX_MODULE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction((int) (byte) 10);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(0L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.math3.fraction.Fraction fraction2 = new org.apache.commons.math3.fraction.Fraction((int) ' ', (int) '4');
        int int3 = fraction2.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.add(32);
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction7 = fraction6.abs();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply(1);
        org.apache.commons.math3.fraction.Fraction fraction12 = new org.apache.commons.math3.fraction.Fraction((int) (short) 10, 10);
        boolean boolean13 = fraction9.equals((java.lang.Object) (short) 10);
        org.apache.commons.math3.fraction.Fraction fraction14 = org.apache.commons.math3.fraction.Fraction.ONE;
        boolean boolean16 = fraction14.equals((java.lang.Object) 128.0f);
        org.apache.commons.math3.fraction.Fraction fraction17 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction18 = fraction17.abs();
        float float19 = fraction17.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction20 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int21 = fraction20.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction23 = fraction20.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException24 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction23);
        org.apache.commons.math3.fraction.Fraction fraction25 = fraction17.divide(fraction23);
        int int26 = fraction23.intValue();
        org.apache.commons.math3.fraction.Fraction fraction27 = fraction23.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction28 = fraction14.divide(fraction23);
        float float29 = fraction14.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction30 = fraction9.subtract(fraction14);
        org.apache.commons.math3.fraction.Fraction fraction31 = fraction2.multiply(fraction14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(fraction17);
        org.junit.Assert.assertNotNull(fraction18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
        org.junit.Assert.assertNotNull(fraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(fraction23);
        org.junit.Assert.assertNotNull(fraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(fraction27);
        org.junit.Assert.assertNotNull(fraction28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertNotNull(fraction30);
        org.junit.Assert.assertNotNull(fraction31);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(100L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble((-86196911));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException; message: must have n >= 0 for n!, got n = -86,196,911");
        } catch (org.apache.commons.math3.exception.NotPositiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.06981317007977318d, 50.50745018749687d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.07590208048749E-59d + "'", double2 == 4.07590208048749E-59d);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        int int1 = org.apache.commons.math3.util.FastMath.abs(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5689240493544077d) + "'", double1 == (-0.5689240493544077d));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        double double2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog(1661992960, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.math3.fraction.Fraction fraction3 = new org.apache.commons.math3.fraction.Fraction(9.7563905186483d, (double) 459L, (int) '#');
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        long long2 = org.apache.commons.math3.util.FastMath.max((-1L), 90L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 90L + "'", long2 == 90L);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number) 0L, (java.lang.Number) 0.0d, false);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException6 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats4, (java.lang.Number) 100);
        numberIsTooLargeException3.addSuppressed((java.lang.Throwable) notPositiveException6);
        org.apache.commons.math3.exception.util.ExceptionContext exceptionContext8 = new org.apache.commons.math3.exception.util.ExceptionContext((java.lang.Throwable) numberIsTooLargeException3);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats10 = org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS;
        exceptionContext8.setValue("", (java.lang.Object) localizedFormats10);
        java.util.Set<java.lang.String> strSet12 = exceptionContext8.getKeys();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats13 = org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_TOO_LARGE_BOUND_EXCLUDED;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats14 = org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats15 = org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL;
        java.lang.String str16 = localizedFormats15.getSourceString();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats17 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats18 = org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO;
        org.apache.commons.math3.fraction.Fraction fraction19 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException20 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction19);
        java.lang.Object[] objArray22 = new java.lang.Object[] { localizedFormats15, localizedFormats17, localizedFormats18, fraction19, (-10L) };
        java.lang.Object[] objArray23 = org.apache.commons.math3.exception.util.ArgUtils.flatten(objArray22);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException24 = new org.apache.commons.math3.exception.MathIllegalStateException((org.apache.commons.math3.exception.util.Localizable) localizedFormats14, objArray22);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats25 = org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats26 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException28 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats26, (java.lang.Number) 100);
        org.apache.commons.math3.exception.util.Localizable localizable29 = null;
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats30 = org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA;
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException32 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats30, objArray31);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException33 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) notPositiveException28, localizable29, objArray31);
        org.apache.commons.math3.exception.MathIllegalStateException mathIllegalStateException34 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable) mathIllegalStateException24, (org.apache.commons.math3.exception.util.Localizable) localizedFormats25, objArray31);
        exceptionContext8.addMessage((org.apache.commons.math3.exception.util.Localizable) localizedFormats13, objArray31);
        java.util.Set<java.lang.String> strSet36 = exceptionContext8.getKeys();
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertTrue("'" + localizedFormats10 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS + "'", localizedFormats10.equals(org.apache.commons.math3.exception.util.LocalizedFormats.RANDOMKEY_MUTATION_WRONG_CLASS));
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + localizedFormats13 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_TOO_LARGE_BOUND_EXCLUDED + "'", localizedFormats13.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_TOO_LARGE_BOUND_EXCLUDED));
        org.junit.Assert.assertTrue("'" + localizedFormats14 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT + "'", localizedFormats14.equals(org.apache.commons.math3.exception.util.LocalizedFormats.IMAGINARY_FORMAT));
        org.junit.Assert.assertTrue("'" + localizedFormats15 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL + "'", localizedFormats15.equals(org.apache.commons.math3.exception.util.LocalizedFormats.TOO_SMALL_INTEGRATION_INTERVAL));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "too small integration interval: length = {0}" + "'", str16, "too small integration interval: length = {0}");
        org.junit.Assert.assertTrue("'" + localizedFormats17 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES + "'", localizedFormats17.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_SUBTRACTION_COMPATIBLE_MATRICES));
        org.junit.Assert.assertTrue("'" + localizedFormats18 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO + "'", localizedFormats18.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POWER_OF_TWO));
        org.junit.Assert.assertNotNull(fraction19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[TOO_SMALL_INTEGRATION_INTERVAL, NOT_SUBTRACTION_COMPATIBLE_MATRICES, NOT_POWER_OF_TWO, 1 / 5, -10]");
        org.junit.Assert.assertTrue("'" + localizedFormats25 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME + "'", localizedFormats25.equals(org.apache.commons.math3.exception.util.LocalizedFormats.INVALID_BINARY_CHROMOSOME));
        org.junit.Assert.assertTrue("'" + localizedFormats26 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats26.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertTrue("'" + localizedFormats30 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA + "'", localizedFormats30.equals(org.apache.commons.math3.exception.util.LocalizedFormats.NO_DATA));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NOT_ALLOWED;
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException4 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number) 0L, (java.lang.Number) 0.0d, false);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats5 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException7 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats5, (java.lang.Number) 100);
        numberIsTooLargeException4.addSuppressed((java.lang.Throwable) notPositiveException7);
        java.lang.Number number9 = numberIsTooLargeException4.getArgument();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats10 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException14 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats10, (java.lang.Number) (-0.017453292519943295d), (java.lang.Number) 10.000000000000002d, true);
        numberIsTooLargeException4.addSuppressed((java.lang.Throwable) numberIsTooSmallException14);
        java.lang.Throwable[] throwableArray16 = numberIsTooLargeException4.getSuppressed();
        org.apache.commons.math3.exception.MathIllegalArgumentException mathIllegalArgumentException17 = new org.apache.commons.math3.exception.MathIllegalArgumentException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Object[]) throwableArray16);
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NOT_ALLOWED + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NOT_ALLOWED));
        org.junit.Assert.assertTrue("'" + localizedFormats5 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats5.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + 0L + "'", number9, 0L);
        org.junit.Assert.assertTrue("'" + localizedFormats10 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX + "'", localizedFormats10.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX));
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5.267884728309446d, (double) (-4));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0012985388494364143d + "'", double2 == 0.0012985388494364143d);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats0 = org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT;
        org.apache.commons.math3.fraction.Fraction fraction2 = org.apache.commons.math3.fraction.Fraction.ZERO;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction2.negate();
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction2.subtract(fraction4);
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException7 = new org.apache.commons.math3.exception.NumberIsTooLargeException((org.apache.commons.math3.exception.util.Localizable) localizedFormats0, (java.lang.Number) 1661992960, (java.lang.Number) fraction5, false);
        boolean boolean8 = numberIsTooLargeException7.getBoundIsAllowed();
        org.junit.Assert.assertTrue("'" + localizedFormats0 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT + "'", localizedFormats0.equals(org.apache.commons.math3.exception.util.LocalizedFormats.LOWER_ENDPOINT_ABOVE_UPPER_ENDPOINT));
        org.junit.Assert.assertNotNull(fraction2);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1661992960L, 1.1962222086548034E56d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.math3.fraction.Fraction fraction1 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.fraction.Fraction fraction3 = fraction1.multiply(100);
        org.apache.commons.math3.fraction.Fraction fraction4 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction5 = fraction4.abs();
        float float6 = fraction4.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction7 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int8 = fraction7.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction10 = fraction7.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException11 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction10);
        org.apache.commons.math3.fraction.Fraction fraction12 = fraction4.divide(fraction10);
        float float13 = fraction10.floatValue();
        boolean boolean14 = fraction3.equals((java.lang.Object) fraction10);
        double double15 = fraction3.doubleValue();
        int int16 = fraction3.intValue();
        org.apache.commons.math3.Field<org.apache.commons.math3.fraction.Fraction> fractionField17 = fraction3.getField();
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException19 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number) 5729.5779513082325d, (java.lang.Number) fraction3, false);
        double double20 = fraction3.doubleValue();
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertNotNull(fraction5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
        org.junit.Assert.assertNotNull(fraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(fraction10);
        org.junit.Assert.assertNotNull(fraction12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.4f + "'", float13 == 0.4f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(fractionField17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        long long2 = org.apache.commons.math3.util.ArithmeticUtils.pow(97L, 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9047709927049615999L) + "'", long2 == (-9047709927049615999L));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE_FIFTH;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction0);
        short short2 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        double double1 = org.apache.commons.math3.util.FastMath.abs(363.7393755555636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 363.7393755555636d + "'", double1 == 363.7393755555636d);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        int int2 = org.apache.commons.math3.util.ArithmeticUtils.pow(148, (long) 14900);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.ONE;
        boolean boolean2 = fraction0.equals((java.lang.Object) 128.0f);
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction4 = fraction3.abs();
        float float5 = fraction3.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction6 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int7 = fraction6.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction9 = fraction6.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException10 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction9);
        org.apache.commons.math3.fraction.Fraction fraction11 = fraction3.divide(fraction9);
        int int12 = fraction9.intValue();
        org.apache.commons.math3.fraction.Fraction fraction13 = fraction9.reciprocal();
        org.apache.commons.math3.fraction.Fraction fraction14 = fraction0.divide(fraction9);
        org.apache.commons.math3.fraction.FractionField fractionField15 = fraction0.getField();
        java.lang.Class<? extends org.apache.commons.math3.FieldElement<org.apache.commons.math3.fraction.Fraction>> wildcardClass16 = fractionField15.getRuntimeClass();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertNotNull(fraction4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(fraction9);
        org.junit.Assert.assertNotNull(fraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(fraction13);
        org.junit.Assert.assertNotNull(fraction14);
        org.junit.Assert.assertNotNull(fractionField15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.math3.fraction.Fraction fraction0 = org.apache.commons.math3.fraction.Fraction.TWO_QUARTERS;
        org.apache.commons.math3.fraction.Fraction fraction1 = fraction0.abs();
        float float2 = fraction0.floatValue();
        org.apache.commons.math3.fraction.Fraction fraction3 = org.apache.commons.math3.fraction.Fraction.TWO_FIFTHS;
        int int4 = fraction3.getNumerator();
        org.apache.commons.math3.fraction.Fraction fraction6 = fraction3.multiply((int) (short) 1);
        org.apache.commons.math3.exception.NotPositiveException notPositiveException7 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number) fraction6);
        org.apache.commons.math3.fraction.Fraction fraction8 = fraction0.divide(fraction6);
        java.lang.String str9 = fraction0.toString();
        short short10 = fraction0.shortValue();
        org.junit.Assert.assertNotNull(fraction0);
        org.junit.Assert.assertNotNull(fraction1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
        org.junit.Assert.assertNotNull(fraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(fraction6);
        org.junit.Assert.assertNotNull(fraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 / 2" + "'", str9, "1 / 2");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.math3.exception.NumberIsTooLargeException numberIsTooLargeException3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number) 0L, (java.lang.Number) 0.0d, false);
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats4 = org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N;
        org.apache.commons.math3.exception.NotPositiveException notPositiveException6 = new org.apache.commons.math3.exception.NotPositiveException((org.apache.commons.math3.exception.util.Localizable) localizedFormats4, (java.lang.Number) 100);
        numberIsTooLargeException3.addSuppressed((java.lang.Throwable) notPositiveException6);
        java.lang.Number number8 = numberIsTooLargeException3.getArgument();
        org.apache.commons.math3.exception.util.LocalizedFormats localizedFormats9 = org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX;
        org.apache.commons.math3.exception.NumberIsTooSmallException numberIsTooSmallException13 = new org.apache.commons.math3.exception.NumberIsTooSmallException((org.apache.commons.math3.exception.util.Localizable) localizedFormats9, (java.lang.Number) (-0.017453292519943295d), (java.lang.Number) 10.000000000000002d, true);
        numberIsTooLargeException3.addSuppressed((java.lang.Throwable) numberIsTooSmallException13);
        boolean boolean15 = numberIsTooLargeException3.getBoundIsAllowed();
        java.lang.Number number16 = numberIsTooLargeException3.getArgument();
        org.junit.Assert.assertTrue("'" + localizedFormats4 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N + "'", localizedFormats4.equals(org.apache.commons.math3.exception.util.LocalizedFormats.PERMUTATION_EXCEEDS_N));
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 0L + "'", number8, 0L);
        org.junit.Assert.assertTrue("'" + localizedFormats9 + "' != '" + org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX + "'", localizedFormats9.equals(org.apache.commons.math3.exception.util.LocalizedFormats.UNABLE_TO_ORTHOGONOLIZE_MATRIX));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 0L + "'", number16, 0L);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.fraction.Fraction fraction1 = new org.apache.commons.math3.fraction.Fraction(2.3639197341146732E18d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.fraction.FractionConversionException; message: illegal state: Overflow trying to convert 2,363,919,734,114,673,200 to fraction (2,363,919,734,114,673,152/1)");
        } catch (org.apache.commons.math3.fraction.FractionConversionException e) {
        // Expected exception.
        }
    }
}
