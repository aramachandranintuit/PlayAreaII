package Jan2021;

import java.util.Stack;

public class RemoveKDigits {
	
	public static void main(String[] args)
	{
		String str ="00012302";
//		System.out.println(str.replaceFirst("0+", ""));
//		String str ="43211378";
		String[] s = str.split("");
		Stack<String> stack = new Stack<String>();
		stack.push(s[0]);
		int k=3;
		int count =0;
		for(int i=0;i<s.length;i++)
		{
			int n = Integer.parseInt(s[i]);
			while(stack.size()>0 && Integer.parseInt(stack.peek()) > n && count<k)
			{
				stack.pop();
				count++;
			}
//			else if(stack.size()==0 || Integer.parseInt(stack.peek()) <= n && count<k)
//			{
				stack.push(s[i]);
//				count ++;
//			}
		}
		System.out.println(stack);
	}

}
