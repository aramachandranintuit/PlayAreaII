package August;

import java.util.Arrays;

public class MaximumContiguousSubArray {
	
	public static void main(String[] args)
	{
		int[] a = {1,-3,2,3,-4};
		int sum=0;
		int maxSum=0;
		int[] post = new int[a.length+1];
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		post[0]=sum;
		for(int i=1;i<post.length;i++)
		{
			post[i]=post[i-1]-a[i-1];
		}
		System.out.println(Arrays.toString(post));
		for(int i=0;i<a.length;i++)
		{
			for(int j=a.length-1;j>=0;j--)
			{
				sum= Math.max(Math.abs(post[j]-post[i]), sum);
				if(maxSum<sum)maxSum=sum;
			}
		}
		System.out.println(maxSum);
	}
	
	public static int kadaneAlgo(int [] nums)
	{
		int res=0;
		int maxSum=0;
		for(int num:nums)
		{
			res=Math.max(res+num, 0);
			maxSum=Math.max(maxSum,res);
		}
		return maxSum;
	}

}
