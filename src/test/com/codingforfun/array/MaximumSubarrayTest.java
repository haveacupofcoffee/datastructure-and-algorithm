package test.com.codingforfun.array;

import com.leetcode.array.MaximumSubarray;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSubarrayTest {

    @Test
    public void maxSubArray() {
        int[] test = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, MaximumSubarray.maxSubArray(test));
    }
}