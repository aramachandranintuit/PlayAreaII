package BFS;

import java.util.Arrays;

public class TotalNumberOfBinarySearchTrees {
	
	public static void main(String[] args)
	{
		int n=4;
		int[]dp=new int[20];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        dp[3]=5;
//        if(n<=3) return dp[n];
        for(int i=3;i<=n;i++)
        {
            int r=0;
            for(int j=1;j<=i;j++)
            {
                r = r + (dp[j-1] * dp[i-j]);
                System.out.println(r);
            }
            dp[i]=r;
            System.out.println("dp[" + i+ "]" + dp[i]);
        }
        System.out.println(Arrays.toString(dp));
        
	}

}
