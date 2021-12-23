package april.GeneralDoubts;

import java.util.Arrays;
import java.util.Stack;

public class RemoveAdjacentStrings {
	public static void main(String[] args)
	{
		String str ="abbaca";
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
			if(stack.isEmpty()) stack.push(str.charAt(i));
			else
			{
				if(stack.peek() == str.charAt(i)) continue;
				else
				{
					stack.push(str.charAt(i));
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty())
		{
			sb.append(stack.pop());
		}
		System.out.println(sb.reverse().toString());
	}
	
	

}
