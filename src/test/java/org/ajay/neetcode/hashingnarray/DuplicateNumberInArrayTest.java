package org.ajay.neetcode.hashingnarray;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DuplicateNumberInArrayTest {

	DuplicateNumberInArray ins = new DuplicateNumberInArray();

	@Test
	public void testContainsDuplicate_1() {
		int[] nums = { 1, 2, 3, 1 };
		assertTrue(ins.containsDuplicate(nums));
	}

	@Test
	public void testContainsDuplicate_2() {
		int[] nums2 = { 1, 2, 3, 4 };
		assertFalse(ins.containsDuplicate(nums2));
	}

	@Test
	public void testContainsDuplicate_3() {
		int[] nums3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		assertTrue(ins.containsDuplicate(nums3));
	}

}
