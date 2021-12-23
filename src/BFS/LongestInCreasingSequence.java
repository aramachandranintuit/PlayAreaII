package BFS;

import java.util.Arrays;
import java.util.Stack;

public class LongestInCreasingSequence {
	
	public static void main(String[] args)
	{
		int[] nums = {10,10,10,10,9,2,5,3,7,101,18};
		int len=0;
		int [] d= new int[nums.length];
		for(int num:nums)
		{
			int i=Arrays.binarySearch(d,0,len,num);
			System.out.println(~i);
			System.out.println("len "+len);
			if(i<0)
			{
				i=~i;
				if(i==len)
				{
					d[i]=num;
					len++;
				}
				else d[i]=num;
			}	
			System.out.println(Arrays.toString(d));
		}
		
		System.out.println(len);
	}

}
