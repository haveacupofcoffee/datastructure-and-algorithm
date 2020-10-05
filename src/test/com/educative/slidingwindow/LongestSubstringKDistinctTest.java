package test.com.educative.slidingwindow;

import com.educative.slidingwindow.LongestSubstringKDistinct;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringKDistinctTest {

    /*
    Input: String="araaci", K=2
 * Output: 4
     */
    @Test
    public void findLength() {
        String inputStr = "araaci";
        int K = 2;
        int expect = 4;
        assertEquals(expect, LongestSubstringKDistinct.findLength(inputStr,K));
    }

    /*
     * Example 2:
     * <p>
     * Input: String="araaci", K=1
     * Output: 2
     * Explanation: The longest substring with no more than '1' distinct characters is "aa".

     */
    @Test
    public void findLength2() {
        String inputStr = "araaci";
        int K = 1;
        int expect = 2;
        assertEquals(expect, LongestSubstringKDistinct.findLength(inputStr,K));
    }
    /*
     * Example 3:
     * <p>
     * Input: String="cbbebi", K=3
     * Output: 5
     * Explanation: The longest substrings with no more than '3' distinct characters are "cbbeb" & "bbebi".
     */
    @Test
    public void findLength3() {
        String inputStr = "cbbebi";
        int K = 3;
        int expect = 5;
        assertEquals(expect, LongestSubstringKDistinct.findLength(inputStr,K));
    }
}