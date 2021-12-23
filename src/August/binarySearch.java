package August;

public class binarySearch {
	
	public static void main(String[] args)
	{
		
		int a[] = {1,3,5,6};
		int target = 5;
		int l=0;
		int r=a.length-1;
		int mid = l+(r-l)/2;
		int ans=0;
		while(l<r)
		{
			mid = l+(r-l)/2;
			if(a[mid]>=target) {
				ans=mid;
				r=mid-1;
			}
			else
				l=mid+1;
		}
		System.out.println(mid);
	}

}
