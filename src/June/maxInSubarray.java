package June;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class arrayNode
{
	int index;
	int value;
	arrayNode(int index,int value)
	{
		this.index=index;
		this.value=value;
	}
}
public class maxInSubarray {
	
	public static void main(String[] args)
	{
		int[] arr = {1,4,5,2,6,7,8,9,12};
		Comparator<arrayNode> cmp = new Comparator<arrayNode>() {
			
			@Override
			public int compare(arrayNode a , arrayNode b)
			{
				return b.value-a.value;
			}
		};
		PriorityQueue<arrayNode> q = new PriorityQueue<arrayNode>(cmp);
		int k=3;
		int[] output = new int[arr.length-k+1];
		for(int i=0;i<k;i++)
		{
			q.offer(new arrayNode(i,arr[i]));
		}
		output[0]=q.peek().value;
		int r=1;
		for(int i=k;i<arr.length;i++)
		{
			q.offer(new arrayNode(i,arr[i]));
			while(q.peek().value < arr[i] || q.peek().index<i-k+1)
			{
				q.poll();
			}
			output[r]=q.peek().value;
			r++;
			
		}
		System.out.println(Arrays.toString(output));
	}

}
