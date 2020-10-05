package com.leetcode.queueandstack.queueandbfs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OpenTheLockTest {

    @Test
    public void openLock() {

        String[] deadends = new String[]{"0201","0101","0102","1212","2002"};
        String target = "0202";

        int output = 6;

        assertEquals(output, new OpenTheLock().openLock(deadends, target));
    }

    @Test
    public void openLock2() {

        String[] deadends = new String[]{"8888"};
        String target = "0009";

        int output = 1;

        assertEquals(output, new OpenTheLock().openLock(deadends, target));
    }


    @Test
    public void openLock3() {

        String[] deadends = new String[]{"8887","8889","8878","8898","8788","8988","7888","9888"};
        String target = "8888";

        int output = -1;

        assertEquals(output, new OpenTheLock().openLock(deadends, target));
    }

    @Test
    public void openLock4() {

        String[] deadends = new String[]{"0000"};
        String target = "8888";

        int output = -1;

        assertEquals(output, new OpenTheLock().openLock(deadends, target));
    }
}