package april;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;


/*The problem is to find the connected components 
 * 
 * 
 */
public class ConnectedComputers {
	
	public static void main(String[] args)
	{
	
		int nodes =5;
		int[][] g  = {{1,2},{2,3},{3,4}};
		List<Integer>[] adj= new LinkedList[nodes+1];
		for(int i=1;i<adj.length;i++)
		{
			adj[i]=new LinkedList<Integer>();
		}
		for(int [] a : g)
		{
			adj[a[0]].add(a[1]);
			adj[a[1]].add(a[0]);
		}
		System.out.println(Arrays.toString(adj));
		boolean[] visited = new boolean[nodes+1];
		int ans=0;
		for(int i=1;i<=nodes;i++)
		{
			ans+=dfs(adj,visited,i);
		}
		System.out.println(ans-1);
	}
	
	public static int dfs(List<Integer>[] adjList,boolean[] visited,int node)
	{
		if(visited[node]) return 0;
		visited[node]=true;
		List<Integer> neighbours = adjList[node];
		for(int a:neighbours)
		{
			dfs(adjList,visited,a);
		}
		return 1;
		
	}

}
