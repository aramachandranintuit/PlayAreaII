package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
public class subsequence {
	
	public static void main(String[] args)
	{
//		System.out.println(isSubsequence("bbb","bbaa"));
		System.out.println( getIndex(new int[]{1,2},2) );
	}
	
	public static int getIndex(int[] arr,int a)
	{
		return Arrays.asList(arr).indexOf(a);
		
	}
	
	 public static boolean isSubsequence(String s, String t) {
		 Stack<Character> stack = new Stack<>();
		 if(s.length()==0 && t.length()==0 || s.length()==0 && t.length()>0)
		 {
			 return true;
		 }
		 if(s.length() >0 && t.length()==0)
			 return false;
		 if(s.length()>0 && t.length()==0)
			 return false;
		 if(t!=null && t.length()>0 && s.length() >0)
		 {
			 char[] str = t.toCharArray();
			 for(int i=0;i<str.length;i++)
			 {
				 stack.push(str[i]);
			 }
			 int i=0;
			 while(i<s.length() && stack.size()>0)
			 {
				 char a = stack.pop();
				 if (a==s.charAt(i))
					 i++;
				 else if(stack.size() ==0 && a!=s.charAt(i))
					 return false;
			 }
			 return true;
			 
		 }
		return false;		         
    }
    
    private static int findChar(int startIndex,int endIndex,char[] str,char c)
    {
        for(int i =startIndex;i<endIndex;i++)
        {
            if(str[i]==c)
            {
            		str[i]='1';	
            		return i;
                
            }
        }
        return -1;
    }

}
