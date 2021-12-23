package leetcode;

import java.util.HashMap;

public class confusingNumberProblem {
	
	
	HashMap a = new HashMap();
	public static void main(String[] args)
	{
		int i =3016;
		System.out.println(isConfusingNumber(i));
		
	}
	
	private static boolean isConfusingNumber(int i)
	{
		String str = "0196";
		while(i>0)
		{
			if(!str.contains(String.valueOf(i%10)))
			{
				return false;
					
			}
			else
			{
				i=i/10;
			}
		}
		return true;
	}

}
