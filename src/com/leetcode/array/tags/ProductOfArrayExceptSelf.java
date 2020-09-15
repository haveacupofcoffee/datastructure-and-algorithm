package com.leetcode.array.tags;

import java.util.Arrays;

/**
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 *
 * Example:
 *
 * Input:  [1,2,3,4]
 * Output: [24,12,8,6]
 * Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.
 *
 * Note: Please solve it without division and in O(n).
 *
 * Follow up:
 * Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
 */
public class ProductOfArrayExceptSelf {


    public int[] productExceptSelf(int[] nums) {

        int length = nums.length;

        int[] answer = new int[length];

        answer[0] = 1;

        for(int i=1; i<length; i++) {
            answer[i] = answer[i-1] * nums[i-1];
        }

        int R = 1;

        for(int i=length-1; i>=0; i--) {
            answer[i] = answer[i] * R;
            R *= nums[i];
        }

        return answer;


    }

















    public int[] productExceptSelfWithDivision(int[] nums) {
        int[]  output = new int[nums.length];

        int productOfAll = 1;
        int countZero = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] ==0 ) {
                countZero += 1;
            }else {
                productOfAll *= nums[i];
            }
        }

        if(countZero >= 2) {
            Arrays.fill(output,0);
            return output;
        }

        if(countZero == 1) {
            for(int i=0; i<nums.length;i++) {
                if(nums[i] == 0) {
                    output[i] = productOfAll;
                }else {
                    output[i] = 0;
                }

            }
        }else {
            for(int i=0; i<nums.length;i++) {
                output[i] = productOfAll / nums[i];
            }
        }



        return output;
    }
}
