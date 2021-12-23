package August;

import java.util.Arrays;
import java.util.Stack;

public class CountAllSubArrays {
	
	/*
	 * counting all sub arrays such that
	 * The value at index i must be the maximum element in the contiguous subarrays, and
		These contiguous subarrays must either start from or end with. 
	 */
	
	public static void main(String[] args)
	{
		int[] a = {3, 4, 1, 6, 2};
//		System.out.println(Arrays.toString(countAllSubArrays(a)));
//		[1, 3, 1, 5, 1]
		countSubArrays(a);
	}
	
	public static int[] countAllSubArrays(int[] a)
	{
		int[] res= new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			res[i]=1;
		}

		for(int i=0;i<a.length;i++)
		{
			int current=a[i];
			int left=i-1;
			int right=i+1;
			while(left>=0 && current>a[left])
			{
				res[i]++;
				left--;
			}
			while(right<a.length && current> a[right])
			{
				res[i]++;
				right++;
			}
		}
		return res;
		
	}
	
	public   static void countSubArrays(int[] a)
	{
		int[] res=new int[a.length];
		Stack<Integer> stack = new Stack<Integer>();
		int left=0;
		for(int i=0;i<a.length;i++)
		{

			while(!stack.isEmpty() && a[i]>a[stack.peek()])
			{
				int index= stack.pop();
				res[index]=i-index;
			}			 
				stack.push(i);
				
		}
		while(!stack.isEmpty())
		{
			int index = stack.pop();
			res[index]+= a.length -index; 
		}
		for(int i=a.length-1;i>=0;i--)
		{
			res[i]--;
			while(!stack.isEmpty() && a[i]>a[stack.peek()])
			{
				int index= stack.pop();
				res[index]+=index-i;
			}			 
				stack.push(i);			
		}
		
		while(!stack.isEmpty())
		{
			int index = stack.pop();
			res[index]+= index+1; 
		}
		System.out.println(Arrays.toString(res));
		
		
	}

}
