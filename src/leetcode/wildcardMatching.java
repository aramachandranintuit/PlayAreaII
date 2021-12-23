package leetcode;

public class wildcardMatching {
	
	public static void main(String[] args)
	{
		System.out.println(isMatch("cat","*"));
	}
	
	private static boolean isMatch(String str, String pattern)
	{
		int k=0;
		for(int i=0;k< str.length() && i<pattern.length();)
		{
			if(str.charAt(k) ==  pattern.charAt(i))
			{
				k++;
				i++;
			}
			else if(pattern.charAt(i) == '*')
			{
				int a=0;
				try
				{
					a = indexOf(pattern.charAt(i+1),str);
				}
				catch(Exception e)
				{
					
				}
				if(a!=-1)
				{
					k = k + a;
				}
				i=i+1;
			}
			else 
			{
				return false;
			}
		}
		return true;
		
	}
	
	private static int indexOf(char a , String str)
	{
		
		return str.indexOf(a);
	}

}
