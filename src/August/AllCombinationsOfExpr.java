package August;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * write a program to get all combination of expressions , by inserting "+","-","/","*".
 */
public class AllCombinationsOfExpr {

	public static void main(String[] args) {
		String a = 1234 + "";
		char[] c = new char[a.length() + a.length() - 1];
		int j = 0;
		for (int i = 0; i < c.length; i++) {
			if (i % 2 == 0)
				c[i] = a.charAt(j++);
			else
				c[i] = '#';
		}
		char[] s = new char[4];
		s[0] = '+';
		s[1] = '-';
		s[2] = '/';
		s[3] = '*';
		List<String> list = new ArrayList<String>();
//		List<List<String>> list = new ArrayList<List<String>>();
		getExpr(s,c,0,c.length-1,list);
//		allCombinations(c, 0, s, 0, list);
//		;
		for (String res : list) {
			System.out.println(res);
		}

	}

	
	
	public static void getExpr(char[] c, char[] s,int sIndex,int lastHashIndex,List<String> list)
	{
		if(sIndex>=lastHashIndex)
		{
			String str = new String(s);
			list.add(str);
			return;
		}
		for(int i=0;i<c.length && sIndex<lastHashIndex;)
		{
					
				if(s[sIndex]=='#')
				{
					s[sIndex]=c[i];
					getExpr(c,s,sIndex+1,lastHashIndex,list);
					s[sIndex]='#';
					i++;
				}
				else sIndex++;
				
		}
	}
	
	
}
