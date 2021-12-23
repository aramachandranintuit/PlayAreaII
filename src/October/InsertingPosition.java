package October;

public class InsertingPosition {
	public static void main(String[] args)
	{
	int [] nums = {1,3,5,6};
	int target = 5;
	int r = insertionPostion(nums,5);
	int l = insertionPostion2(nums,5);
	System.out.println("via std algo "+ l);
	System.out.println(r);
	}


public static int insertionPostion(int[] nums,int target)
{
	int l=0;
	int r=nums.length-1;
	int mid = l+(r-l)/2;
	int ans=0;
	while(l<=r)
	{
		if(nums[mid]>=target)
		{
			ans=mid;
			r=mid-1;
		}
		else
			l=mid+1;
		mid = l+(r-l)/2;
	}
	return ans;
}

public static int insertionPostion2(int[] nums,int target)
{
	int l=0;
	int r=nums.length-1;
	int mid = l+(r-l)/2;
	int ans=0;
	while(l<=r)
	{
		if(nums[mid]>target)
		{
			ans=mid;
			r=mid-1;
		}
		else if(nums[mid]<target) l=mid+1;
		else return mid;
		mid = l+(r-l)/2;
	}
	return l;
}
}