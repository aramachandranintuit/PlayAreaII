package september2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class ConcatenatedWords {
	
	public static void main(String[] args)
	{
		String[] s = {"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"};
		TreeMap<Integer,ArrayList<String>> map = new TreeMap<Integer,ArrayList<String>>();
		for(int i=0;i<s.length;i++)
		{
			if(map.containsKey(s[i].length()))
			{ 
				ArrayList<String> list1 = map.get(s[i].length());
				list1.add(s[i]);				
			}
			else
			{	ArrayList<String> list2 = new ArrayList<String>();
				list2.add(s[i]);
				map.put(s[i].length(), list2);
			}
		}
		
		HashMap<String,List<String>> fMap = new HashMap<String,List<String>>();	
		for(int i =0;i<s.length;i++)
		{
			for(int a : map.keySet())
			{ 
				ArrayList<String> fList = new ArrayList<String>();
				if(a<=s[i].length())
				{
					
				}
				else
					continue;
			}
		}
		
		System.out.println(map);
	}
	
	public static boolean isCancatenated(String str ,String toCheck)
	{
		if(str.equals(toCheck))
			return true;
		else 
			return false;
	}

}
