package June;

import java.util.ArrayList;
import java.util.List;

public class TravellingSalesMan {
	
	static List<List<Integer>> alist = new ArrayList<List<Integer>>();
	public static void main(String[] args)
	{
		int[][] graph = {{0, 10, 15, 20},
                {10, 0, 35, 25},
                {15, 35, 0, 30},
                {20, 25, 30, 0}};
		
		boolean[] v = new boolean[graph.length];
		v[0]=true;
		int an =travellingSalesManAlgo(graph,4,v,0,0,1,Integer.MAX_VALUE,new ArrayList<Integer>());
		System.out.println(an);
		for(List<Integer> ans :alist)
		{
			System.out.println(ans);
		}
		
	}

	public static int travellingSalesManAlgo(int[][] graph,int n,boolean[]visited,int cost,int index,int count,int ans,List<Integer> list)
	{
		if(count==n && graph[index][0]>0)
		{
			ans = Math.min(cost+graph[index][0], ans);
			alist.add(new ArrayList<>(list));			
			return ans;
		}
		for(int i=0;i<n;i++)
		{
			if(visited[i]==false && graph[index][i]>0)
			{
				visited[i]=true;
				list.add(i);
				ans = travellingSalesManAlgo(graph,n,visited,cost+graph[index][i],i,count+1,ans,list);
				visited[i]=false;
				list.remove(list.size()-1);
				
			}
		}
		return ans;
	}
}
