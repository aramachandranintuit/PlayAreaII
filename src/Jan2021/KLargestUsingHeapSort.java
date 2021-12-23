package Jan2021;

import java.util.Arrays;

public class KLargestUsingHeapSort {
	
	public static void main(String[] args)
	{
//		int[] a = {3, 4, 5, 9, 12, 21,2};
		int [] a= {21, 12, 5, 9, 4, 3, 2,11};
		for(int i=(a.length/2 -1);i>=0;i--)
		{
			heapify(a,a.length,i);
		}
		System.out.println(Arrays.toString(a));
		
		for(int i=a.length-1;i>=0;i--)
		{
			int temp = a[i];
			a[i]=a[0];
			a[0]=temp;
			heapify(a,i,0);
		}
		System.out.println(Arrays.toString(a));
	}
	
	public static void heapify(int[] a,int n,int i)
	{
		int largest = i;
		int r = 2*i+2;
		int l = 2*i+1;
		if(l<n && a[l] > a[largest] )
		{
			largest =l;
		}
		if(r<n && a[r] > a[largest])
		{
			largest = r;
		}
		if(i!=largest)
		{
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
			heapify(a,n,largest);
		}
	}

}
