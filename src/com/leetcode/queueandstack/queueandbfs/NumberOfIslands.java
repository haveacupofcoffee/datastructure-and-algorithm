package com.leetcode.queueandstack.queueandbfs;

import com.leetcode.binarytree.traverseatree.BinaryTreePostorderTraversal;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: grid = [
 * ["1","1","1","1","0"],
 * ["1","1","0","1","0"],
 * ["1","1","0","0","0"],
 * ["0","0","0","0","0"]
 * ]
 * Output: 1
 * Example 2:
 * <p>
 * Input: grid = [
 * ["1","1","0","0","0"],
 * ["1","1","0","0","0"],
 * ["0","0","1","0","0"],
 * ["0","0","0","1","1"]
 * ]
 * Output: 3
 */
public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        //up, down, left, right
        int[] rowOffset = {-1, 1, 0, 0};
        int[] columnOffset = {0, 0, -1, 1};

        int rows = grid.length;
        int columns = grid[0].length;
        int ans = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (Character.compare(grid[r][c], '1') == 0) {
                    Queue<Integer> queue = new LinkedList<>();
                    ans += 1;
                    queue.offer(r * columns + c);
                    grid[r][c] = '0';

                    while (!queue.isEmpty()) {
                        int size = queue.size();
                        for (int i = 0; i < size; i++) {
                            int gridLabel = queue.poll();

                            for(int k=0; k<rowOffset.length; k++) {
                                int offsetR = gridLabel / columns + rowOffset[k];
                                int offsetC = gridLabel % columns + columnOffset[k];

                                //valid grid
                                if(offsetR >= 0 && offsetR < rows && offsetC >=0 && offsetC < columns && Character.compare(grid[offsetR][offsetC], '1') == 0) {
                                    queue.offer(offsetR * columns + offsetC);
                                    grid[offsetR][offsetC] = '0';
                                }
                             }
                        }
                    }

                }
            }
        }

        return ans;

    }


}
