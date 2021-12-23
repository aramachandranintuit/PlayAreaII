package feb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
	public static void main(String[] args)
	{
		int[] a = {5,6,2,8,2,4,3};
		int target=13;
		Arrays.sort(a);
		
		List<List<Integer>> aList = new ArrayList<List<Integer>>();
		for(int i=0;i<a.length;i++)
		{
			List<Integer> list=null;
			list = twoSum(a,target-a[i],i);
			if(list!=null)
			{
				list.add(a[i]);				
				aList.add(list);
			}
		}
		System.out.println(aList);
		
	}
	
	public static List<Integer> twoSum(int[] a, int target,int index)
	{
		int i=0;
		int j=a.length-1;
		List<Integer> list = null;
		while(i<j && i!=index && j!=index)
		{
			if( a[i]+a[j] == target) {
				list= new ArrayList<Integer>();
				list.add(a[i]);
				list.add(a[j]);
				return list;
			}
			else if( a[i]+a[j] < target) i++;
			else  j--;
		}
		return list;
	}

}
