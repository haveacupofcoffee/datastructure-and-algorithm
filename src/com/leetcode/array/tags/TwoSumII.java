package com.leetcode.array.tags;

/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 *
 * Note:
 *
 * Your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * Example:
 *
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {

        int[] ans = new int[]{-1,-1};

        for(int i=0; i<numbers.length-1; i++) {
            if( i== 0 || (i>= 1 && numbers[i] != numbers[i-1])) {
                int index2 = helper(numbers, i+1, numbers.length-1, target-numbers[i]);
                if( index2 != -1) {
                    ans[0] = i+1;
                    ans[1] = index2+1;
                    break;
                }
            }
        }

        return ans;

    }

    public int[] twoSumTwopointer(int[] numbers, int target) {

        int left = 0, right = numbers.length -1;
        while(left < right) {
            int sum = numbers[left] + numbers[right];
            if(sum == target) {
                return new int[]{left + 1, right + 1};
            }else if(sum < target) {
                left++;
            }else {
                right--;
            }
        }

        return new int[]{-1, -1};

    }


    private int helper(int[] numbers, int left, int right, int value) {
        if(left > right ) return  -1;
        int mid = (left + right) / 2;
        if(numbers[mid] == value) {
            return mid;
        }else if(numbers[mid] > value) {
            return helper(numbers, left, right -1, value);
        }else {
            return helper(numbers, left+1, right,value);
        }

    }
}
