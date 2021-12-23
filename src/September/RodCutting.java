package September;

import java.util.Arrays;

/*
 * 
 * The following problem is used to determine 
 */
public class RodCutting {
	
	public static void main(String[] args)
	{
//		int[] l = {1,2,3,4,5,6,7,8,9,10};
		int [] p= {1, 5, 8, 9, 10, 17, 17, 20};
		int[] res = new int[p.length+1];
		for(int i=1;i<=p.length;i++)
		{
			int q=Integer.MIN_VALUE; 
			for(int j=0;j<i;j++)
			{
				q=Math.max(q,p[j]+res[i-j-1]);
				res[i]=q;
			}
		}
		System.out.println(Arrays.toString(res));
	}

}
