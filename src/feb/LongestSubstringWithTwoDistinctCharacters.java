package feb;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithTwoDistinctCharacters {
	public static void main(String[] args)
	{
		String str="ccaabbb";
		System.out.println(lengthOfLongestSubstringTwoDistinct(str));
	}
	public static int lengthOfLongestSubstringTwoDistinct(String s) {
        if(s.length()<=2) return s.length();
        HashMap<Character,Integer> set = new HashMap<Character,Integer>();
        int i=0,j=0;
//        set.add(s.charAt(0));
        int res=0;
        while(j<s.length())
        {   
            if(set.containsKey(s.charAt(j)) && set.size()<=2)
            {    
            		set.put(s.charAt(j), j);
                j++;                
            }
            else if(!set.containsKey(s.charAt(j)) && set.size()<2)
            {
            		set.put(s.charAt(j), j);
                j++;     
            }
            else if((!set.containsKey(s.charAt(j)) && set.size()>=2 ))
            {
                int del_indx = Collections.min(set.values());
                set.remove(s.charAt(del_indx));
                i=del_indx+1;      
            }
            res = Math.max(res,(j-i));                      
        }
        
        return res;
        
    }

}
