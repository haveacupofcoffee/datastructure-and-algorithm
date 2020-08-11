package com.leetcode.array.inplace;

import com.sun.java.swing.plaf.windows.WindowsTabbedPaneUI;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Example:
 *
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Note:
 *
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeroes {
    /**
     * first move the non-zero to right place, then assign the left of array to 0s
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        while(j<nums.length) {
            nums[j++] = 0;
        }
    }


    /**
     * swap with 0
     * @param nums
     */
    public static void moveZeroesTwoPinters2(int[] nums) {
        int j=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                nums[j] = nums[i];
                nums[i] = 0 ;
                j++;
            }
        }
    }

    public static void moveZeroesTwoPointer(int[] nums) {
        int left = 0, right = 1;
        while(right < nums.length && left < nums.length) {
            if(nums[left] == 0) {
                while(right < nums.length) {
                    if(nums[right] != 0) {
                        nums[left] = nums[right];
                        nums[right] = 0;
                        right++;
                        left++;
                        break;
                    }else {
                        right++;
                    }
                }
            }else {
                right++;
                left++;
            }
        }
    }

    public static void moveZeroesTwoPointerOptimize(int[] nums) {
        int left = 0;

        while(left < nums.length) {
            if(nums[left] == 0) {
                int right = left + 1;
                while (right<nums.length) {
                    if(nums[right] != 0) {
                        nums[left] = nums[right];
                        nums[right] = 0;
                        break;
                    }else {
                        right++;
                    }

                }

             }
            left++;
        }
    }
}
