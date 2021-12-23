package September;
/*
 *  [3,4,5,1,2]
 *  [4,5,6,7,0,1,2]
 *	[11,13,15,17]
 * 
 */

public class minimumInARotatedArray {
	
	public static void main(String[] args)
	{
		int nums[] = {3,4,5,1,2};
		if(nums[0]<nums[nums.length-1]) {
			System.out.println(nums[0]);
			return;
		}
		int l=0;
		int r =nums.length-1;
		int mid =l +(r-l)/2;
		while(l<=r)
		{
			if(nums[mid]>nums[mid+1]) {
				System.out.println(nums[mid+1]);
				return;
			}
			if(nums[mid-1]>nums[mid]) {
				System.out.println(nums[mid]);
				return;
			}
			else if(nums[mid]<nums[0]) l=mid+1;
			else
			{
				r=mid-1;
			}
		}
		
	}

}
