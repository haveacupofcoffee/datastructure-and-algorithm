package test.com.codingforfun.array;
import com.leetcode.array.MergeSortedArray;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *  * Input:
 *  * nums1 = [1,2,3,0,0,0], m = 3
 *  * nums2 = [2,5,6],       n = 3
 *  *
 *  * Output: [1,2,2,3,5,6]
 *  *
 */
public class MergeSortedArrayTest {

    @Test
    public void mergeTest() {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};

        int m = 3;
        int n = 3;
        int[] expect = new int[]{1,2,2,3,5,6};

        MergeSortedArray.merge(nums1, m, nums2, n);

        assertArrayEquals(expect, nums1);


    }
}