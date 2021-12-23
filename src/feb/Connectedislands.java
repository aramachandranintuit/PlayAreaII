package feb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Connectedislands {
	public static void main(String[] args)
	{
		int m[][] =   { { 1, 1, 0, 0, 0 },
                			{ 0, 1, 0, 0, 1 },
            				{ 1, 0, 0, 1, 1 },
            				{ 0, 0, 0, 0, 0 },
            				{ 1, 0, 1, 0, 1 } };
		boolean[][] visited = new boolean[m.length][m[0].length];
		int count=0;
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				if(!visited[i][j] && m[i][j]==1)
				{
						DFS(m,i,j,visited);
						count++;
				}
			}
		}
		System.out.println(count);
		
	}
	
	private static void DFS(int[][] m,int r , int c,boolean[][] visited)
	{
		int[][] dir = {{1,0},{-1,0},{0,1},{0,-1},{-1,-1},{1,1},{-1,1},{1,-1}};
		for(int i=0;i<dir.length;i++)
		{
			int newR = r + dir[i][0];
			int newC = c + dir[i][1];
			if(newR < 0|| newC <0 || newR >=m.length || newC >= m.length) continue;
			if(visited[newR][newC]) continue;
			if(m[newR][newC]!=1) continue;
			visited[newR][newC] =true;
			DFS(m,newR,newC,visited);
		}
	}

}
