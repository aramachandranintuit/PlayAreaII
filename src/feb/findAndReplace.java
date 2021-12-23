package feb;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findAndReplace {
	public static void main(String[] args)
	{
//		String str = "A man, a plan, a canal: Panama";
		String str =  "Damosel, a poem? A carol? Or a cameo pale? (So mad!)";
		System.out.println(str.replaceAll("[^(a-z0-9)]|[(\\(\\)]", ""));
//		Pattern p = Pattern.compile("[^(@|#|$|)][(a-zA-Z0-9)]");
//		Matcher m = p.matcher(str);
//		StringBuilder s = new StringBuilder();
//		
//		while(m.find())
//		{
//			s.append(m.group());
//		}
////		StringBuild
//		System.out.println(s.toString());
	}
	

}
