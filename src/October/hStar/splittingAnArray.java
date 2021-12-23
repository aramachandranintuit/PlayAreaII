package October.hStar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given an integer array arr[], the task is to check if the input array 
 * can be split in two sub-arrays such that: 
Sum of both the sub-arrays is equal.
All the elements which are divisible by 5 should be in the same group.
All the elements which are divisible by 3 (but not divisible by 5) should be in the other group.
Elements which are neither divisible by 5 nor by 3 can be put in any group.
 * 
 * 
 */
public class splittingAnArray {
	
	public static void main(String[] args)
	{
		int [] a= { 1, 2,3,4,5,6};
//		findSplittingPoint(a);
		System.out.println(isequalSplitPossible(a,0,0,0));
//		String[] b = new String[3];
//		Arrays.fill(b,"0");
//		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(a));
		
	}
	// function to split an array equally with same sum;
	public static void findSplittingPoint(int[] nums)
	{
		int leftSum=0;
		int rightSum=0;
		for(int i=0;i<nums.length;i++)
		{
			leftSum+=nums[i];
		}
		for(int i=0;i<nums.length;i++)
		{
			leftSum-=nums[i];
			rightSum+=nums[i];
			if(leftSum==rightSum) System.out.println(i);			
		}
	}
	// function to split an array based on certain conditions
	/*
	 * Sum of both the sub-arrays is equal.
		All the elements which are divisible by 5 should be in the same group.
		All the elements which are divisible by 3 (but not divisible by 5) should be in the other group.
		Elements which are neither divisible by 5 nor by 3 can be put in any group.
		If possible then print Yes else print No.
	 * 
	 */

	public static boolean isequalSplitPossible(int[] nums,int lsum,int rsum, int index)
	{
		
		if(index==nums.length)
		return lsum==rsum;
		if(nums[index]%5==0) lsum+=nums[index];
		else if(nums[index]%3==0)rsum+=nums[index];
		else
		{
			return isequalSplitPossible(nums,lsum+nums[index],rsum,index+1) || isequalSplitPossible(nums,lsum,rsum+nums[index],index+1);
		}
		return isequalSplitPossible(nums,lsum,rsum,index+1);
		
	}
}
