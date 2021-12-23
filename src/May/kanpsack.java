package May;

public class kanpsack {
	public static void main(String[] args)
	{
		int[] profit= {0,60,100,120};
		int[] weight= {0,10,20,30};
		int W=50;
		int[][] table= new int[weight.length+1][W+1];
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=W;j++)
			{
				if(i==0||j==0) table[i][j]=0;
				else if(weight[i]<=j){
						table[i][j]=Math.max(profit[i]+table[i-1][j-weight[i]], table[i-1][j]);
				}
				else
				{
					table[i][j]=table[i-1][j];
				}
			}
		}
		System.out.println(table[3][W]);
		
		for(int i=0;i<table.length;i++)
		{
			for(int j=0;j<table[0].length;j++)
			{
				System.out.print(table[i][j]);
				System.out.print("\t");
			}
			System.out.println("");
		}
	}

}
