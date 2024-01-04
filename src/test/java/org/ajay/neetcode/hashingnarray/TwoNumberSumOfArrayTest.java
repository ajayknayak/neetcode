package org.ajay.neetcode.hashingnarray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * You can return the answer in any order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation: Because
 * nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Example 2:
 * 
 * Input: nums = [3,2,4], target = 6 Output: [1,2]
 * 
 * 
 * Example 3:
 * 
 * Input: nums = [3,3], target = 6 Output: [0,1]
 * 
 * 
 * Constraints:
 * 
 * 2 <= nums.length <= 104 -109 <= nums[i] <= 109 -109 <= target <= 109
 * 
 * Only one valid answer exists.
 * 
 * 
 * Follow-up: Can you come up with an algorithm that is less than O(n2) time
 * complexity?
 * 
 * @author ajay
 *
 */

public class TwoNumberSumOfArrayTest {
	
	private TwoNumberSumOfArray inst = new TwoNumberSumOfArray();
	
	@Test
	public void testTwoNumSumWithConsicutiveIndice_1(){
		int[] nums = {2,7,11,15};
		int[] expIndices = {0,1};
		int[] indices = inst.twoNumSumWithConsicutiveIndice(nums, 9);
		Assert.assertArrayEquals(expIndices, indices);
	}
	
	@Test
	public void testTwoNumSumWithConsicutiveIndice_2(){
		int[] nums = {3,2,4};
		int[] expIndices = {1,2};
		int[] indices = inst.twoNumSumWithConsicutiveIndice(nums, 6);
		Assert.assertArrayEquals(expIndices, indices);
	}
	
	
	@Test
	public void testTwoNumSumWithConsicutiveIndice_3(){
		int[] nums = {3,3};
		int[] expIndices = {0,1};
		int[] indices = inst.twoNumSumWithConsicutiveIndice(nums, 6);
		Assert.assertArrayEquals(expIndices, indices);
	}
	
	@Test
	public void testTwoNumSumWithoutConsicutiveIndice_1(){
		int[] nums = {2,7,11,15};
		int[] expIndices = {0,1};
		int[] indices = inst.twoNumSumWithoutConsicutiveIndice(nums, 9);
		Assert.assertArrayEquals(expIndices, indices);
	}
	
	@Test
	public void testTwoNumSumWithoutConsicutiveIndice_2(){
		int[] nums = {3,2,4};
		int[] expIndices = {1,2};
		int[] indices = inst.twoNumSumWithoutConsicutiveIndice(nums, 6);
		Assert.assertArrayEquals(expIndices, indices);
	}
	
	
	@Test
	public void testTwoNumSumWithoutConsicutiveIndice_3(){
		int[] nums = {3,3};
		int[] expIndices = {0,1};
		int[] indices = inst.twoNumSumWithoutConsicutiveIndice(nums, 6);
		Assert.assertArrayEquals(expIndices, indices);
	}

}
