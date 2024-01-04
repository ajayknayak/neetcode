package org.ajay.neetcode.hashingnarray;

import java.util.HashMap;
import java.util.Map;

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

public class TwoNumberSumOfArray {

	private int MAX_VALID = 1000000000;
	private int MIN_VALID = -1000000000;

	public int[] twoNumSumWithConsicutiveIndice(int[] nums, int target) {

		int[] indices = new int[2];

		if (!isValidInput(nums, target)) {
			return indices;
		}

		for (int i = 0; i < nums.length; i++) {

			if (i < nums.length - 1 && target == nums[i] + nums[i + 1]) {
				indices[0] = i;
				indices[1] = i + 1;
			}
		}
		return indices;
	}

	public int[] twoNumSumWithoutConsicutiveIndice(int[] nums, int target) {

		int[] indices = new int[2];

		if (!isValidInput(nums, target)) {
			return indices;
		}

		Map<Integer, Integer> indicesMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			indicesMap.putIfAbsent(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {

			if (indicesMap.containsKey(target - nums[i]) && i != indicesMap.get(target - nums[i])) {
				indices[0] = i;
				indices[1] = indicesMap.get(target - nums[i]);
				break;
			}
		}
		return indices;
	}

	private boolean isValidInput(int[] nums, int target) {
		if (null == nums) {
			System.out.println("inout array is null");
			return false;
		}
	
		if (nums.length < 2 || nums.length > 10000 || target < MIN_VALID || target > MAX_VALID) {
			System.out.println("Inlidate array length or target is very large");
			return false;
		}

		for (int i : nums) {
			if (i < MIN_VALID || i > MAX_VALID) {
				return false;
			}
		}

		return true;

	}

}
