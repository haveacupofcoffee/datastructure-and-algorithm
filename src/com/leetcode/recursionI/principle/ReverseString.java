package com.leetcode.recursionI.principle;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

/**
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * You may assume all the characters consist of printable ascii characters.
 *
 *
 *
 * Example 1:
 *
 * Input: ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * Example 2:
 *
 * Input: ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 */
public class ReverseString {

    public static void reverseString(char[] s) {
        helper(0, s.length-1, s);
    }

    private static void helper(int left, int right, char[] s) {
        if(left >= right) {
            return;
        }

        //swap
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        helper(left + 1, right - 1, s);

    }
}
