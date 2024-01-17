package org.ajay.neetcode.bitmanipulation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Given a non-empty array of integers nums, every element appears twice except
 * for one. Find that single one.
 * 
 * You must implement a solution with a linear runtime complexity and use only
 * constant extra space.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [2,2,1] 
 * Output: 1 
 * 
 * Example 2:
 * 
 * Input: nums = [4,1,2,1,2] 
 * Output: 4 
 * 
 * Example 3:
 * 
 * Input: nums = [1] Output: 1
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 30000,  -30000 <= nums[i] <= 30000 Each element in
 * the array appears twice except for one element which appears only once.
 * 
 * @author ajnayak
 *
 */
public class SingleNumberTest {

	@Test
	public void testSingleNumberWithValidInput() {
		SingleNumber singleNumber = new SingleNumber();

		// Testing with an array containing a single non-repeating number (e.g., 7)
		int[] nums1 = { 4, 2, 7, 2, 4 };
		assertEquals(7, singleNumber.singleNumber(nums1));

		// Testing with an array containing a single non-repeating number (e.g., -3)
		int[] nums2 = { -1, -3, -1, -3, -4 };
		assertEquals(-4, singleNumber.singleNumber(nums2));
	}

	@Test
	public void testSingleNumberWithEmptyArray() {
		SingleNumber singleNumber = new SingleNumber();

		// Testing with an empty array should return 0
		int[] nums = {};
		assertEquals(0, singleNumber.singleNumber(nums));
	}

	@Test
	public void testSingleNumberWithNullArray() {
		SingleNumber singleNumber = new SingleNumber();

		// Testing with a null array should return 0
		int[] nums = null;
		assertEquals(0, singleNumber.singleNumber(nums));
	}

	@Test
	public void testSingleNumberWithArrayContainingOnlyDuplicates() {
		SingleNumber singleNumber = new SingleNumber();

		// Testing with an array containing only duplicate numbers should return 0
		int[] nums = { 1, 1, 2, 2, 3, 3, 4, 4 };
		assertEquals(0, singleNumber.singleNumber(nums));
	}
}
