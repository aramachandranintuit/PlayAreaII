package april;

import java.util.Stack;

/*
 *  this program is used to
 *  get the subsequence with minimum dictionary order, 
 * 
 * 
 */

public class MonotonicStack {
	
	public static void main(String[] args)
	{
		System.out.println(smallestSubsequence("cbacdcbc"));
	}
	
	public static String smallestSubsequence(String str) {
        Stack<Character> s = new Stack<>();
		int[] index = new int[26];
        boolean[] seen = new boolean[26];
		for(int i=0;i<str.length();i++)
		{
			index[str.charAt(i)-'a'] =i;
		}
		for(int i=0;i<str.length();i++)
		{
            if(seen[str.charAt(i)-'a'])
			{
					continue;
			}
			else 
			{				
				while(!s.empty() && s.peek() >= str.charAt(i) && index[s.peek() -'a'] >i)
				{
					char c = s.pop();
                    seen[c -'a']=false;
				}
					s.push(str.charAt(i));	
                    seen[s.peek()-'a']=true;
                    
			}
		}
        StringBuilder sb = new StringBuilder();
        while(!s.empty())
        {
            sb.append(s.pop());
        }
        return sb.reverse().toString();
        
    }

}
