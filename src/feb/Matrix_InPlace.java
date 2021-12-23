package feb;

import java.util.Arrays;

public class Matrix_InPlace {
	
	public static void main(String[] args)
	{
		int[][]a = {{1,2,3,11},
					{4,5,6,12},
					{7,8,9,13},
					{17,18,19,13}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i]=temp;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<=a.length/2;j++)
			{
				int temp = a[i][j];
				a[i][j]=a[i][a.length-1-j];
				a[i][a.length-1-j]=temp;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
	}

}
