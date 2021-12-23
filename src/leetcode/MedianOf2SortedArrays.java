package leetcode;

import java.util.Arrays;

public class MedianOf2SortedArrays 
{
	
	public static void main(String[] args)
	{
		int[] a = {12,13,14,15,16};
		int[] b = {5,6,7,9,10};	
		System.out.println(new MedianOf2SortedArrays().getMedian(a,b));
	}
	
	private int getMedian(int[] arr1, int[] arr2) {
		
		int m1=0;
		int m2=0;
		int j=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(i==arr1.length-1)
			{
				m1=arr1[i];
				m2=arr2[0];
			}
			else if(j==arr1.length-1)
			{
				m1=arr2[j];
				m2=arr1[0];
			}
			else if(arr1[i] >= arr2[j])
			{
				m1=arr1[i];
				m2=m1;
				i++;
			}
			else
			{
				m1=arr2[j];
				m1=m2;
				j++;
			}
		}
		System.out.println(m1);
		System.out.println(m2);
		return (m1+m2)/2;
	}
	
	private int median(int[] arr)
	{
		if(arr.length %2 ==0)
		{
			return (arr[arr.length/2] + arr[arr.length/2 -1])/2;
		}
		else
		{
			return arr[arr.length/2];
		}
		
	}

}
