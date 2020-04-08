package test.com.educative.slidingwindow;

import com.educative.slidingwindow.MaxFruitCountOf2Types;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxFruitCountOf2TypesTest {
    /*
     * Example 1:
     * <p>
     * Input: Fruit=['A', 'B', 'C', 'A', 'C']
     * Output: 3
     * Explanation: We can put 2 'C' in one basket and one 'A' in the other from the subarray ['C', 'A', 'C']

     */
    @Test
    public void findLength1() {
        char[] arr = new char[]{'A', 'B', 'C', 'A', 'C'};
        int expect = 3;
        assertEquals(expect, MaxFruitCountOf2Types.findLength(arr));
    }

    /*
     * Example 2:
     * <p>
     * Input: Fruit=['A', 'B', 'C', 'B', 'B', 'C']
     * Output: 5
     * Explanation: We can put 3 'B' in one basket and two 'C' in the other basket.
     * This can be done if we start with the second letter: ['B', 'C', 'B', 'B', 'C']
     */

    @Test
    public void findLength2() {
        char[] arr = new char[]{'A', 'B', 'C', 'B', 'B', 'C'};
        int expect = 5;
        assertEquals(expect, MaxFruitCountOf2Types.findLength(arr));
    }


}