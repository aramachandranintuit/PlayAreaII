package mock;

import java.util.Arrays;

public class maxProfit {
	
	public static void main(String[] args)
	{
		int[] a = {7,1,5,3,6,4};
		int[] b = Arrays.copyOfRange(a,0,a.length);
		Arrays.sort(b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		int max=0;
		int sum=0;
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(indexOf(b[j],a) > indexOf(b[i],a))
				{
					max = Math.max(max,b[j] -b[i]);

				}
			}
			sum+=max;
		}
		System.out.println(max);
		
	}
	
	private static int indexOf(int n,int[]nums)
	{
		for(int i=0;i<nums.length;i++)
		{
			if(n==nums[i])
				return i;
		}
		return -1;
	}

}
