package Test;

import java.util.LinkedList;
import java.util.List;

public class Merge_2_sorted_linked_lists {
	public static void main(String[] args)
	{
		int[] a = { 3,5,7,8,9,10,13};
		int[] b = {1,4,6,11,12};
		int[] c = new int[a.length+b.length];
		int i =0,j=0,k=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				c[k]=a[i];
				i++;
			}
			else
			{
				c[k]=b[j];
				j++;
			}
			k++;
		}
		while(i<a.length)
		{
			c[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length)
		{
			c[k]=b[j];
			j++;
			k++;
		}
		
		for(i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
		
	}

}
