package com.leetcode.array.tags;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 *
 * Note:
 *
 * The solution set must not contain duplicate triplets.
 *
 * Example:
 *
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 *
 * A solution set is:
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3) {
            return null;
        }

        Set<Integer> visited = new HashSet<>();

        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0; i<nums.length; i++) {
            if(!visited.contains(nums[i])) {
                visited.add(nums[i]);
                for(int j = 0; j<nums.length; j++) {
                    if(j != i) {
                        if(map.containsKey(-nums[i] - nums[j])) {
                            
                        }
                    }
                }
            }
        }

    }
}
