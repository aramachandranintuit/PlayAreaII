package Jan2021;

import java.util.Arrays;

public class ThreeSum implements Runnable {
	
	public static void main(String[] args)
	{
		int[] a= {-1,0,1,2,-1,-4};	
		Arrays.sort(a);
		Thread t = new Thread(new ThreeSum());
//		int [] b= Arrays.copyOfRange(a, from, to)
		int target =3;
		int i=0,j=a.length-1;
		while(i<j)
		{
			if(a[i]+a[j]>target)
			{
				j--;
			}
			else if (a[i]+a[j]<target)
			{
				i++;
			}
			else 
			{
				System.out.println("no 1 is "+ a[i]);
				System.out.println("no 2 is "+ a[j]);
				break;
			}
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
