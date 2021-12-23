package September;

import java.util.Arrays;

/*
 * 
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 * 
 * 
 */
public class BestTimeToBuyAndSellStock {
	
	public static void main(String[] args)
	{
		int[] p = {7,1,5,3,6,4};
//		int [] p = {7,6,4,3,1};
		BestTimeToBuyAndSellStock o = new BestTimeToBuyAndSellStock();
		System.out.println(o.maxProfit1_a(p));
//		System.out.println(o.maxProfit(p));
//		System.out.println(o.maxProfit1(p));
//		System.out.println(o.maxProfit2(p));
	}
	
	public int maxProfit(int[] prices) {
		
		int maxValue=Integer.MIN_VALUE;
		int maxProfit=0;
		int i=prices.length-1;
		while(i>0)
		{
			maxValue=Math.max(maxValue, prices[i]);
			maxProfit=Math.max(maxProfit,maxValue-prices[i-1]);
			i--;
		}
		return maxProfit;
	}
	
	public int maxProfit1(int[] prices)
	{
		int maxProfit=0;
		int minValue=prices[0];
		for(int i=1;i<prices.length;i++)
		{
			minValue=Math.min(minValue, prices[i-1]);
			maxProfit=Math.max(maxProfit, prices[i]-minValue);
			
		}
		return maxProfit;
	}
	
	public int maxProfit1_a(int[] prices)
	{
		if(prices.length==1)return 0;
		int buy = -prices[0];
		int sell=0;
		for(int i=0;i<prices.length;i++)
		{
			buy=Math.max(buy,sell-prices[i]);	
			sell = Math.max(sell, buy+prices[i]);
					
		}
		return sell;
	}
	
	
	 public int maxProfit2(int[] prices) {
	        int n = prices.length;
	        int[][] dp = new int[3][n];
	        int maxValue = Integer.MIN_VALUE;
	        dp[0][0]=0;
	        for(int k=1;k<=2;k++){
	        	maxValue = Integer.MIN_VALUE;
	            for(int i=1;i<n;i++){
	            	maxValue = Math.max(maxValue,dp[k-1][i-1]-prices[i-1]);    
	            	dp[k][i] = Math.max(dp[k][i-1],prices[i]+maxValue);	     
	            	
	            	    	                	         
	            }
	            System.out.println(Arrays.toString(dp[k]));
	        }
	        return dp[2][n-1];
	    }
	
	/*
	 * This approach involves solving subproblems from day 0 to day n-1 (0 based indexing) with considering a number of transaction happend. Each subproblem is represented asdp(i,j) where i reprsents transaction number and j represents the day of transaction (0 based).
Here dp(i,j) stores maximum profit till ith day with jth transaction.
Results of subproblem is based on following recurrence.

dp(i,j) = maximum { dp(i,j-1), price(i) - minValue }, where minValue = min { price[j] - dp(i-1,j-1}} 0<=j<i

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[3][n];
        int minValue = prices[0];
        dp[0][0]=0;
        for(int k=1;k<=2;k++){
            minValue = prices[0];
            for(int i=1;i<n;i++){
                dp[k][i] = Math.max(dp[k][i-1],prices[i]-minValue);

                minValue = Math.max(minValue,prices[i]-dp[k-1][i-1]);
            }
        }
        return dp[2][n-1];
    }
}
	 * 
	 */

}
