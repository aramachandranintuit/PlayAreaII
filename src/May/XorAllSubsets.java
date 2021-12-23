package May;

import java.util.ArrayList;
import java.util.List;

public class XorAllSubsets {
	
	public static void main(String[] args)
	{
		XorAllSubsets instance = new XorAllSubsets();
		int[] nums = {3,4,5,6,7,8};
		System.out.println(instance.subsetXORSum(nums));
		
	}
	
public int subsetXORSum(int[] nums) {
        
        int[] sum = new int[1];
        dfs(nums,new ArrayList<Integer>(),sum,0);
        return sum[0];
    }
    
    public void dfs(int[] nums, List<Integer> list,int[] sum,int index)
    {
         if(index>nums.length) return;    
//    		System.out.println(index);
            int temp=0;
            for(int c : list)
               temp ^= c ;
            sum[0]+=temp;
            System.out.println(sum[0]);
            for(int i=index;i<nums.length;i++)
            {
                list.add(nums[i]);
                System.out.println(list);
                dfs(nums,list,sum,i+1);
                list.remove(list.size()-1);
                System.out.println(list);
            }
        
    }

}
