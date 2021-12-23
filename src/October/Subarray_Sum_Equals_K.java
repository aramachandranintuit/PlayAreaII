package October;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 * Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.
Example 1:
Input: nums = [1,1,1], k = 2
Output: 2
Example 2:
Input: nums = [1,2,3], k = 3
Output: 2
 * 
 */

public class Subarray_Sum_Equals_K {
	
	public static void main(String[] args)
	{
		Map<Integer,Integer> map = new HashMap();
		map.put(0,1);
		int [] a = {1,2,3};
		int sum=0;
		int k=3;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			if(map.containsKey(sum-k)) count+=map.get(sum-k);
			map.put(sum,map.getOrDefault(sum,0)+1);
		}
		System.out.println(count);
	}

}
