package NotClearFirstTime;

public class NumberSystemEncoding {
	
	public static void main(String[] args)
	{
		String s = "of8";
		int base = s.length();
		String str = getSymbolForNum(3);
		System.out.println(getSymbolForNum(3));
		String s1="";
		for(int i=0;i<str.length();i++)
		{
			s1+=s.charAt(Integer.parseInt(str.charAt(i)+""));
		}
		System.out.println(s1);
	}
	
	private static String getSymbolForNum(int i)
	{
		StringBuilder sb= new StringBuilder();
		while(i>0)
		{
			sb.append(i%3);
			i=i/3;
		}
		return sb.reverse().toString();
	}
}
