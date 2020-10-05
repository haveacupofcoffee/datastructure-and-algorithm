package com.review.leetcode.queueandstack.conclustion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecodeStringTest {

    @Test
    public void decodeString1() {
        String input = "3[a]2[bc]";
        String expect = "aaabcbc";

        assertEquals(expect, new DecodeString().decodeString(input));
    }

    @Test
    public void decodeString2() {
        String input = "3[a2[c]]";
        String expect = "accaccacc";

        assertEquals(expect, new DecodeString().decodeString(input));
    }

    @Test
    public void decodeString3() {
        String input = "2[abc]3[cd]ef";
        String expect = "abcabccdcdcdef";

        assertEquals(expect, new DecodeString().decodeString(input));
    }

    @Test
    public void decodeString4() {
        String input = "abc3[cd]xyz";
        String expect = "abccdcdcdxyz";

        assertEquals(expect, new DecodeString().decodeString(input));
    }

    @Test
    public void decodeString5() {
        String input = "100[leetcode]";
        String expect = "";
        for(int i=0; i<100; i++) {
            expect += "leetcode";
        }

        assertEquals(expect, new DecodeString().decodeString(input));
    }






}