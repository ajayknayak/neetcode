package org.ajay.neetcode.bitmanipulation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MissingNumberTest {

	@Test
    public void testMissingNumberWithValidInput() {
        MissingNumber missingNumber = new MissingNumber();

        // Testing with an array where the missing number is 4
        int[] nums1 = {0, 1, 2, 3, 5};
        assertEquals(4, missingNumber.missingNumber_UsingSum(nums1));

        // Testing with a larger array where the missing number is 8
        int[] nums2 = {1, 0, 4, 7, 6, 2, 3, 5};
        assertEquals(8, missingNumber.missingNumber_UsingSum(nums2));
    }

    @Test
    public void testMissingNumberWithEmptyArray() {
        MissingNumber missingNumber = new MissingNumber();

        // Testing with an empty array should return -1
        int[] nums = {};
        assertEquals(-1, missingNumber.missingNumber_UsingSum(nums));
    }

    @Test
    public void testMissingNumberWithOutOfRangeLength() {
        MissingNumber missingNumber = new MissingNumber();

        // Testing with an array length out of range should return -1
        int[] nums = new int[10001];
        assertEquals(-1, missingNumber.missingNumber_UsingSum(nums));
    }
    
    @Test
    public void testMissingNumberWithValidInput_UsingXOR() {
        MissingNumber missingNumber = new MissingNumber();

        // Testing with an array where the missing number is 4
        int[] nums1 = {0, 1, 2, 3, 5};
        assertEquals(4, missingNumber.missingNumber_UsingXOR(nums1));

        // Testing with a larger array where the missing number is 8
        int[] nums2 = {1, 0, 4, 7, 6, 2, 3, 5};
        assertEquals(8, missingNumber.missingNumber_UsingXOR(nums2));
    }

    @Test
    public void testMissingNumberWithEmptyArray__UsingXOR() {
        MissingNumber missingNumber = new MissingNumber();

        // Testing with an empty array should return -1
        int[] nums = {};
        assertEquals(-1, missingNumber.missingNumber_UsingXOR(nums));
    }

    @Test
    public void testMissingNumberWithOutOfRangeLength__UsingXOR() {
        MissingNumber missingNumber = new MissingNumber();

        // Testing with an array length out of range should return -1
        int[] nums = new int[10001];
        assertEquals(-1, missingNumber.missingNumber_UsingXOR(nums));
    }
}
