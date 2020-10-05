package test.com.educative.twopointers;

import com.educative.twopointers.PairWithTargetSum;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PairWithTargetSumTest {

    @Test
    public void search() {
        int[] test = new int[]{1, 2, 3, 4, 6};
        int testTarget = 6;

        int[] expected = new int[]{1,3};

        assertArrayEquals(expected, PairWithTargetSum.search(test,testTarget));

    }

    @Test
    public void search2() {
        int[] test = new int[]{2, 5, 9, 11};
        int testTarget = 11;

        int[] expected = new int[]{0,2};

        assertArrayEquals(expected, PairWithTargetSum.search(test,testTarget));

    }
}