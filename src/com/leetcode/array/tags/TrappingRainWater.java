package com.leetcode.array.tags;

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
 *
 *
 * The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!
 *
 * Example:
 *
 * Input: [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 */
public class TrappingRainWater {
    public int trapWithTwoPointers(int[] height) {
        if(height == null || height.length ==0) return 0;
        int left = 0, right = height.length-1;

        int leftMax = height[left];
        int rightMax = height[right];
        int ans = 0;

        while(left < right) {
            if(leftMax <= rightMax) {
                ans += leftMax - height[left];
                left++;
                leftMax = Math.max(leftMax, height[left]);
            }else {
                ans += rightMax - height[right];
                right--;
                rightMax = Math.max(rightMax, height[right]);
            }
        }

        return ans;

    }
}