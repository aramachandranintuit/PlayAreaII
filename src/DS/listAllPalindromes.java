package DS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class listAllPalindromes {
	
	public static void main(String[] args)
	{
		String str ="aab";
		List<ArrayList<String>> set = new ArrayList<ArrayList<String>>();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
				ArrayList<String> list = new ArrayList<String>();
				 if(isPalindrome(str.substring(i,j)) && (str.substring(i,j)!="" || str.substring(i,j)!=" ") && isPalindrome(str.substring(j,str.length())) && (str.substring(j,str.length())!="" || str.substring(j,str.length())!=" ") )
					{
					 list.add(str.substring(i,j));			
					 list.add(str.substring(j,str.length()));
					 set.add(list);
					}
				 
			}
		}	
		for(int i=0;i<set.size();i++)
		{
			System.out.println(set.get(i).toString());
		}
		System.out.println(set.size());
	}
	
	public static boolean isPalindrome(String a)
	{
		if(a!=null)
		{
			if (a.equals(reverseString(a)))
			return true;
		}
		return false;
	}
	
	public static String reverseString(String str)
	{
		if(str.length()>1)
			return reverseString(str.substring(1)) + str.charAt(0);
		else
			return str;
		
	}

}
