package september2020;

import java.util.Arrays;

public class ZerosAndOnes {
	public static void main(String[] args)
	{
		int[] num = {0,1,0,1,0,0};
		order(num);
		System.out.println(Arrays.toString(num));
	}
	
	public static void order(int[] num)
	{
		int c1=0;int c2=1;
		for(;c2<=num.length-1;)
		{
			if(num[c1]==0 && num[c2]==1)
			{
				c1++;
				c2++;
			}
			else if(num[c1]==1 && num[c2]==1)
			{
				c2++;
			}
			else if(num[c1]==1 && num[c2]==0)
			{
				int temp = num[c1];
				num[c1]=num[c2];
				num[c2]=temp;
				c1++;
				c2++;
			}
			else if(num[c1]==0 && num[c2]==0)
			{
				c2++;
			}
		}
	}

}
