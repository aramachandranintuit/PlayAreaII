package DS;

public class regularExpression2 {
	
	public static void main(String[] args)
	{
//		System.out.println(isMatch("ajay", "aj."));
		System.out.println(isMatch("aa",".*"));
//		isMatch("aa","a")
//		isMatch("aa","aa")
//		isMatch("aaa","aa")
//		isMatch("aa", "a*")
//		isMatch("aa", ".*")
//		isMatch("ab", ".*")
	}
	
	private static int isMatch(String str ,String regex)
	{
		int j=0;
		int i ;
		for(i=0;i<regex.length()&&j<str.length();)
		{
			if(regex.charAt(i)=='.')
			{
				 if(i==regex.length()-1 && j==str.length()-1)
					 return 1;
				 else {
					 i++;
					 j++;
				 }
				 
			}
			else if(regex.charAt(i)=='*')
			{
				 i++;	
				 j++;
			}
			else if(regex.charAt(i) == str.charAt(j) )
			{
				 if(j==str.length()-1 && i==regex.length()-1)
					return 1;
				 else if(i==regex.length()-1 && j<str.length()-1)
					 return 0;
				 else 
					 {
					 j++;
					 i++;
					 }
				
			}
			else if(regex.charAt(i) != str.charAt(j) )
			{
				if(regex.charAt(i+1)=='*' && i<=regex.length()-1)
				{
					i++;
					j++;
				}
				else
					return 0;
			}
		}
		if(i==regex.length() && j==str.length())
		{
			return 1;
		}
		else
			return 0;
	}
	


}
