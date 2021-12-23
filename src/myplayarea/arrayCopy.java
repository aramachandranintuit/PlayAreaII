package myplayarea;

public class arrayCopy {
	
	public static void main(String[] args)
	{
		int a[] = {1,2,3,4,5};
		int b[] = new int[5];

		for (int i=0;i<a.length;i++)
		{
			b[i] = a[i];
		}

		for (int i=0;i<a.length;i++)
		{
			a[i]= a[i]+1;
		}
		
		for (int i=0;i<a.length;i++)
		{
			System.out.print("b : "+ b[i] + "  ");
			System.out.println("a : "+ a[i]);
		}

		
		
	}

}
