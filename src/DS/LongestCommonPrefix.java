package DS;

public class LongestCommonPrefix {
	
	public static void main(String[] args)
	{
		String A ="abcdefgh";
		String B = "abcefgh";
		 System.out.println(commonPrefix(A,B));
	}
	
	private static String commonPrefix(String A , String B)
	{
		if( A!=null && B!=null)
		{
			int length = A.length() > B.length() ? B.length() : A.length();
			for(int i=0;i< length; i++ )
			{
				if(A.charAt(i) != B.charAt(i))
					return A.substring(0,i);
			}
			if (length ==A.length())
				return A;
			else
				return B;
		}
		else
			return null;
	}
	
//	private 

}
