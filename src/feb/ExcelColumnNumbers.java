package feb;

import java.util.HashMap;
import java.util.Map;

public class ExcelColumnNumbers {
	
	public static void main(String[] args)
	{
		String str="CZ";
		int j=0;
		int sum=0;
		for(int i=str.length()-1;i>=0;i--)
		{
			sum+=((str.charAt(i)-'A') +1)*(int)(Math.pow(26,j));
			j++;
		}
		System.out.println(sum);
		sum=0;
//		for(int i=str.length()-1;i>=0;i--)
//		{
//			sum+=sum*26+((str.charAt(i)-'A')+1);
//		}
//		System.out.println(sum);
	}

}
