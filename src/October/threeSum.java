package October;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
	
	public static void main(String[] args)
	{
		int []nums = {-1,0,1,2,-1,-4};
		int target =0;
		List<List<Integer>> list = new ArrayList();
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++)
		{

			if(i==0 || nums[i]==nums[i-1]) {
				List<Integer> ls = threeSum(i,0,nums);
				if(ls.size()>0) list.add(ls);
			}
			
		}
		for(List<Integer> aList:list)
		{
			System.out.println(aList);
		}
	}
	
	public  static List<Integer> threeSum(int index,int target,int[] nums)
	{
		int i =index+1;
		int j= nums.length-1;
		List<Integer> ls =new ArrayList();;
		while(i<j)
		{
			if(nums[index]+nums[i]+nums[j]>target)j--;
			else if(nums[index]+nums[i]+nums[j]<target)i++;
			else if(nums[index]+nums[i]+nums[j]==target)
			{
				
				ls.add(nums[i++]);
				ls.add(nums[index]);
				ls.add(nums[j--]);
				while(i<nums.length-1 && nums[i]==nums[i-1])i++;
				
			}						
		}
		return ls;
		
	}

}
