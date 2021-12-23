package DS;

import java.util.Arrays;
/*
 * 
 * program to find the 2 smallest number in an array
 */

public class HeapSort {
	
	public static void main(String[] args)
	{
		int [] a = {12,25,3,56,21,4,9};
		HeapSort hs = new HeapSort();
		for(int i=(a.length/2)-1;i>=0;i--)
		{
			hs.heapify(a,a.length,i);
		}
		int count=0;
		int pre=-1;
//		for(int j=(a.length-1);j>=0;j--)
//		{
//			int temp  = a[j];
//			a[j]=a[0];
//			a[0]=temp;
//			System.out.println(Arrays.toString(a));
//			hs.heapify(a, j,0);
//		}
		
			System.out.println(Arrays.toString(a));
	}
	
	public void heapify(int[]a,int n,int i)
	{
		
			int largest =i;
			int left = 2*i+1;
			int right = 2*i+2;
			if(left < n && a[largest] < a[left])
			{
				largest =left;
			}
			if(right < n && a[largest] < a[right])
			{
				largest = right;
			}
			if(largest!=i)
			{
				int temp = a[largest];
				a[largest] =a[i];
				a[i]=temp;
				heapify(a,n,largest);
			}
		
	}

}
