package Medium;

import java.util.HashSet;

public class LongestSubStringWithoutRepitation {
	
	public static void main(String[] args)
	{
		String s = "abcabcbb";
		int startIndex=0;
		int result =0;
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			startIndex=i;
			while(i<s.length() && !set.contains(s.charAt(i)) ) {
				set.add(s.charAt(i));
				i++;				
			}
			i=startIndex;
			result = Math.max(result,set.size());
			System.out.println( set);
			set = new HashSet<Character>();
			
		}
		System.out.println( result);
		
	}

}
