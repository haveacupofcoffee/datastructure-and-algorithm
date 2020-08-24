package com.leetcode.queueandstack.stack;

/**
 * Given a list of daily temperatures T, return a list such that, for each day in the input, tells you how many days you would have to wait until a warmer temperature. If there is no future day for which this is possible, put 0 instead.
 *
 * For example, given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76, 73], your output should be [1, 1, 4, 2, 1, 1, 0, 0].
 *
 * Note: The length of temperatures will be in the range [1, 30000]. Each temperature will be an integer in the range [30, 100].
 */
public class DailyTemperatures {

    // TODO: 2020-08-24  Need to find a better way with stack, accepted but with around 1800ms  
    public int[] dailyTemperatures(int[] T) {

        int[] ans = new int[T.length];
        ans[T.length-1] = 0;
        int warmerIndex = T.length - 1;

        for(int j=T.length - 2; j>=0; j--) {
            if(T[j] < T[j+1]) {
                ans[j] = 1;
            }else {
                ans[j] = 0;
                for(int i=j+1; i<=warmerIndex;i++) {
                    if (T[i] > T[j]) {
                        ans[j] = i - j;
                        break;
                    }
                }

                if(T[j] > T[warmerIndex]) {
                    warmerIndex = j;
                }

            }
        }

        return ans;

    }
}
