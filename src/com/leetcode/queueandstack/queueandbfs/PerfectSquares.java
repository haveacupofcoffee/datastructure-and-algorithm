package com.leetcode.queueandstack.queueandbfs;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;
import sun.awt.image.ImageWatched;

import java.net.Inet4Address;
import java.util.*;

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
/*    public int numSquares(int n) {

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

    }*/

    Map<Integer, Integer> map = new HashMap<>();

    //recursively
    public int numSquares(int n) {

        if (n < 4) {
            map.put(n, n);
            return n;
        }

        if (n == 4) {
            map.put(4, 1);
            return 1;
        }

        if (map.containsKey(n)) {
            return map.get(n);
        }

        int ans = Integer.MAX_VALUE;
        int square = (int) Math.sqrt(n);

        for (int i = 1; i <= square; i++) {
            int result = numSquares(n - i * i) + 1;
            ans = Math.min(ans, result);
        }

        map.put(n, ans);
        return ans;
    }


    public int numSquaresIterative(int n) {
        if (n < 4) return n;
        int[] dp = new int[n + 1];
        int i = 0;
        for (; i < 4; i++) {
            dp[i] = i;
        }

        dp[i] = 1;

        int numSquare = Integer.MAX_VALUE;

        for (; i <= n; i++) {
            int square = (int) Math.sqrt(i);
            for (int j = 1; j <= square; j++) {
                numSquare = Math.min(numSquare, dp[i - j * j] + 1);
            }
            dp[i] = numSquare;
        }

        return dp[n];
    }


    public int numSquaresBFS(int n) {

        if( n < 4) return n;

        Queue<Integer> queue = new LinkedList<>();
        int ans = 0;

        Set<Integer> squareNumbers = new HashSet<>();

        for (int i=1; i*i<=n; i++) {
            squareNumbers.add(i*i);
        }

        queue.offer(n);

        while(!queue.isEmpty()) {
            int size = queue.size();
            ans += 1;

            for(int i=0; i<size; i++) {
                int curr = queue.poll();
                if(squareNumbers.contains(curr)) return ans;
                int sqrtOfCurr = (int)Math.sqrt(curr);
                for(int j=sqrtOfCurr; j>=1; j--) {
                    queue.offer(curr - j * j);
                }
            }
        }

        return ans;


    }


    public int numSquaresBFSOpt(int n) {

        if( n < 4) return n;

        Queue<Integer> queue = new LinkedList<>();
        int ans = 0;

        Set<Integer> squareNumbers = new HashSet<>();
        Set<Integer> possibleAns = new HashSet<>();

        for (int i=1; i*i<=n; i++) {
            squareNumbers.add(i*i);
        }

        queue.offer(n);
        possibleAns.add(n);

        while(!queue.isEmpty()) {
            int size = queue.size();
            ans += 1;

            for(int i=0; i<size; i++) {
                int curr = queue.poll();
                if(squareNumbers.contains(curr)) return Math.min(Collections.min(possibleAns), ans);
                if(curr < 4) {
                    possibleAns.add(ans + curr  -1);
                }else {
                    int sqrtOfCurr = (int)Math.sqrt(curr);
                    for(int j=sqrtOfCurr; j>1; j--) {
                        queue.offer(curr - j * j);
                    }
                }

            }
        }

        return Collections.min(possibleAns);


    }


}
