package May;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Node
{
	int val;
	int index;
	Node(int val,int index)
	{
		this.val=val;
		this.index=index;		
	}
}
public class SlidingWindowMaximum {
	
	public static void main(String[] args)
	{
		//[1,3,-1,-3,5,3,6,7], k = 3
		int [] nums= {1,3,-1,-3,5,3,6,7};
		int k = 3;
		System.out.println(Arrays.toString(maxSlidingWindow(nums,k)));
	}
	
	
	public static int[] maxSlidingWindow(int[] nums, int k) {
		int[] res = new int[nums.length-k+1];
		PriorityQueue<Node> q = new PriorityQueue<Node>(new Comparator<Node>() {
			
			@Override
			public int compare(Node a , Node b)
			{
				return b.val-a.val;
			}
		});
		for(int i=0;i<k;i++)
		{
			Node t = new Node(nums[i],i);
			q.offer(t);
		}
		res[0]=q.peek().val;
		int n=1;
		for(int i=k;i<nums.length;i++)
		{
			Node t = new Node(nums[i],i);
			q.offer(t);
			while(!q.isEmpty() && q.peek().index < i-(k-1))
			{
				q.poll();
			}
			res[n]=q.peek().val;
			n++;
			
		}
		return res;
		
	}

}
