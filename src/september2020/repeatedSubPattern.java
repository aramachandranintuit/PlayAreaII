package september2020;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeSet;

public class repeatedSubPattern {
	public static void main(String[] args)
	{
		String str="aaaabbbaaaabbbaaaabbbaaabb	";
		System.out.println(isRepeated(str));
		TreeSet<Integer> set  = new TreeSet<Integer>();
		Iterator<Integer> itr =set.iterator();
		
	}
	
	public static boolean isRepeated(String str)
	{
	        for(int i=0;2*i+1<str.length();i++)
			{
				if(str.substring(0,i+1).equals(str.substring(i+1,2*i+2)))
					{
						if(str.length()%(i+1)==0)
						{
							StringBuilder a =new StringBuilder();
							for(int j=1;j<=str.length()/(i+1);j++)
							{
								a.append(str.substring(0,i+1));
							}
							if(str.equals(a.toString()))
								return true;
//							else
//								return false;
							
						}
//						else
//							return false;
					}		       		
			}
			return false;
	}

}
