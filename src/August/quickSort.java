package August;

import java.util.Arrays;

public class quickSort {
	
	public static void main(String[] args)
	{
		int a[]= {3,2,4,5,1,6,3};
		quickSort qs = new quickSort();
		qs.quicksort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}
	
	public void quicksort(int[] a,int low ,int high)
	{
		if(high>low)
		{
			int pivot = partition(a,low,high);
			quicksort(a,low,pivot-1);
			quicksort(a,pivot+1,high);		
		}
		
	}
	
	public int partition(int[] a,int low,int high)
	{
		int i=low-1;
		int pivot =a[high];
		for(int j=low;j<high;j++)
		{
			if(a[j]<=pivot)
			{
				i++;
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp =a[i+1];
		a[i+1]=a[high];
		a[high]=temp;
		return i+1;
	}
	
}
