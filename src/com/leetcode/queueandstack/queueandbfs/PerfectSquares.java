package com.leetcode.queueandstack.queueandbfs;

import sun.awt.image.ImageWatched;

import java.net.Inet4Address;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 12
 * Output: 3
 * Explanation: 12 = 4 + 4 + 4.
 * Example 2:
 * <p>
 * Input: n = 13
 * Output: 2
 * Explanation: 13 = 4 + 9.
 */
// TODO: 2020-08-21  Need to read the article 
public class PerfectSquares {

    //from n to 0
    public int numSquares(int n) {

        if(n < 4) return n;

        Queue<Integer> queue = new LinkedList<>();
        int ans = 0;

        //init queue
        queue.offer(n);

        while (!queue.isEmpty()) {

            int size = queue.size();
            ans += 1;

            for (int i = 0; i < size; i++) {
                int cur = queue.poll();
                int sqrt = (int) Math.sqrt(cur);

                if (cur == 0) return ans - 1;
                if (cur == 1 ) return ans;

                for(int j=2; j<=sqrt; j++) {
                    queue.offer(cur - j * j);
                }
            }

        }

        return ans;

    }
}
