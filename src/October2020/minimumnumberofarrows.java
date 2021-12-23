package October2020;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.TreeMap;

public class minimumnumberofarrows {
	public static void main(String[] args)
	{ 
//		int[][]a = {{-1,1},{0,1},{2,3},{1,2}};
//		int[][]a = {{1,2},{3,4},{5,6},{7,8}};
		String a = "aaaa";
		int i=0;
		String r = "aa";
		String result ="";
		Stack<String> s = new Stack<String>();
		while(i<a.length()-r.length())
		{
			if(a.substring(i,i+r.length()).equals(r) && s.size()>0 && s.peek()!="X")
			{
				s.push("X");
			}
			else if(a.substring(i,i+r.length()).equals(r) && s.size()==0)
			{
				s.push("X");
			}
			else if(!a.substring(i,i+r.length()).equals(r))
			{
				s.push(a.substring(i,i+r.length()));
			}
			i=i+r.length();			
		}
		if(i<a.length() && a.substring(i)!="aa")
		{
			s.push(a.substring(i));			
		}
		if(i<a.length() && a.substring(i)=="aa")
		{
			s.push(a.substring(i));			
		}
		System.out.println(s);
		
		
//		Arrays.sort(a,new Comparator<int[]>() {
//			@Override
//			public int compare(int[] a ,int []b)
//			{
//				return a[1] - b[1];
//			}			
//			
//		});
//		
//		Arrays.sort(a, new Comparator<int[]>() {			
//			@Override
//			public int compare(int[]a ,int[] b)
//			{
//				return a[1]-b[1];
//			}
//		});
//		int counter=1;
//		int end = a[0][1];
//		for(int i=1;i<a.length;i++)
//		{
//			if(a[i][0]<=end)
//			{
//				end = Math.min(end, a[i][1]);
//			}
//			else if (a[i][0]>end)
//			{
//				counter++;
//				end=a[i][1];
//			}
//		}
//		System.out.println(counter);
//		
		
	}

}
