package com.educative.twopointers;

public class SortedArraySquares {

    public static int[] makeSquares(int[] arr) {
        int[] squares = new int[arr.length];
        // TODO: Write your code here
        int left = 0;
        int right = arr.length-1;
        for(int i=arr.length-1; i>=0; i--) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if(rightSquare >= leftSquare) {
                squares[i] = rightSquare;
                right--;
            }else {
                squares[i] = leftSquare;
                left++;
            }

        }
        return squares;
    }
}
