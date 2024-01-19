package org.ajay.neetcode.bitmanipulation;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class CountingBitsTest {
	

    @Test
    public void testCountBitsWithValidInput() {
        CountingBits countingBits = new CountingBits();

        // Testing with a positive value (e.g., 5)
        int[] result1 = countingBits.countBits(5);
        int[] expected1 = {0, 1, 1, 2, 1, 2};
        assertArrayEquals(expected1, result1);

        // Testing with a larger positive value (e.g., 10)
        int[] result2 = countingBits.countBits(10);
        int[] expected2 = {0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2};
        assertArrayEquals(expected2, result2);
    }

    @Test
    public void testCountBitsWithZero() {
        CountingBits countingBits = new CountingBits();

        // Testing with zero should return [0]
        int[] result = countingBits.countBits(0);
        int[] expected = {0};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testCountBitsWithNegativeInput() {
        CountingBits countingBits = new CountingBits();

        // Testing with a negative value (e.g., -3)
        int[] result = countingBits.countBits(-3);
        // Negative input should return an array with all zeros
        int[] expected = new int[0];
        assertArrayEquals(expected, result);
    }

}
