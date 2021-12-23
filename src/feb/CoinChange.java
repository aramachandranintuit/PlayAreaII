package feb;

import java.util.Arrays;

public class CoinChange {
	
	public static void main(String[] args)
	{
		int [] a = {1,2,3};
		int n=4;
		changeCount(a,3,4);
	}
	
	public static void changeCount(int[]a ,int m, int n)
	{
		int [] table = new int[n+1];
		table[0]=1;
		for(int i=0;i<m;i++)
		{
			for(int j=a[i];j<=n;j++)
			{
				table[j]+=table[j-a[i]];
				System.out.print("table["+j+"]"+ table[j]);
				System.out.print(" ");
			}
			System.out.println("\n");
		}
		System.out.println(Arrays.toString(table));
		
	}

}
