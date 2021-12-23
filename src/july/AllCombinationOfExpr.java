package july;

import java.util.ArrayList;
import java.util.List;

public class AllCombinationOfExpr {
	public static void main(String[] args)
	{
		String str = "1$2$3$4$5";
		char[] c = str.toCharArray();	
		List<String> aList = new ArrayList<String>();
		getAllCombinations(str.toCharArray(),0,aList);
		for(String s : aList)
		{
			System.out.println(s);
		}
	}
	
	public static void getAllCombinations(char[] c , int count,List<String> aList)
	{
		if(count>c.length-2)
		{
			aList.add(new String(c));
			return;
		}
		
			if (c[count]=='$')
			{
				c[count]='+';
				getAllCombinations(c,count+1,aList);
				c[count]='-';
				getAllCombinations(c,count+1,aList);
				c[count]='/';
				getAllCombinations(c,count+1,aList);				
				c[count]='*';				
				getAllCombinations(c,count+1,aList);
				c[count]='$';
			}
			else if(count < c.length-2) getAllCombinations(c,count+1,aList);
				
			
		}
	}


