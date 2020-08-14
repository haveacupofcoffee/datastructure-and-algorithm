package com.leetcode.queueandstack.queue;

import com.leetcode.recursionI.conclusion.KthSymbolInGrammar;

import java.util.ArrayList;
import java.util.List;


/**
 * ["MyCircularQueue","enQueue","isFull","enQueue","enQueue","isFull","enQueue","enQueue","enQueue","Front","Front","Rear",
 * "enQueue","Rear","enQueue","Rear","Front","enQueue","enQueue","Front","enQueue","enQueue","Rear",
 * "enQueue","isEmpty","Rear","Front","Rear","enQueue","Front","enQueue","Rear","isEmpty","Rear",
 * "enQueue","Front","Front","deQueue","enQueue","Front","enQueue","enQueue","deQueue","enQueue",
 * "isFull","Front","enQueue","deQueue","enQueue","isEmpty","isEmpty","enQueue","Front","Front","Rear","deQueue","Front",
 * "enQueue","Rear","enQueue","Rear","Rear","Front","deQueue","enQueue","deQueue","Rear","enQueue",
 * "Front","enQueue","enQueue","deQueue","enQueue","Front","enQueue","deQueue","enQueue",
 * "Front","Front","enQueue","enQueue","enQueue","Front","enQueue","enQueue","Rear","deQueue","enQueue","Front","enQueue","enQueue","Rear","enQueue","enQueue","Rear","isFull","enQueue","Rear","enQueue","deQueue","Rear","enQueue"]
 * [[30],[71],[],[32],[1],[],[32],[8],[6],[],[],[],
 * [8],[],[3],[],[],[56],[41],[],[14],[6],[],
 * [25],[],[],[],[],[44],[],[84],[],[],[],
 * [59],[],[],[],[4],[],[40],[11],[],[94],
 * [],[],[72],[],[19],[],[],[20],[],[],[],[],[],
 * [58],[],[54],[],[],[],[],[65],[],[],[59],
 * [],[26],[10],[],[14],[],[2],[],[37],
 * [],[],[46],[63],[42],[],[84],[30],[],[],[49],[],[79],[46],[],[97],[83],[],[],[76],[],[79],[],[],[44]]
 */
public class MyCircularQueue {

    private int capacity;
    private int[] data;
    private int head;
    private int tail;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        head = -1;
        tail = -1;
        capacity = k;
        data = new int[k];
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        //full
        if(isFull()) {
            return false;
        }

        //when empty,  enqueue
        if(isEmpty()) {
            head = 0;
        }
        tail = (tail + 1) % capacity;
        data[tail] = value;
        return true;

    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()) return false;
        //dequeue the last element
        if(head == tail) {
            head = -1;
            tail = -1;
        }else {
            head = (head + 1) % capacity;
        }
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()) return -1;
        return data[head];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty()) return -1;
        return data[tail];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return head == -1;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return ((tail + 1) % capacity) == head;
    }

}
