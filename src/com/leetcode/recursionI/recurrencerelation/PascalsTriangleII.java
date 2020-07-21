package com.leetcode.recursionI.recurrencerelation;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 *
 * Note that the row index starts from 0.
 *
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 3
 * Output: [1,3,3,1]
 * Follow up:
 *
 * Could you optimize your algorithm to use only O(k) extra space?
 */
// TODO: 2020-07-21 review, didn't think a good way at first
public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>(rowIndex + 1);
        row.add(1);

        for(int i=0; i<rowIndex; i++) {
            for(int j=i; j>=1; j--) {
                row.set(j, row.get(j) + row.get(j-1));
            }
            row.add(1);
        }

        return row;
    }
}
