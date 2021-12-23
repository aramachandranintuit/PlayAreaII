package October;

import java.util.HashMap;

public class subarray_with_equal_0_1s {
	
	public static void main(String[] args)
	{
		int[] a = { 1, 0, 0, 1, 0, 1, 1 };
		int sum=0;
		int maxLength=0;
		HashMap<Integer,Integer> map = new HashMap<>();
		int endingIndex=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)a[i]=-1;
		}
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			if(sum==0)
			{
				maxLength = i+1;
				endingIndex=i;
			}
			if(map.containsKey(sum))
			{
				maxLength  = maxLength > i - map.get(sum) ?  i - map.get(sum) : maxLength;
				endingIndex=i;
			}
			else map.put(sum,i);
		}
		
	}

}
