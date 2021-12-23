package leetcode;

public class LeastCommonPrefix {
	public static void main(String[] args)
	{
		String str="ajay";
		String str2="aj231312";
		System.out.println(getCommonPrefix(str,str2));
		
	}
	
	public static String getCommonPrefix(String str1,String str2)
	{
		
		while(str2.length()!=0)
		{
			if(str1.indexOf(str2)!=-1)
				return str2;
			else
			{
				str2=str2.substring(0,str2.length()-1);
			}
		}
		return null;
	}

}
