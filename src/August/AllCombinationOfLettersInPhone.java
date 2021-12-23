package August;

import java.util.ArrayList;
import java.util.List;

public class AllCombinationOfLettersInPhone {
	/*
	 * 
	 * find all combinations that can be done when 2 buttons of a phone key are pressed.
	 */
	public static void main(String[] args)
	{
		String str1 = "abc";
		String str2 ="def";
		String str3 ="ghi";
		
		List<String> keyList = new ArrayList<String>();
		keyList.add(str1);
		keyList.add(str2);
		keyList.add(str3);
		int size=3;
		List<String> res = new ArrayList<String>();
		allCombinations(res,keyList,new StringBuilder(),0,0,3);
		for(String a : res)
		{
			System.out.println(a);
		}
		
	}
	private static void allCombinations(List<String> res , List<String> keyList,StringBuilder sb,int count , int keyPos,int size)
	{
		if(count==size)
		{
			String s = new String(sb.toString());
			res.add(s);
			return;
		}
		for(int i=0;i<keyList.get(keyPos).length();i++)
		{
			sb.append(keyList.get(keyPos).charAt(i));
			allCombinations(res,keyList,sb,count+1,keyPos+1,size);
			sb.deleteCharAt(sb.length()-1);
		}
	}
	
	

}
