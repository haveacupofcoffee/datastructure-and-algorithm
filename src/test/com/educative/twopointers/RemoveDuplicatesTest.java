package test.com.educative.twopointers;

import com.educative.twopointers.RemoveDuplicates;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void remove() {
        int[] input = new int[] {2, 3, 3, 3, 6, 9, 9};
        int expected = 4;
        int realOutput = RemoveDuplicates.remove(input);

        assertEquals(expected, realOutput);
    }

    @Test
    public void remove2() {
        int[] input = new int[] {2, 2, 2, 11};
        int expected = 2;
        int realOutput = RemoveDuplicates.remove(input);

        assertEquals(expected, realOutput);
    }
}