package mock;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
	
	public static void main(String[] args)
	{
		String str = "III";
		System.out.println(getInt(str));
		
		
	}
	
	private static int getInt(String str)
	{
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			int s1=getIntVal(str.charAt(i));
			if(i<str.length()-1)
			{
				int s2= getIntVal(str.charAt(i+1));
				if(s1 >=s2)
					sum+=s1+s2;
				else
					sum+=s2-s1;
				i++;
			}
			else
			{
				sum+=s1;
			}
		}
		return sum;
	}
	
	private static int getIntVal(char c){
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
