package com.leetcode.array.problems;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one
 * number) which has the largest sum and return its sum.
 *
 * Example:
 *
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Follow up:
 *
 * If you have figured out the O(n) solution, try coding another solution using the
 * divide and conquer approach, which is more subtle.
 */
public class MaximumSubarray {
    public  int maxSubArrayDivideAndConquer(int[] nums) {
        return helper(nums, 0, nums.length -1);
    }

    private int helper(int[] nums, int left, int right) {
        if(left == right) return nums[left];

        int p = (left + right) / 2;

        int leftSum = helper(nums, left, p);
        int rightSum = helper(nums, p+1,right);
        int crossSum = crossSum(nums, left, right, p);

        return Math.max(Math.max(leftSum, rightSum), crossSum);

    }


    private int crossSum(int[] nums, int left, int right, int p) {
        if(left == right) return nums[left];

        int leftSubSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=p; i>=left; i--) {
            currSum += nums[i];
            leftSubSum = Math.max(leftSubSum, currSum);
        }

        int rightSubSum = Integer.MIN_VALUE;
        currSum = 0;
        for(int i=p+1; i<=right; i++) {
            currSum += nums[i];
            rightSubSum = Math.max(rightSubSum, currSum);
        }

        return leftSubSum + rightSubSum;

    }


    public  int maxSubArrayGreedy(int[] nums) {
        int n = nums.length;

        int currSum = nums[0], maxSum = nums[0];

        for(int i=1; i<n; i++) {
            currSum = Math.max(nums[i], currSum+nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

}
