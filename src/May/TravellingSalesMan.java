package May;

import java.util.ArrayList;
import java.util.List;

public class TravellingSalesMan {
	int min=Integer.MAX_VALUE;
	static List<List<Integer>> aList  = new ArrayList<List<Integer>>();
	public static void main(String[] args)
	{
		int[][] graph = {{0, 10, 15, 20},
                {10, 0, 35, 25},
                {15, 35, 0, 30},
                {20, 25, 30, 0}};
		boolean[] v = new boolean[4];
		v[0]=true;
		System.out.println(tsp(graph,0,4,v,0,1,Integer.MAX_VALUE,new ArrayList<Integer>()));
		for(List<Integer> ls : aList)
		{
			System.out.println(ls);
		}
	}
	
	public static int tsp(int[][] graph,int pos,int n,boolean[] visited,int cost,int count,int ans,List<Integer> list)
	{
		if(graph[pos][0]>0 && count==n)
		{
			ans = Math.min(ans, cost+graph[pos][0]);
			aList.add(new ArrayList<Integer>(list));
			return ans;
		}
		for(int i=0;i<n;i++)
		{
			if(visited[i]==false && graph[pos][i]>0)
			{
					visited[i]=true;
					list.add(i);
					ans=	tsp(graph,i,n,visited,cost+graph[pos][i],count+1,ans,list);
					visited[i]=false;
					list.remove(list.size()-1);
			}
		}
		return ans;
	}

}
