package com.leetcode.array;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note:
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
 * Example:
 *
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * Output: [1,2,2,3,5,6]
 *
 *
 * Constraints:
 *
 * -10^9 <= nums1[i], nums2[i] <= 10^9
 * nums1.length == m + n
 * nums2.length == n
 */
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int indexOfNum1 = m - 1;
        int indexOfNum2 = n - 1;
        int indexOfMerge = m + n - 1;

        while(indexOfNum1>=0 && indexOfNum2>=0) {
            if(nums1[indexOfNum1] >= nums2[indexOfNum2]) {
                nums1[indexOfMerge--] = nums1[indexOfNum1--];
            }else {
                nums1[indexOfMerge--] = nums2[indexOfNum2--];
            }
        }

        while(indexOfNum1 >= 0) {
            nums1[indexOfMerge--] = nums1[indexOfNum1--];
        }

        while(indexOfNum2 >= 0) {
            nums1[indexOfMerge--] = nums2[indexOfNum2--];
        }
    }

}
