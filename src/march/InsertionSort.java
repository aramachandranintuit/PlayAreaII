	package march;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args)
	{
		int[] a = {10,1,3,4,11,15,34};
		
		for(int i=1;i<a.length;i++)
		{
			int j=i-1;
			int p = a[i];
			while(j>=0 && p<a[j])
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=p;
			System.out.println(Arrays.toString(a));
		}
		System.out.println(Arrays.toString(a));
	}

}
