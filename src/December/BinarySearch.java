Hepackage December;

public class BinarySearch {
	
	public static void main(String[] args)
	{
		int [] a = {1,2,3,4,5};
		boolean flag = binarySearch(a,4);
		System.out.println(flag);
	}
	
	private static boolean binarySearch(int[] a,int target)
	{
		int first=0;
		int last=a.length-1;
		int mid = (last+first)/2;
		while(first<last)
		{
			if(a[mid] ==target)
				return true;
			else if(target>a[mid])
			{
				first= mid+1;
			}
			else if(target<a[mid])
			{
				last= mid-1;
			}
			mid = (last+first)/2;
		}
//		if(first>last)
			return false;
	}
}
