package May;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
	
	public static void main(String[] args)
	{
		String[] t = {"test","apple","elephant"};
		HashSet<String> set =new HashSet<String>();
		for(int i=0;i<t.length;i++)
		{
			set.add(t[i]);
		}
		if(set.contains("t\\*")) System.out.println("true");
		Pattern p = Pattern.compile("([0-9\" \"]*)");
		Matcher m = p.matcher("this is a sentence");
		if(m.find()) System.out.println(m.group());
		
	}

}
