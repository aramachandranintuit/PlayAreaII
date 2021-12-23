package September;

/*
 * You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

You can either start from the step with index 0, or the step with index 1.

Return the minimum cost to reach the top of the floor.

 

Example 1:

Input: cost = [10,15,20]
Output: 15
Explanation: Cheapest is: start on cost[1], pay that cost, and go to the top.
Example 2:

Input: cost = [1,100,1,1,1,100,1,1,100,1]
Output: 6
Explanation: Cheapest is: start on cost[0], and only step on 1s, skipping cost[3].
 * 
 * 
 */
public class MinCostOfClimbingStairs {
	
	public static void main(String[] args)
	{
		int[] cost= {1,100,1,1,1,100,1,1,100,1};
		MinCostOfClimbingStairs o = new MinCostOfClimbingStairs();
		System.out.println(o.minCostClimbingStairs(cost));
	}
	
	public int minCostClimbingStairs(int[] cost) {
		int [] dp = new int[cost.length];
		dp[0]=cost[0];
		dp[1]=Math.min(cost[0],cost[1]);
		for(int i=2;i<cost.length;i++)
		{
			dp[i]=cost[i]+Math.min(dp[i-2],dp[i-1]);
		}
		return dp[cost.length-1];
	
	}

}
