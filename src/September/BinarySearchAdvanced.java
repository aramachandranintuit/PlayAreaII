package September;

import java.util.Arrays;

/*
 * [1,2,3,1]
 * [1,2,1,3,5,6,4]
 */
public class BinarySearchAdvanced {
	public static void main(String[] args)
	{
		int[] a= {21,1,4,5,5,5,5,16,18,19,20};
		int [] b= {4,1,0,5,2,7};
		Arrays.binarySearch(a,1);
//		System.out.println(lowestInARotatedArray(a));
		Arrays.sort(b);
		System.out.println(a[getCeiling(b,3)]);
//		System.out.println(getOnePeakInAnUnSortedArray(b));
		
	}
	
	public static int getOnePeakInAnUnSortedArray(int[] a)
	{
		/*
		 * a peak is a number that is greater than its immediate neighbours.
		 * 
		 */
		int start=0;
		int end=a.length-1;
		int mid= start +(end-start)/2;		
		while(start<end)
		{
			if(a[mid]<a[mid+1]) start=mid+1;
			else if(a[mid]>a[mid+1]) end=mid;
			mid= start +(end-start)/2;
		}
		return a[start];
	}	
	public static int lowestInARotatedArray(int [] a)
	{
		if(a.length==1) return a[0];
		int start=0;
		int end=a.length-1;
		int mid= start+ (end-start)/2;
		while(start<end)
		{
			if(a[mid]<a[end])end=mid;
			else if(a[mid]>a[end]) start=mid+1;
			else end--;
			mid=start+(end-start)/2;
		}
		return a[start];
	}
	
	public static int getCeiling(int[] a,int target)
	{
		int left=0;
		int right=a.length-1;
		int mid =left +(right-left)/2;
		while(left<right)
		{
			if(a[mid]<target) left=mid+1;
			else if(a[mid]>target) right=mid-1;
			else return mid;
			mid=left +(right-left)/2;
		}
		return mid;
	}

}
