package test.com.educative.slidingwindow;

import com.educative.slidingwindow.MaxSumSubArrayOfSizeK;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxSumSubArrayOfSizeKTest {

    /*
    Input: [2, 1, 5, 1, 3, 2], k=3
    Output: 9
    Explanation: Subarray with maximum sum is [5, 1, 3].
     */
    @Test
    public void findMaxSumSubArray1() {
        int[] inputArr = new int[]{2, 1, 5, 1, 3, 2};
        int inputK = 3;
        int expect = 9;

        assertEquals(expect, MaxSumSubArrayOfSizeK.findMaxSumSubArray(inputK,inputArr));
    }

    /*
     * Input: [2, 3, 4, 1, 5], k=2
     * Output: 7
     * Explanation: Subarray with maximum sum is [3, 4].
    */
    @Test
    public void findMaxSumSubArray2() {
        int[] inputArr = new int[]{2, 3, 4, 1, 5};
        int inputK = 2;
        int expect = 7;

        assertEquals(expect, MaxSumSubArrayOfSizeK.findMaxSumSubArray(inputK,inputArr));
    }
}