package feb;

import java.util.TreeMap;

public class DeepestNestedSubString {
	
	public static void main(String[] args)
	{
		String str = "a{{{bc}}}sdef{{cd}";
		getSubString(str);
		
	}
	public static void getSubString(String str)
	{
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		int max=-1;
		int j=0;
		int i=0;
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='{')
			{
				j++;				
			}
			if(j > max) max =j;
			else if(str.charAt(i)=='}' && j>0) j-- ;
			else if(str.charAt(i)=='}' && j==0) {
				System.out.println("-1");
				return  ;
			}
			
		}
		if(i==str.length() && j!=0)
		{
		System.out.println("-1") ; 
		return;
		} 
		System.out.println(max);
	}

}
