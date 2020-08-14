package com.leetcode.queueandstack.queue;

import org.junit.Test;

import javax.print.DocFlavor;

import static org.junit.Assert.*;

public class MyCircularQueueTest {

    @Test
    public void testMyCircularQueue(){

        String[] operationNames = new String[]{
                "enQueue","isFull","enQueue","enQueue","isFull","enQueue","enQueue","enQueue","Front","Front","Rear",
                "enQueue", "Rear","enQueue","Rear","Front","enQueue","enQueue","Front","enQueue","enQueue","Rear",
                "enQueue","isEmpty","Rear","Front","Rear","enQueue","Front","enQueue","Rear","isEmpty","Rear","enQueue",
                "Front","Front","deQueue","enQueue","Front","enQueue","enQueue","deQueue","enQueue","isFull","Front",
                "enQueue","deQueue","enQueue","isEmpty","isEmpty","enQueue","Front","Front","Rear","deQueue","Front",
                "enQueue","Rear","enQueue","Rear","Rear","Front","deQueue","enQueue","deQueue","Rear","enQueue",
                "Front","enQueue","enQueue","deQueue","enQueue","Front","enQueue","deQueue","enQueue","Front","Front",
                "enQueue","enQueue","enQueue","Front","enQueue","enQueue","Rear","deQueue","enQueue","Front","enQueue",
                "enQueue","Rear","enQueue","enQueue","Rear","isFull","enQueue","Rear","enQueue","deQueue","Rear",
                "enQueue"

        };

        Object[] results = new Object[operationNames.length];

        String enQueueString =  "[71],[],[32],[1],[],[32],[8],[6],[],[],[],[8],[],[3],[],[],[56],[41],[],[14],[6],[],[25],[],[],[]," +
                "[],[44],[],[84],[],[],[],[59],[],[],[],[4],[],[40],[11],[],[94],[],[],[72],[],[19],[],[],[20],[]," +
                "[],[],[],[],[58],[],[54],[],[],[],[],[65],[],[],[59],[],[26],[10],[],[14],[],[2],[],[37],[],[]," +
                "[46],[63],[42],[],[84],[30],[],[],[49],[],[79],[46],[],[97],[83],[],[],[76],[],[79],[],[],[44]";

        String[] enQueueNumbers = enQueueString.split(",");



        MyCircularQueue myCircularQueue = new MyCircularQueue(30);

        for(int i=0; i<operationNames.length; i++) {
            Object result = null;
            if("enQueue".equals(operationNames[i])) {
                result = myCircularQueue.enQueue(Integer.valueOf(enQueueNumbers[i].substring(1,enQueueNumbers[i].length()-1)));
            }else if("isFull".equals(operationNames[i])) {
                result = myCircularQueue.isFull();
            }else if("Front".equals(operationNames[i])) {
                result = myCircularQueue.Front();
            }else if("Rear".equals(operationNames[i])) {
                result = myCircularQueue.Rear();
            }else if("isEmpty".equals(operationNames[i])) {
                result = myCircularQueue.isEmpty();
            }else if("deQueue".equals(operationNames[i])) {
                result = myCircularQueue.deQueue();
            }

            results[i] = result;
        }

    }

}