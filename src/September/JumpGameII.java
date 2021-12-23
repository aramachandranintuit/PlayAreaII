package September;

/*
 * 
 * Given an array of non-negative integers nums, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

You can assume that you can always reach the last index.

Example 1:

Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2.
 Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [2,3,0,1,4]
Output: 2
 * 
 */
public class JumpGameII {
	public static void main(String[] args)
	{
		int[] nums= {2,3,0,1,4};
		JumpGameII o = new JumpGameII();
		int res = o.minimumJumps(nums);
		System.out.println(res);
	}
	
	public int minimumJumps(int[] nums)
	{
		int target=0;
		int jumps=0;
		int max=0;
		for(int i=0;i<nums.length-1;i++)
		{
			max= Math.max(max, i+nums[i]);
			if(i==target)
			{
				target=max;
				jumps++;
			}
		}
		return jumps;
	}

}
