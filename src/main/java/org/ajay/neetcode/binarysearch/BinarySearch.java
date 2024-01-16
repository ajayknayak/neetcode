package org.ajay.neetcode.binarysearch;

/**
 * Given an array of integers nums which is sorted in ascending order, and an
 * integer target, write a function to search target in nums. If target exists,
 * then return its index. Otherwise, return -1.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [-1,0,3,5,9,12], target = 9 
 * Output: 4 
 * Explanation: 9 exists in nums and its index is 4 
 * 
 * Example 2:
 * 
 * Input: nums = [-1,0,3,5,9,12], target = 2 
 * Output: -1 
 * Explanation: 2 does not exist in nums so return -1
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 10000 
 * -10000 < nums[i], target < 10000 
 * All the integers in nums are unique. nums is sorted in ascending order.
 * 
 * @author ajnayak
 *
 */

public class BinarySearch {
    public int search(int[] nums, int target) {
        
    	//Validate Input
    	if(null == nums || 1 > nums.length || nums.length > 10000) {
    		System.out.println("Invalid Input");
    		return -1;
    	}
    	
    	int length = nums.length;
    	if(nums[0] <= -10000 || nums[length-1] >= 10000 || target <= -10000 || target >= 10000 ) {
    		System.out.println("Invalid input");
    		return -1;
    	}
    	
    	return bsearch(nums, 0, length-1, target);
    	
    }

	private int bsearch(int[] nums, int i, int j, int target) {
		
        if(i > j) {
			return -1;
		}
		int mid = i+ ((j-i)/2);
		if(nums[mid] == target) {
			return mid;
		}
	
		if(nums[mid] > target) {
			j = mid-1;
		} else {
			i = mid+1;
		}
		
		return bsearch(nums, i, j, target);
	}
}
