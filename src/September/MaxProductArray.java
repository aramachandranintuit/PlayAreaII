package September;

public class MaxProductArray {
	public static void main(String[] args)
	{
		int [] a= {2,3,-2,4};
		MaxProductArray o = new MaxProductArray();
		int r =o.maxProduct(a);
		System.out.println(r);
		
	}
	public int maxProduct(int[] nums)
	{
		if(nums.length==1)return nums[0];
		int pre=1;
		int post=1;
		int max=1;
		for(int i=0;i<nums.length;i++)
		{
			pre*=nums[i];
			post*=nums[nums.length-1-i];
			max= Math.max(max, Math.max(pre, post));
			if(pre==0)pre=1;
			if(post==0)post=1;
		}
		return max;
		
	}

}
