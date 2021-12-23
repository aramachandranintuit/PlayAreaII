package myplayarea;

import java.util.Arrays;

public class ArithmaticProgression {
	
	public static void main(String[] args)
	{
		int a[] = {4,2,6,10,8};
		int length = a.length;
		Arrays.sort(a);
		int  i =1;
		int m=2;
		while( m<=5)
		{
			i = i+m;
			m++;
		}
		System.out.println(i*(a[1]-a[0]));
		
	}

}
