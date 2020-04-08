package com.educative.twopointers;

public class PairWithTargetSum {
    public static int[] search(int[] arr, int targetSum) {
        // TODO: Write your code here

        int start = 0;
        int end = arr.length-1;

        while(start < end ) {
            int sum = arr[start] + arr[end];
            if(sum == targetSum ) {
                return new int[]{start, end};
            }else if (sum > targetSum) {
                end--;
            }else {
                start++;
            }
        }




        return new int[] { -1, -1 };
    }


}
