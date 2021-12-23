package feb;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
	public static void main(String[] args)
	{
		String str = "3[a2[m]]2[bc]";
//		String str ="3[a2[c]]";
		Pattern p = Pattern.compile("\\[(.*?)\\]");
		Matcher m = p.matcher(str);
		while(m.find())
		{
			System.out.println(m.group(1));
		}
	}

}
