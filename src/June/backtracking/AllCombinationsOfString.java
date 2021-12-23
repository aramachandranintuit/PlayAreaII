package June.backtracking;

import java.util.ArrayList;
import java.util.List;

/*
 * the approach here uses the 
 * 
 */
public class AllCombinationsOfString {
	
	public static void main(String[] args)
	{
		String str ="1234";
		List<List<Character>> list = new ArrayList<List<Character>>();
		boolean[] v = new boolean[str.length()];
//		getAllCombinations(new ArrayList<Character>(),v ,str,0,0,list);
		getAllCombinationsAlt(new ArrayList<Character>(),v ,str,0,0,list);
		for(List<Character> l : list)
		{
			System.out.println(l);
		}
		
//		getAllCombinations("",str,str.length());
		
	}
	
	
	
	
	public static void getAllCombinations(String prefix ,String str,int length)
	{
		if(prefix.length()==length)
		{
			System.out.println(prefix);
			return;
		}
		for(int i=0;i<str.length();i++)
		{
			getAllCombinations(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,str.length()),length);
		}
		
	}
	public static void getAllCombinations(List<Character> cList , boolean[] visited,String str,int count ,int index, List<List<Character>> list)
	{
		if(count == str.length())
		{
			list.add(new ArrayList<Character>(cList));
			return;
		}
		for (int i=0;i<str.length();i++)
		{
			
			if(visited[i]==false)
				{
					visited[i]=true;
					cList.add(str.charAt(i));
					getAllCombinations(cList,visited,str,count+1,i+1,list);
					cList.remove(cList.size()-1);
					visited[i]=false;
				}
		}
	}
	
	
	public static void getAllCombinationsAlt(List<Character> cList , boolean[] visited,String str,int count ,int index, List<List<Character>> list)
	{
		if(count == str.length())
		{
			list.add(new ArrayList<Character>(cList));
			return;
		}
		for (int i=index;i<str.length();i++)
		{
			
			if(visited[i]==false)
				{
					visited[i]=true;
					cList.add(str.charAt(i));
					getAllCombinations(cList,visited,str,count+1,i+1,list);
					cList.remove(cList.size()-1);
					visited[i]=false;
				}
		}
	}

}
