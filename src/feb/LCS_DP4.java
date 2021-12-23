		package feb;

import java.math.BigInteger;

public class LCS_DP4 {
	
	public static void main(String[] args)
	{
		BigInteger b = new BigInteger("111");
		
		String s1 = "AGGTAB"; 
	    String s2 = "GXTXAYB";
	    int[][] a = new int[s1.length()+1][s2.length()+1];
	    for(int i=0;i<s1.length()+1;i++)
	    {
	    		for(int j=0;j<s2.length()+1;j++)
	    		{
	    			if(i==0||j==0)
	    			{
	    				a[0][0]=0;
	    			}
	    			else
	    			{
	    				if(s1.charAt(i-1)==s2.charAt(j-1))
	    				{
	    					a[i][j]=1+a[i-1][j-1];
	    				}
	    				else
	    				{
	    					a[i][j] = Math.max(a[i-1][j], a[i][j-1]);
	    				}
	    			}
	    		}
	    }
	    System.out.println(a[s1.length()][s2.length()]);
	    for(int i=0;i<s1.length()+1;i++)
	    {
	    		for(int j=0;j<s2.length()+1;j++)
	    		{
	    			System.out.print(a[i][j]);
	    			System.out.print("\t");
	    		}
    			System.out.println();
	    }
	}

}
