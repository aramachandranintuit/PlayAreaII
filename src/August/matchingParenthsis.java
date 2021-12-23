package August;

import java.util.Stack;

public class matchingParenthsis {
	
	public static void main(String[] args)
	{
		System.out.println(minAddToMakeValid(")("));
	}
	public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(') {
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==')' && !stack.isEmpty() ){
                stack.pop();
               
            }
            else if(stack.isEmpty() && s.charAt(i)==')') j++;
            else
                stack.push(s.charAt(i));
        }
        
        return stack.size() + j;
    }

}
