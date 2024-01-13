package org.ajay.neetcode.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * Given n pairs of parentheses, write a function to generate all combinations
 * of well-formed parentheses.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: n = 3 
 * Output: ["((()))","(()())","(())()","()(())","()()()"] 
 * 
 * Example 2:
 * 
 * Input: n = 1 
 * Output: ["()"]
 * 
 * 
 * Constraints:
 * 
 * 1 <= n <= 8
 * 
 * @author ajnayak
 *
 */

public class GenerateParentheses {

	public List<String> generateParenthesis(int n) {

		List<String> resParenth = new ArrayList<String>();

		//Validate input
		if (1 > n || n > 8) {
			System.out.println("Invalid Input");
			return resParenth;
		}

		createParentheses(resParenth, 0, 0, "", n);

		return resParenth;

	}

	private void createParentheses(List<String> resParenth, int left, int right, String parentheses, int n) {
		if (parentheses.length() == n * 2) {
			resParenth.add(parentheses);
			return;
		}

		if (left < n) {
			createParentheses(resParenth, left + 1, right, parentheses+"(", n);
		}

		if (right < left ) {
			createParentheses(resParenth, left, right + 1,parentheses+")", n);
		}

	}

}
