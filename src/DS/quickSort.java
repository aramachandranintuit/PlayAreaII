package DS;

import java.util.Arrays;

public class quickSort {
	
	public static void main(String[] args)
	{
		int[] a = {6,10,3,1,2,-1};
		int x =partition(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}
	
	private static int partition(int[] a,int startIndex,int endIndex)
	{
		int mid= (endIndex-startIndex)/2;
		int x =a[mid];
		int j=startIndex,k=endIndex;
		while(j<mid && k>mid)
		{
			if(a[j]<=x)
			{
				j++;	
			}
			else if(a[k] > x)
			{
				k--;
			}
			if( j < k)
			{
				int temp =a[j];
				a[j] =a [k];
				a[k] = temp;												
			}
			
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
		return mid+1;
	}

}
