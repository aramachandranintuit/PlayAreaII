package leetcode;

public class DP1 {
	
	public static void main(String[] args)
	{
		DP1 dp = new DP1();
		System.out.println(dp.climbStairsDP(5));
	}
	
	public int climbStairs(int sum)
	{
		if(sum>=2)
		{
			return  climbStairs(sum-1) + climbStairs(sum-2);
		}
		else if(sum==1)
		{
			return  1;
		}
		else if(sum==2)
		{
			return 2;
		}
		return 0;
		
	}
	
	public int climbStairsDP(int sum)
	{
		int memo[] = new int[sum+1];
		memo[0]=0;
		memo[1]=1;
		memo[2]=2;
		for(int i=3;i<=sum;i++)
		{
			memo[i] = memo[i-1]+memo[i-2];		
		}
		return memo[sum];
		
	}

}
