package October.hStar;

import java.util.Arrays;

public class KlengthMaxSubArrays {
	public static void main(String[] args)
	{
		int [] a= { 1, 2,3,4,5,-6};
		int[] prefix = new int[a.length];
		prefix[0]=a[0];
		int k=2;
		for(int i=1;i<a.length;i++)
		{
			prefix[i]=prefix[i-1]+a[i];
		}
		int res=0;
		int start=0;
		int end=0;
		for(int i=0;i+k-1<prefix.length;i++)
		{
			if(prefix[i+k-1]-prefix[i]>res)
			{
				res = prefix[i+k-1]-prefix[i];
				start=i;
				end=i+k-1;
			}
			
		}
		System.out.println(Arrays.toString(Arrays.copyOfRange(a,start,end+1)));
//		System.out.println(Arrays.toString(a));
		
	}

}
