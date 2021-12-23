package feb;

import java.util.*;

public class PriorityQueue1 {
	public static void main(String[] args)
	{
//		PriorityQueue<Integer> q = new  PriorityQueue<Integer>(
//				new Comparator<Integer>() {
//					
//					@Override
//					public int compare(Integer a,Integer b)
//					{
//						return b-a;
//					}
//
//				});
//		
		int[] a = {3,1,5,9,2,10};
		maxHeap(a,3);
//		for(int i=0;i<a.length;i++)
//		{
//			q.add(a[i]);
//		}
//		
//		while(!q.isEmpty())
//		{
//			System.out.println(q.poll());
//		}
	}



public static void maxHeap(int[] a,int k)
{	
	PriorityQueue<Integer> q = new PriorityQueue<Integer>();
	
	for(int i=0;i<k;i++)
	{
		q.add(a[i]);
	}
	for(int i=0;i<a.length;i++)
	{
		if(!q.isEmpty() && q.peek()>a[i])
		{
			q.poll();
			q.add(a[i]);
		}
//		else q.add(a[i]);
	}
	while(!q.isEmpty()) System.out.println(q.poll());
	
}

}
