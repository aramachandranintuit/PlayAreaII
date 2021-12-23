package march;

public class squareRoot {
	
	public static void main(String[] args)
	{
		System.out.println(sqrt(10));
	}
	
	public static int sqrt(int x)
	{
		if(x<2) return x;
		int low =2;
		int high=x/2;
		int pivot  = (low+high)/2;
		while(low<=high)
		{
			 
			if(pivot*pivot >x) high=pivot-1;
			else if(pivot*pivot <x) low=pivot+1;
			else if(pivot*pivot ==x) return pivot;
			pivot = (low+high)/2;
		}
//		System.out.println(low);
//		System.out.println(high);
		return high;
	}

}
