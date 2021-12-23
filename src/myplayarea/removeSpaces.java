package myplayarea;

public class removeSpaces {
	
	public static void main(String[] args)
	{
		String input = "geeks for geeks";
		char[] inputChar = input.toCharArray();
		System.out.println( inputChar);
		for(int i=0;i<inputChar.length;i++)
		{
			if(inputChar[i] ==' ')
			{
				inputChar[i++] = inputChar[i];
				
			}
		}
		System.out.println(inputChar);
		
	}

}
