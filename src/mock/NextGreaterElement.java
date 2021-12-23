package mock;

import java.util.Arrays;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Map;
import java.util.HashMap;

public class NextGreaterElement {
	
	public static void main(String[] args)
	{
		int[]a = {4, 5, 2, 25};
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			map.put(a[i], i);
		}
		for(int i=0;i<a.length;i++)
		{			
			System.out.println();
		}
		
	}
	
	private static int nextBigElement(Map<Integer,Integer> map,int m)
	{
		
	}

}
