package October;

/*
 * 
 * Given an array containing only positive integers, return if you can pick two integers from the array which cuts the array into three pieces such that the sum of elements in all pieces is equal.

Example 1:

Input: array = [2, 4, 5, 3, 3, 9, 2, 2, 2]

Output: true

Explanation: choosing the number 5 and 9 results in three pieces [2, 4], [3, 3] and [2, 2, 2]. Sum = 6.

Example 2:

Input: array =[1, 1, 1, 1],

Output: false
 * 
 * 
 */
public class loadBalancing {
	
	public static void main(String[] args)
	{
		int [] a = {2, 4, 5, 3, 3, 9, 2, 2, 2};
		
		int left =1;
		int right= a.length-2;
		
		int leftSum=a[0];
		int rightSum=a[a.length-1];
		while(left<right)
		{
			if(leftSum == rightSum)
			{
				int ptr=left+1;
				int sum=0;				
				while(ptr<right) sum+=a[ptr++];
				if(sum==leftSum) {
					System.out.println( true);
					return;
				}
			}
			if(leftSum<rightSum) leftSum+=a[left++];
			else rightSum+=a[right--];
		}
		System.out.println(false);
	}

}
