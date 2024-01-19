package org.ajay.neetcode.bitmanipulation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HammingWeightTest {

	@Test
	public void testHammingWeightWithPositiveNumber() {
		HammingWeight hammingWeight = new HammingWeight();

		// Testing with a positive number (e.g., 9 in binary: 1001)
		int result = hammingWeight.hammingWeight(9);
		assertEquals(2, result);
	}

	@Test
	public void testHammingWeightWithZero() {
		HammingWeight hammingWeight = new HammingWeight();

		// Testing with zero should return 0
		int result = hammingWeight.hammingWeight(0);
		assertEquals(0, result);
	}

	@Test
	public void testHammingWeightWithNegativeNumber() {
		HammingWeight hammingWeight = new HammingWeight();

		// Testing with a negative number (e.g., -3 in binary:
		// 11111111111111111111111111111101)
		int result = hammingWeight.hammingWeight(-3);
		assertEquals(31, result);
	}

	@Test
	public void testHammingWeightWithLargeNumber() {
		HammingWeight hammingWeight = new HammingWeight();

		// Testing with a large positive number
		int result = hammingWeight.hammingWeight(Integer.MAX_VALUE);
		// The number of set bits in Integer.MAX_VALUE is 31
		assertEquals(31, result);
	}

	@Test
	public void testHammingWeightWithLargeNegativeNumber() {
		HammingWeight hammingWeight = new HammingWeight();

		// Testing with a large negative number
		int result = hammingWeight.hammingWeight(Integer.MIN_VALUE);
		// The number of set bits in Integer.MIN_VALUE is 1
		assertEquals(1, result);
	}
}
