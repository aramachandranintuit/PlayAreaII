package DS;

public class sumofNos {
	
/*
 * given n=2 digits and sum of the digits = 2  . find the number of nos that satify the criteria
 * 
 */
	public int findNos(int noOfDigits ,int sum)
	{
		int start = (int) Math.pow(10,noOfDigits-1);
		int end = (int) Math.pow(10,noOfDigits) -1;
		if(sum==0)
			return 1;
		for(int i=1;;i++)
		{
			findFirstNumberInSeries
		}
				
		
	}
	
	private static int findFirstNumberInSeries(int start,int sum)
	{
		for(int i=start;;i++)
		{
			if(sum == sumOfDigits(0,i))
				return i;	
		}
	}
	
	private static int sumOfDigits(int sum,int number)
	{
		if(number >0)
		{
			sum = sum*10 + number%10;
			sumOfDigits(sum,number/10);
		}
		if(sum > 9)
		{
			number =sum;
			sum=0;
			sumOfDigits(sum,number);
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		
	}

}
