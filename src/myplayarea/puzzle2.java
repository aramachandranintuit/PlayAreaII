package myplayarea;

public class puzzle2 {
	
	int a =10;
	int b=5;
	
	public static void main(String[] args)
	{
		new puzzle2().go();
	}
	
	public void go()
	{
		new puzzle2().new n().getA();
	}
	
	class n
	{	
		public void getA()
		{
			System.out.println(a);
		}
	}

}
