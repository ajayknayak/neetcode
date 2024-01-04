package org.ajay.neetcode.stack;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {
	
	public ValidParentheses ins = new ValidParentheses();
	
	@Test
	public void testIsValid_1() {
		String string = "(){}[]";
		Assert.assertTrue(ins.isValid(string));
	}
	
	@Test
	public void testIsValid_2() {
		String string = "(";
		Assert.assertFalse(ins.isValid(string));
		string = ")";
		Assert.assertFalse(ins.isValid(string));
		string = " ";
		Assert.assertFalse(ins.isValid(string));
		string = "";
		Assert.assertFalse(ins.isValid(string));
		string = null;
		Assert.assertFalse(ins.isValid(string));
	}
	
	@Test
	public void testIsValid31() {
		String string = "(]";
		Assert.assertFalse(ins.isValid(string));
	}
	

}
