package NotClearFirstTime;

import java.util.Arrays;

public class missingPositiveNumber {
	
	public static void main(String[] args)
	{
		int a[] = {4,3,2,7,1};
		for(int i=0;i<=a.length-1;i++)
		{
			int x = Math.abs(a[i]);
			if(x >0 && x<a.length)
			{
				a[x-1] = -1*a[x-1];
			}			
		}
		System.out.println(Arrays.toString(a));
	}

}
