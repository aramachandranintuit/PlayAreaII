package DS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ShortestSuperString {
	
	public static void main(String[] args)
	{
		ArrayList<String> list =new ArrayList<String>();
		list.add("abcd");
		list.add("cdef");
		list.add("fgh");
		list.add("de");	
		System.out.println(getSuperString(list));
	}



	private static String getSuperString(ArrayList<String> strs)
	{
		HashSet<Character> set = new HashSet<Character>();
		for(int i =0;i<strs.size();i++)
		{
			String temp  = strs.get(i);
			set = populateSet(temp,set);
		}
		Iterator setIterator = set.iterator();
		String str ="";
		while (setIterator.hasNext())
		{
			str = str + String.valueOf(setIterator.next());
		}
			
		return str;
	}
	
	private static HashSet<Character> populateSet(String str , HashSet<Character> set)
	{
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		return set;
		
	}

}
