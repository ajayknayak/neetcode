package org.ajay.neetcode.stack;

import java.util.Stack;

/**
 * You are given an array of strings tokens that represents an arithmetic
 * expression in a Reverse Polish Notation.
 * 
 * Evaluate the expression. Return an integer that represents the value of the
 * expression.
 * 
 * Note that:
 * 
 * The valid operators are '+', '-', '*', and '/'. Each operand may be an
 * integer or another expression. The division between two integers always
 * truncates toward zero. There will not be any division by zero. The input
 * represents a valid arithmetic expression in a reverse polish notation. The
 * answer and all the intermediate calculations can be represented in a 32-bit
 * integer.
 * 
 * 
 * Example 1:
 * 
 * Input: tokens = ["2","1","+","3","*"] 
 * Output: 9 
 * Explanation: ((2 + 1) * 3) = 9 
 * 
 * Example 2:
 * 
 * Input: tokens = ["4","13","5","/","+"] 
 * Output: 6 
 * Explanation: (4 + (13 / 5)) = 6 Example 3:
 * 
 * Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
 * Output: 22 
 * Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5 
 * = ((10 * (6 / (12 * -11))) + 17) + 5 
 * = ((10 * (6 / -132)) + 17) + 5 
 * = ((10 * 0) + 17) + 5 
 * = (0 + 17) + 5 
 * = 17 + 5 
 * = 22
 * 
 * 
 * Constraints:
 * 
 * 1 <= tokens.length <= 10000 tokens[i] is either an operator: "+", "-", "*", or
 * "/", or an integer in the range [-200, 200].
 * 
 * @author ajnayak
 *
 */

public class EvaluateReversePolishNotation {

	public int evalRPN(String[] tokens) {

		if (null == tokens) {
			System.out.println("Input is null");
			return 0;
		}

		if (1 > tokens.length || tokens.length > 10000) {
			System.out.println("Input out of bound exception");
			return 0;
		}

		int result = 0;
		Stack<Integer> nStack = new Stack<Integer>();

		for (int i = 0; i < tokens.length; i++) {

			String iStr = tokens[i];
			if (iStr.matches("[^+\\-*/]") && !isNumber(iStr)) {
				System.out.println("Invalid Input token " + iStr);
				return 0;
			}

			if (iStr.matches("[+\\-*/]")) {
				char opr = iStr.charAt(0);
				if (nStack.size() < 2) {
					System.out.println("Invalid Expression");
					return 0;
				}
				int oprnd1 = nStack.pop();
				int oprnd2 = nStack.pop();
				try {
					result = evaluate(oprnd1, oprnd2, opr);
				} catch (Exception e) {
					System.out.println("Operator evalution failed");
					return 0;
				}
				nStack.push(result);
			} else {
				// If it is a Operand then push into the stack
				int num = Integer.parseInt(iStr);
				if (-200 > num || num > 200) {
					System.out.println("Number out of range");
					return 0;
				}
				nStack.push(num);
			}

		}

		if (nStack.size() > 1) {
			return 0;
		}
		return nStack.pop();

	}

	private boolean isNumber(String strNum) {

		try {

			Integer.parseInt(strNum);
			return true;
		} catch (Exception e) {
			System.out.println("Not a digit");
			return false;
		}

	}

	private int evaluate(int oprnd1, int oprnd2, char operator) throws Exception{

		switch (operator) {
		case '+':
			return oprnd1 + oprnd2;
		case '-':
			return oprnd2 - oprnd1;
		case '*':
			return oprnd1 * oprnd2;
		case '/':
			return oprnd2 / oprnd1;
		default:
			break;
		}
		return 0;
	}
}
