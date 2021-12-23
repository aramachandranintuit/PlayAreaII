package feb;

import java.util.Arrays;

public class RummyCardsDistribution {
	public static void main(String[] args)
	{
		int players=5;
		int cards=52;
		int[] d = new int[5];
		distribute(d,0,52,0);
		System.out.println(Arrays.toString(d));
	}
	
	public static void distribute(int[] a,int pos,int remainingCount,int preCount)
	{
		if(remainingCount<=0) return;
		a[pos] += remainingCount > 1 ?  1 : remainingCount;
		distribute(a,(pos+1)%a.length,remainingCount-(1),1);		
	}

}
