package com.educative.twopointers;

import java.util.HashMap;
import java.util.Map;

public class PairWithTargetSumWithHashTable {
    public static int[] search(int[] arr, int targetSum) {
        // TODO: Write your code here

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            int element = targetSum - arr[i];
            if(map.containsKey(element)) {
                return new int[]{map.get(element), i};
            }else {
                map.put(arr[i],i);
            }
        }

        return new int[] { -1, -1 };
    }


}
