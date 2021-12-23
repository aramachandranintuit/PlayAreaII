package August;

public class binarySearch2 {
	public static void main(String[] args)
	{
		
		int a[] = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,5,6};
		int target = 3;
		int l=0;
		int r=a.length-1;
		int mid = (r+l)/2;
		int itr=0;
		int ans=0;
//		System.out.println(a.length);
		while(l<=r)
		{
			itr++;
//			System.out.println("mid "+ mid);
			mid =(r+l)/2;
			if(a[mid]>target) {
				
				r--;
			}
			else if(a[mid]<target)
				l++;
			else
			{
				ans=mid;
				l=mid+1;				
//				System.out.println(itr);
//				return;
			}
		}
		System.out.println(ans);
		
	}

}
