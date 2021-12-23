package December;

import java.util.ArrayList;
import java.util.List;

public class ConnectedComputers {
	
	public static void main(String[] args)
	{
		int nodes=5;
		int[][] c = {{1,2},{1,3},{2,3}};
		getExtraEdges(nodes,c);
		
	}
	
	public static void getExtraEdges(int nodes , int[][] edges)
	{
		if(nodes < edges.length)
			System.out.println("cannot be connected");
		List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for(int i=1;i<=nodes;i++)
		{
			list.add(new ArrayList<Integer>());
		}
		for(int[] c : edges)
		{
			if(list.get(c[0])!=null)
				list.get(c[0]).add(c[1]);
			else if(list.get(c[0])==null)
				list.add(c[0], new ArrayList<Integer>());
			if(list.get(c[1])!=null)
				list.get(c[1]).add(c[0]);
			else if(list.get(c[1])==null)
				list.add(c[1], new ArrayList<Integer>());
		}
		boolean[] visited = new boolean[nodes];
		int op=0;
		for(int i=0;i<nodes;i++)
		{
			op+=DFSUtil(list,i,visited);
			System.out.println(i+" " + op);
		}
		System.out.println(op-1);
	}
	
	public static int DFSUtil(List<ArrayList<Integer>> list,int n,boolean[] visited)
	{
		if(visited[n]==true)
			return 0;
//		System.out.println(n+" is visited");
		visited[n]=true;
		for(int a: list.get(n))
		{
			if(!visited[a])
				DFSUtil(list,a,visited);
		}
		return 1;
	}
	
	

}
