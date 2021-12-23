package Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;



class Solution {
    public int maxLength(List<String> arr) {
        int[] totalCount = new int[26];
        return helper(arr, 0, totalCount);
    }
    
    public int helper(List<String> arr, int current, int[] totalCount){
        if(current == arr.size()){
            return 0;
        }
    
        String currString = arr.get(current);
        
        //we can check if it feasible to add current String
        boolean feasible = true;
        int result = Integer.MIN_VALUE;
        
        for(int i = 0; i < currString.length();i++){
            totalCount[currString.charAt(i) - 'a']++;
            
            //if characters are not unique
            if(totalCount[currString.charAt(i) - 'a'] > 1){
                feasible = false;
            }
        }
        
        if(feasible){            
            result = Math.max(result, currString.length() + helper(arr, current + 1, totalCount));
        }
        
        //backtrack remove current string characters from total counts array;
        for(int i = 0; i < currString.length();i++){
            totalCount[currString.charAt(i) - 'a']--;
        }
        
        result = Math.max(result, helper(arr, current + 1, totalCount));
        return result;
    }
}

public class ConcatenateAString {
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
//		["a", "abc", "d", "de", "def"]
		list.add("a");
		list.add("abc");
		list.add("d");
		list.add("de");
		list.add("def");
		ConcatenateAString c = new ConcatenateAString();
		System.out.println(c.maxLength(list));
		
	}
	
	public  int maxLength(List<String> arr) {
        if(arr==null)
            return 0;
        if(arr.size()==1)
            return arr.get(0).length();
        int result=0;
        StringBuilder s =null;
        for(int i=0;i<arr.size();i++)
        {
            if(!checkUniqueness(arr.get(i)))
            {
                continue;
            }
                       
            for(int j=0 ; j<arr.size();j++)
            { 
            	  s = new StringBuilder(arr.get(i));
                if(checkUniqueness(s.toString(),arr.get(j)))
                {
                    s.append(arr.get(j));                    
                }
                result=Math.max(result,s.toString().length());
            }
            
            result= Math.max(result,s.length());
            
        }
        return result;
        
    }
    
    private boolean checkUniqueness(String str,String str1)
    {
        
        for(int i=0;i<str.length();i++)
        {
            if(str1.contains(str.charAt(i)+""))
               return false;
        }
        
        return true;
    }
    
    private boolean checkUniqueness(String str)
    {
        HashSet<String> set = new HashSet<String>();
        for(int i=0;i<str.length();i++)
        {
            if(set.contains(str.charAt(i)+""))
               return false;
            else
                set.add(str.charAt(i)+"");
        }
        
        return true;
    }

}
