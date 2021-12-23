package leetcode;

public class prime {
	public static void main(String[] args)
	{
		
	}
	
	public boolean isPrime(int a)
	{
		if(a%2==0)
			return false;
		for(int i=3;i<a/2;i=i+2)
		{
			if(a%i==0)
				return false;
		}
		return truel
	}
}
