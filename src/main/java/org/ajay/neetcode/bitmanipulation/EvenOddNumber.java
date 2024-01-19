package org.ajay.neetcode.bitmanipulation;

/**
 * Check a integer is even or odd number using bit manipulation
 * @author ajnayak
 *
 */
public class EvenOddNumber {
	
	public Boolean isEven(int n) {
		
		return 0==(n&1)? true:false;
	}

}
