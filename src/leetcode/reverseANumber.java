package leetcode;

public class reverseANumber {
	
	public static void main(String[] args)
	{
		int a = 567;
		System.out.println(new reverseANumber().reverse(a));
		
		String str =null;
		String.r
	}
	
	private  int reverse(int a)
	{
		int reverserd =0;
		while(a>0)
		{
			int n = a%10;
			reverserd = reverserd*10 + n;
			a=a/10;
			
		}
		return reverserd;
	}

}
