package September;

/*
 * the aim is to find the maximum sequence of increasing numbers.
 * 
 * 
 */
import java.util.LinkedList;
import java.util.Queue;

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
		if(cache[r][c]!=0) return cache[r][c];
		int max=1;
        Queue<int[]> q = new LinkedList<int[]>();
        q.offer(new int[] {r,c});
        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
        while(!q.isEmpty())
        {
        		int[] t = q.poll();
        		for(int[] a: dir)
        		{
        			int nextRow = t[0]+a[0];
        			int nextCol = t[1]+a[1];
        			if(nextRow >= m.length || nextCol >= m[0].length || nextRow <0 || nextCol <0) continue;
        			if(m[nextRow][nextCol] > m[r][c])
        			{
        				max = Math.max(max,1+ allCombinations(m,nextRow,nextCol,cache));
        			}        			        		
        		}
        		cache[r][c]=max;        		
        }
        return cache[r][c];
       
    }

}
