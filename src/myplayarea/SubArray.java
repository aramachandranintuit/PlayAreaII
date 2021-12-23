maxipackage myplayarea;

public class SubArray {
	
	public static void main(String[] args)
	{
		int A[] = {2, 3, 0, 5, 1, 1, 2}, B[] = {3, 0, 5, 1};
		int counter =0;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]==B[0])
			{
				counter=i;
				break;
			}
		}
		int j=0;
		for(int i=counter;i<counter+B.length;i++)
		{
			if(A[i]==B[j])
			{
				j++;
			}
			else
			{
				System.out.println("not a subarray");
				System.exit(0);
				
			}
		}
		System.out.println("it is a subarray");
		
		
	}

}
