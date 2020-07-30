package com.leetcode.recursionII.divideandconquer;

import javafx.scene.transform.MatrixType;

import java.util.Arrays;

/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 *
 * Integers in each row are sorted in ascending from left to right.
 * Integers in each column are sorted in ascending from top to bottom.
 * Example:
 *
 * Consider the following matrix:
 *
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 * Given target = 5, return true.
 *
 * Given target = 20, return false.
 */
public class SearchA2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        if(rows == 0) return false;
        int columns = matrix[0].length;

        return helper(matrix, 0, rows-1, 0, columns-1, target);
    }

    private boolean helper(int[][] matrix, int fromRow, int toRow, int fromColumn, int toColumn, int target) {
        int rows = toRow - fromRow + 1;
        int columns = toColumn - fromColumn + 1;
        if(rows == 1 && columns == 1) return matrix[fromRow][fromColumn] == target;
        if(rows <=0 || columns <=0 ) return false;
        int mid = columns / 2 + fromColumn;

        int pivotRow = fromRow;

        for(;pivotRow <= toRow; pivotRow++) {
            if(matrix[pivotRow][mid] == target) {
                return true;
            }else if(matrix[pivotRow][mid] > target) {
                break;
            }
        }

        return helper(matrix, pivotRow, toRow, 0, mid-1, target) || helper(matrix, 0, pivotRow-1,mid+1,toColumn,target);

    }

}
