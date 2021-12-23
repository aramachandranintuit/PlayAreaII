package June;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 
 * Does path exist to the end of a matrix , 0 means path is path , 1 is obstruction
 */

class Node
{
	int row;
	int col;
	Node(int row,int col)
	{
		this.row=row;
		this.col=col;
	}
}
public class PathToEnd {
	
	public static void main(String[] args)
	{
		int[][] m = {{0,1,0},{0,0,1},{1,0,9}};
		doesPathExist(m);
	}
	
	public static void doesPathExist(int[][]m)
	{
		Queue<Node> q = new LinkedList<Node>();
		q.offer(new Node(0,0));
		int[][] r = {{0,1},{1,0}};
		while(!q.isEmpty())
		{
			Node temp = q.poll();
			for(int [] a :r)
			{				
				int nextRow = temp.row +a[0];
				int nextCol = temp.col +a[1];
				if(nextRow >= m.length || nextCol>=m[0].length) continue;
				if(m[nextRow][nextCol]==9) {
					System.out.println("path exists");
					return;
				}
				else if(m[nextRow][nextCol]==0)q.offer(new Node(nextRow,nextCol));
			}
		}
		System.out.println("path does not exist to the exit");
	}

}
