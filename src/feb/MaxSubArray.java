package feb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class MaxSubArray {
	public static void main(String[] args)
	{
		int[] a = {3,5,1,2,7,10};
		int k=3;
		HashMap m = new HashMap();
		List<Integer> list = new ArrayList<Integer>();
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		int i=0;
		for(;i<k;i++)
		{
			q.add(a[i]);
		}
		list.add(q.peek());
		q.remove(a[0]);
		for(;i<a.length;i++)
		{
			q.add(a[i]);
			list.add(q.peek());
			q.remove(a[i-k+1]);
		}
		System.out.println(list);	
	}
	
//	public static int getMaxIndex(int[] a,int start,int end)
//	{
//		int max=Integer.MIN_VALUE;
//		int index=-1;
//		for(int i=start;i<end;i++)
//		{
//			if(a[i]>max)
//			{
//				max=a[i];
//				index=i;
//			}
//		}
//		return index;
//	}

}
