package com.leetcode.recursionI.complexityanalysis;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *  * Example 1:
 *  *
 *  * Input: 2.00000, 10
 *  * Output: 1024.00000
 *  * Example 2:
 *  *
 *  * Input: 2.10000, 3
 *  * Output: 9.26100
 *  * Example 3:
 *  *
 *  * Input: 2.00000, -2
 *  * Output: 0.25000
 *  * Explanation: 2-2 = 1/22 = 1/4 = 0.25
 */
public class PowTest {

    @Test
    public void myPowNonTailRecursion1() {
        double input = 2.00000;
        int n = 10;
        double expect = 1024.00000;

        assertEquals(expect,Pow.myPowNonTailRecursion(input,n),5);
    }


    @Test
    public void myPowNonTailRecursion2() {
        double input = 2.10000;
        int n = 3;
        double expect = 9.26100;

        assertEquals(expect,Pow.myPowNonTailRecursion(input,n),5);
    }


    @Test
    public void myPowNonTailRecursion3() {
        double input = 2.00000;
        int n = -2;
        double expect = 0.25000;

        assertEquals(expect,Pow.myPowNonTailRecursion(input,n),5);
    }


    @Test
    public void myPowTailRecursion1() {
        double input = 2.00000;
        int n = 10;
        double expect = 1024.00000;

        assertEquals(expect,Pow.myPowTailRecursion(input,n),5);
    }


    @Test
    public void myPowTailRecursion2() {
        double input = 2.10000;
        int n = 3;
        double expect = 9.26100;

        assertEquals(expect,Pow.myPowTailRecursion(input,n),5);
    }


    @Test
    public void myPowTailRecursion3() {
        double input = 2.00000;
        int n = -2;
        double expect = 0.25000;

        assertEquals(expect,Pow.myPowTailRecursion(input,n),5);
    }

    @Test
    public void myPowBruteForce() {
        double input = 1.00000;
        int n = 2147483647;

        double expcet = 1.00000;

        assertEquals(expcet, Pow.myPowBruteForce(input, n), 5);
    }
}