package org.ajay.neetcode.stack;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class DailyTemperaturesTest {

	@Test
	public void testDailyTemperaturesWithValidInput() {
		DailyTemperatures dailyTemperatures = new DailyTemperatures();
		int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
		int[] result = dailyTemperatures.dailyTemperatures(temperatures);

		assertArrayEquals(new int[] { 1, 1, 4, 2, 1, 1, 0, 0 }, result);
	}

	@Test
	public void testDailyTemperaturesWithInvalidTemperature() {
		DailyTemperatures dailyTemperatures = new DailyTemperatures();
		int[] temperatures = { 73, 74, 105, 71, 69, 72, 76, 73 };
		int[] result = dailyTemperatures.dailyTemperatures(temperatures);

		assertArrayEquals(new int[temperatures.length], result);
	}

	@Test
	public void testDailyTemperaturesWithNullInput() {
		DailyTemperatures dailyTemperatures = new DailyTemperatures();
		int[] result = dailyTemperatures.dailyTemperatures(null);

		assertNull(result);
	}

	@Test
	public void testDailyTemperaturesWithOutOfRangeArray() {
		DailyTemperatures dailyTemperatures = new DailyTemperatures();
		int[] temperatures = new int[100001];
		int[] result = dailyTemperatures.dailyTemperatures(temperatures);

		assertArrayEquals(null, result);
	}

	@Test
	public void testDailyTemperaturesWithEmptyArray() {
		DailyTemperatures dailyTemperatures = new DailyTemperatures();
		int[] temperatures = {};
		int[] result = dailyTemperatures.dailyTemperatures(temperatures);

		assertArrayEquals(null, result);
	}

}
