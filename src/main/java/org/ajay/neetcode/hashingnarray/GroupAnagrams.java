package org.ajay.neetcode.hashingnarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * Given an array of strings strs, group the anagrams together. You can return
 * the answer in any order. An Anagram is a word or phrase formed by rearranging
 * the letters of a different word or phrase, typically using all the original
 * letters exactly once.
 * 
 * 
 * Example 1:
 * 
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output:[["bat"],["nat","tan"],["ate","eat","tea"]]
 * 
 * Example 2:
 * 
 * Input: strs = [""] Output: [[""]]
 * 
 * Example 3:
 * 
 * Input: strs = ["a"] Output: [["a"]]
 * 
 * Constraints:
 * 
 * 1 <= strs.length <= 10000 0 <= strs[i].length <= 100 strs[i] consists of
 * lowercase English letters.
 * 
 * @author ajay
 * 
 *
 */

public class GroupAnagrams {

	private int MAX_STRING_ARRAY_LENGTH = 10000;
	private int MAX_STRING_LENGTH = 100;

	/**
	 * Solution A: Used index array to find the anagrams
	 * @param strs
	 * @return
	 * 
	 * Leet Code: 
	 * 
	 * Complexity: ~ mXn
	 */
	public List<List<String>> groupAnagramsSol_A(String[] strs) {

		List<List<String>> output = null;
		if (!IsValidInput(strs)) {
			System.out.println("Invalid Input");
			return output;
		}

		Map<String, List<String>> groupMap = new HashMap<String, List<String>>();
		for (String str : strs) {

			int[] index = new int[26];
			char[] strCharArry = str.toCharArray();
			for (int i = 0; i < strCharArry.length; i++) {
				index[strCharArry[i] - 'a']++;
			}
			String strKey = new String(index, 0, 26);
			groupMap.putIfAbsent(strKey, new ArrayList<String>());
			groupMap.get(strKey).add(str);
		}
		output = new ArrayList<List<String>>();
		output.addAll(groupMap.values());
		return output;
	}
	
	/**
	 * Solution B: Sort each elements in the string array and find the anagrams
	 * @param strs
	 * @return
	 * 
	 * Leet Code: 
	 * 
	 * Complexity : ~ mXnlogn
	 * 
	 */
	
	public List<List<String>> groupAnagramsSol_B(String[] strs) {

		List<List<String>> output = null;
		if (!IsValidInput(strs)) {
			System.out.println("Invalid Input");
			return output;
		}

		Map<String, List<String>> groupMap = new HashMap<String, List<String>>();
		for (String str : strs) {

			char[] strCharArry = str.toCharArray();
			Arrays.sort(strCharArry);
			
			String strKey = new String(strCharArry);
			groupMap.putIfAbsent(strKey, new ArrayList<String>());
			groupMap.get(strKey).add(str);
		}
		output = new ArrayList<List<String>>();
		output.addAll(groupMap.values());
		return output;
	}

	private boolean IsValidInput(String[] strs) {
		if(null == strs || 0 >= strs.length || strs.length > MAX_STRING_ARRAY_LENGTH){
			System.out.println("String array is null or > 10000");
			return false;
		}
		
		for (String str : strs) {
			if(str.length() > MAX_STRING_LENGTH){
				System.out.println("Some elements for very larg:  "+str);
				return false;
			}
			
			String lowerCaseStr = str.toLowerCase();
			
			if(!str.equals(lowerCaseStr)){
				System.out.println("Some elements are not in lower case: "+str);
				return false;
			}
		}
		
		return true;
	}

}
