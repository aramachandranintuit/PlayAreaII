package Test;

import java.util.regex.Pattern;

public class Regex {
	
	public static void main(String[] args)
	{
		String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\\$%\\^&\\*])(?=.{8,})";
		String str = "ajaayAasa123sdasd1#";
		boolean matches = Pattern.matches(pattern, str);
        System.out.println("matches = " + matches);

	}
}
