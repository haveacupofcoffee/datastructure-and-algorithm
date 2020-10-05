package test.com.educative.slidingwindow;

import com.educative.slidingwindow.MinSizeSubArraySum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinSizeSubArraySumTest {

    @Test
    public void findMinSubArray() {
        int[] arr = new int[]{2, 1, 5, 2, 3, 2};
        int S = 7;

        int expect = 2;

        assertEquals(expect, MinSizeSubArraySum.findMinSubArray(S,arr));
    }

    @Test
    public void findMinSubArray2() {
        int[] arr = new int[]{2, 1, 5, 2, 8};
        int S = 7;

        int expect = 1;

        assertEquals(expect, MinSizeSubArraySum.findMinSubArray(S,arr));
    }

    @Test
    public void findMinSubArray3() {
        int[] arr = new int[]{3, 4, 1, 1, 6};
        int S = 8;

        int expect = 3;

        assertEquals(expect, MinSizeSubArraySum.findMinSubArray(S,arr));
    }

    @Test
    public void findMinSubArray4() {
        int[] arr = new int[]{1,1,1,1,1,1,1};
        int S = 6;

        int expect = 6;

        assertEquals(expect, MinSizeSubArraySum.findMinSubArray(S,arr));
    }

    @Test
    public void findMinSubArray5() {
        int[] arr = new int[]{1,1,1,1,1,1,1};
        int S = 8;

        int expect = 0;

        assertEquals(expect, MinSizeSubArraySum.findMinSubArray(S,arr));
    }
}