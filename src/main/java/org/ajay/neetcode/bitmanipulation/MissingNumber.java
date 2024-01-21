package org.ajay.neetcode.bitmanipulation;

/**
 * Given an array nums containing n distinct numbers in the range [0, n], return
 * the only number in the range that is missing from the array.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [3,0,1] 
 * Output: 2 
 * Explanation: n = 3 since there are 3 numbers,
 * so all numbers are in the range [0,3]. 2 is the missing number in the range
 * since it does not appear in nums. 
 * 
 * Example 2:
 * 
 * Input: nums = [0,1] 
 * Output: 2 
 * Explanation: n = 2 since there are 2 numbers,
 * so all numbers are in the range [0,2]. 2 is the missing number in the range
 * since it does not appear in nums. 
 * 
 * Example 3:
 * 
 * Input: nums = [9,6,4,2,3,5,7,0,1] 
 * Output: 8 
 * Explanation: n = 9 since there
 * are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number
 * in the range since it does not appear in nums.
 * 
 * 
 * Constraints:
 * 
 * n == nums.length 
 * 1 <= n <= 10000 
 * 0 <= nums[i] <= n 
 * 
 * All the numbers of nums are unique.
 * 
 * @author ajnayak
 *
 */

public class MissingNumber {
	
    public int missingNumber_UsingSum(int[] nums) {
    	
    	int len = nums.length;
    	if(1 > len || len > 10000) {
    		System.out.println("Length out of range");
    		return -1;
    	}
    	
    	int sum = (len*(len+1))/2;
    	
    	int numSum=0;
    	for (int i = 0; i < nums.length; i++) {
    		numSum += nums[i];
		}
    	 return sum-numSum;
    }
    
    public int missingNumber_UsingXOR(int[] nums) {
    	
    	int len = nums.length;
    	if(1 > len || len > 10000) {
    		System.out.println("Length out of range");
    		return -1;
    	}
    	
    	int rangeXor = 0;
    	for (int i = 0; i <= len ; i++) {
    		rangeXor ^= i;
		}
    	
    	for (int i = 0; i < nums.length; i++) {
    		rangeXor = rangeXor ^ nums[i];
		}
    	 return rangeXor;
    }
}
