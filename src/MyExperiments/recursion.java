package MyExperiments;

import java.util.HashSet;
import java.util.Set;

/*
 * 
 * from A-Z find all the combinations of the four letter word where letters dont repeat.
 */
public class recursion {
	static Set<String> set = new HashSet<String>();
	public static void main(String[] args)
	{
		String str = "abcde";
		printAllCombinations("",str);
		System.out.println(set.size());
		
	}
	
	public static void printAllCombinations(String prefix,String s)
	{
		if(prefix.length()==2) set.add(prefix);
		for(int i=0;i<s.length();i++)
		{
			printAllCombinations(prefix+s.charAt(i),s.substring(0,i)+s.substring(i+1,s.length()));
		}
	}

}
