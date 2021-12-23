package feb;

import java.util.Arrays;

public class CandiesToPeople {
	public static void main(String[] args)
	{
		int[] n= new int[4];
		int c=7;
		distributeCandies(n,0,1,7);
//		distributeCandies(n,7);
		System.out.println(Arrays.toString(n));
	}
	
	public static void distributeCandies(int[] n, int pos,int lastCount,int candies)
	{
		if(candies<=0) return;
		if(pos>=n.length && candies>0) {
			pos=0;
			lastCount= n.length+1;
		}
		
		n[pos]+= candies > lastCount? lastCount : candies ;	
		candies=candies-(lastCount);
		distributeCandies(n,pos+1,lastCount+1,candies);
	}
	
	public static void distributeCandies(int []a,int candies)
	{
		int lastCount=0;
		for(int i=0;candies>0;i++)
		{
			a[i%a.length]= candies > lastCount ? lastCount+1 : candies;
			lastCount=lastCount+1;
			candies= candies -lastCount;
		}
		System.out.println(Arrays.toString(a));
	}

}
