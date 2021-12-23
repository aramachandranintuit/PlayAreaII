package August;

import java.util.Arrays;

public class DoublePivotQuickSort {
	
	public static void main(String[] args)
	{
		int[] arr = { 24, 8, 42, 75, 29, 77, 38, 57 };
		dualPivotQuickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		Random r  = new Random();
	}
	
	public static void dualPivotQuickSort(int[] arr, int low ,int high)
	{
		if(low<high)
		{
			int[] pivot = DoublePivot(arr,low,high);
			dualPivotQuickSort(arr,low,pivot[0]-1);
			dualPivotQuickSort(arr,pivot[0]+1,pivot[1]-1);
			dualPivotQuickSort(arr,pivot[1]+1,high);
		}
	}
	
	public static int[] pivot(int[] arr, int low ,int high)
	{
		if(arr[low]>arr[high]) swap(arr,low,high);
		int p=low+1;
		int q= high-1;
		int k=low+1;
		int g = arr[low];
		int h=arr[high];
		while(k<=q)
		{
			if(arr[k]<g)
			{
				swap(arr,p,k);
				p++;
			}
			else if(arr[k]>=h)
			{
				while(arr[q]>h && k<q) q--;
				
				swap(arr,k,q); q--;
				
				if(arr[k]<g) {swap(arr,k,p) ;p++;}
			}
			k++;
		}
		p--;
		q++;
		swap(arr,low,p);
		swap(arr,high,q);
		return new int[] {p,q};
		
	}
	
	
	
	public static int[] DoublePivot(int[] arr,int low ,int high)
	{
		if(arr[low]>arr[high]) swap(arr,low,high);
		int p=low+1;
		int q=high-1;
		int k=low+1;
		int g=arr[low];
		int h=arr[high];
		while(k<=q)
		{
			if(arr[k]<g) {
				swap(arr,k,p);
				p++;
			}
			else if(arr[k]>=h)
			{
				while(arr[q]>h && k<q) q--;
				
				swap(arr,k,q);q--;
				
				if(arr[k]<g) {
					swap(arr,k,p);
					p++;
				}
			}
			k++;
		}
		p--;
		q++;
		swap(arr,low,p);
		swap(arr,high,q);
		return new int[] {p,q};
		
				
				
	}
	
	public static void swap(int [] arr,int index1,int index2)
	{
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		return;
	}

}
