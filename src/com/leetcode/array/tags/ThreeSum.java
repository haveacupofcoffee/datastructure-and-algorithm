package com.leetcode.array.tags;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

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
    public List<List<Integer>> threeSumTwoPointer(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i= 0; i< nums.length && nums[i] <=0; i++) {
            if(i == 0 || nums[i-1] != nums[i]) {
                TwoSumWithSortedArray(nums, i, res);
            }
        }

        return res;

    }

    private void TwoSumWithSortedArray(int[] nums, int i, List<List<Integer>> res) {

        int left = i + 1, right = nums.length -1;
        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];
            if( sum < 0 ) {
                left++;
            }else if(sum > 0) {
                right--;
            }else {
                res.add(Arrays.asList(nums[i], nums[left++], nums[right--]));
                //skip duplicates values
                while(left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
            }



        }
    }


    public List<List<Integer>> threeSumHashSetWithSortedArray(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i= 0; i< nums.length && nums[i] <=0; i++) {
            if(i == 0 || nums[i-1] != nums[i]) {
                TwoSumWithHashSet(nums, i, res);
            }
        }

        return res;

    }

    private void TwoSumWithHashSet(int[] nums, int i, List<List<Integer>> res) {
        Set<Integer> seen = new HashSet<>();
        int j = i + 1;
        while(j < nums.length) {
            int complement = -nums[i] - nums[j];
            if(seen.contains(complement)) {
                res.add(Arrays.asList(nums[i], complement, nums[j]));
                while(j < nums.length && nums[j] == nums[j-1]) {
                    j++;
                }
            }else {
                seen.add(nums[j++]);

            }
        }

    }


    public List<List<Integer>> threeSumNoSort(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Set<Integer> dups = new HashSet<>();
        Map<Integer, Integer> seen = new HashMap<>();

        for(int i= 0; i< nums.length; i++) {
            //only check non-repeated value
            if(dups.add(nums[i])) {
                for (int j = i+1; j<nums.length; j++) {
                    int complement = -nums[i] - nums[j];
                    if(seen.containsKey(complement) && seen.get(complement) == i) {
                        List<Integer> triplet = Arrays.asList(nums[i], complement, nums[j]);
                        Collections.sort(triplet);
                        res.add(triplet);
                    }

                    seen.put(nums[j] , i);

                }
            }
        }

        return new ArrayList<>(res);

    }

}
