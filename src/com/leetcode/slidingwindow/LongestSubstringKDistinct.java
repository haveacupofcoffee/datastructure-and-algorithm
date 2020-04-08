package com.leetcode.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the length of the longest substring in it with no more than K distinct characters.
 *
 * Example 1:
 *
 * Input: String="araaci", K=2
 * Output: 4
 * Explanation: The longest substring with no more than '2' distinct characters is "araa".
 * Example 2:
 *
 * Input: String="araaci", K=1
 * Output: 2
 * Explanation: The longest substring with no more than '1' distinct characters is "aa".
 * Example 3:
 *
 * Input: String="cbbebi", K=3
 * Output: 5
 * Explanation: The longest substrings with no more than '3' distinct characters are "cbbeb" & "bbebi".
 */
public class LongestSubstringKDistinct {
    public static int findLength(String str, int k) {
        // TODO: Write your code here
        Map<Character, Integer> map = new HashMap<>();
        int windowStart = 0;
        int ans = -1;
        for(int windowEnd=0; windowEnd<str.length();windowEnd++) {
            if(map.containsKey(str.charAt(windowEnd))) {
                map.put(str.charAt(windowEnd),windowEnd);

                if(map.size() < k) {
                    map.put(str.charAt(windowEnd),windowEnd);
                }else {
                    ans = Math.max(ans, map.size());
                }
            }else {
                if(map.size() < k) {
                    map.put(str.charAt(windowEnd),windowEnd);
                }
            }
        }
        return -1;
    }
}
