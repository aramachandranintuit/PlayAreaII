package September;

import java.util.Stack;

/*
 * Input: s = "3[a]2[bc]"
 * Output: "aaabcbc"
 * 
 */
public class DecodingAString {
	public static void main(String[] args)
	{
		String s = "3[a]2[bc]";
		String res = decodeString(s);
		System.out.println(res);
		
	}
	
	public static String decodeString(String s)
	{
		int i=0;
		Stack<Integer> num = new Stack<>();
		Stack<String> stack = new Stack<>();
		String res="";
		while(i<s.length())
		{
			if(s.charAt(i)=='[')
			{
				stack.push(res);
				res="";
				i++;
				
			}
			else if(s.charAt(i)==']')
			{
				StringBuilder sb = new StringBuilder(stack.pop());
				int l = num.pop();
				for(int j=0;j<l;j++)
				{
					sb.append(res);
				}
				res=sb.toString();
				i++;
			}
			else if(Character.isDigit(s.charAt(i)))
			{
				int temp=0;
				while(Character.isDigit(s.charAt(i)))
				{
					temp=temp*10+ (s.charAt(i)-'0');
					i++;
				}
				num.push(temp);							
			}
			else
			{
				res+=s.charAt(i);
				i++;
			}
		}
		 return res;
	}

}
