package Test;

public class equibilirium {
	
	public static void main(String[] args)
	{
		int a[] = {-7, 1, 5, 2, -4, 3, 0};
		int leftSum=0;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i];
		}
		
		for(int i=0;i<a.length;i++)
		{
			sum = sum - a[i];
			if(sum == leftSum)
			{
				System.out.println(i);
			}
			else 
			{
				leftSum = leftSum + a[i];
			}
		}
		
	}

}
