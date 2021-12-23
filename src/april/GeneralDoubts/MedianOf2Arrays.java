package april.GeneralDoubts;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MedianOf2Arrays {
	
	public static void main(String[] args)
	{
		int ar1[] = {-5, 3, 6, 12, 15};
        int ar2[] = {-12, -10, -6, -3, 4, 10};
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        int mIndex=0;
        mIndex =(ar1.length + ar2.length )/2+1;
        System.out.println(mIndex);
        for(int i=0;i<ar1.length;i++)
        {
        		q.offer(ar1[i]);
        		if(q.size()>mIndex) q.poll();
        }
        System.out.println(q);
        for(int i=0;i<ar2.length;i++)
        {
        		q.offer(ar2[i]);
        		if(q.size()>mIndex) q.poll();
        }
        System.out.println(q);
        if((ar1.length + ar2.length )%2!=0)System.out.println(q.poll());
        else 
        {
        		int m1 = q.poll();
        		int m2 =q.poll();
        		System.out.println((m1+m2)/2);
        }
        
        
	}

}
