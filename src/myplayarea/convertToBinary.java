package myplayarea;

public class convertToBinary {	
	public static void main(String[] args)
	{
		int a=6;
		
		System.out.println(convertToBinary(a));
		
	}
	private static String convertToBinary(int a)
	{
		if( a >=2)
		{
			return  convertToBinary(a/2) +a%2;
		}
		else 
			return a + "";
	}

}
