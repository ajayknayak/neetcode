package org.ajay.neetcode.slidingwindow;

import java.util.Iterator;

/**
 * You are given an array prices where prices[i] is the price of a given stock
 * on the ith day.
 * 
 * You want to maximize your profit by choosing a single day to buy one stock
 * and choosing a different day in the future to sell that stock.
 * 
 * Return the maximum profit you can achieve from this transaction. If you
 * cannot achieve any profit, return 0.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: prices = [7,1,5,3,6,4] 
 * Output: 5 
 * Explanation: Buy on day 2 (price = 1)
 * and sell on day 5 (price = 6), profit = 6-1 = 5. Note that buying on day 2
 * and selling on day 1 is not allowed because you must buy before you sell.
 * 
 * 
 * Example 2:
 * Input: prices = [7,6,4,3,1] 
 * Output: 0 
 * Explanation: In this case, no transactions are done and the max profit = 0.
 * 
 * 
 * Constraints:
 * 
 * 1 <= prices.length <= 100000 0 <= prices[i] <= 10000
 * 
 * @author ajnayak
 *
 */
public class BuySellStockWindow {
	
    public int maxProfit(int[] prices) {
    	
    	if(null == prices) {
    		System.out.println("Input is  null");
    		return 0;
    	}
    	
    	if(1 > prices.length || prices.length > 100000) {
    		System.out.println("Input out of bound Exception");
    		return 0;
    	}
    	
    	int buyIndex = -1;
    	int buyPrice = 100001;
    	int maxProfit = 0;
    	
    	for(int i=0; i < prices.length; i++) {
    		if(0 > prices[i] || prices[i] > 10000) {
    			System.out.println("Invalid Price on day" + i);
    			maxProfit = 0;
    			break;
    		}
    		if(prices[i] < buyPrice && i > buyIndex) {
    			buyPrice = prices[i];
    			buyIndex = i;
    		}
    		if(prices[i] -  buyPrice > maxProfit && i > buyIndex) {
    			if(maxProfit < prices[i] - buyPrice) {
    				maxProfit = prices[i] - buyPrice;
    			}
    		}

    	}
    	
    	return maxProfit;
        
    }

}
