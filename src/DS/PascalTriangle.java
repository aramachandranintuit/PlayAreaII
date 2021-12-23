package DS;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	
	public static void main(String[] args)
	{
		int[][] a = new int[3][3];
		a[0][0]=1;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(j==0 || i==j)
					a[i][j]=1;	
				else if(i!=0)
					a[i][j]=a[i-1][j-1] + a[i-1][j];
				System.out.print(a[i][j]);
			}
			System.out.println(" ");
		}
				
		
	}
	
	private void TransposeMatrix()
	{
		int [][] a = {{1, 2},{3, 4}};
		int n =2;
		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>=0;j--)
			{
				System.out.print(a[j][i] + " ");
			}
			System.out.println("\n");
		}
	}

//	private void pascalTriangle(int i)
//	{
//		if(i<=1)
//			return 1;
//
//	}
	
	
}
