package myplayarea;

public class longestPalindrome {
	
	public static void main(String[] args)
	{
		String str = "forgeeksskeegfor";
		
		
		
	}
	
	public static void longestPalindrome(String str) 
	{
		int maxLength=1 ;
		int start=0;
		int len =str.length();
		int low=0,high=0;
		for(int i=0;i<len;i++)
		{
			low=i-1;
			high=i;
			while( low >=0 && high<len && str.charAt(low)==str.charAt(high))
			{
				if(high)
				
			}
		}
		
	}

}
