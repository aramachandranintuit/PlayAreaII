package mock;

import java.util.Arrays;

/*
 * product of nos without 
 */
public class productOfNumbers {
	
	
	public static void main(String[] args)
	{
		String str="";

		int[] a = {1,2,3,4};
		int[] left=Arrays.copyOfRange(a,0,a.length);
		int[] right=Arrays.copyOfRange(a,0,a.length);
		left[0]=1;
		for(int i=1;i<a.length;i++)
		{
			left[i]= a[i-1]*left[i-1];
		}
		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(a));
		right[a.length-1]=1;
		for(int i=a.length-2;i>=0;i--)
		{
			right[i]=a[i+1]*right[i+1];
		}
		System.out.println(Arrays.toString(right));
		int[] n = new int[a.length];
		n[0]=right[0];
		n[a.length-1]=left[a.length-1];
		for(int i=1;i<a.length-1;i++)
		{
			n[i]=left[i]*right[i];
		}
		System.out.println(Arrays.toString(n));
	}

}
