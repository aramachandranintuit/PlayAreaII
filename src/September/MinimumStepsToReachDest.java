package September;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumStepsToReachDest {
	
	public static void main(String[] args)
	{
		int[][] m = {{0,1,0},
				     {0,0,1},
				     {1,0,9}};
		MinimumStepsToReachDest o = new MinimumStepsToReachDest();
		int ans = o.minimumSteps(m);
		System.out.println(ans);
		
	}
	
	public int minimumSteps(int[][] m)
	{
		Queue<int[]> q = new LinkedList<int[]>();
		q.offer(new int[] {0,0,0});
		int[][] dir ={{0,1},{1,0}};
		while(!q.isEmpty())
		{
			int[] t = q.poll();
			for(int i=0;i<dir.length;i++)
			{
				 int nextRow = t[0]+dir[i][0];
				 int nextCol = t[1]+dir[i][1];
				 int dist = t[2];
				 if(nextRow >= m.length || nextCol >= m[0].length) continue;
				 if(m[nextRow][nextCol]==9) {
//					 System.out.println(dist+1);
					 return dist+1;
				 }
				 else if(m[nextRow][nextCol]!=1)q.offer(new int[] {nextRow,nextCol,dist+1});
			}
		}
		return Integer.MAX_VALUE;
	}

}
