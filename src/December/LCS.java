
package December;

import java.util.ArrayList;
import java.util.List;

public class LCS {
	public static void main(String[] args)
	{
		String str1="alex";
		String str2="aaleex";
		List<Character> list = new ArrayList<Character>();
		System.out.println(new LCS().lcs(str1,str2,str1.length(),str2.length(),list));
		System.out.println(list);
		
	}
	private int lcs(String a,String b , int m , int n,List<Character> list)
	{
		if(m==0 || n==0)
		{
			return 0;
		}
		if(a.charAt(m-1)==b.charAt(n-1))
		{
			list.add(a.charAt(m-1));
			return 1+lcs(a,b,m-1,n-1,list);
		}
		else
			return Math.max(lcs(a,b,m,n-1,list),lcs(a,b,m-1,n,list));
	}

}
