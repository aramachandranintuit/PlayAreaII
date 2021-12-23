package march;

public class GridPerimetre {
	
	public static void main(String[] args)
	{
		int[][] g = new int[1][2];
		g[0][0]=1;
		g[0][1]=1;
		System.out.println(islandPerimeter(g));
	}
	
	public static int islandPerimeter(int[][] grid) {
        
        int p=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    p=p+4;
                    if(i-1>=0 && grid[i-1][j]==1) p=p-1;
                    if(i+1<grid.length && grid[i+1][j]==1) p=p-1;
                    if(j+1<grid[i].length && grid[i][j+1]==1) p=p-1;
                    if(j-1>=0 && grid[i][j-1]==1) p=p-1;
                }
            }
//            System.out.println(p);
        }
       return p;                
    }

}
