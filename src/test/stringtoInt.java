package Test;

import java.util.HashMap;

public class stringtoInt {
	
	public static void main(String[] args)
	{
		String str ="42";
		int k=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!='-')
			{
				k=k*10+ str.charAt(i) -'0';
			}
		}
		
		System.out.println(k);
		
	}

}
