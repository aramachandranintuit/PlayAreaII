package Medium;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityQueue {
	
	public static void main(String[] args)
	{
		int[] a = {3,1,4,12,9,8};
//		
//		for(int i=(a.length-1)/2;i>=4;i--)
//		{
//			heapify(a,a.length,i);
//		}
//		
//		for(int i=(a.length-1);i>=0;i--)
//		{
//			int temp =a[i];
//			a[i]=a[0];
//			a[0]=temp;
//			heapify(a,i,0);
//		}
//		System.out.println(Arrays.toString(a));
		
		klargestElement(a,3);
	}
	
	
	
	private static void klargestElement(int[] n,int k)
	{
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		
		
		for(int i=0;i<k;i++)
		{
			minHeap.add(n[i]);
		}
		for(int i=n.length-1;i>=0;i--)
		{
			if(minHeap.peek()>n[i])
			{
				continue;
			}
			else
			{
				minHeap.poll();
				minHeap.add(n[i]);
			}
		}
		Iterator<Integer> itr = minHeap.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	private static void heapify(int[] a,int length,int i)
	{
		int m = 2*i+1;
		int n=2*i+2;
		int largest=i;
		int r =a[i];
		if(m<a.length && a[m] <= r)
		{
			largest=m;
		}
		if(n<a.length && a[n] < r)
		{
			largest=n;
		}
		if(i!=largest)
		{
			int temp = a[i];
			a[i]=a[largest];
			a[largest]=temp;
			heapify(a,i,largest);
		}
	}

}
