package myplayarea;

public class DecimalToBinary {
	public static void main(String[] args)
	{
		int a =2;
		char[] a1 = convertToBinary(6).toCharArray();
		char[] a2 = convertToBinary(7).toCharArray();
		int diff =0;
		for(int i=0;i< (a1.length > a2.length ? a1.length : a2.length);i++)
		{
			if(i < a1.length && i < a2.length)
			{	if((a1[i]!=a2[i]))
				{
					diff++;
				}
				else if(a1[i] == a2[i])
				{				
					
				}	
			}
			else
			{
				diff = diff + (a1.length > a2.length ? a1.length -a2.length : a2.length - a1.length);
			}
		}
		System.out.println(diff);
		
	}
	
	private static String convertToBinary(int a)
	{
		if(a>=2)
		{
			return a%2 + convertToBinary(a/2);
		}
		else
			return a+"";
	}
}
