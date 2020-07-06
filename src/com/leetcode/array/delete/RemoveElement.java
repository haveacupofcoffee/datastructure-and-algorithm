package com.leetcode.array.delete;

/**
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 *
 * Example 1:
 *
 * Given nums = [3,2,2,3], val = 3,
 *
 * Your function should return length = 2, with the first two elements of nums being 2.
 *
 * It doesn't matter what you leave beyond the returned length.
 * Example 2:
 *
 * Given nums = [0,1,2,2,3,0,4,2], val = 2,
 *
 * Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.
 *
 * Note that the order of those five elements can be arbitrary.
 *
 * It doesn't matter what values are set beyond the returned length.
 */
public class RemoveElement {
    /**
     * Use two pointers, one scan from left to right, if the value of the Array is equal to the given value,
     * then scan from right to left, find the rightmost index of the array whose value is not equal to the given value, then switch with the left index(don't need to switch, just assign the
     * value of the right to the left.
     * This way can't guarantee the order of the
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {

        int left = 0, right = nums.length -1 ;
        while(left <= right) {
            //if the value of the left pointer equals to the given value, then find the rightmost index whose value is not equal to given value
            if(nums[left] == val) {
                // = edge case [1] val = 1
                while(right >= left) {
                    //find the rightmost index, assign the right most value of the array which is not equal to the given value to the left
                    if(nums[right] != val) {
                        nums[left] = nums[right];
                        left++;
                        right--;
                        break;
                    }
                    right--;
                }
            }else {
                left++;
            }
        }

        return left;
    }
}
