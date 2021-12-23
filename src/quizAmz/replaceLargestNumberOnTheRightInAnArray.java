package quizAmz;

public class replaceLargestNumberOnTheRightInAnArray {
	
	public static void main(String[] args)
	{
		int[] a = {1,3,7,5,6,4};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(new replaceLargestNumberOnTheRightInAnArray().replacedArray(a)[i]);
		}
	}

	private int[] replacedArray(int[] a)
	{
		int largest=0;
		for(int i =a.length-1;i>0;i--)
		{
			if(a[i-1] < a[i] && largest < a[i])
			{
				largest = a[i];
				a[i-1] = largest;
			}
		}
		
		a[a.length-1] =-1;
		return a;
	}
}
