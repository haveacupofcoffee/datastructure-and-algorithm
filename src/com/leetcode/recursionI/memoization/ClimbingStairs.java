package com.leetcode.recursionI.memoization;

import java.util.HashMap;
import java.util.Map;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Example 1:
 *
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 *
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 *
 *
 * Constraints:
 *
 * 1 <= n <= 45
 *
 * for k steps
 * if k = 1 f(k) = 1
 * if k = 2 f(k) = 2
 *  else :
 *  f(k) is all ways of f(k-1) + f(k-2) (f(k-1) ways each of them plus 1 step will be k steps or f(k-2), each way plus 2 steps it's k steps)
 */
public class ClimbingStairs {

    Map<Integer, Integer> cache = new HashMap<>();
    public int climbStairs(int n) {

        if(cache.containsKey(n)) {
            return cache.get(n);
        }

        int steps;

        if(n <= 2) {
            steps = n;
        }else {
            steps = climbStairs(n - 1 ) + climbStairs( n - 2 );
        }

        cache.put(n, steps);
        return steps;

    }
}
