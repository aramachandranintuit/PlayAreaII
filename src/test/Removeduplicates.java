package Test;

import java.util.HashMap;

public class Removeduplicates {
	
	public static void main(String[] args)
	{
		int[] a = {1,1,2,3,4,5,5};
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			map.put(a[i],map.containsKey(a[i]) == true ? map.get(a[i])+1 :1);
		}
		System.out.println(map.keySet());
		
	}

}
