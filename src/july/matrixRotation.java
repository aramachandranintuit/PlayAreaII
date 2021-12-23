package july;

import java.util.Arrays;

public class matrixRotation {
	public static void main(String[] args)
	{
		int m[][] = {{7,4,1},{8,5,2},{9,6,3}};
//		int target[][] = new int[m.length][m[0].length];
		for(int i=0;i<m.length;i++)
		{
			System.out.println("Before -- >  "+ Arrays.toString(m[i]));
		}
		for(int i=0;i<m.length;i++)
		{
			
			for(int j=i;j<m[i].length;j++)
			{
				int temp = m[i][j];
				m[i][j]=m[j][i];
				m[j][i]=temp;
			}
			System.out.println("after --  > " + Arrays.toString(m[i]));
		}
		
		for(int i=0;i<m.length;i++)
		{			
			for(int j=0;j<m[i].length/2;j++)
			{
				int temp = m[i][j];
				m[i][j]=m[i][m[i].length-1-j];
				m[i][m[i].length-1-j]=temp;
				
			}
			System.out.println("after --  > " + Arrays.toString(m[i]));
		}
		
	}

}
