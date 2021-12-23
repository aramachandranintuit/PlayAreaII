 package april;

public class UniquePaths {
	
	public static void main(String[] args)
	{
		int[][] a = {{0,0},{1,1},{0,0}};
		System.out.println(uniquePathsWithObstacles(a));
	}
	
	public static int uniquePathsWithObstacles(int[][] grid) {
        if(grid[0][0]==1) return 0;
        if(grid.length==1 && grid[0].length==1 && grid[0][0]==0) return 1;
        grid[0][0]=1;
        for(int i=1;i<grid[0].length;i++)
        {
            grid[0][i]= (grid[0][i]==0 && grid[0][i-1]==1 ? 1 :0);
        }
        for(int i=1;i<grid.length;i++)
        {
            grid[i][0]= (grid[i][0]==0 &&grid[i-1][0]==1 ? 1 :0);
            
        }

        for(int i=1;i<grid.length;i++)
        {
            for(int j=1;j<grid[i].length;j++)
            {
                if(grid[i][j]==0)
                {
                    grid[i][j]=grid[i-1][j]+grid[i][j-1];
                }
                else
                {
                    grid[i][j]=0;
                }
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }

}
