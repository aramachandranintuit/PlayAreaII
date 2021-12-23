package september2020;

import java.util.HashMap;

public class maximumpartitions {
	
	public static void main(String[] args)
	{
		String str ="abacadbjkjljiiuou";
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(1, 0);
		int lastIndex=str.lastIndexOf(str.charAt(0));
		int currentPartition =1;
		for(int i=1;i<str.length();i++)
		{
			if(str.lastIndexOf(str.charAt(i))>lastIndex && str.indexOf(str.charAt(i))>lastIndex )
			{
				lastIndex=str.lastIndexOf(str.charAt(i));
				map.put(currentPartition++,lastIndex);
			}
			else if(str.lastIndexOf(str.charAt(i))>lastIndex && str.indexOf(str.charAt(i))<lastIndex )
			{
				lastIndex=str.lastIndexOf(str.charAt(i));
				map.put(currentPartition,lastIndex);
			}
			
		}
		System.out.println(map.keySet());
	}
 }
