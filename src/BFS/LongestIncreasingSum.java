package BFS;

import java.util.LinkedList;
import java.util.Queue;

/*
 * since this is a program to calculate the longest increasing sum , we have to use the weighted graph approach  ,
 * i.e use DFS.
 * 
 */
public class LongestIncreasingSum {
	
	public static void main(String[] args)
	{
		int[][]m= {{9,9,4},{6,6,8},{2,1,1}};
		int [][] cache  = new int[m.length][m[0].length];
		int max=1;
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[0].length;j++)
			{
				max = Math.max(max, allCombinations(m,i,j,cache));
			}
		}
		System.out.println(max);
	}
	
	public static int allCombinations(int[][]m ,int r,int c,int [][] cache)
    {
		if(cache[r][c]>0) return cache[r][c];
		int[][] dir = {{-1,0},{1,0},{0,1},{0,-1}};
		int max=1;
		for(int [] a : dir)
		{
			int nextRow = a[0]+r;
			int nextCol = a[1]+c;
			if(nextRow >= m.length || nextCol >= m[0].length) continue;
			if(nextRow <0 || nextCol <0) continue;
			if(m[r][c] < m[nextRow][nextCol])
			{
				max= Math.max(max,1+allCombinations(m,nextRow,nextCol,cache));
			}
			cache[r][c]=max;
		}
		return cache[r][c];
    }

}
