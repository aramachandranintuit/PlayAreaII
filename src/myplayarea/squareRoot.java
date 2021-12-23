package myplayarea;

public class squareRoot {
	
	public static void main(String[] args)
	{
		int a = 144;
		boolean flag = false;
		for(int i =2;i<=144/2;i++)
		{
			if(i*i == a)
			{
				System.out.println(i+" is the square root");
				flag = true;
				break;
				
			}
			
		}
		
		if(!flag)
		{
			System.out.println(a + " is not a perfect square");
		}
		
	}

}
