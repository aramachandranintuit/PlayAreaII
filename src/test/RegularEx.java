package Test;

public class RegularEx {
	
	public static void main(String[] args)
	{
		System.out.println(isMatch("abchjghjg","a*"));
		
	}
	
	public static boolean isMatch(String str,String pattern)
	{
//		String str = "bc";
//		String pattern ="a*b";
		int j=0;
		for(int i=0;i<pattern.length() && j<str.length();i++)
		{
			if(pattern.charAt(i)==str.charAt(j))
			{
				j++;
			}
			else if(pattern.charAt(i)=='*')
			{
				int index=0;
				if(i+1<pattern.length())
				{
					index = getIndex(str,j,str.length(),pattern.charAt(i+1)); 
					if(index!=-1)
						i = index;
					else 
						return false;
				}
				else 
					return true;	
			}
			else
			{
				return false;
			}
		}
		if(j!=str.length())
			return false;
		return true;
		
	}
	private static int getIndex(String str,int startIndex, int endIndex,char a)
	{
		if(str!=null)
		{
			for(int i=startIndex;i<endIndex;i++)
			{
				if(str.charAt(i)==a)
				{
					return i;
				}
			}
		}
		return -1;
	}
	
	
}
