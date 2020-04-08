package com.educative.twopointers;

public class RemoveDuplicates {
    public static int remove(int[] arr) {
        // TODO: Write your code here
        int nextNonDuplicate = 1;
        for (int next = 1; next < arr.length; next++) {
            if (arr[nextNonDuplicate - 1] != arr[next]) {
                arr[nextNonDuplicate] = arr[next];
                nextNonDuplicate++;
            }

        }

        return nextNonDuplicate;
    }

}
