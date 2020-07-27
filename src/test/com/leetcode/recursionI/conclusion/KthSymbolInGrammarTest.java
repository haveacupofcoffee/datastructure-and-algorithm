package com.leetcode.recursionI.conclusion;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Examples:
 * Input: N = 1, K = 1
 * Output: 0
 *
 * Input: N = 2, K = 1
 * Output: 0
 *
 * Input: N = 2, K = 2
 * Output: 1
 *
 * Input: N = 4, K = 5
 * Output: 1
 */
public class KthSymbolInGrammarTest {

    @Test
    public void kthGrammar1() {
        int N = 1;
        int K = 1;
        int expect = 0;
        assertEquals(expect, KthSymbolInGrammar.kthGrammar(N, K));
    }

    @Test
    public void kthGrammar2() {
        int N = 2;
        int K = 1;
        int expect = 0;
        assertEquals(expect, KthSymbolInGrammar.kthGrammar(N, K));
    }

    @Test
    public void kthGrammar3() {
        int N = 2;
        int K = 2;
        int expect = 1;
        assertEquals(expect, KthSymbolInGrammar.kthGrammar(N, K));
    }

    @Test
    public void kthGrammar4() {
        int N = 4;
        int K = 5;
        int expect = 1;
        assertEquals(expect, KthSymbolInGrammar.kthGrammar(N, K));
    }

    @Test
    public void kthGrammar5() {
        int N = 30;
        int K = 434991989;
        int expect = 0;
        assertEquals(expect, KthSymbolInGrammar.kthGrammar(N, K));
    }
}