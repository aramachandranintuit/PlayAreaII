package August;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Comparator;
public class LargestTripleProducts {
	public static void main(String[] args)
	{
		int [] a = {1, 2, 3, 4, 5};
		int [] res = new int[a.length];
		int k=3;
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		Arrays.fill(res, 1);
		res[0]=-1;
		res[1]=-1;
		int j=2;
		q.offer(a[0]);
		q.offer(a[1]);
		for(int i=k-1;i<a.length;i++)
		{
			q.offer(a[i]);
			
				int x =q.poll();
				int y= q.poll();
				int z = q.poll();
			
			res[j++]=x*y*z;
			q.offer(x);
			q.offer(y);
			q.offer(z);
		}
		System.out.println(Arrays.toString(res));
	}

}
