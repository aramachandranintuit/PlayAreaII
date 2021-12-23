package September;


/*
 * 
 * given a 2x2 matrix , we need to calculate the perimeter of an island ,each land segment is represented by 1.
 */
public class IslandPerimeter {
	
	public static void main(String[] args)
	{
		
	}
	
	public static int getPerimeter(int[][] grid)
	{
		int p=0;
		for(int i=0;i<grid.length;i++)
		{
			for(int j=0;j<grid[i].length;j++)
			{
				if(grid[i][j]==1)
				{
					p=p+4;
					if(i-1>=0 && grid[i-1][j]==1) p--;
					if(i+1<grid.length && grid[i+1][j]==1)p--;
					if(j-1 >=0 && grid[i][j-1]==1) p--;
					if(j+1 < grid[i].length && grid[i][j+1]==1) p--;					
				}
			}
		}
		return p;
	}

}
