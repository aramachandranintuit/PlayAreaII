package leetcode;

public class reverseCharacters {
	
	public static void main(String[] args)
	{
		String str ="ajay123";
		
		System.out.println(new reverseCharacters().getReverse(str));
		
	}
	
	private String getReverse(String s)
	{
		if(s!=null && s.length()>0)
		{
			if (Character.isDigit(s.charAt(0)))
			{
				return s.charAt(0) + getReverse(s.substring(1));
			}
			else
				return getReverse(s.substring(1)) +s.charAt(0);
		}
		return "";
	}

}
