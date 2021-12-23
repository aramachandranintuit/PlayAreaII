package DS;

import java.util.SortedSet;
import java.util.TreeSet;

public class ContaisDuplicate111 {
	public static void main(String[] args)
	{
		
	}
	
	public static boolean customDuplicate(int[] nums ,int k , int t)
	{
		if(nums.length <=1 || k<0 || t<0)
			return false;
		TreeSet<Long> set = new TreeSet<Long>();
		for(int i=0;i<nums.length;i++)
		{
			Long leftBoundary= (long)nums[i]-k;
			Long rightBoundary=(long)nums[i]+k+1;
			SortedSet<Long> subSet = set.subSet(leftBoundary, rightBoundary);
			if(subSet.size()>0)
				return true;
			set.add((long)nums[i]);
			if(set.size()>=k)
				set.remove((long)nums[i-k]);
		}
		return false;
	}

}
