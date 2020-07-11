package com.leetcode.array.inplace;

/**
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
 *
 * After doing so, return the array.
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [17,18,5,4,6,1]
 * Output: [18,6,6,6,1,-1]
 *
 *
 * Constraints:
 *
 * 1 <= arr.length <= 10^4
 * 1 <= arr[i] <= 10^5
 */
public interface ReplaceElementsWithGreatestElementOnRightSide {
    /**
     * scan from left to right, find the greatest element of the right side, then assign it to the current element
     * @param arr
     * @return
     */
    public static int[] replaceElements(int[] arr) {
        int rightMaxIndex = -1;
        for(int i=0; i<arr.length-1; i++) {
            if(rightMaxIndex > i) {
                arr[i] = arr[rightMaxIndex];
            }else {
                rightMaxIndex = i + 1;
                for(int j = i+2; j<arr.length; j++) {
                    if(arr[j] >= arr[rightMaxIndex]) {
                        rightMaxIndex = j;
                    }
                }
                arr[i] = arr[rightMaxIndex];
            }
        }
        arr[arr.length - 1] = -1;
        return arr;
    }

    /**
     *
     * @param arr
     * @return
     */
    public static int[] replaceElementsFromRightToLeft(int[] arr) {
        int len = arr.length - 1;
        int rightMax= arr[len];
        arr[len] = -1;
        for(int i = len-1; i>=0; i--) {
            int temp = arr[i];
            arr[i] = rightMax;
            rightMax = Math.max(rightMax, temp);
        }

        return arr;
    }
}
