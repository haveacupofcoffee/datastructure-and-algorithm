package test.com.codingforfun.array;

import com.leetcode.array.FindNumbersWithEvenNumberOfDigits;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example 1:
 *
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 * Explanation:
 * 12 contains 2 digits (even number of digits).
 * 345 contains 3 digits (odd number of digits).
 * 2 contains 1 digit (odd number of digits).
 * 6 contains 1 digit (odd number of digits).
 * 7896 contains 4 digits (even number of digits).
 * Therefore only 12 and 7896 contain an even number of digits.
 * Example 2:
 *
 * Input: nums = [555,901,482,1771]
 * Output: 1
 * Explanation:
 * Only 1771 contains an even number of digits.
 */
public class FindNumbersWithEvenNumberOfDigitsTest {

    @Test
    public void findNumbersTest1() {
        int[] nums = new int[]{12,345,2,6,7896};
        int expect = 2;
        assertEquals(expect, FindNumbersWithEvenNumberOfDigits.findNumbers(nums));
    }

    @Test
    public void findNumbersTest2() {
        int[] nums = new int[]{555,901,482,1771};
        int expect = 1;
        assertEquals(expect, FindNumbersWithEvenNumberOfDigits.findNumbers(nums));
    }
}