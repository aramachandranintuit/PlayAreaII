package myplayarea;

public class longestSubSequence_2 {
	
	public static void main(String[] args)
	{
		longestSubSequence_2 inst = new longestSubSequence_2();
		System.out.println(inst.returnString("abbcdgf", "bbadcgf", 0, 0, ""));
	}
	
	private String returnString(String A , String B , int AIndex,int BIndex,String str)
	{
		if(A!=null && B!=null)
		{
			if(AIndex ==A.length() ||  BIndex==B.length())
			{
				return str;
			}
			else if(A.charAt(AIndex) == B.charAt(BIndex))
			{
				str += String.valueOf(A.charAt(AIndex));
				System.out.println(str);
				String str1 = returnString(A,B,AIndex+1,BIndex+1,str);
				str = str.length() >= str1.length()? str :str1 ;
				
			}
			else if(A.charAt(AIndex) != B.charAt(BIndex))
			{
				String str1= returnString(A,B,AIndex+1,BIndex,str);
				String str2= returnString(A,B,AIndex,BIndex+1,str);
				System.out.println("str1  " +str1);
				System.out.println("str2  " +str2);
				if(str1.length() >= str2.length())
				{
					if(str.length() <=str1.length())
						str=str1;
				}
				else if(str.length() <=str2.length())
					str= str2;
			}
		}
		return str;
	}

}
