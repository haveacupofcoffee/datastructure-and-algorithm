package com.review.leetcode.tags;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length ==0) return 0;

        int n = nums.length;

        int currSum = nums[0];
        int maxSum = nums[0];

        for(int i=1; i<n;i++) {
            currSum = Math.max(nums[i], currSum+nums[i]);

            maxSum = Math.max(currSum, maxSum);
        }


        return maxSum;
    }
}
