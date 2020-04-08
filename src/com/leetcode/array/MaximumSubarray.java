package com.leetcode.array;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {

        if(nums == null || nums.length == 0) {
            throw new NullPointerException("array is null or empty");
        }

        int sum = Integer.MIN_VALUE;
        int windowSum = 0;
        int windowStart=0;

        for(int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum += nums[windowEnd];
            if(windowSum > sum) {
                while(windowStart <= windowEnd) {
                    sum = Math.max(sum, windowSum);
                    if(windowStart < windowEnd) {
                        windowSum -= nums[windowStart];
                        windowStart++;
                    }else {
                        break;
                    }
                }
            }
        }

        return sum;



    }
}
