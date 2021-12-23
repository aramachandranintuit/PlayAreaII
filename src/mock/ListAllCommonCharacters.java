package mock;

import java.util.ArrayList;
import java.util.List;

public class ListAllCommonCharacters {
	public static void main(String[] args) {
		String[] a = {"bella","label","roller"};
//		List<Character> list = new ArrayList<Character>();
//		int k =getCommonCharacters(a[0],a[1],a[0].length(),a[1].length(),list);
//		System.out.println(k);
//		System.out.println(list);
		int[][] list = new int[a.length][26];
		for(int i=0;i<a.length;i++)
		{
			String str = a[i];
			for(int j=0;j<str.length();j++)
			{
				list[i][str.charAt(j)-'a']++;
			}
		}
		
		List<String> strList = new ArrayList<String>();
		for(int j=0;j<26;j++)
		{
			int min =Integer.MAX_VALUE;
			for(int i=0;i<a.length;i++)
			{
				min = Math.min(min, list[i][j]);				
			}
			for(int h=0;h<min;h++)
			{
				strList.add(Character.toString((char)(j+97)));
			}
			
		}
		
		System.out.println(strList);
		
	}
	
	
	
	public static int getCommonCharacters(String a , String b,int m ,int n,List<Character> list)
	{
		if(m==0 || n==0)
			return 0;
		if(a.charAt(m-1)==b.charAt(n-1))
		{
			list.add(a.charAt(m-1));
		  return 1+getCommonCharacters(a,b,m-1,n-1,list);
		}
		else
		{
			return Math.max(getCommonCharacters(a,b,m-1,n,list),getCommonCharacters(a,b,m,n-1,list));
		}
		
		
	}

}
