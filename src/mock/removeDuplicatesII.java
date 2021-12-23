package mock;

import java.util.Stack;

public class removeDuplicatesII {
	/*
	 * given a string remove characters that appear > 2 times consecutively
	 * so if aaabbaaa is the input , the output is aabbaa; 
	 */
	
	public static void main(String[] args)
	{
		String str ="aabbaaaabbaa";
//		Stack<Character> s = new Stack<Character>();
//		s.push(str.charAt(0));
//		int count=1;
//		for(int i=1;i<str.length();i++)
//		{
//			if(s.size()>0 && s.peek()==str.charAt(i) && count<=1)
//			{
//				count++;
//				s.push(str.charAt(i));
//			}
//			else if(s.size()>0 && s.peek()!=str.charAt(i))
//			{
//				s.push(str.charAt(i));
//				count=1;
//			}
//		}
		System.out.println(removeDuplicates(str));
	}
	
	private static String removeDuplicates(String str)
	{
		int j=0;
		StringBuilder s = new StringBuilder();
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)!=str.charAt(i+1))
			{
				s.append(str.charAt(i));
			}
		}
		s.append(str.charAt(str.length()-1));
		return s.toString();
	}

}
