package april;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 
 *  so the problem here is that we need to find out the last man standing in a game,
 *  say if there are 3 people , and if the interval is 2 , so everytime the count reaches 2 that person is eliminated .
 *  1-2-3 , after first round 2 is eliminated as interval=2 starting at 1.Next the count starts from 3 and 1 will be eliminated.
 *  so winner is 3
 */

public class CircularGame {
	
	public static void main(String[] args)
	{
		System.out.println(winner(5,2));
	}
	
	public static int winner(int n,int k)
	{
		Queue<Integer> q = new LinkedList();
		for(int i=1;i<=n;i++)
		{
			q.offer(i);
		}
		int r=0;
		while(q.size()>1)
		{
			r = k-1;
			while(r>0)
			{
				q.offer(q.poll());
				r--;
			}
			q.remove();
		}
		return q.remove();
	}
	

}
