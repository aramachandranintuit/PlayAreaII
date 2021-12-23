package leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPasswordChecker {
	
	public static void main(String[] args)
	{
		String str ="Aaaa";
		int a= str.length() >=6  ? 0 : 6 - str.length();
//		a=a+checkPassword(0,"[?=.*(A-Z)]",str);
//		a=a+checkPassword(0,"[?=.*(a-z)]",str);
//		a=a+checkPassword(0,"[?=.*(0-9)]",str);
		a=a+checkPassword(0,"[(.){3}]",str);
		System.out.println(a);
	}
	
	static int checkPassword(int counter,String regex,String str)
	{
		int a =counter;
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		if(!matcher.find())
			a++;
		return a;
		
	}
}
