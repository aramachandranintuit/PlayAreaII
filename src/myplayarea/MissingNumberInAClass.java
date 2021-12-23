package myplayarea;

public class MissingNumberInAClass {
	
	public static void main(String[] args)
	{
		int[] n = {1,2,4};
		
		int arrLength = n.length;
		
		int count =0;
		for(int i=1;i<=arrLength;i++)
		{
			if (i!= n[count++])
			{
				System.out.println("missing number is "+ i);
			}
		}
		
		
	}

}
