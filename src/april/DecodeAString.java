package april;

import java.util.Stack;

/*
 * Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times.
 Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not 
contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].
Example 1:

Input: s = "3[a]2[bc]"
Output: "aaabcbc"
 * 
 * 
 */
public class DecodeAString {
	public static void main(String[] args)
	{
		decode("3[a]2[bc]");
	}
	
	public static void decode(String s)
	{
		Stack<String> stack = new Stack();
		Stack<Integer> c = new Stack();
		int i=0;
		String res ="";
		while(i<s.length())
		{
			int count=0;
			if(Character.isDigit(s.charAt(i)))
			{
				while(Character.isDigit(s.charAt(i)))
				{
					count=count*10+ (s.charAt(i)-'0');
					i++;
				}
				c.push(count);
			}
			else if(s.charAt(i)=='[')
			{
				stack.push(res);
				res="";
				i++;
			}
			else if(s.charAt(i)==']')
			{
				StringBuilder temp = new StringBuilder(stack.pop());
				int num= c.pop();
				for(int j=0;j<num;j++) temp.append(res);
				res = temp.toString();
				i++;				
			}
			else
			{
				res+=s.charAt(i);
				i++;
			}
			
		}
		System.out.println(res);
		
	}

}
