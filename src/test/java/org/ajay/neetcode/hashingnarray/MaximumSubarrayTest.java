package org.ajay.neetcode.hashingnarray;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumSubarrayTest {

    @Test
    public void testMaxSubArrayWithValidInput() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, maximumSubarray.maxSubArray(nums));
    }

    @Test
    public void testMaxSubArrayWithAllNegativeNumbers() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int[] nums = {-2, -3, -4, -1, -2};
        assertEquals(-1, maximumSubarray.maxSubArray(nums));
    }

    @Test
    public void testMaxSubArrayWithSingleElement() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int[] nums = {5};
        assertEquals(5, maximumSubarray.maxSubArray(nums));
    }

    @Test
    public void testMaxSubArrayWithNullInput() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        assertEquals(0, maximumSubarray.maxSubArray(null));
    }

    @Test
    public void testMaxSubArrayWithLargeInputSize() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int[] nums = new int[100001];
        assertEquals(0, maximumSubarray.maxSubArray(nums));
    }

    @Test
    public void testMaxSubArrayWithInvalidInput() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 10001};
        assertEquals(0, maximumSubarray.maxSubArray(nums));
    }
    
    @Test
    public void testMaxSubArrayWith_1() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int[] nums = {1,1,-2};
        assertEquals(2, maximumSubarray.maxSubArray(nums));
    }
}
