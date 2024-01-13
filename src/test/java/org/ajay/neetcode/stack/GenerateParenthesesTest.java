package org.ajay.neetcode.stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class GenerateParenthesesTest {

    @Test
    public void testGenerateParenthesisWithValidInput() {
        GenerateParentheses generator = new GenerateParentheses();
        List<String> result = generator.generateParenthesis(3);

        assertEquals(5, result.size());
        assertTrue(result.contains("((()))"));
        assertTrue(result.contains("(()())"));
        assertTrue(result.contains("(())()"));
        assertTrue(result.contains("()(())"));
        assertTrue(result.contains("()()()"));
    }

    @Test
    public void testGenerateParenthesisWithInvalidInput() {
        GenerateParentheses generator = new GenerateParentheses();
        List<String> result = generator.generateParenthesis(-1);

        assertTrue(result.isEmpty());
    }

    @Test
    public void testGenerateParenthesisWithUpperBoundInput() {
        GenerateParentheses generator = new GenerateParentheses();
        List<String> result = generator.generateParenthesis(8);

        assertEquals(1430, result.size());
        // You can add more assertions if needed
    }

    @Test
    public void testGenerateParenthesisWithZeroInput() {
        GenerateParentheses generator = new GenerateParentheses();
        List<String> result = generator.generateParenthesis(0);

        assertTrue(result.isEmpty());
    }

    @Test
    public void testGenerateParenthesisWithLargeInputSize() {
        GenerateParentheses generator = new GenerateParentheses();
        List<String> result = generator.generateParenthesis(10);
        assertTrue(result.isEmpty());
    }

}
