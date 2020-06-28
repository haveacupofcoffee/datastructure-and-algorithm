package test.com.codingforfun.array;

import com.leetcode.array.MaxConsecutiveOnes;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxConsecutiveOnesTest {

    @Test
    public void findMaxConsecutiveOnes() {
        int[] nums = new int[]{1,1,0,1,1,1};
        int expect = 3;
        assertEquals(expect, MaxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }
}