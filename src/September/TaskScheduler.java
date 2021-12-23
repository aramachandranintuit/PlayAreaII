package September;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class TaskScheduler {
	
	public static void main(String[] args)
	{
		char[] t = {'A','A','A','B','B','B'};
		int n=2;
		Map<Character,Integer> map = new TreeMap<Character,Integer>();
		for(int i=0;i<t.length;i++)
		{
			map.put(t[i],map.getOrDefault(t[i], 0)+1);			
		}
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>( new Comparator<Integer>() {
			
			@Override
			public int compare(Integer a,Integer b)
			{
				return b-a;
			}
		});
		queue.addAll(map.values());
		int res=0;
		while(!queue.isEmpty())
		{
			List<Integer> list =new ArrayList<Integer>();
			for(int i=0;i<=n;i++)
			{
				if(!queue.isEmpty())
				{
					list.add(queue.poll());
				}
				
			}
			
			for(int i=0;i<list.size();i++)
			{
				int temp =list.get(i);
				if(--temp>0)
				{
					queue.offer(temp);
				}
			}
			res =res + (queue.isEmpty() ? list.size() : n+1);
		}
		System.out.println(res);

	}
}
