package NotClearFirstTime;

import java.util.Stack;

public class RemoveDuplicates {
	
	public static void main(String[] args)
	{
		String s = "geeksforgeeks";
		Stack<Character> stack = new Stack<Character>();
		StringBuilder str = new StringBuilder();
		int[] a = new int[26];
		for(char c :s.toCharArray())
		{
			a[c-'a']++;
		}
//		for(int i=0;i<s.length();i++)
//		{
//			char n = s.charAt(i);
//			if(a[n-'a']>0) 
//			{
//				a[n-'a']=0;
//				str.append(n);
//			}
//			else continue;
//			
//		}
		
		
		for(int i=0;i<s.length();i++)
		{
			char n = s.charAt(i);
			if(	!stack.isEmpty() && stack.contains(n))
			{
				a[n-'a']--;
				continue;
			}
			while(!stack.isEmpty() && a[n-'a']>0 && n>stack.peek())
			{
				a[n-'a']--;
			}
			stack.push(n);
			
			
		}
		System.out.println(stack);
//		System.out.println(str.toString());
	}

}
