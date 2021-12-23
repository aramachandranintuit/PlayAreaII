package feb;

import java.util.ArrayList;
import java.util.List;

public class AllCombinationOfLettersInA2LtterWord {
	
	/*
	 * 
	 * find all combinations that can be done when 2 buttons of a phone key are pressed.
	 */
	public static void main(String[] args)
	{
		String str1 = "abc";
		String str2 ="def";
		String str3 ="ghi";
		List<String> list = new ArrayList<String>();
		list.add(str1);
		list.add(str2);
		list.add(str3);
		List<String> aList = new ArrayList<String>();
//		generate(new char[list.size()],0,0,list,aList);
		generate_backtracking(new StringBuilder(),0,list,aList);
		System.out.println(aList);
	}
	
	static void generate(char[] c ,int cPos,int wPos,List<String> list , List<String> aList)
	{
		if(cPos==c.length)
		{
			aList.add(new String(c));
			return;
		}
		else
		{
			for(int i=0;i<list.get(wPos).length();i++)
			{
				c[cPos]=list.get(wPos).charAt(i);
				generate(c,cPos+1,wPos+1,list,aList);
			}
		}
	}
	
	static void generate_backtracking(StringBuilder sb,int wPos,List<String> list, List<String> aList)
	{
		if(sb.length()== list.size())
		{
			aList.add(sb.toString());
			return;
		}
		else
		{
			for(int i=0;i<list.get(wPos).length() && wPos < list.size();i++)
			{
				sb.append(list.get(wPos).charAt(i));
				generate_backtracking(sb,wPos+1,list,aList);
				sb.deleteCharAt(sb.length()-1);
			}
		}
	}

}

/*
 * str1 = abc
 * str2 = def
 * 	[a][] -[a][d]
 * 		  -[a][e]
 * 	  	  -[a][f]
 * [b][] - [b][d]
 * 		  -[b][e]
 * 	  	  -[b][f]		
 * 
 */
