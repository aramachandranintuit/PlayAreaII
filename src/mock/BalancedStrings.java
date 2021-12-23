package mock;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BalancedStrings {
	public static void main(String[] args)
	{
	String str= "RLRRLLRLRL";
	Stack<Character> s = new Stack<Character>();
	int l=0,r=0;
	int count=0;
	String s1="";
	List<String> list = new ArrayList<String>();
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='L')
		{
			l++;
			s1+='L';
		}
		else 
			{
			r++;
			s1+='R';
			}
		if(l==r)
		{
			r=0;
			l=0;
			System.out.println(s1);
			s1="";
			count++;
		}
	}
	System.out.println(count);
	}

}
