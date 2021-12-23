package Test;

import java.util.Arrays;

public class PA {
	
	public static void main(String[] args)
	{
		
//		String str = "i am a programmer 1232";
		String str = "am";
		String[] s = str.split(" ");
		int j=1;
		System.out.println(reverse(str));
//		for(int i=0;i<s.length;i++)
//		{
////			if(i<s[i].length()) 
////			System.out.println(reverse(s[i]));
////			s[i]=reverse(s[i]);
//			
//			if(i+1 < s[i].length())
//			{
//				s[i]=s[i].substring(0,i+1)+reverse(s[i].substring(i+1,s[i].length()));
//			}
//		}
//		System.out.println(Arrays.toString(s));
	}

	private static String reverse(String str)
	{
		char[] c = str.toCharArray();
		for(int i=0;i<c.length/2;i++)
		{
			char temp =c[i];
			c[i] =c[c.length-1-i];
			c[c.length-1-i]=temp;
		}
		System.out.println(new String(c));
		return new String(c);
		
	}
}
