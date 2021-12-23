package September;

import java.util.HashSet;

public class LongestStringWithUniqueCharacters {
	
	public static void main(String[] args)
	{
		String str="abcabcbb";
		int r = new LongestStringWithUniqueCharacters().longestUniqString(str);
		System.out.println(r);
		
	}
	
	public int longestUniqString(String s)
	{
		int i=0,j=0;
		int ans=0;
		HashSet<Character> set = new HashSet<Character>();
		while(i<s.length() && j<s.length())
		{
			if(set.contains(s.charAt(j)))
			{
				ans= Math.max(ans,j-i);
				set.remove(s.charAt(i));				
				i++;				
			}
			else
			{
				set.add(s.charAt(j++));
			}
		}		
		ans= Math.max(ans,j-i);
		return ans;
	}

}
