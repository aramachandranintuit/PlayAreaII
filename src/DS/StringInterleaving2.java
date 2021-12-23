package DS;

public class StringInterleaving2 {
	
	public static void main(String[] args)
	{
		String	A = "aabcc";
		String	B = "dbbca";
		String	C = "aadbbcbcac";
		System.out.println(B.equals(checkInterLeaving(A,C)) ? true :false);
		System.out.println(A.equals(checkInterLeaving(B,C))?true:false);
	}
	
	private static String checkInterLeaving(String a , String b)
	{
		int j=0;
		for(int i=0;i<a.length() && j<b.length();)
		{
			if(a.charAt(i)==b.charAt(j))
			{
				b= b.substring(0,j)+b.substring(j+1,b.length());
				i++;
				j--;
			}
			j++;
		}
		return b;
	}

}
