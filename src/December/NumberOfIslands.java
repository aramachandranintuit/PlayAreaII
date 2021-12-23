package December;

public class NumberOfIslands {
	
	public static void main(String[] args)
	{
		int[][] m = {{1,1,1,1,0},
					{1,1,0,1,0},
					{1,1,0,0,0},
					{0,0,0,0,0}};
		
		boolean[][] visited = new boolean[m.length][m[0].length];
		int res=0;
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[0].length;j++)
			{
				System.out.println(visited[i][j]);
				if(!visited[i][j] && m[i][j]==1) 
					res+=dfs(m,visited,i,j);
			}
			System.out.println(res);
		}
	}

	public static int dfs(int[][]m,boolean[][] visited,int r,int c)
	{
		if(visited[r][c]) return 0;
		visited[r][c]=true;
		int[][] dir = {{0,-1},{0,1},{1,0},{-1,0}};
		for(int [] a : dir)
		{
			int nextRow = r + a[0];
			int nextCol = c +a[1];
			if(nextRow <0 || nextRow >= m.length || nextCol <0 || nextCol >= m[0].length) continue;
			if(!visited[nextRow][nextCol] && m[nextRow][nextCol]==1) dfs(m,visited,nextRow,nextCol);
		}
		return 1;
	}
}
