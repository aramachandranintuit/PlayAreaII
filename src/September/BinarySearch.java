package September;

/*
 * 
 * The below program is used to get the total number of unique elements in a sorted array.
 * we are doing it in log n.
 */
public class BinarySearch {
	
	public static void main(String[] args) {
//		int[] a = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
		int[] a = {5,7,7,8,8,10};
		System.out.println(bSearch(a,6));
//		int ans=0;
//		int index=0;
//		while(index+1<a.length)
//		{
//			index=getLastIndex(a,a[index]);
//			index++;
//			ans++;
//			if(index<a.length)getLastIndex(a,a[index]);
//		}
//		System.out.println(ans);
		
//		int b[] = {2,3,4,5,1};
//		System.out.println(MinimumInARotatedArray(b));
	}
	
	public static int getLastIndex(int[] a,int target)
	{
		int l=0;
		int r =a.length-1;
		int mid= (r+l)/2;
		int res=-1;
		while(l<=r)
		{
			if(a[mid]>target) r=mid-1;
			else if(a[mid]<target)l=mid+1;
			else
			{
				if(a[mid]==target)
				{
					res=mid;
//					l=mid+1;
					r=mid-1;
				}
			}
			mid=(l+r)/2;
		}
		return res;
	}
	
	public static int bSearch(int[] a,int t)
	{
		int start=0;
		int end = a.length-1;
		int mid= start+(end-start)/2;
		while(start<end)
		{
			if(a[mid]<t)end=mid+1;
			else if(a[mid]>t) start=mid-1;
			else return mid;
			mid = start+(end-start)/2;
		}
		return a[mid];
	}
	public static int MinimumInARotatedArray(int[] a)
	{
		int start=0;
		int end = a.length-1;
		int mid= start+(end-start)/2;
		while(start<end)
		{
			if(a[mid]<a[end])end=mid;
			else if(a[mid]>a[end]) start=mid+1;
			else end--;
			mid = start+(end-start)/2;
		}
		return a[start];
	}

}
