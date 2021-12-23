package Medium;

import java.util.Arrays;

public class OrderIntegers {
	
	public static void main(String[] args)
	{
		int[] n ={3,2,1,4,5,6,7};
		int j=0;
		for(int i=0;i<n.length;i++)
		{
			if(n[i]%2!=0)
			{
				n[j++]=n[i];
			}
		}
	  System.out.println(Arrays.toString(Arrays.copyOfRange(n,0,j)));
	}

}
