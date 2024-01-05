package org.ajay.neetcode.hashingnarray;

import java.time.Year;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false
 * otherwise.
 * 
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters exactly
 * once.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "anagram", t = "nagaram" Output: true
 * 
 * Example 2:
 * 
 * Input: s = "rat", t = "car" Output: false
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length, t.length <= 5 * 104 s and t consist of lowercase English
 * letters.
 * 
 * 
 * Follow up: What if the inputs contain Unicode characters? How would you adapt
 * your solution to such a case?
 * 
 * @author ajay
 *
 */

/**
 * Leet Code : Accepted
 * @author ajnayak
 *
 */

public class ValidAnagram {

	public boolean isAnagram(String s, String t) {
		boolean isAnaGram = true;

		//validate null value
		if (null == s || null == t) {
			System.out.println("Either is inout is null");
			return false;
		}

		//validate length
		if (s.length() < 1 || s.length() > 50000 || t.length() < 1 || t.length() > 50000) {
			System.out.println("Either or both of the input length is out of length");
			return false;
		}

		//validate length compare
		if (s.length() != t.length()) {
			System.out.println("Both input length is not equal");
			return false;
		}
		
		//validate lower case chars
		for (int i = 0; i < s.length(); i++) {
			char sCh = s.charAt(i);
			char tCh = t.charAt(i);
			if(sCh < 97 || sCh > 122 || tCh < 97 || tCh > 122){
				isAnaGram = false;
				break;
			}
		}
		
		if(!isAnaGram){
			System.out.println("Invalid Inout String Characters");
			return isAnaGram;
		}
		

		int[] mapArray = new int[125];
		for (int i = 0; i < s.length(); i++) {
			mapArray[s.charAt(i)] = mapArray[s.charAt(i)] +1;
		}
		
		for (int i = 0; i < t.length(); i++) {
			mapArray[t.charAt(i)] = mapArray[t.charAt(i)] -1;
		}
		
		for (int i = 0; i < mapArray.length; i++) {
			if (mapArray[i] != 0) {
				isAnaGram = false;
				break;
			}
		}

		return isAnaGram;
	}

}
