package org.ajay.neetcode.stack;

import java.util.Stack;

import org.w3c.dom.css.ElementCSSInlineStyle;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * Open brackets must be closed by the same type of brackets. Open brackets must
 * be closed in the correct order. Every close bracket has a corresponding open
 * bracket of the same type.
 * 
 * 
 * Example 1:
 * 
 * Input: s = "()" Output: true Example 2:
 * 
 * Input: s = "()[]{}" Output: true Example 3:
 * 
 * Input: s = "(]" Output: false
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 104 s consists of parentheses only '()[]{}'.
 * 
 * @author ajay
 *
 */

public class ValidParentheses {

	public char[] allowedChar = { '(', ')', '[', ']', '{', '}' };

	public boolean isAllowedChar(char ch) {
		boolean isAllowed = false;
		for (int i = 0; i < allowedChar.length; i++) {
			if (ch == allowedChar[i])
				isAllowed = true;
		}
		return isAllowed;
	}

	public boolean isValid(String s) {
		boolean isValid = true;
		if (null == s || s.isEmpty()) {
			isValid = false;
		} else if (1 >= s.length() || s.length() >= 10000) {
			isValid = false;
		} else {
			Stack<Character> stack = new Stack<Character>();
			for (int i = 0; i < s.length(); i++) {
				Character character = s.charAt(i);
				if (!isAllowedChar(character)) {
					isValid = false;
					break;
				}
				if (character == '(' || character == '[' || character == '{') {
					stack.add(character);
				} else if(stack.size() !=0){
					if (character == ')') {
						if ('(' != stack.peek()) {
							isValid = false;
							break;
						}
					} else if (character == ']') {
						if ('[' != stack.peek()) {
							isValid = false;
							break;
						}
					} else if (character == '}') {
						if ('{' != stack.peek()) {
							isValid = false;
							break;
						}
					}
					stack.pop();
				} else {
					isValid = false;
					break;
				}

			}
			if (stack.size() != 0) {
				isValid = false;
			}
		}

		return isValid;
	}

}
