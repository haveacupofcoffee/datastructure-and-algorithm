package com.leetcode.recursionI.conclusion;

import java.util.ArrayList;
import java.util.List;

/**
 * On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.
 *
 * Given row N and index K, return the K-th indexed symbol in row N. (The values of K are 1-indexed.) (1 indexed).
 *
 * Examples:
 * Input: N = 1, K = 1
 * Output: 0
 *
 * Input: N = 2, K = 1
 * Output: 0
 *
 * Input: N = 2, K = 2
 * Output: 1
 *
 * Input: N = 4, K = 5
 * Output: 1
 *
 * Explanation:
 * row 1: 0
 * row 2: 01
 * row 3: 0110
 * row 4: 01101001
 * Note:
 *
 * N will be an integer in the range [1, 30].
 * K will be an integer in the range [1, 2^(N-1)].
 */
// TODO: 2020-07-22 Need to think a better solution, when submit below solution, has memory limit exceed problem, A better way
// TODO: 2020-07-22 A better way to solve this is find the rule and don't generate the real list
public class KthSymbolInGrammar {

    public static int kthGrammar(int N, int K) {
        int capacity = getSize(N);
        List<Integer> row = new ArrayList<>(capacity);
        row.add(0);

        for(int i=2; i<=N; i++) {
            int lastRowSize = getSize(i-1);
            for(int j  = 0; j < lastRowSize; j++) {
                if(row.get(j) == 0) {
                    row.add(1);
                }else {
                    row.add(0);
                }
            }
        }
        return row.get(K-1);
    }

    private static int getSize(int n) {
        return (int)Math.pow(2, n-1);
    }
}
