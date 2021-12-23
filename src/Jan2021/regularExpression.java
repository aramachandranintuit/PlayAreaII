package Jan2021;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpression {
	public static void main(String[] args)
	{
		String str ="asdfghjkl 123213 12313";
//		String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\\$%\\^&\\*])(?=.{8,})";
		Pattern p = Pattern.compile("([^a-z])([^\\s]*)");
		Matcher matcher = p.matcher(str);
//		System.out.println(matcher.group(0));
		while(matcher.find())
		{
			System.out.println("I found the text "+ str.substring(matcher.start(),matcher.end()));  
		}
		
	}

}
