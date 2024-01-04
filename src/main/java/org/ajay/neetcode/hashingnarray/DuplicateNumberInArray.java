package org.ajay.neetcode.hashingnarray;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,1] Output: true
 * 
 * Example 2:
 * 
 * Input: nums = [1,2,3,4] Output: false
 * 
 * Example 3:
 * 
 * Input: nums = [1,1,1,3,3,4,3,2,4,2] Output: true
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 105 -109 <= nums[i] <= 109
 * 
 * Accepted 3.4M Submissions
 * 
 * @author ajay
 *
 */

public class DuplicateNumberInArray {

	private int MAX_NUM = 1000000000;
	private int MIN_NUM = -1000000000;

	public boolean containsDuplicate(int[] nums) {
		boolean containsDuplicate = false;
		if (null == nums || 1 >= nums.length || nums.length >= 100000) {
			System.out.println("Array is null or length is out of scope");
			return containsDuplicate;
		}
		Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			if (num <= MIN_NUM || num >= MAX_NUM) {
				break;
			}
			int anyNumCount = null == numMap.get(num) ? 0 : 1;
			numMap.put(num, anyNumCount + 1);
			anyNumCount = numMap.get(num);
			if (anyNumCount > 1) {
				containsDuplicate = true;
				break;
			}
		}
		return containsDuplicate;
	}
}
