package com.leetcode.queueandstack.stackanddfs;

import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * You are given a list of non-negative integers, a1, a2, ..., an, and a target, S. Now you have 2 symbols + and -. For each integer, you should choose one from + and - as its new symbol.
 *
 * Find out how many ways to assign symbols to make sum of integers equal to target S.
 *
 * Example 1:
 *
 * Input: nums is [1, 1, 1, 1, 1], S is 3.
 * Output: 5
 * Explanation:
 *
 * -1+1+1+1+1 = 3
 * +1-1+1+1+1 = 3
 * +1+1-1+1+1 = 3
 * +1+1+1-1+1 = 3
 * +1+1+1+1-1 = 3
 *
 * There are 5 ways to assign symbols to make the sum of nums be target 3.
 *
 *
 * Constraints:
 *
 * The length of the given array is positive and will not exceed 20.
 * The sum of elements in the given array will not exceed 1000.
 * Your output answer is guaranteed to be fitted in a 32-bit integer.
 */
public class TargetSum {

    int count = 0;

    public int findTargetSumWays(int[] nums, int S) {
        help(nums, S, 0);
        return count;
    }

    private void help(int[] nums, int S, int index) {
        if(index == nums.length) {
            if(S == 0) {
                count++;

            }
            return;
        }

        help(nums, S-nums[index], index + 1);
        help(nums, S+nums[index], index + 1);

    }


    public int findTargetSumWaysWithMemo(int[] nums, int S) {

        int[][] memo = new int[nums.length][2001];
        for(int[] row: memo)
            Arrays.fill(row, Integer.MIN_VALUE);
        return helpWithMemo(nums, 0, S, 0, memo);
    }

    private int helpWithMemo(int[] nums, int sum, int S, int index, int[][] memo) {
        if(index == nums.length) {
            return  S == 0? 1 : 0;
        }

        if(memo[index][sum + 1000] != Integer.MIN_VALUE) {
            return memo[index][sum+1000];
        }

        int add = helpWithMemo(nums, sum + nums[index],S, index + 1, memo);
        int subtract = helpWithMemo(nums, sum - nums[index],S, index + 1, memo);
        memo[index][sum + 1000] = add + subtract;

        return memo[index][sum + 1000];

    }
}
