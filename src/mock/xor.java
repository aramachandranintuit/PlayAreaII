package mock;
/*
 * 
 * 
 * find out a single non-duplicate element  in the array
 */
public class xor {
	public static void main(String[] args)
	{
		int [] a = {6,1,1,3,3,4,4};
		int r=a[0];
		for(int i=1;i<=a.length-1;i++)
		{
			r^=a[i];
			System.out.println(r);
		}
	}

}
