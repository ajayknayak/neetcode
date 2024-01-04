package org.ajay.neetcode.hashingnarray;

import org.junit.Assert;
import org.junit.Test;

public class ValidAnagramTest {
	
	private ValidAnagram inst = new ValidAnagram();
	
//	@Test
	public void testIsAnagram_1(){
		
		String s = "anagram";
		String t = "nagaram";
        Assert.assertTrue((inst.isAnagram(s, t)));
	}
	
	@Test
	public void testIsAnagram_2(){
		
		String s = "cat";
		String t = "rat";
        Assert.assertFalse((inst.isAnagram(s, t)));
	}
}
