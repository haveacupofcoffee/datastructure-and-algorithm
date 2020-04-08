package com.educative.cyclicsort;

public class CyclicSort {
    public static void sort(int[] nums) {
        // TODO: Write your code here
        int start = 0;
        while(start < nums.length) {
            if(nums[start] -1 != start ) {
                int rightIndexOfStart = nums[start] - 1;
                int temp = nums[start];
                nums[start] = nums[rightIndexOfStart];
                nums[rightIndexOfStart] = temp;
            }else {
                start++;
            }
        }

    }

    public static void main(String[] args) {
        int[] test1 = new int[]{1, 5, 6, 4, 3, 2};
        sort(test1);
        for(Integer item : test1) {
            System.out.println(item);
        }

    }
}
