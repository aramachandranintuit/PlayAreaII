package myplayarea;

public class missingPalindrome {
	
	public static void main(String[] args)
	{
		String str = " caba";
		int j=0;
		if(str.length()%2 ==0)
		{
			for(int i=1;i<str.length()/2;i++)
		{
			if( str.charAt(( (str.length()/2))-i)!= str.charAt(((str.length()/2)) +i) )
				{
				j++;
//				System.out.println( str.charAt(str.length()-i-1) + " needs to be added at " + str.charAt(i));
				}
		}
		System.out.println("total number of characters to be added is " + j);
		}
		else
		{
			for(int i=1;i<=str.length()/2;i++)
			{
				if( str.charAt(( (str.length()/2))-i)!= str.charAt(((str.length()/2)) +i) )
					{
					j++;
//					System.out.println( str.charAt(str.length()-i-1) + " needs to be added at " + str.charAt(i));
					}
			}
			System.out.println("total number of characters to be added is " + j);
			
		}
	}

}
