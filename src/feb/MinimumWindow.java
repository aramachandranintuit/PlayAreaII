package feb;

import java.util.HashMap;

public class MinimumWindow {
	
	public static void main(String[] args)
	{
		String s = "ADOBECODEBANC";
		String t = "ABC";
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		String res= null;
		for(int i=0;i<s.length();i++)
		{
			map.put(s.charAt(i),map.get(i)==null ? 1 :map.get(i)+1);
		}
		
		for(int i=0;i<s.length();i++)
		{
			if(i==0)
			{
				if (!contains(t,map)) System.out.println("false");
			}
			else
			{
				int n= map.get(s.charAt(i));
				if(n-1>0) map.put(s.charAt(i), n-1);
				else map.remove(s.charAt(i));
				if(contains(t,map)) res = s.substring(beginIndex)
			}
		}
	}
	
	public static boolean contains(String t,HashMap<Character,Integer> m)
	{
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<t.length();i++)
		{
			if(map.containsKey(t.charAt(i)))
			{
				map.put(t.charAt(i), map.get(t.charAt(i)+1));
			}			
		}
		for(char c: map.keySet())
		{
			int n= map.get(c);
			if(m.get(c)== null ) return false;
			else 
			{
				if(m.get(c)<n) return false;
			}
		}
		return true;
		
	}

}
