package Graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RootingATree {
	
	public static void main(String[] args)
	{
		int[][] graph = {{1,3},{1,4},{1,0},{4,5},{4,8},{3,7},{3,6},{3,2},{6,9}};
		int nodes=9;
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for(int i=0;i<=nodes;i++)
		{
			list.add(new ArrayList<Integer>());
		}
		for(int[] a : graph)
		{
			List<Integer> newList = list.get(a[0]);
			if(newList==null) newList = new ArrayList<Integer>();
			newList.add(a[1]);
			newList = list.get(a[1]);
			if(newList==null) newList = new ArrayList<Integer>();
			newList.add(a[0]);						
		}
		for(List<Integer> nl: list)
		{
			System.out.println(nl);
		}
		Collections.sort(list,new Comparator<List<Integer>>()
				{
					@Override
					public int compare(List<Integer>a ,List<Integer>b)
					{
						return a.size() - b.size();
					}
			
			
				});
		for(List<Integer> nl: list)
		{
			System.out.println(nl);
		}
		
	}

}
