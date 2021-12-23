package September;

import java.util.Arrays;

public class plusOne {
	
	public static void main(String[] args)
	{
		System.out.println(Arrays.toString(plusOne(new int[]{1,2,3})));
		System.out.println(Arrays.toString(plusOne(new int[]{1,9,9})));
//		plusOne({1,2,3});
	}
	
	public static int[] plusOne(int[] nums)
	{
		for(int i=nums.length-1;i>=0;i--)
		{
			if(nums[i]<9) {
				nums[i]++;
				return nums;
			}
			nums[i]=0;
		}
		int[] res= new int[nums.length+1];
		res[0]=1;
		return res;
	}

}
