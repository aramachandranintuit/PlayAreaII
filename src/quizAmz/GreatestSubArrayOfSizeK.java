package quizAmz;

public class GreatestSubArrayOfSizeK {
	
	public static void main(String[] args)
	{
		int [] a = {10, 3, 2, 7, 9, 3};
		int k=3;
		int largestIndex = getLargestFromTheLast(a,k);
		for(int i=largestIndex;i<=largestIndex+2;i++)
		{
			System.out.println(a[i]);
		}
	}
	private static int getLargestFromTheLast(int[] a,int k)
	{
		int largest=0;
		for(int i=a.length-k;i>=0;i--)
		{
			if(a[i]>largest)
				largest=i;			
		}
		return largest;
	}

}
