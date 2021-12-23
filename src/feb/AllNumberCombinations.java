package feb;

import java.util.Arrays;

public class AllNumberCombinations {
	
	public static void main(String[] args)
	{
		printAllCombinations(new int[]{1,2,3,4},4);
	}
	
	public static void printAllCombinations(int[] a,int length)
	{
		if(length==0)
		{
			System.out.println(Arrays.toString(a));			
		}
		for(int i=0;i<length;i++)
		{
			printAllCombinations(a, length-1);
			if(length%2==0)
			{
				int temp =a[i];
				a[i]=a[length-1];
				a[length-1]=temp;
			}
			else
			{
				int temp =a[0];
				a[0]=a[length-1];
				a[length-1]=temp;
			}
		}
		
	}

}
