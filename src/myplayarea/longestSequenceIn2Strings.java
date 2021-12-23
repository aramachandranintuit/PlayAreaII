package myplayarea;

public class longestSequenceIn2Strings {
	
	public static void main(String[] args)
	{
		String str1 = "bella";
		String str2 = "label";
		
		System.out.println(new longestSequenceIn2Strings().LCS(str1.toCharArray(),str2.toCharArray(),str1.length(),str2.length()));
	}
	
	private int LCS(char[] a , char[] b ,int m ,int n)
	{
		if (m ==0 || n==0)
			return 0;
		if(a[m-1] == b[n-1])
		{
			System.out.println(a[m-1]);
			return 1 + LCS(a ,b ,m-1,n-1);
			
		}
		else
		{
			return Math.max( LCS(a ,b ,m,n-1), LCS(a ,b ,m-1,n));
		}
		
		
	}

}
