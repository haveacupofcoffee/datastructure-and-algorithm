package com.leetcode.queueandstack.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.
 *
 * Example:
 *
 * MovingAverage m = new MovingAverage(3);
 * m.next(1) = 1
 * m.next(10) = (1 + 10) / 2
 * m.next(3) = (1 + 10 + 3) / 3
 * m.next(5) = (10 + 3 + 5) / 3
 */
public class MovingAverageFromDataStream {
    private Queue<Integer> data;
    private int size;
    private int preSum;
    /** Initialize your data structure here. */
    public MovingAverageFromDataStream(int size) {
        data = new LinkedList<>();
        this.size = size;
        preSum = 0;
    }

    public double next(int val) {
        data.offer(val);
        preSum += val;
        if(data.size() > size) {
            int removeElement = data.poll();
            preSum -= removeElement;
        }

        return preSum / new Double(data.size());
    }

}
