package June;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CombinationSum {
	static List<List<Integer>> aList = new ArrayList<List<Integer>>();
	
	public static void main(String[] args)
	{
		int arr[] = {2,3,4};
		int res =7;
		combinationSum(arr,7,0,new ArrayList<Integer>());
		for(List<Integer> r: aList)
		{
			System.out.println(r);
		}
		
	}
	
	public static void combinationSum(int[] arr ,int sum ,int index,List<Integer> list)
	{
		if(sum==0)
		{
			List<Integer> res = new ArrayList<>(list);
			aList.add(res);
		}
		if(sum<0) return;
		for(int i=index;i<arr.length;i++)
		{
			list.add(arr[i]);
			combinationSum(arr,sum-arr[i],i,list);
			list.remove(list.size()-1);
		}
		
	}

}
