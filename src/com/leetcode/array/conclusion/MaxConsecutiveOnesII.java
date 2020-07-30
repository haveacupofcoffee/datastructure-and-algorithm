package com.leetcode.array.conclusion;

/**
 * Given a binary array, find the maximum number of consecutive 1s in this array if you can flip at most one 0.
 *
 * Example 1:
 * Input: [1,0,1,1,0]
 * Output: 4
 * Explanation: Flip the first zero will get the the maximum number of consecutive 1s.
 *     After flipping, the maximum number of consecutive 1s is 4.
 * Note:
 *
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 * Follow up:
 * What if the input numbers come in one by one as an infinite stream? In other words, you can't store all numbers
 * coming from the stream as it's too large to hold in memory. Could you solve it efficiently?
 */
public class MaxConsecutiveOnesII {
    // TODO: 2020-07-27 Review
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, zeroIndex = -1;
        int windowLeft = 0;
        for(int windowRight = 0; windowRight < nums.length; windowRight++) {
            if(nums[windowRight] == 0) {
                windowLeft = zeroIndex + 1;
                zeroIndex = windowRight;
            }

            max = Math.max(max, windowRight - windowLeft + 1);
        }

        return max;

    }
}
