package Graphs;
/*
 * given a 2d matrix find the shortest distance to a 1 from a 0
 * 
 * 
 */
import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistanceTo1 {
	
	public static void main(String[] args)
	{
		int[][]m= {{0,1,1},{0,1,1},{0,1,1}};
		int[][] dist = new int[m.length][m.length];
		Queue<BFSNode> q  = new LinkedList();
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m.length;j++)
			{
				if(m[i][j]==0) {
					dist[i][j]=0;
					q.add(new BFSNode(i,j,0));
				}
				else
				{
					dist[i][j]=Integer.MAX_VALUE;
				}
			}
		}
		
		int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
		while(!q.isEmpty())
		{
			BFSNode n = q.poll();
			for(int[] a : dir)
			{
				int nextRow = n.row + a[0];
				int nextCol = n.col + a[1];
				if(nextRow <0 || nextCol <0) continue;
				if(nextRow >=dist.length || nextCol >=dist.length) continue;
				if(dist[nextRow][nextCol] > dist[n.row][n.col]) 
					{
						dist[nextRow][nextCol] = dist[n.row][n.col]+1;
						q.offer(new BFSNode(nextRow,nextCol,dist[nextRow][nextCol]));
					}
			}
		}
		
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m.length;j++)
			{
				System.out.print(dist[i][j]);
				System.out.print("\t");
			}			
			System.out.println("\n");
		}


	}

}
