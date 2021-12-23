package NotClearFirstTime;

import java.util.Stack;

public class ValidParenthesisII {
	public static void main(String[] args)
	{
		String str ="lee(t(c)o)de)";
		System.out.println(isValid(str));
		
	}
	
	
	public static String isValid(String str)
	{
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
			{
				stack.push(i);
				sb.append('(');
			}
			else if(str.charAt(i)==')')
			{
				if(!stack.isEmpty())
				{					
					sb.append(')');
					stack.pop();
				}
				else count++;
			}
			else sb.append(str.charAt(i));
		}
		while(!stack.isEmpty())
		{
			int index= stack.pop();
			sb.deleteCharAt(index-count);
		}
		return sb.toString();
	
		
	}

}
