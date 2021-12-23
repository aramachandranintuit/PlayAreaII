package september2020;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class largestTimeFromDigits {
	static int max=Integer.MIN_VALUE;
	static TreeSet<Integer> set = new TreeSet<Integer>();
	
	public static void main(String[] args)
	{
		int[] arr = {2,3,4,1};
		String str ="as";
		
		
		set = permutations(arr,arr.length,max);
		System.out.println(set.last());
//		getInt(arr);
	}
	
//	public static String largestTimeFromDigits(int []arr)
//	{
//		Arrays.sort(arr);
//		
//	}
	
	public static TreeSet<Integer> permutations(int[] arr,int size,int max)
	{
		if(size==1)
		{
			if( ((arr[0] == 2 && arr[1] <=3) || (arr[0]<2 && arr[1] <=9)) && (arr[2]<=5 && arr[3]<=9))
			{
				max = Math.max(max,getInt(arr));
				set.add(max);
				return set;
			}
			
				
		}
		for(int i=0;i<size;i++)
		{
			permutations(arr,size-1,max);
			if(size%2==0)
			{
				int temp =arr[0];
				arr[0] =arr[size-1];
				arr[size-1]=temp;
			}
			else
			{
				int temp =arr[i];
				arr[i]=arr[size-1];
				arr[size-1]=temp;
			}
			
		}
		return set;
	}
	
	public static int getInt(int[] arr)
	{
		int integer=0;
		for(int i=0;i<arr.length;i++)
		{
			integer= (int) (integer+ arr[i]*Math.pow(10, arr.length-1-i));
		}
		return integer;
	}
	
}
