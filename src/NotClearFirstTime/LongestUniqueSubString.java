package NotClearFirstTime;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class LongestUniqueSubString {
	public static void main(String[] args)
	{
		
	}
	
	public static String longestUniqueString(String str)
	{
		int i=0;
		int j=0;
		int maxLength= Integer.MIN_VALUE;
		HashSet<Character> set = new HashSet<Character>();
		String res="";
		while(i < str.length() && j< str.length())
		{
			if(!set.contains(str.charAt(i)))
			{
				set.add(str.charAt(i++));
				if(maxLength <i-j){
					res=str.substring(j,i);
					maxLength=res.length();					
				}
			}
			else
			{
				set.remove(j++);
			}
		}
	}

}
