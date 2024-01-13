package org.ajay.neetcode.stack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EvaluateReversePolishNotationTest {

	@Test
	public void testEvalRPNWithValidInput() {
		EvaluateReversePolishNotation evaluator = new EvaluateReversePolishNotation();
		String[] tokens = { "2", "1", "+", "3", "*" };
		assertEquals(9, evaluator.evalRPN(tokens));
	}

	@Test
	public void testEvalRPNWithInvalidToken() {
		EvaluateReversePolishNotation evaluator = new EvaluateReversePolishNotation();
		String[] tokens = { "2", "1", "+", "A", "*" };
		assertEquals(0, evaluator.evalRPN(tokens));
	}

	@Test
	public void testEvalRPNWithInvalidInput() {
		EvaluateReversePolishNotation evaluator = new EvaluateReversePolishNotation();
		String[] tokens = { "2", "1", "+", "*", "3" };
		assertEquals(0, evaluator.evalRPN(tokens));
	}

	@Test
	public void testEvalRPNWithDivisionByZero() {
		EvaluateReversePolishNotation evaluator = new EvaluateReversePolishNotation();
		String[] tokens = { "4", "2", "0", "/" };
		assertEquals(0, evaluator.evalRPN(tokens));
	}

	@Test
	public void testEvalRPNWithMultipleOperandsRemaining() {
		EvaluateReversePolishNotation evaluator = new EvaluateReversePolishNotation();
		String[] tokens = { "2", "1", "+", "3", "*", "5", "/" };
		assertEquals(1, evaluator.evalRPN(tokens));
	}
	
	@Test
	public void testEvalRPNWithMultipleOperandsRemaining_2() {
		EvaluateReversePolishNotation evaluator = new EvaluateReversePolishNotation();
		String[] tokens = { "4","13","5","/","+" };
		assertEquals(6, evaluator.evalRPN(tokens));
	}

	@Test
	public void testEvalRPNWithNullInput() {
		EvaluateReversePolishNotation evaluator = new EvaluateReversePolishNotation();
		assertEquals(0, evaluator.evalRPN(null));
	}

	@Test
	public void testEvalRPNWithLargeInputSize() {
		EvaluateReversePolishNotation evaluator = new EvaluateReversePolishNotation();
		String[] tokens = new String[10001];
		assertEquals(0, evaluator.evalRPN(tokens));
	}

}
