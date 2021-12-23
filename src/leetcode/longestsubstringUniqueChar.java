package leetcode;

import java.util.HashSet;
import java.util.Iterator;

public class longestsubstringUniqueChar {
	
	static String str="abcabc";
	
	
	public static void main(String[] args)
	{
		new longestsubstringUniqueChar().getUniqueSubString(str);
	}
	private  String getUniqueSubString(String str)
	{
		char[] charArray = str.toCharArray();
		String subString="";
		HashSet<Character> uniqueString = new HashSet<Character>(); 
		for(int i=0;i<charArray.length;i++)
		{
			HashSet<Character> temp = getuniqueString(i,charArray.length,charArray);
			if(uniqueString.size() < temp.size())
			{
				uniqueString = temp;
			}
		}
		Iterator<Character> setIterator = uniqueString.iterator();
		while(setIterator.hasNext())
		{
			subString+=setIterator.next();
		}
		System.out.println(subString);
		return subString;
	}
	
	private HashSet<Character> getuniqueString(int startIndex,int endIndex,char[] str)
	{
		HashSet<Character> uniqueString = new HashSet<Character>();
		int counter =0;
		for(int i=startIndex;i<endIndex;i++)
		{
			uniqueString.add(str[i]);
			counter=counter+1;
			if(counter != uniqueString.size())
			{
				break;
			}
		}
		return uniqueString;
	}

}
