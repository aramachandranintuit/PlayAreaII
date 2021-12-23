package quizAmz;

public class CountingNumberOf1UntilaNumberinBinaryForm {
	
	public static void main(String[] args)
	{

	
		/**000
		 * 001
		 * 010
		 * 011
		 * 100
		 * 101
		 * 110
		 */
		
		String binaryFormOfNum = convertToBinary(6);
		int numOfBits = binaryFormOfNum.length();
		int countOfOnes =0;
	
		
		int[] span = new int[3];
		span[0]=1;
		span[1]=2;
		span[2]=4;
		
			countOfOnes += numofBitsInANumber(6,1,false);
			System.out.println("count of ones after 1 iteration"+ countOfOnes);
			countOfOnes +=numofBitsInANumber(6,2,false);
			System.out.println("count of ones after 2 iteration"+ countOfOnes);
			countOfOnes +=numofBitsInANumber(6,4,false);
			System.out.println("count of ones after 1 iteration"+countOfOnes);
		
		System.out.println(countOfOnes);
		
	}
	
	
	private static int numofBitsInANumber(int untilNo,int span,boolean dSwitch)
	{
		int tempSpan = span;
		int oneCount=0;
		for(int i=0;i<=untilNo;)
		{
			while(span > 0)
			{ 
				if(dSwitch && i<=untilNo)
				{
					oneCount++;
					i=i+1;
				}
				else if(!dSwitch && i<=untilNo)
				{
						i=i+1;
				}
				span=span-1;
			}
			
			dSwitch =!dSwitch;
			span=tempSpan;
		}
		return oneCount;
		
	}
	
	private static String convertToBinary(int a)
	{
		if(a <2)
		{
			return String.valueOf(a);
		}
		else
		{
			return String.valueOf(convertToBinary(a/2)) + String.valueOf(a%2);
		}
		
	}

}
