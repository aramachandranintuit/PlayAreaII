package myplayarea;

public class CountingSort {
	
	public static void main(String[] args)
	{
		int[] a = {4,2,20,34,3};
		int largest = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i] > largest)
				largest = a[i] ;
		}
		int[] frequency = new int[largest+1];
		for(int i=0;i<=largest+1;i++)
		{
			
			for(int j=0;j<a.length;j++ )
			{
				if(i==a[j])
					frequency[a[j]]++;
			}
		}
		
//		for(int i=0;i<frequency.length;i++)
//		{
//			System.out.println(frequency[i]);
//		}
		 
		int j=0;
		for(int i=0;i<frequency.length;i++)
		{
			int temp=frequency[i];
			while(temp-- > 0)
			{	
				a[j] =i;
				j++;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
	}

}
