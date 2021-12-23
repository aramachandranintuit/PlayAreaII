package August;

public class inPlaceRotateMatrix {
	public static void main(String[] args)
	{
		int[][] m= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				System.out.print(m[i][j]);
				System.out.print(" ");
			}
			System.out.println("\n");
		}
		
		System.out.println("=================================================");
		
		
		for(int i=0;i<m.length;i++)
		{
			for(int j=i;j<m[i].length;j++)
			{
				int temp = m[i][j];
				m[i][j] = m[j][i];
				m[j][i]=temp;
			}
		}
		
		
		
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length/2;j++)
			{
				int temp=m[i][j];
				m[i][j]=m[i][m[i].length-1-j];
				m[i][m[i].length-1-j]=temp;
			}
		}
		
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				System.out.print(m[i][j]);
				System.out.print(" ");
			}
			System.out.println("\n");
		}
	}

}
