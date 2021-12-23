package Medium;

import java.util.ArrayList;
import java.util.List;

// return the common sub sequence instead of the lcs length
public class LCS {
	
	List<List<Character>> slist = new ArrayList<List<Character>>();
	public static void main(String[] args)
	{
		String s1="AGGTAB" ;
//				"abbcdgf";
		String s2="GXTXAYB";
		List<Character> list = new ArrayList<Character>();
		LCS ll = new LCS();
		String r = ll.LCS1(s1, s2, s1.length(),s2.length(),"");
		System.out.println(r);
//		System.out.println(ll.slist);
	}
	public  String LCS1(String s1,String s2,int m ,int n ,String c)
	{
		if(m==0 || n==0)
			return c;
		if(s1.charAt(m-1)==s2.charAt(n-1))
		{
			c+=s1.charAt(m-1);
			m--;
			n--;
			String str =LCS1(s1,s2,m,n,c);
			if(c!=null && str!=null && str.length() > c.length())
				return str;
			else if(c!=null && str!=null && str.length() < c.length())
				return c;			
		}
		else
		{
			String str1=LCS1(s1,s2,m-1,n,c);
			String str2=LCS1(s1,s2,m,n-1,c);
			if(str1!=null && str2!=null && str1.length() >=str2.length())
			{
				 c= str1;
			}
			if(str1!=null && str2!=null && str1.length() <str2.length())
			{
				 c= str2;
			}
		}
		return c;
	
	}

}
