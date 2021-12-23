package December;

import java.util.Arrays;

public class FindDuplicates {
	
	public static void main(String[] args)
	{
		int[] nums = {1,1,1,1,1,1,2,3,4,4};
		int i=0;
		int j=0;
		for(i=0;i<nums.length-1;i++)
		{
			if(nums[i]!=nums[i+1])
			{
				nums[j++]=nums[i];
			}
			
		}
//		nums[j++]=nums[nums.length-2];
		nums[j++]=nums[nums.length-1];
		
		System.out.println(Arrays.toString(Arrays.copyOfRange(nums,0,j)));
	}
	
	

}
