package DS;

public class BinarySearch {

	public static void main(String[] args)
	{
		int a[] = {1,1,3,4,6,8};
		search(a,0,a.length-1,1);
	}
	
	private static void search(int[] a,int first, int last,int s)
	{
		int mid = (last-first)/2;
		while(first < last)
		{
			if(s <a[mid])
			{
				first++;
			}
			else if(s==a[mid])
				{
				System.out.println("the number is found");
				return;
				}
			else
				{
				last--;
				}
			if(first>=last)
				{
				System.out.println("the number cannot be found");
				return;
				}
			mid = (last-first)/2;
		}
		
	}
}
