package leetcode;

public class MaxSubArray {
	
	public static void main(String[] args)
	{
//		int[] a = {0,-1,2,-3,5,9,-5,10};
		int [] a = {4,-2, 3, -4, -5, -29}; 
//		System.out.println(getMaxSum(a,0,a.length-1));
		System.out.println(getMaximumSubArray(a));
	}
	
	
	public static int getMaximumSubArray(int[] a)
	{
		int sum=0;
		int maxSum=0;
		int start=0;
		int end=0;
		int m=0;
		for(int i=0;i<a.length;i++)
		{			
			if(a[i]>sum +a [i])
			{
				sum=a[i];
				m=i;
			}
			else if(a[i]>0)
			{
				sum=a[i]+sum;
			}
			if(maxSum<sum)
			{
				maxSum=sum;
				end=i;
				start=m;
				
			}
		}
		System.out.println("start  "+ start+ "  end  " +end);
		return maxSum;
	}
	
	public static int getMaxSum(int[] a, int l, int h)
	{
			if(l==h)
				return a[l];
			int m = (l+h)/2;
			return Math.max(Math.max(getMaxSum(a,l,m),getMaxSum(a,m+1,h)),getMaxCrossSum(a,l,m,h));
	}
	public static int getMaxCrossSum(int[] a , int l, int m , int h)
	{
		int leftSum=Integer.MIN_VALUE;
		int sum=0;
		for(int i=l;i<=m;i++)
		{
			sum= sum + a[i];
			if(sum>leftSum)
				leftSum=sum;
		}
		sum=0;
		int rightSum=Integer.MIN_VALUE;
		for(int i=m+1;i<=h;i++)
		{
			sum=sum+a[i];
			if(sum>rightSum)
				rightSum=sum;
		}
		return Math.max(leftSum+rightSum,Math.max(leftSum,rightSum));
	}

}
