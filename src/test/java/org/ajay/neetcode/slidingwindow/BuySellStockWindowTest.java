package org.ajay.neetcode.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BuySellStockWindowTest {
	
	@Test
    public void testMaxProfitWithValidInput() {
        BuySellStockWindow BuySellStockWindow = new BuySellStockWindow();
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(5, BuySellStockWindow.maxProfit(prices));
    }

    @Test
    public void testMaxProfitWithNoProfit() {
        BuySellStockWindow BuySellStockWindow = new BuySellStockWindow();
        int[] prices = {7, 6, 4, 3, 1};
        assertEquals(0, BuySellStockWindow.maxProfit(prices));
    }

    @Test
    public void testMaxProfitWithInvalidPrices() {
        BuySellStockWindow BuySellStockWindow = new BuySellStockWindow();
        int[] prices = {7, 10001, 5, 3, 6, 4};
        assertEquals(0, BuySellStockWindow.maxProfit(prices));
    }

    @Test
    public void testMaxProfitWithNullInput() {
        BuySellStockWindow BuySellStockWindow = new BuySellStockWindow();
        assertEquals(0, BuySellStockWindow.maxProfit(null));
    }

    @Test
    public void testMaxProfitWithSmallInputSize() {
        BuySellStockWindow BuySellStockWindow = new BuySellStockWindow();
        int[] prices = {5};
        assertEquals(0, BuySellStockWindow.maxProfit(prices));
    }

    @Test
    public void testMaxProfitWithLargeInputSize() {
        BuySellStockWindow BuySellStockWindow = new BuySellStockWindow();
        int[] prices = new int[100001];
        assertEquals(0, BuySellStockWindow.maxProfit(prices));
    }

}
