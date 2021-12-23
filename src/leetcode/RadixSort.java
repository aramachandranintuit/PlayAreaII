package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.lang.Number.*;

public class RadixSort {
	
	static int maximum =0;
	public static void main(String[] args)
	{
		List<String> list  = new ArrayList<String>();
		int a[] = {100,300,17,-2000,9,10};
		RadixSort rx = new RadixSort();
		maximum = rx.findMaximum(a);
		int numOfDigits = rx.findNumberOfDigitsInMaximum(maximum);
		for(int i=1;i<=numOfDigits;i++)
		{
			HashMap<Integer,List<Integer>> sortedMap = (HashMap<Integer, List<Integer>>) rx.radixSort(a, (int)Math.pow(10,i ));
			 a =rx.populateArray(sortedMap, a,((int)Math.pow(10,i ))-1);
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	private int findNumberOfDigitsInMaximum(int maximum)
	{
		int i=1;
			while(maximum/10 >0)
			{
				maximum = maximum/10;
				i++;
			}
		return i;	
	}
	
	private int findMaximum(int a[])
	{
		int maximum =a[0]; 
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>maximum)
				maximum = a[i];
		}
		return maximum;
	}
	
	private Map<Integer,List<Integer>> radixSort(int[] a,int exp)
	{
		Map<Integer,List<Integer>> sortedMap = new HashMap<Integer,List<Integer>>();
		for(int i=0;i<a.length;i++)
		{
			Integer digit = a[i]%exp;
			if(sortedMap.containsKey(digit))
				sortedMap.get(digit).add(a[i]);
			else
				{
					List<Integer> list = new ArrayList<Integer>();
					list.add(a[i]);
					sortedMap.put(digit, list);
				}
		}
		return sortedMap;
	}
	
	private int[] populateArray(Map<Integer,List<Integer>> sortedMap,int[] a,int maximum)
	{
		int k=0;
		for(int i=0;i<=maximum;i=i+1)
		{			
			int temp = i;
			if(sortedMap.containsKey(i))
			{
				List<Integer> nos = sortedMap.get(i);
				for(int j=0;j<nos.size();j++)
				{
					a[k] = nos.get(j);
					k++;
				}
			}
		}
		return a;
	}
	

}
