package com.leetcode.array.inplace;

/**
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
 *
 * You may return any answer array that satisfies this condition.
 * Example 1:
 *
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 *
 *
 * Note:
 *
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 */
public class SortArrayByParity {
    /**
     * First count the even numbers, then use two pointers to swap the element
     * @param A
     * @return
     */
    public static int[] sortArrayByParity(int[] A) {
        int evenCount = 0;
        for(int i=0 ; i< A.length; i++) {
            if(A[i] % 2 == 0) {
                evenCount++;
            }
        }
        int j = evenCount;
        for (int i=0; i<evenCount;i++) {
            //not even element
            if(A[i] % 2 != 0) {
                while(j<A.length) {
                    //even
                    if(A[j] % 2 == 0) {
                        int temp = A[i];
                        A[i] = A[j];
                        A[j] = temp;
                        j++;
                        break;
                    }else {
                        j++;
                    }
                }
            }
        }
        return A;
    }

    public static int[] sortArrayByParityTwoPinter(int[] A) {
        int left = 0, right = A.length -1;
        while(left < right) {
            if(A[left] % 2 == 0) {
                left++;
            }else {
                while(right > left) {
                    if(A[right] % 2 == 0 ) {
                        int temp = A[left];
                        A[left] = A[right];
                        A[right] = temp;
                        right--;
                        left++;
                        break;
                    }else {
                        right--;
                    }
                }
             }
        }

        return A;
    }

}
