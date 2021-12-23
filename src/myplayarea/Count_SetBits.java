package myplayarea;

public class Count_SetBits {
	public static void main(String[] args)
	{
//		int bitCount=0;
//		for(int i=0;i<=3;i++)
//		{
//			bitCount+= new Count_SetBits().countSetBits(i);	
//		}
//		System.out.println(bitCount);
//		int n=6;
//		int count =0;
//		while(n>0)
//		{
//			n= n & (n-1);
//			count ++;
//		}
		System.out.println(countSetBitsWithAnd(3));
	}
	
	private static int countSetBitsWithAnd(int a)
	{
		int r=a;
		int c=0;
		while(a>0)
		{
			a = a & (a-1);
			c++;
		}
		return c;
	}
	private int countSetBits(int x)
	{
		if(x==0)
		{
			return 0 ;
		}
		else return (x % 2 ==0 ? 0:1 ) + countSetBits(x/2);
	}
}
