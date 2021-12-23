package August;

import java.util.Arrays;

/*
 * in the below problem , we are trying to find the indices of all the start and end of all contiguous sub arrays whose sum is even
 */
public class ContiguousSubArrays {
	public static void main(String[] args)
	{
		int[] arr = {10, 4, 1, 6, 2};
		int[] post = new int[arr.length+1];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		post[0]=sum;
		for(int i=1;i<post.length;i++)
		{
			post[i]=post[i-1]-arr[i-1];
		}
		for(int i=0;i<post.length;i++)
		{
			for(int j=post.length-1;j>=0;j--)
			{
				if((post[i]-post[j])%2==0)
				{
						System.out.println("start "+i+" end "+(j-1));
				}
			}
		}
		System.out.println(Arrays.toString(post));
		
	}

}
