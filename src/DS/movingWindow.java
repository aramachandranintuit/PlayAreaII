package DS;

import java.util.Arrays;
import java.util.TreeSet;

public class movingWindow {
	
	public static void main(String[] args)
	{
		
	}
	
	private static void printMedian(int[] nos)
	{
		Arrays.sort(nos);
		if(nos.length%2==0)
		{
			System.out.println((nos[nos.length/2] + nos[(nos.length/2) +1])/2);
		}
		else
		{
			System.out.println(nos[nos.length/2]);
		}
		
	}

}
