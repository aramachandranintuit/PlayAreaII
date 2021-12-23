package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	
	public static void main(String[] args)
	{
		int nums[] = new int[] {3,2,3};
		int target =6;
		System.out.println(twoSum(nums,target)[0]);
		System.out.println(twoSum(nums,target)[1]);
	}

    public static int[] twoSum(int[] nums, int target) {
    
        int[] original = nums.clone();
        Arrays.sort(nums);
        int j=1;
        int[] a = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            while( (j < nums.length))
            {
					if (nums[i] + nums[j] == target) {
						a[0] = getIdex(original, nums[i]);
						a[1] = getIdex(original, nums[j]);
						return a;
					} else {
						j++;

					}
            }
            j=0;
            
        }
        return new int[]{};
    }
    
    private static int getIdex(int[] arr,int a)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==a)
            {   
                arr[i]=0;
                return i;
            }
        }
        return -1;
    }


}
