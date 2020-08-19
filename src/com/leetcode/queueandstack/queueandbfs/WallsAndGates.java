package com.leetcode.queueandstack.queueandbfs;

import jdk.nashorn.internal.runtime.ScriptObject;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * You are given a m x n 2D grid initialized with these three possible values.
 *
 * -1 - A wall or an obstacle.
 * 0 - A gate.
 * INF - Infinity means an empty room. We use the value 231 - 1 = 2147483647 to represent INF as you may assume that the distance to a gate is less than 2147483647.
 * Fill each empty room with the distance to its nearest gate. If it is impossible to reach a gate, it should be filled with INF.
 *
 * Example:
 *
 * Given the 2D grid:
 *
 * INF  -1  0  INF
 * INF INF INF  -1
 * INF  -1 INF  -1
 *   0  -1 INF INF
 * After running your function, the 2D grid should be:
 *
 *   3  -1   0   1
 *   2   2   1  -1
 *   1  -1   2  -1
 *   0  -1   3   4
 */
public class WallsAndGates {
    //failed on 1 test on leetcode , from INF to 0, think another way, from 0 to INF
    public void wallsAndGates(int[][] rooms) {

        if(rooms == null || rooms.length == 0) return;

        //up, down, left, right
        int[] rowOffset = new int[]{-1, 1, 0, 0};
        int[] columnOffSet = new int[]{0,0,-1,1};

        int rows = rooms.length;
        int columns = rooms[0].length;

        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < columns; c++) {
                //only for empty room
                if(rooms[r][c] == Integer.MAX_VALUE) {
                    Queue<Integer> queue = new LinkedList<>();
                    Set<Integer> visited = new HashSet<>();
                    int gridLabel = r * columns + c;
                    queue.offer(gridLabel);
                    visited.add(gridLabel);
                    int distance = 0;
                    boolean find = false;

                    while(!queue.isEmpty() && !find) {
                        int size = queue.size();
                        distance += 1;
                        for(int i=0; i< size; i++) {
                            gridLabel = queue.poll();
                            //up, down ,left ,right
                            for(int k=0; k < rowOffset.length; k++) {
                                int offsetR = gridLabel / columns + rowOffset[k];
                                int offSetC = gridLabel % columns + columnOffSet[k];
                                //valid grid
                                if(offsetR >= 0 && offsetR < rows && offSetC >=0 && offSetC < columns) {

                                    if(rooms[offsetR][offSetC] == 0 || distance >= rooms[offsetR][offSetC]) {
                                        rooms[r][c] = distance;
                                        size = 0;
                                        find = true;
                                        break;
                                     }

                                    int offSetGridLabel = offsetR * columns + offSetC;

                                    if(rooms[offsetR][offSetC] != -1 && !visited.contains(offSetGridLabel)) {
                                        queue.offer(offSetGridLabel);
                                        visited.add(offSetGridLabel);
                                    }
                                }

                            }


                        }
                    }
                }



            }
        }
    }

    //from 0 to INF
    public void wallsAndGates2(int[][] rooms) {

        if(rooms == null || rooms.length == 0) return;

        //up, down, left, right
        int[] rowOffset = new int[]{-1, 1, 0, 0};
        int[] columnOffSet = new int[]{0,0,-1,1};

        int rows = rooms.length;
        int columns = rooms[0].length;

        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < columns; c++) {
                //from gate to empty room
                if(rooms[r][c] == 0) {
                    Queue<int[]> queue = new LinkedList<>();
                    queue.offer(new int[]{r,c});
                    int distance = 0;

                    while(!queue.isEmpty()) {
                        int size = queue.size();
                        distance += 1;
                        for(int i=0; i< size; i++) {
                            int[] cell = queue.poll();
                            //up, down ,left ,right
                            for(int k=0; k < rowOffset.length; k++) {
                                int offSetR = cell[0] + rowOffset[k];
                                int offSetC = cell[1] + columnOffSet[k];
                                //valid grid
                                if(offSetR >= 0 && offSetR < rows && offSetC >=0 && offSetC < columns) {

                                    if(rooms[offSetR][offSetC] == Integer.MAX_VALUE || distance < rooms[offSetR][offSetC]) {
                                        rooms[offSetR][offSetC] = distance;
                                        queue.offer(new int[]{offSetR, offSetC});
                                    }

                                }

                            }

                        }
                    }
                }

            }
        }
    }
}
