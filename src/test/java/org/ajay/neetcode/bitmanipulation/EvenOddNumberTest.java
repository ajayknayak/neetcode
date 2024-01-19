package org.ajay.neetcode.bitmanipulation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EvenOddNumberTest {

	@Test
	public void testIsEvenWithEvenNumber() {
		EvenOddNumber evenOddNumber = new EvenOddNumber();

		// Testing with an even number (e.g., 6)
		assertTrue(evenOddNumber.isEven(6));
	}

	@Test
	public void testIsEvenWithOddNumber() {
		EvenOddNumber evenOddNumber = new EvenOddNumber();

		// Testing with an odd number (e.g., 11)
		assertFalse(evenOddNumber.isEven(11));
	}

	@Test
	public void testIsEvenWithZero() {
		EvenOddNumber evenOddNumber = new EvenOddNumber();

		// Testing with zero should return true
		assertTrue(evenOddNumber.isEven(0));
	}

	@Test
	public void testIsEvenWithNegativeEvenNumber() {
		EvenOddNumber evenOddNumber = new EvenOddNumber();

		// Testing with a negative even number (e.g., -8)
		assertTrue(evenOddNumber.isEven(-8));
	}

	@Test
	public void testIsEvenWithNegativeOddNumber() {
		EvenOddNumber evenOddNumber = new EvenOddNumber();

		// Testing with a negative odd number (e.g., -13)
		assertFalse(evenOddNumber.isEven(-13));
	}
}
