package mock;

import java.util.Arrays;

public class removeDuplicates {
	
	public static void main(String[] args)
	{
		int[] nums= {0,0,1,1,2,3,3,4,4};
//		nums=removeDuplicates(nums);
		nums=deDup(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	
	public static int[] deDup(int[] nums)
	{
		int j=0;
		for(int i=0;i<nums.length-1;i++)
		{
			if(nums[i]!=nums[i+1])
			{
				nums[j]=nums[i];
				j++;
			}
		}
		nums[j]=nums[nums.length-1];
		return Arrays.copyOfRange(nums, 0,j+1);
	}
	public static int[] removeDuplicates(int[] nums) {
        int c1=1;
        int c2=2;
        int l=0;
        int[] temp = new int[nums.length];
        temp[0]=nums[0];
        while(c1<nums.length && c2<nums.length)
        {
        	if(nums[c1]==nums[c2])
        	{
        		if(c2!=nums.length-1)
        		{
        			c2 = findNextUniqueNumber(c2,nums);
        			nums[l]=nums[c1];
        			c1=c2;
        			c2++;
        			l++;
        		}
        		else
        		{
        			return temp;
        		}
        	}
        	else if(nums[c1]!=nums[c2])
        	{
        		nums[l]=nums[c1];
        		c1=c2;
        		c2++;
        		l++;
        	}
            
          
        }
        return temp;
        
    }
    
    private static int findNextUniqueNumber(int index, int[] nums)
    {
        int temp = nums[index];
        for(int i=index+1;i<nums.length;i++)
        {
            if(nums[i]!=temp)
                return i;
        }
        return index;
    }

}
