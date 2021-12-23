package June;

import java.util.Arrays;

public class djikStrasAlgo {
	public static void main(String[] args)
	{
		int m[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
            { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
            { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
            { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
            { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
            { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
            { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
            { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
            { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
            
            djikStrasAlgo o = new djikStrasAlgo();
            o.getShortestPath(m, 0, 9);
	}
	
	public void getShortestPath(int[][] m , int src,int V)	
	{
		int [] dist = new int[V];
		boolean[] visited = new boolean[V];
		for(int i=0;i<V;i++)
		{
			dist[i]=Integer.MAX_VALUE;
			visited[i]=false;
		}
		dist[src]=0;
		for(int i=0;i<V-1;i++)
		{
			int u = getMinimumDistance(dist,visited);
			visited[u]=true;
			for(int v=0;v<V;v++)
			{
				if(!visited[v] && m[u][v]!=0 && dist[u] !=Integer.MAX_VALUE && dist[v] > dist[u]+m[u][v])
					dist[v]=dist[u]+m[u][v];
			}
		}
		
		System.out.println(Arrays.toString(dist));
	}
	
	public int getMinimumDistance(int[] dist,boolean[] visited)
	{
		int minDist =Integer.MAX_VALUE;
		int index=0;
		for(int i=0;i<dist.length;i++)
		{
			if(!visited[i] && minDist > dist[i])
			{
				minDist = dist[i];
				index=i;
			}
		}
		return index;
	}
	
	

}
