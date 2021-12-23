package Medium;

public class MaximumDiff {
	
	public static void main(String[] args)
	{
		int[] a = {-2, -3, 4, 5, 7};
		int maxDiff=0;
		int j=0;
		for(int i=0;i<a.length;i++)
		{
//			int startIndex=i;
			j=i+1;
			while(j<a.length)
			{
				if(maxDiff<a[j]-a[i])
					maxDiff =a[j]-a[i];
				j++;
			}
//			i=startIndex;
		}
		System.out.println(maxDiff);
	}

}
