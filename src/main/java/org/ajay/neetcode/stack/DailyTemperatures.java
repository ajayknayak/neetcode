package org.ajay.neetcode.stack;

import java.util.Stack;

/**
 * Given an array of integers temperatures represents the daily temperatures,
 * return an array answer such that answer[i] is the number of days you have to
 * wait after the ith day to get a warmer temperature. If there is no future day
 * for which this is possible, keep answer[i] == 0 instead.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: temperatures = [73,74,75,71,69,72,76,73] 
 * Output: [1,1,4,2,1,1,0,0]
 * 
 * Example 2:
 * 
 * Input: temperatures = [30,40,50,60] 
 * Output: [1,1,1,0] 
 * 
 * Example 3:
 * 
 * Input: temperatures = [30,60,90] 
 * Output: [1,1,0]
 * 
 * 
 * Constraints:
 * 
 * 1 <= temperatures.length <= 100000 30 <= temperatures[i] <= 100
 * 
 * @author ajnayak
 *
 */
public class DailyTemperatures {

	public int[] dailyTemperatures(int[] temperatures) {

		if (null == temperatures) {
			System.out.println("Input in null");
			return null;
		}

		if (1 > temperatures.length || temperatures.length > 100000) {
			System.out.println("Temperator array is out of range");
			return null;
		}

		int result[] = new int[temperatures.length];
		Stack<Integer> indices = new Stack<Integer>();

		for (int i = 0; i < temperatures.length; i++) {

			if (temperatures[i] > 100 || temperatures[i] < 30) {
				System.out.println("Invalid Temperator");
				return new int[temperatures.length];
			}

			if (!indices.isEmpty()) {
				while (!indices.isEmpty() && temperatures[i] > temperatures[indices.peek()]) {
					if (temperatures[i] > temperatures[indices.peek()]) {
						int topIndices = indices.pop();
						result[topIndices] = i - topIndices;
					}
				}
			}
			indices.push(i);

		}
		return result;
	}

}
