package com.leetcode.array.problems;

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively.
 *
 * Return the median of the two sorted arrays.
 *
 * Follow up: The overall run time complexity should be O(log (m+n)).
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * Example 2:
 *
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * Example 3:
 *
 * Input: nums1 = [0,0], nums2 = [0,0]
 * Output: 0.00000
 * Example 4:
 *
 * Input: nums1 = [], nums2 = [1]
 * Output: 1.00000
 * Example 5:
 *
 * Input: nums1 = [2], nums2 = []
 * Output: 2.00000
 *
 *
 * Constraints:
 *
 * nums1,length == m
 * nums2,length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        if(m > n) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;

            int tem = m;
            m = n;
            n = tem;
        }

        int imin = 0, imax = m, halfLen = (m+n+1)/2;

        while(imin<=imax) {
            int i = (imin + imax) / 2;
            int j = halfLen - 1;
            if(i > imin && nums2[j] < nums1[i-1]) {
                //i is too big
                imax = i-1;
            }else if(i < imax && nums1[i] < nums2[j-1]) {
                //i is too small
                imin = i + 1;
            }else {
                int maxLeft = 0;
                if(i==0) {
                    maxLeft = nums2[j-1];
                }else if(j==0) {
                    maxLeft = nums1[i-1];
                }else {
                    maxLeft  = Math.max(nums1[i-1], nums2[j-1]);
                }
                //if it's odd
                if((m+n)%2 == 1) {
                    return maxLeft;
                }



                int minRight = 0;
                if(i == m) {
                    minRight =nums2[j];
                }else if(j == n) {
                    minRight = nums1[i];
                }else {
                    minRight = Math.min(nums1[i], nums2[j]);
                }

                if((m + n) % 2==0) {
                    return (maxLeft + minRight) / 2.0;
                }



            }
        }
        return  0.0;
    }
}
