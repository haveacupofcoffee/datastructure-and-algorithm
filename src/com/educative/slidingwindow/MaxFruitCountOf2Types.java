package com.educative.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of characters where each character represents a fruit tree, you are given two baskets and your goal is to put maximum number of fruits in each basket. The only restriction is that each basket can have only one type of fruit.
 * <p>
 * You can start with any tree, but once you have started you can’t skip a tree. You will pick one fruit from each tree until you cannot, i.e., you will stop when you have to pick from a third fruit type.
 * <p>
 * Write a function to return the maximum number of fruits in both the baskets.
 * <p>
 * Example 1:
 * <p>
 * Input: Fruit=['A', 'B', 'C', 'A', 'C']
 * Output: 3
 * Explanation: We can put 2 'C' in one basket and one 'A' in the other from the subarray ['C', 'A', 'C']
 * Example 2:
 * <p>
 * Input: Fruit=['A', 'B', 'C', 'B', 'B', 'C']
 * Output: 5
 * Explanation: We can put 3 'B' in one basket and two 'C' in the other basket.
 * This can be done if we start with the second letter: ['B', 'C', 'B', 'B', 'C']
 */
public class MaxFruitCountOf2Types {
    public static int findLength(char[] arr) {
        // TODO: Write your code here
        if (arr == null) {
            throw new IllegalArgumentException();
        }

        int maxLenght = 0, windowStart = 0;
        Map<Character, Integer> fruitFrequencyMap = new HashMap<>();

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            char rightFruit = arr[windowEnd];
            fruitFrequencyMap.put(rightFruit, fruitFrequencyMap.getOrDefault(rightFruit, 0) + 1);

            while (fruitFrequencyMap.size() > 2) {
                char leftFruit = arr[windowStart];
                fruitFrequencyMap.put(leftFruit, fruitFrequencyMap.get(leftFruit) - 1);
                if (fruitFrequencyMap.get(leftFruit) == 0) {
                    fruitFrequencyMap.remove(leftFruit);
                }
                windowStart++;
            }

            maxLenght = Math.max(maxLenght, windowEnd - windowStart + 1);
        }

        return maxLenght;
    }
}
