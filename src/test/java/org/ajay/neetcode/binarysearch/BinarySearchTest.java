package org.ajay.neetcode.binarysearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearchTest {
	@Test
	public void testSearchWithValidInputAndTargetPresent() {
		BinarySearch binarySearch = new BinarySearch();
		int[] nums = { -1, 0, 3, 5, 9, 12 };
		int target = 9;
		assertEquals(4, binarySearch.search(nums, target));
	}

	@Test
	public void testSearchWithValidInputAndTargetNotPresent() {
		BinarySearch binarySearch = new BinarySearch();
		int[] nums = { -1, 0, 3, 5, 9, 12 };
		int target = 7;
		assertEquals(-1, binarySearch.search(nums, target));
	}

	@Test
	public void testSearchWithValidInputAndTargetNotPresent_2() {
		BinarySearch binarySearch = new BinarySearch();
		int[] nums = { 2,5 };
		int target = 0;
		assertEquals(-1, binarySearch.search(nums, target));
	}

	@Test
	public void testSearchWithInvalidInput() {
		BinarySearch binarySearch = new BinarySearch();
		int[] nums = null;
		int target = 7;
		assertEquals(-1, binarySearch.search(nums, target));
	}

	@Test
	public void testSearchWithOutOfRangeInput() {
		BinarySearch binarySearch = new BinarySearch();
		int[] nums = { -10001, -5000, 0, 5000, 10001 };
		int target = 0;
		assertEquals(-1, binarySearch.search(nums, target));
	}

	@Test
	public void testSearchWithLargeInputSize() {
		BinarySearch binarySearch = new BinarySearch();
		int[] nums = new int[10000];
		for (int i = 0; i < 10000; i++) {
			nums[i] = i;
		}
		int target = 5000;
		assertEquals(5000, binarySearch.search(nums, target));
	}
}
