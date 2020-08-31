package com.leetcode.array.tags;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        double median = 0;
        int sum = 0;

        int i=0, j=0;

        for(; i<m && j <n; i++, j++) {
            sum += nums1[i] + nums2[j];
        }

        if(i < m ) {
            
        }



    }
}
