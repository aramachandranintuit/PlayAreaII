package mock;

import java.util.Stack;

public class ReplaceChracters {
	public static void main(String[] args)
	{
		String str ="aaaaa";
		String p = "aa";
//		String[] a = str.split(p);
		Stack<String> s = new Stack<String>();
		for(int i=0;i<str.length() && str.indexOf(p)!=-1;i++)
		{
			int a = str.indexOf(p);
			str = str.substring(0,a) + "X"+str.substring(a+p.length(),str.length());
		}
		System.out.println(str);
		char[] c = str.toCharArray();
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)!=str.charAt(i+1))
			{
				str.charAt(i)=str.charAt(i+1);
			}
		}
	}
	

}
