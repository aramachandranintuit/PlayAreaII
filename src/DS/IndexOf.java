package DS;

public class IndexOf {
	
	public static void main(String[] args)
	{
		String str1 = "myinterviewtrainer";
		String[] str = {"trainer", "my", "interview"};
		System.out.println(indexOf(str1,str[0]));
		System.out.println(indexOf(str1,str[1]));
		System.out.println(indexOf(str1,str[2]));
		float a =1.123f;
		double u =123.123;
	}
	
	private static int indexOf(String str,String toFind)
	{
		for(int i=0;i<=str.length()-toFind.length();i++)
		{
			if(str.substring(i,i+toFind.length()).equals(toFind))
			{
				return i;
			}
		}
		return -1;
		
	}

}
