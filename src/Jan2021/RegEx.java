package Jan2021;

public class RegEx {
	public static void main(String[] args)
	{
		String str="abc";
		String regEx ="a*";
		System.out.println(isMatching(str,regEx));
	}
	
	public static boolean isMatching(String str,String regex)
	{
		if(str==null || regex==null)
			return false;
		int i=0,j=0;
		while(i<str.length() && j<regex.length())
		{
			if(str.charAt(i)==regex.charAt(j))
			{
				i++;
				j++;
			}
			else if(str.charAt(i)!=regex.charAt(j))
			{
				if(regex.charAt(j)=='*' && j<regex.length()-1 && i<str.length()-1)
				{
					int newIndex =findIndex(str,i+1,regex.charAt(j+1));
					if(newIndex!=-1)
					{
						i=newIndex;
						j++;
					}
					
				}
				else if(regex.charAt(j)=='*' && j==regex.length()-1 && i==str.length()-1)
					return true;
				else
					return false;
			}
		}
		
		return false;
	}
	
	public static int findIndex(String str,int startIndex,char c)
	{
		for(int i=startIndex;i<str.length();i++)
		{
			if(str.charAt(i)==c)
				return i;
		}
		return -1;
	}

}
