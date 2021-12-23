package feb;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElement {
	public static void main(String[] args)
	{
		int[] a = {3,2,1,5,6,4,3};
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		for(int i=0;i<a.length;i++)
		{
			q.offer(a[i]);
////			if(q.size()>3)
//				{System.out.println(q);
//				q.poll();
//				}
			
		}
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
	}

}
