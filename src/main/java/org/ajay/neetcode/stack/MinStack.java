package org.ajay.neetcode.stack;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
You must implement a solution with O(1) time complexity for each function.

 

Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2
 

Constraints:

-231 <= val <= 231 - 1  = 2,147,483,648 <= val <= 2,147,483,647
Methods pop, top and getMin operations will always be called on non-empty stacks.
At most 3 * 10000 calls will be made to push, pop, top, and getMin.
 */

import java.util.Stack;

public class MinStack {

	Stack<Integer> mainStack = null;
	Stack<Integer> minStack = null;

	public MinStack() {
		mainStack = new Stack<Integer>();
		minStack = new Stack<Integer>();
	}

	/**
	public void push(int val) {

		if (val < Integer.MIN_VALUE || val > Integer.MAX_VALUE) {
			return;
		}
		mainStack.push(val);
		if (minStack.isEmpty()) {
			minStack.push(val);
		} else {
			int min = minStack.peek();
			if (min > val) {
				minStack.push(val);
			} else {
				minStack.push(min);
			}
		}

	}
	 */
	/**
	 * public void pop() {
	 * 
	 * if (!mainStack.isEmpty()) mainStack.pop(); 
	 * if (!minStack.isEmpty()) minStack.pop();
	 * 
	 * }
	 */

	public void push(int val) {

		if (val < Integer.MIN_VALUE || val > Integer.MAX_VALUE) {
			return;
		}
		mainStack.push(val);
		if (minStack.isEmpty()) {
			minStack.push(val);
		} else {
			int min = minStack.peek();
			if (min >= val) {
				minStack.push(val);
			}
		}

	}

	public void pop() {

		if (!mainStack.isEmpty()) {
			int popVal = mainStack.pop();
			if (!minStack.isEmpty() && popVal <= minStack.peek()) {
				minStack.pop();
			}
		}

	}

	public int top() {

		if (!mainStack.isEmpty())
			return mainStack.peek();
		return 0;

	}

	public int getMin() {
		if (!minStack.isEmpty())
			return minStack.peek();
		return 0;
	}
}
