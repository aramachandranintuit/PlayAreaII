package april;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

public class MergeIntervals {
	
	public static void main(String[] args)
	{
		int [][] a = {{1,3},{2,6},{8,10},{15,18}};
	
		Arrays.sort(a, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] a,int [] b)
			{
				return a[0]-b[0];
			}
		});
		
		Stack<int[]> stack = new Stack<int[]>();
		
		for(int i=0;i<a.length;i++)
		{
			if(stack.isEmpty())stack.push(a[i]);
			else
			{
				if(stack.peek()[1]>= a[i][0] && stack.peek()[1]<=a[i][1])
				{
					stack.peek()[1] =a[i][1];
				}
				else
				{
					stack.push(a[i]);
				}
			}
		}
		
	 while(!stack.isEmpty())
	 {
		 int[] c = stack.pop();
		 System.out.println( c[0] +" : " + c[1]);
	 }
	}

}
