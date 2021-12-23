package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralsToIntegers {
	
	public static void main(String[] args)
	{
		String str ="MCDLXXVI";
		int result=0;
		for(int i=0;i<str.length()-1;i++)
		{
			int s1 = getIntForRomanNumerals(str.charAt(i));
			if(i+1<str.length())
			{
				int s2 = getIntForRomanNumerals(str.charAt(i+1));
					if(s1>=s2)
					{
						result += s1;
						
					}
					else
					{
						result+=-s1;
					}
			}
			else result+=s1;
		}
		System.out.println(result);
	}
	
	private static Integer getIntForRomanNumerals(char c)
	{
		Map<Character, Integer> romanIntMap = new HashMap<Character,Integer>();
		romanIntMap.put('I',1);
		romanIntMap.put('V',5);
		romanIntMap.put('L',50);
		romanIntMap.put('X',10);
		romanIntMap.put('C',100);
		romanIntMap.put('D',500);
		romanIntMap.put('M',1000);
		return romanIntMap.get(c);
	}

}
