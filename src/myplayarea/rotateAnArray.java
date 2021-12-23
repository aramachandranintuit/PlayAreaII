package myplayarea;

public class rotateAnArray {
	
	public static void main(String[] args)
	{
		int []  a = {1,8,4,5,7};
		a = rotateArray(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	private static int[] rotateArray(int[] a)
	{
		int temp = a[0];
		for(int i=1;i<a.length;i++)
		{
			a = swap(a,0,i);
		}
		return a;
	}
	
	private static int[] swap(int [] a,int startIndex,int endIndex)
	{
		int temp = a[startIndex];
		a[startIndex] = a[endIndex];
		a[endIndex] = temp;
		return a;
	}

}
