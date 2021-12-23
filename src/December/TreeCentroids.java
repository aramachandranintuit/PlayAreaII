package December;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class TreeCentroids {

	public static void main(String[] args)
	{
		int[][] edges = {{3,0},{3,1},{3,2},{3,4},{5,4}};
		int n=6;
		Map<Integer,List<Integer>> map  = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			map.put(i,new ArrayList<>());
		}
		for(int [] a : edges)
		{
			map.get(a[0]).add(a[1]);
			map.get(a[1]).add(a[0]);
		}
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<n;i++)
		{
			if(map.get(i).size()==1) q.offer(i);
		}
		while(n>2)
		{
			int size = q.size();
			for(int i=0;i<size;i++)
			{
				int curr = q.poll();
				List<Integer> list = map.get(curr);
				int leafNeighbour = list.get(0);
				map.get(leafNeighbour).remove(new Integer(curr));
				if(map.get(leafNeighbour).size()==1) q.offer(leafNeighbour);
			}
			n-=size;
		}
		System.out.println(q);
	}
}
