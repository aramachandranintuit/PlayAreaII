package MyExperiments;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * print all combinations with repeating characters
 */
public class BackTracking {
	public static void main(String [] args)
	{
		String res= "abc";
		String str ="a#j#y";
		List<String> list = new ArrayList<String>();
		char[] c = new char[str.length()];
		printAllCombinations(res,str.toCharArray(),0,2,list);
		for(String s : list)
		{
			System.out.println(s);
		}
	}
	
	static void printAllCombinations(String res, char[] c,int cIndex,int lasthashIndex,List<String> list)
	{
		
		if(cIndex>lasthashIndex) list.add(new String(c));
		for(int i=0;i<res.length() && cIndex < c.length;)
		{
			if(c[cIndex]=='#')
			{
				c[cIndex]=res.charAt(i);
				printAllCombinations(res,c,cIndex+1,lasthashIndex,list);
				c[cIndex]='#';				
				i++;
			}
			else
			{
				cIndex++;
			}
		}
			
			
		
		
	}

}
