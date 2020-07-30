package com.leetcode.recursionI.complexityanalysis;

/**
 * Implement pow(x, n), which calculates x raised to the power n (xn).
 *
 * Example 1:
 *
 * Input: 2.00000, 10
 * Output: 1024.00000
 * Example 2:
 *
 * Input: 2.10000, 3
 * Output: 9.26100
 * Example 3:
 *
 * Input: 2.00000, -2
 * Output: 0.25000
 * Explanation: 2-2 = 1/22 = 1/4 = 0.25
 * Note:
 *
 * -100.0 < x < 100.0
 * n is a 32-bit signed integer, within the range [−231, 231 − 1]
 */
// TODO: 2020-07-22 didn't do it right first time, can't pass all tests in leetcode, has stack overflow problem 
public class Pow {
    //non tail recursion,StackOverflowError on leetcode
    public static double myPowNonTailRecursion(double x, int n) {

        long N = n; //Integer.MIN_VALUE to Integer.MAX_VALUE overflow
        if(N < 0) {
            x = 1 / x;
            N = -N;
        }

        return  helperNonTailRecursion(x, N);
    }

    private static double helperNonTailRecursion(double x, long n) {
        if(n == 0) {
            return 1.0;
        }

        return x * helperNonTailRecursion(x, n-1);
    }


    //non tail recursion, StackOverflowError on leetcode
    public static double myPowTailRecursion(double x, int n) {
        long N = n; //Integer.MIN_VALUE to Integer.MAX_VALUE overflow
        if(N < 0) {
            x = 1 / x;
            N = -N;
        }

        return helperTailRecursion(x, N, 1.0);
    }

    private static double helperTailRecursion(double x, long n, double preResult) {
        if( n == 0) return preResult;

        return helperTailRecursion(x, n-1, x * preResult);
    }

    public static double myPowBruteForce(double x, int n) {
        if(n == 0) return 1.0;
        long N = n;

        if(N < 0) {
            x = 1/x;
            N = -N;
        }

        double result = 1.0;

        for(int i=0; i<N; i++) {
            result= result * x;
        }

        return result;
    }

    public static double fastPowerRecursion(double x, int n) {
        long N = n;

        if(N < 0) {
            x = 1 / x;
            N = -N;
        }

        return helperFastPowerRecursion(x, N);
    }

    private static double helperFastPowerRecursion(double x, long n) {
        if(n == 0) return 1.0;

        double half = helperFastPowerRecursion(x, n / 2);

        if(n % 2 == 0) {
            return half * half;
        }else {
            return half * half * x;
        }
    }

    public static double fastPowerIteration(double x, int n) {
        if(n == 0 ) return 1.0;

        long N = n;
        if(N < 0 ) {
            x = 1 / x;
            N = -N;
        }

        double result = 1.0;
        double currResult = x;

        for(long i = N; i > 0; i /= 2) {
            if(i % 2 == 1) {
                result = result * currResult;
            }

            currResult = currResult * currResult;
        }

        return result;
    }
}
