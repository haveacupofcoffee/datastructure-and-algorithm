package com.leetcode.array;

/**
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
 *
 * Note that elements beyond the length of the original array are not written.
 *
 * Do the above modifications to the input array in place, do not return anything from your function.
 * Example 1:
 *
 * Input: [1,0,2,3,0,4,5,0]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 * Example 2:
 *
 * Input: [1,2,3]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 * Note:
 * 1 <= arr.length <= 10000
 * 0 <= arr[i] <= 9
 */
public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        //[1,5,2,0,6,8,0,6,0]
        int count = 0;
        int length = arr.length - 1;

        for(int left = 0; left<= length-count; left++) {
            if(arr[left] == 0) {
                if(left == length - count) {
                    arr[length] = 0;
                    length--;
                    break;
                }
                count++;
            }
        }

        int last = length - count;
        for(int i=last; i>=0; i--) {
            if(arr[i] == 0) {
                arr[i+count] = 0;
                count--;
                arr[i+count] = 0;
            }else {
                arr[i+count] = arr[i];
            }
        }

    }
}
