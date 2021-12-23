package Medium;

public class InsertA {
	
	public static void main(String[] args)
	{
		String s = "12312a2313";
		StringBuilder str = new StringBuilder();
		if(s.charAt(0)!='a')
			{
			str.append('a');
			str.append(s.charAt(0));
			str.append('a');
			}
		for(int i=1;i<s.length()-1;i++)
		{
			if(s.charAt(i)!='a' && s.charAt(i+1)!='a')
			{
				str.append(s.charAt(i));
				str.append('a');
			}
			else
			{
			str.append(s.charAt(i));
			}
		}
			str.append(s.charAt(s.length()-1));
			if(s.charAt(s.length()-1)!='a')
			{
				str.append('a');
			}
		System.out.println(str.toString());
			
			
	}

}
