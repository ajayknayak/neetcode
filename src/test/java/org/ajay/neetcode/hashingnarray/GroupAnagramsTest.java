package org.ajay.neetcode.hashingnarray;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class GroupAnagramsTest {
	
	private GroupAnagrams inst = new GroupAnagrams();
	
	@Test
	public void testgroupAnagramsSol_A_1(){
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> groupAnagrams = inst.groupAnagramsSol_A(strs);
		String strGroupAnagram = groupAnagrams.toString();
		Assert.assertEquals(strGroupAnagram, "[[tan, nat], [eat, tea, ate], [bat]]");
	}
	
	@Test
	public void testgroupAnagramsSol_A_EmptyArray(){
		String[] strs = {""};
		List<List<String>> groupAnagrams = inst.groupAnagramsSol_A(strs);
		String strGroupAnagram = groupAnagrams.toString();
		Assert.assertEquals(strGroupAnagram, "[[]]");
	}
	
	@Test
	public void testgroupAnagramsSol_A_2(){
		String[] strs = {"a"};
		List<List<String>> groupAnagrams = inst.groupAnagramsSol_A(strs);
		String strGroupAnagram = groupAnagrams.toString();
		Assert.assertEquals(strGroupAnagram, "[[a]]");
	}
	
	@Test
	public void testgroupAnagramsSol_B_1(){
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> groupAnagrams = inst.groupAnagramsSol_B(strs);
		String strGroupAnagram = groupAnagrams.toString();
		Assert.assertEquals(strGroupAnagram, "[[eat, tea, ate], [bat], [tan, nat]]");
	}
	
	@Test
	public void testgroupAnagramsSol_B_EmptyArray(){
		String[] strs = {""};
		List<List<String>> groupAnagrams = inst.groupAnagramsSol_B(strs);
		String strGroupAnagram = groupAnagrams.toString();
		Assert.assertEquals(strGroupAnagram, "[[]]");
	}
	
	@Test
	public void testgroupAnagramsSol_B_2(){
		String[] strs = {"a"};
		List<List<String>> groupAnagrams = inst.groupAnagramsSol_B(strs);
		String strGroupAnagram = groupAnagrams.toString();
		Assert.assertEquals(strGroupAnagram, "[[a]]");
	}
}
