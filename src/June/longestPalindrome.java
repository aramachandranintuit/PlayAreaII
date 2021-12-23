package June;

public class longestPalindrome {
	public static void main(String[] args)
	{
		String str1 ="babad";
		String str2= new StringBuilder(str1).reverse().toString();
		System.out.println(lcs(str1,str2,str1.length(),str2.length(),new StringBuilder()));
	}
	
	public static String lcs(String str1,String str2,int m, int n ,StringBuilder ans)
	{
		if(m==0 || n==0)
			return ans.toString();
		if(str1.charAt(m-1)==str2.charAt(n-1))
		{
			ans.append(str1.charAt(m-1));
			m--;
			n--;
			lcs(str1,str2,m,n,ans);
		}
		else
		{
			String ans1 = lcs(str1,str2,m,n-1,new StringBuilder());
			String ans2 = lcs(str1,str2,m-1,n,new StringBuilder());
			if(ans1.length() >= ans2.length()) ans = new StringBuilder(ans1);
			else ans =new StringBuilder(ans2);
		}
		return ans.toString();
	}

}
