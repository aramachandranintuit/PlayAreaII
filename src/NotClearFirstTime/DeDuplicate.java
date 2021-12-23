package NotClearFirstTime;

import java.util.Arrays;

public class DeDuplicate {
	public static void main(String[] args)
	{
		int [] a= {1,2,1,31,2,2,3,3,4,4,5,5};
		Arrays.sort(a);
		int j=0;
		for(int i=0;i<a.length-2;i++)
		{
			if(a[i]!=a[i+2]) a[j++]=a[i];			
		}
		a[j++]=a[a.length-2];
		a[j]=a[a.length-1];
		System.out.println(Arrays.toString(Arrays.copyOfRange(a, 0, j+1)));
	}

}
