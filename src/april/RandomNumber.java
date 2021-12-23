package april;


/* the program is to generate a random number within a given range.
 * the algorithm uses the system's time to get a number.
 * 
 * Since a range is given ,we are getting the total number of counts in the entire 2 dimensional array
 * the random number willbe the reminder of the time / count + the starting number of the array , so that the final number will be 
 * a random number but within the range of the numbers.
 */
public class RandomNumber {
	public static void main(String[] args)
	{
		int[][] a = {{12,15},{1,7}};
		long time = System.currentTimeMillis();
		int count=0;
		for(int[] c : a)
		{
			for(int i=c[0];i<=c[1];i++)
			{
				count++;
			}
		}
		long randomNum = (long)time%count;
		count=0;
		for(int[] c : a)
		{
			for(int i=c[0];i<=c[1];i++)
			{
				if(count==randomNum) {
					System.out.println(c[0]+count);
					return;
				}
				count++;
			}
		}
		
		
	}

}
