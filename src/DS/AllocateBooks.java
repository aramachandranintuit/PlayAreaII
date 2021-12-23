package DS;

import java.util.Arrays;

public class AllocateBooks {
	
	public static void main(String[] args)
	{
		int[] a = {12, 34, 67, 90};
		int b= 2;
		int total = 0;
		int min_pages=Integer.MAX_VALUE;
		int maximumArrayElementsInPart= a.length - (b-1);
		System.out.println(maxPages(a , maximumArrayElementsInPart));
		
	}
	
	private static  int maxPages(int[] a,int limit )
	{
		int minPages = Integer.MAX_VALUE;
		int total=0;
		for(int i=0;i<a.length-limit;i++)
		{
			total = sum(Arrays.copyOfRange(a,i,i+limit));
			minPages =  total < minPages ? total : minPages; 
		}
		
		return minPages;
		
		
	}
	
	private static int sum(int[ ] a)
	{
		int total=0;
		for(int i=0;i<a.length;i++)
		{
			total+=a[i];
		}
		return total;
	}
}
