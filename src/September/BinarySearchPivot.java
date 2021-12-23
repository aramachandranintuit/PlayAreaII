package September;

public class BinarySearchPivot {
	
	/*
	 * the problem of finding the pivot in a sorted rotated array can be solved if we can find the minimum in a
	 * rotated array as if minimum is at 0 , array is not rotated
	 * else pivot index is minimum index-1
	 * 
	 */
	public static void main(String[] args)
	{
		int [] a = {4,4,5,6,7,7,7,8,9,9,9,1};
		int minIndex = BinarySearch(a);
		int pivot = minIndex == 0 ? 0: minIndex-1;
		System.out.println(a.length);
		System.out.println(pivot);
		System.out.println(a[pivot]);
	}
	
	public static int BinarySearch(int[] nums)
	{
		int start=0;
		int end=nums.length-1;
		int mid= start + (end-start)/2;
		while(start<end)
		{
			if(nums[mid]<nums[end])end=mid;
			else if(nums[mid]>nums[end]) start=mid+1;
			else if(nums[mid]==nums[mid+1])end--;
			mid=start+(end-start)/2;
		}
		return start;
	}

}
