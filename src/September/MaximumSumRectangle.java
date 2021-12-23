package September;

public class MaximumSumRectangle {
	
	public static void main(String[] args)
	{
		int[][] matrix = new int[][] {{ 1, 2, -1, -4, -20 },
									{ -8, -3, 4, 2, 1 },
									{ 3, 8, 10, 1, 3 },
									{ -4, -1, 1, 7, -6 } };
		MaximumSumRectangle O = new MaximumSumRectangle();
		int ans = O.maximumRectangle(matrix);
		System.out.println(ans);
		
	}
	
	public int maximumRectangle(int[][] matrix)
	{
		int cols = matrix[0].length;
		int rows = matrix.length;
		int ans =0;
		for(int c1=0;c1<cols;c1++)
		{
			int[] rowSum = new int[rows]; 
			for(int c2=c1;c2<cols;c2++)
			{
				for(int i=0;i<rows;i++)
				{
					rowSum[i]+=matrix[i][c2];
				}
				ans=Math.max(ans, kadaneAlgo(rowSum));				
			}
		}
		return ans;
		
	}
	public int kadaneAlgo(int [] nums)
	{
		int max=0;
		int sum=0;
		for(int i=0;i<nums.length;i++)
		{
			sum=nums[i]+Math.max(sum, 0);
			max=Math.max(sum,max);
		}
		return max;
	}

}
