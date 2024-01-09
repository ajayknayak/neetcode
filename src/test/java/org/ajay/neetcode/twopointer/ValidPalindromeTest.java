package org.ajay.neetcode.twopointer;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidPalindromeTest {
	
	 @Test
	    public void testPalindromeWithValidPalindrome() {
		 ValidPalindrome checker = new ValidPalindrome();
	        assertTrue(checker.isPalindrome("A man, a plan, a canal: Panama"));
	        assertFalse(checker.isPalindrome("Race a car"));
	        assertTrue(checker.isPalindrome("Able was I ere I saw Elba"));
	        assertTrue(checker.isPalindrome("12321"));
	    }

	    @Test
	    public void testPalindromeWithEmptyString() {
	    	ValidPalindrome checker = new ValidPalindrome();
	        assertFalse(checker.isPalindrome(""));
	    }

	    @Test
	    public void testPalindromeWithSingleCharacter() {
	    	ValidPalindrome checker = new ValidPalindrome();
	        assertTrue(checker.isPalindrome("a"));
	    }

	    @Test
	    public void testPalindromeWithNonPalindrome() {
	        ValidPalindrome checker = new ValidPalindrome();
	        assertFalse(checker.isPalindrome("Hello World"));
	        assertFalse(checker.isPalindrome("abc123"));
	    }

	    @Test
	    public void testPalindromeWithNullInput() {
	        ValidPalindrome checker = new ValidPalindrome();
	        assertFalse(checker.isPalindrome(null));
	    }

	    @Test
	    public void testPalindromeWithVerySmallInput() {
	        ValidPalindrome checker = new ValidPalindrome();
	        assertFalse(checker.isPalindrome("ab"));
	    }

	    @Test
	    public void testPalindromeWithVeryBigInput() {
	        ValidPalindrome checker = new ValidPalindrome();
	        assertFalse(checker.isPalindrome("a".repeat(200001)));
	    }

	    @Test
	    public void testPalindromeWithSpecialCharacters() {
	        ValidPalindrome checker = new ValidPalindrome();
	        assertTrue(checker.isPalindrome("A man, a plan, a canal: Panama!!!"));
	        assertTrue(checker.isPalindrome("Was it a car or a cat I saw?"));
	        assertTrue(checker.isPalindrome("No lemon, no melon"));
	    }

}
