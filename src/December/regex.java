package December;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
	public static void main(String[] args)
	{
		String str ="my name is @@!#Ajay.R";
		Pattern pattern = Pattern.compile("[A-Za-z!@#^&*$]");
		Matcher match = pattern.matcher(str);
		int i=0;
		while(match.find())
		{
			System.out.print(str.substring(match.start(0),match.end(0)));
//			i++;
		}
		
	}

}
