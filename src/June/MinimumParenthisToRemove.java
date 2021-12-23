package June;

import java.util.Stack;

public class MinimumParenthisToRemove {
	
	public static void main(String[] args)
	{
		System.out.println(minRemoveToMakeValid("))ASAD("));
	}
	
	public static String minRemoveToMakeValid(String str) {
        
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
