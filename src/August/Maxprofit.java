package August;

import java.util.Arrays;

public class Maxprofit {
	
	public static void main(String[] args)
	{
		int[] prices = {3,3,5,0,0,3,1,4};
		int[] leftP = new int[prices.length];
		int[] rightP =new int[prices.length];
		int maxProfit= 0;
		int minValue=prices[0];
		for(int i=0;i<prices.length;i++)
		{
			maxProfit= Math.max(maxProfit,prices[i]-minValue);
			minValue=Math.min(minValue,prices[i]);
			leftP[i] = maxProfit;
		}
		System.out.println(Arrays.toString(leftP));
		maxProfit=0;
		minValue=prices[prices.length-1];
		for(int i=prices.length-1;i>=0;i--)
		{
			maxProfit= Math.max(maxProfit,minValue-prices[i]);
			minValue= Math.max(minValue,prices[i]);
			rightP[i]=maxProfit;
		}
		System.out.println(Arrays.toString(rightP));
		int res=Integer.MIN_VALUE;
		for(int i=0;i<prices.length;i++)
		{
			res= Math.max(res, leftP[i]+rightP[i]);
		}		
		System.out.println(res);
	}

}
