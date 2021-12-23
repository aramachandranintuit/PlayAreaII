package August;

public class knapsack {
	
	public static void main(String[] args)
	{
		int[] profit= {0,160,100,120};
		int[] weight= {0,10,20,30};
		int W=40;
		int[][] res = new int[weight.length+1][W+1];
		for(int i=0;i<weight.length;i++)
		{
			for(int j=0;j<=W;j++)
			{
				if(i==0||j==0) res[i][j]=0;
				else if(weight[i]<=j) res[i][j]= Math.max(profit[i]+res[i-1][j-weight[i]], res[i-1][j]);
				else res[i][j]=res[i-1][j];
			}
		}
		System.out.println(res[weight.length-1][W]);
	}

}
