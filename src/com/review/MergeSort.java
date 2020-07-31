package com.review;

import javax.management.JMRuntimeException;
import java.util.Arrays;

/**
 * Given an array of integers nums, sort the array in ascending order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,2,3,1]
 * Output: [1,2,3,5]
 * Example 2:
 *
 * Input: nums = [5,1,1,2,0,0]
 * Output: [0,0,1,1,2,5]
 */
public class MergeSort {

    public static int[] sortArray(int[] nums) {
        //base case
        if(nums.length <= 1) return nums;
        int pivot = nums.length / 2;
        //divide
        int[] left_array = sortArray(Arrays.copyOfRange(nums, 0, pivot));
        int[] right_array = sortArray(Arrays.copyOfRange(nums, pivot, nums.length));

        //merge
        return merge(left_array, right_array);

    }

    private static int[] merge(int[] left, int[] right) {
        int[] merge = new int[left.length + right.length];
        int mergeIndex = 0, leftIndex = 0, rightIndex = 0;
        while(leftIndex < left.length && rightIndex < right.length) {
            if(left[leftIndex] <= right[rightIndex]) {
                merge[mergeIndex++] = left[leftIndex++];
            }else {
                merge[mergeIndex++] = right[rightIndex++];
            }
        }

        while(leftIndex < left.length) {
            merge[mergeIndex++] = left[leftIndex++];
        }

        while(rightIndex < right.length) {
            merge[mergeIndex++] = right[rightIndex++];
        }

        return merge;
    }
}
