package DS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ArrayRotation {
	
	public static void main(String[] args)
	{
		
		Integer[] a = {1,2,3};
//		rotate(a,a.length,a.length);
		ArrayRotation r = new ArrayRotation();
		print(r.findDigits(Arrays.asList(a), 5),2);
		
		
	}
	
	
	private int[] findDigits(List<Integer> numList ,int sum)
	{		
		List<Integer> temp = numList;
		Collections.sort(numList);
		int[] index = new int[2];
		index[0]=-1;
		index[1]=-1;
		for(int i=0;i<=numList.size()-2;i++)
		{
			if( numList.get(i)+ numList.get(i+1) == sum)
			{
				index[0]=temp.indexOf(numList.get(i));
				index[1]=temp.indexOf(numList.get(i+1));
				return index;
			}
			else if (numList.get(i) + numList.get(i+1) > sum)
			{
				return index;
			}
		}
		return index;
		
	}
	
	private static void print(int[] nos,int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(nos[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
	}
	
	
	private static void rotate(Integer[] nos,int size,int n)
	{
		if(size==1)
		{
			print (nos,n);
		}
		for(int i=0;i<size;i++)
		{
			rotate(nos,size-1,n);
			if(size%2==1)
			{
				int temp =nos[0];
				nos[0] =nos[size-1];
				nos[size-1]=temp;
			}
			else
			{
				int temp = nos[i];
				nos[i]=nos[size-1];
				nos[size-1]=temp;
			}
		}
	}
	
	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            {
	        			permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	            }
	    }
	}
	
	private static void permutate(Integer[] a)
	{
		
		for(int i=0;i<a.length;i++)
		{
			HashSet<Integer> set = new HashSet<Integer>();
			int temp = a[i];
			if(i==a.length-1)
			{
				a[i]=a[0];
				a[0]=temp;
			}
			else
			{
				a[i]=a[i+1];
				a[i+1] = temp;
			}
			Integer[] newA = a;
			set.addAll(Arrays.asList(newA));
			System.out.println(set);
		}
		System.out.println("\n");	
	}

}
