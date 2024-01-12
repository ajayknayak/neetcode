package org.ajay.neetcode.stack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinStackTest {

    @Test
    public void testMinStackWithValidInput() {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(3);
        minStack.push(7);

        assertEquals(7, minStack.top());
        assertEquals(3, minStack.getMin());

        minStack.pop();
        assertEquals(3, minStack.top());
        assertEquals(3, minStack.getMin());
    }

    @Test
    public void testMinStackWithInvalidValues() {
        MinStack minStack = new MinStack();
        minStack.push(Integer.MIN_VALUE);
        minStack.push(Integer.MAX_VALUE);

        // Should not affect the stack
        assertEquals(Integer.MAX_VALUE, minStack.top());
        assertEquals(Integer.MIN_VALUE, minStack.getMin());
    }

    @Test
    public void testMinStackWithPopOnEmptyStack() {
        MinStack minStack = new MinStack();
        minStack.pop();  // Should not throw an exception
    }

    @Test
    public void testMinStackWithEmptyStack() {
        MinStack minStack = new MinStack();
        assertEquals(0, minStack.top());
        assertEquals(0, minStack.getMin());
    }

    @Test
    public void testMinStackWithPushAndPop() {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.pop();

        assertEquals(0, minStack.top());
        assertEquals(0, minStack.getMin());
    }
}
