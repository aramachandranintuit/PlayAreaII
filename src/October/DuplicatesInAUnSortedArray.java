package October;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:

Input: nums = [1,1,2]
Output: [1]
Example 3:

Input: nums = [1]
Output: []
 * 
 * 
 */
public class DuplicatesInAUnSortedArray {
	
	public static void main(String[] args)
	{
		int arr[] = {1,1,2};
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			int index = Math.abs(arr[i])-1;
			if(arr[index]<0) list.add(Math.abs(arr[i]));
			else arr[index]=-arr[index];			
		}
		System.out.println(list);
	}

}
