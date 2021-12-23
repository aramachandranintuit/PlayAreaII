package feb;

import java.util.Arrays;

public class HouseToRob {
	public static void main(String [] args)
	{
		int[] nums = {1,2,3,1};
		int[] dp = new int[nums.length];
		dp[0]=nums[0];
		dp[1] = Math.max(dp[0],dp[1]);
		for(int i=2;i<nums.length;i++)
		{
			dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
		}
		System.out.println(Arrays.toString(dp));
	}

}
