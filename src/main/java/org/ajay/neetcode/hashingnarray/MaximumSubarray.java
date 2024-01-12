package org.ajay.neetcode.hashingnarray;

/**
 * 
 * Given an integer array nums, find the subarray with the largest sum, and
 * return its sum.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4] 
 * Output: 6 
 * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 * 
 *  
 * Example 2:
 * Input: nums = [1] 
 * Output: 1 
 * Explanation: The subarray [1] has the largest sum
 * 
 * Example 3:
 * Input: nums = [5,4,-1,7,8] 
 * Output: 23 
 * Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 100000 -10000 <= nums[i] <= 10000
 * 
 * @author ajnayak
 *
 */

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        
    	if(null == nums) {
    		System.out.println("Input is invalid");
    		return 0;
    	}
    	
    	if(1 > nums.length || nums.length > 100000) {
    		System.out.println("Array Index bound of error");
    		return 0;
    	}
    	
    	boolean isAllNagetive = true;
    	for (int i = 0;  i< nums.length; i++) {
			 if(nums[i] > 0) {
				 isAllNagetive = false;
				 break;
			 }
		}
    	
    	int sum = 0;
    	int[] sumArray = new int[nums.length];
    	if (isAllNagetive) {
    		sum = Integer.MIN_VALUE;
    		for (int j = 0; j < nums.length; j++) {
				if(nums[j] > sum) sum = nums[j];
			}
    		
    		return sum;
    	}
    	
    	for (int i = 0; i < nums.length; i++) {
			
    		if(nums[i] > 10000 || nums[i] < -10000) {
    			System.out.println("Invalid Input element");
    			sum = 0;
    			sumArray = new int[nums.length];
    			break;
    		}
    		
    		if(sum + nums[i] <= 0) {
    			sum =0;
    			sumArray[i] = sum;
    		} else {
    			sum += nums[i];
    			sumArray[i] = sum;
    		}
		}
    	
    	sum = 0;
    	for (int i = 0; i < sumArray.length; i++) {
			if(sum < sumArray[i])
				sum = sumArray[i];
		}
    	
    	return sum;
    }
    
}
