package August;

import java.util.ArrayList;
import java.util.List;
public class TravellingSalesManProblem {
//	static int ans = Integer.MAX_VALUE;
	public static void main(String[] args)
	{
		int[][] graph = {{0, 10, 15, 20},
                {10, 0, 35, 25},
                {15, 35, 0, 30},
                {20, 25, 30, 0}};
		boolean[] v = new boolean[4];
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int ans = trs(graph,4,0,0,Integer.MAX_VALUE,0,list,new ArrayList<Integer>(),v);
		for(List<Integer> ls: list)
		{
			System.out.println(ls);
		}
		System.out.println(ans);
		
	}
	
	public static int trs(int[][] g,int n,int index,int count ,int ans,int score,List<List<Integer>> list, List<Integer> aList,boolean[] visited)
	{
		if(n==count && g[index][0]>0)
		{
			ans = Math.min(ans, score);
			list.add(new ArrayList<>(aList));
			return ans;
		}
		for(int i=0;i<n;i++)
		{
			if(!visited[i] && g[index][i]>0)
			{
				visited[i]=true;
				aList.add(i);
				ans=trs(g,n,i,count+1,ans,g[index][i]+score,list,aList,visited);
				visited[i]=false;
				aList.remove(aList.size()-1);
				
			}
		}
		return ans;
		
		
	}

}
