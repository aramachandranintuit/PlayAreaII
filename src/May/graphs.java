package May;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class graphs {
	
	static List<List<Integer>> res = new ArrayList<List<Integer>>();
	public static void main(String[] args)
	{
		int[][] graph = {{0, 10, 15, 20},
                {10, 0, 35, 25},
                {15, 35, 0, 30},
                {20, 25, 30, 0}};
			boolean[] v =  new boolean[4];
			v[0]=true;
//		System.out.println(trs(graph,0,1,4,0,Integer.MAX_VALUE,v));
			List<Integer> list = new ArrayList<Integer>();
			list.add(0);
		allPaths(graph,0,1,4, list);
		for(List<Integer> ls : res)
		{
			System.out.println(ls);
		}
	}
	/*
	 * 1.travelling sales man problem
	 * 2.hamiltonian cycle
	 * 3.number of paths from start to finish
	 * 4.Does a path exists from start to finish
	 * 
	 */
	
	// travelling sales man problem solved using back tracking.
	public static int trs(int[][] graph,int pos, int count,int vertices,int cost,int ans,boolean[] visited)
	{
		if(count==vertices && graph[pos][0]>0)
		{
			ans= Math.min(ans, cost+graph[pos][0]);
			return ans;
		}
		else 
		{
			for(int i=0;i<vertices;i++)
			{
				if(visited[i]!=true && graph[pos][i]>0)
				{
					visited[i]=true;
					ans=trs(graph,i,count+1,vertices,cost+graph[pos][i],ans,visited);
					visited[i]=false;			
				}
			}
		}
		return ans;
	}
	
	public static void allPaths(int[][]graph, int pos , int count , int v , List<Integer>list)
	{
		if(count== v && graph[pos][0]>0)
		{
			List<Integer> aList = new ArrayList<>(list);
			res.add(aList);
			return ;
			
		}
		for(int i=0;i<v;i++)
		{
			if(graph[pos][i]>0) 
			{
				if(!list.contains(i))
				{
					list.add(i);
					allPaths(graph,i,count+1,v,list);
					list.remove(list.size()-1);
				}
			}
		}
		return;
		
	}

}
