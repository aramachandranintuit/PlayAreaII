package BFS;

import java.util.Arrays;

/*
 * count the number of unique elements in an array. in LogN
 * 
 */
public class CountNoOfUniqueElement {
	public static void main(String[] args)
	{
		int[] a = {1,1,1,1,1,1,1,1,1,1,1,1,1,4,15,16,17,17,17,17,18,18,18};
		int temp=0;
		System.out.println(a.length);
		int i=0;
		while(a[i]!=a[a.length-1])
		{
			i=(Arrays.binarySearch(a,i,(i+a.length)/2,a[i]+1));
			if(i<0)
			{
				i=~i;
				System.out.println(a[i]);
				temp++;
			}
			else 
			{
				temp++;
				i++;
			}
		}
		System.out.println(temp);
	}

}
