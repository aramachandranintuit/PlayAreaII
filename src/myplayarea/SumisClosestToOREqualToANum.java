package myplayarea;

import java.util.Arrays;
import java.util.LinkedList;

public class SumisClosestToOREqualToANum {
	
	public static void main(String[] args)
	{
		int a ;
		int[] nos = {10,2,4,5,9};
		System.out.println(checkForSum(nos,9,0,nos.length-1));
	}
	
	private static boolean checkForSum(int [] nos,int sum,int leftIndex,int rightIndex)
	{
		Arrays.sort(nos);
		while(leftIndex < rightIndex)
		{
			int s = nos[leftIndex] +nos[rightIndex];
			if(s  == sum)
			{
				return true;
			}
			else if(s < sum )
			{
				leftIndex++;
			}
			else
			{
				rightIndex--;
			}
		}
		return false;
		 
	}

}
