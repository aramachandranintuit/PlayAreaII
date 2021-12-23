package quizAmz;

public class MovingWindownProblem {
	
	public static void main(String[] args)
	{
		int [] a = {2,1,6,7,2,9}; 
		sumInAMovingWindow(a,3);
		String str ="asd";
		str.contains("a");
	}
	
	private static void sumInAMovingWindow(int[] a,int window)
	{
		int largest =0;
		for(int i=0;i<a.length-window;i++)
		{
			largest(a,i,i+window);
		}	
	}
	
	private static int largest(int[] a, int startIndex,int endIndex)
	{
		int largest=0;
		for(int i=startIndex;i<endIndex;i++)
		{
			if(a[i] > largest)
			{
				largest = a[i];			
			}
		}
		System.out.println(largest);
		return largest;
	}

}


