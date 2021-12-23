package October;

import java.util.Arrays;

public class BinarySerach {
	public static void main(String[] args)
	{
		int[] a = {1,2,6,7,9};
		int l=0;
		int r=a.length;
		int mid = l+(r-l)/2;
		int t =8;
		while(l<r)
		{
			if(a[mid]<=t) l=mid+1;
			else if(a[mid]>t) r=mid-1;
			else {
				System.out.println(a[mid]);
				return;
			}
			mid= l+(r-l)/2;
		}
		System.out.println(-Arrays.binarySearch(a, t)-1);
//		System.out.println(a[l]);
	}

}
