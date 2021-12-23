package August;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
	public static void main(String [] args)
	{
		int[] arr = {1,2,3,4,5};
		int[] d=new int[3];
		System.arraycopy(arr, 2, d, 0, d.length);
		System.out.println(Arrays.toString(d));
		int target= 7;
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> aList = new ArrayList<Integer>();
//		combinationSum(arr,0,list,aList,target,0);
		combinationSum(arr,0,7,0,list,aList);
		for(List<Integer> l: list)
		{
			System.out.println(l);
		}
	}
	
	public static void combinationSum(int[] arr,int index, List<List<Integer>> list,List<Integer> aList,int target, int sum)
	{
		
		if(sum==target)
		{
			list.add(new ArrayList<>(aList));
			return;
		}
		if(sum> target) return;
		for(int i=index;i<arr.length;i++)
		{
			
			aList.add(arr[i]);
			combinationSum(arr,i,list,aList,target,sum+arr[i]);
			aList.remove(aList.size()-1);
		}
	}
	
	public static void combinationSum(int[] a,int index,int target,int sum,List<List<Integer>> list,List<Integer> aList)
	{
		if(target==sum)
		{
			list.add(new ArrayList<>(aList));
			return;
		}
		if(sum>target) return;
		for(int i=index;i<a.length;i++)
		{
			aList.add(a[i]);
			combinationSum(a,i,target,sum+a[i],list,aList);
			aList.remove(aList.size()-1);
		}
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
