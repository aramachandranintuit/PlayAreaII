package October.Spotnana;
/*
 * Problem
	There is an array of N integers, you are given a task to make any number of partitions in the array such that the Special Sum of all the partitions combined is maximized.
	
	Suppose you make K partitions then the Special Sum is defined as P1 - P2 + P3 - P4 + P5 ..... +(-1)(K - 1)Pk.
	
	Here Pi is defined as summation of all integers in that partition.
	
	Input :
	
	  The first line of input consist of an integer N, which denotes the number of integers in the array.    
	  The second line of input consist of N integers, which denotes the values of the array.
	Output :
	
	 A single integer which denotes the maximum value of the Special Sum that can be obtained by any number of partitions.
	Constraint :
	
	Sample Input
	5
	1 -2 -3 2 1
	Sample Output
	9
	Time Limit: 1
	Memory Limit: 256
 * 
 * 
 */
public class MaximumPartition {
	public static void main(String[] args)
	{
		int[] nums= {1,-2,-3,2,1};
		// the important thing is to note that this dp array has to be long array.
		long [] dp = new long[nums.length];
		dp[0]=nums[0];
		for(int i=1;i<nums.length;i++)
		{
			dp[i]=Math.max(dp[i-1]+nums[i],dp[i-1]-nums[i]);
		}
		System.out.println(dp[nums.length-1]);
	}

}
