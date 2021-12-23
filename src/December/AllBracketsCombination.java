package December;

import java.util.ArrayList;
import java.util.List;

public class AllBracketsCombination {
	public static void main(String[] args)
	{
		print(new char[6],0,0,0,3);
		List<String> list = new ArrayList<>();
		printWithBackTracking(0,0,3,new StringBuilder(),list);
		System.out.println(list);
	}

	public static void print(char[] s,int pos,int open , int close, int n)
	{
		if(close==n)
		{
			String str = new String(s);
			System.out.println(str);
			return;
		}
		else
		{			
			if(open < n) {
				s[pos]='{';
				print(s,pos+1,open+1,close,n);
			}
			if(open > close) {
				s[pos]='}';
				print(s,pos+1,open,close+1,n);
			}
		}
	}
	
	public static void printWithBackTracking(int open , int close, int n,StringBuilder sb,List<String> list)
	{
		if(close==n)
		{
			String str = new String(sb.toString());
			list.add(str);
			return;
		}
		else
		{			
			if(open < n) {
				sb.append('{');
				printWithBackTracking(open+1,close,n,sb,list);
				sb.deleteCharAt(sb.length()-1);
			}
			if(open > close) {
				sb.append('}');
				printWithBackTracking(open,close+1,n,sb,list);
				sb.deleteCharAt(sb.length()-1);
			}
		}
	}
}
