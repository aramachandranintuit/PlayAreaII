package myplayarea;

public class fibinoci {
	
	public static void main(String[] args)
	{
		System.out.println(fibinociSeries(2));
	}
	
	public static int fibinociSeries(int n)
	{
		if(n<=1)
		{
			return n;
		}
		else
		{
			return fibinociSeries(n-1) + fibinociSeries(n-2);
		}
	}

}

// 0 ,1,1,2,3,5
