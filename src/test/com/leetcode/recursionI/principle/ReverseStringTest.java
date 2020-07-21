package com.leetcode.recursionI.principle;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example 1:
 *
 * Input: ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * Example 2:
 *
 * Input: ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 */
public class ReverseStringTest {

    @Test
    public void reverseString1() {
        char[] input = "hello".toCharArray();
        char[] expect = "olleh".toCharArray();

        ReverseString.reverseString(input);
        assertArrayEquals(expect,input);
    }

    @Test
    public void reverseString2() {
        char[] input = "hannah".toCharArray();
        char[] expect = "hannah".toCharArray();

        ReverseString.reverseString(input);
        assertArrayEquals(expect,input);
    }
}