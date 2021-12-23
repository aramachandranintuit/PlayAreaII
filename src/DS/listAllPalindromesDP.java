package DS;

public class listAllPalindromesDP {
	public static void main(String[] args)
	{
		String str = "aaass";
		if(isPalindrome(str))
			System.out.println("the given string is a palindrome");
	}
	
	
//	public static boolean isPalindrome(String str)
//	{
//		
//	}
//	public static boolean isPalindrome(String a)
//	{
//		if(a!=null)
//		{
//			if (a.equals(reverseString(a)))
//			return true;
//		}
//		return false;
//	}
	
	public static boolean isPalindrome(String str)
	{
		if(str.length()%2!=0)
		{
			for(int i=0;i<(str.length()-1)/2;i++)
			{
				if(str.charAt(i) != str.charAt(str.length()-i-1))
				{
					System.out.println("the string is not a palindrome");
					return false;
				}
			}
			
		}
		else 
		{
			for(int i=0;i<=(str.length()-1)/2;i++)
			{
				if(str.charAt(i) != str.charAt(str.length()-i-1))
				{
					System.out.println("the string is not a palindrome");
					return false;
				}
			}
		}
		return true;
			
	}
	
	public static String reverseString(String str)
	{
		if(str.length()>1)
			return reverseString(str.substring(1)) + str.charAt(0);
		else
			return str;
		
	}

}
