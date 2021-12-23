package Test;

public class encodeStrings {
	
	public static void main(String[] args)
	{
		String str = "aaabcdef";
		String encodedString ="";
		for(int i =0;i<str.length();i++)
		{
			int j=1;
			char aChar = str.charAt(i);
			while(aChar == str.charAt(i+i))
			{
				j=j+1;
			}
		}
	}

}
