package september2020;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	
	public static void main(String[]args)
	{
		int[] nums= {1,3,1,5,4};
		int k=0;
		int r = findPairs(nums,k);
		System.out.println(r);
	}
	public static int findPairs(int[] nums, int k) {
		Arrays.sort(nums);
        int c1=0;
        int c2=1;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        while(c2<nums.length && c1<nums.length)
        {
	        	if(c1==c2 && c2!=nums.length-1)
	        	{
	        		c2++;
	        	}	  
           if(Math.abs(nums[c1]-nums[c2])>k)
           {
               c1++;               
           }
            else if(Math.abs(nums[c1]-nums[c2])<k)
            {
                c2++;
            }
            else if(Math.abs(nums[c1]-nums[c2])==k)
            {
            		if(c1==c2)
            			return map.size();
                if(nums[c1]<=nums[c2] && !map.containsKey(nums[c1]))
                    map.put(nums[c1],nums[c2]);
                else if(nums[c1] > nums[c2] && !map.containsKey(nums[c2]))
                    map.put(nums[c2],nums[c1]);
                c1++;
                c2++;
            }
            
        }
        return map.size();
        
    }
}
