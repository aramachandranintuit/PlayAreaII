package Graphs;

import java.util.LinkedList;
import java.util.Queue;

/*
 * given a 2d matrix , find the shortest escape route to the m[n][n] from m[0][0]
 * 
 * Note : Always use breadth first search for an unwieghted graph to 
 * 		  for wieghted graph use a depth first search 
 */
class BFSNode{
	int row;
	int col;
	int data;
	BFSNode(int row,int col,int data)
	{
		this.col=col;
		this.row=row;
		this.data=data;
	}
}
public class ShortestEscapeRoute {
	
	
	public static void main(String[] args)
	{
		int[][] m = {{0,1,0},
					{0,1,0},
					{0,0,99}};
		boolean[][] visited = new boolean[m.length][m.length];
		Queue<BFSNode> q = new LinkedList<BFSNode>();
		q.offer(new BFSNode(0,0,0));
		visited[0][0]=true;
		int[][] neighbours = {{0,1},{0,-1},{1,0},{-1,0}};		
		int count=0;
		while(!q.isEmpty())
		{
			BFSNode n = q.poll();
			count++;
			for(int[] a :neighbours)
			{
				int nextRow = n.row + a[0];
				int nextCol = n.col + a[1];
				if(nextRow <0 || nextCol<0 ) continue;
				if(nextRow >= m.length || nextCol >= m.length) continue;
				if(visited[nextRow][nextCol]) continue;
				visited[nextRow][nextCol]=true;
				if(m[nextRow][nextCol]==99) System.out.println("escaped with " + count + " steps");
				else if(m[nextRow][nextCol]==0)
				{
					q.add(new BFSNode(nextRow,nextCol,m[nextRow][nextCol]));
				}
			}
			
		}
		
	}

}
