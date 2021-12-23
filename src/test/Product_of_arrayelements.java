package Test;

/*
 * Given an array arr[] of n integers, construct a Product Array prod[] (of same size) such that prod[i] is equal to the product of all the elements of arr[] except arr[i]. Solve it without division operator in O(n) time.
Example :
Input: arr[]  = {10, 3, 5, 6, 2}
Output: prod[]  = {180, 600, 360, 300, 900}
 * 
 * 
 */
public class Product_of_arrayelements {
	
	public static void main(String [] args) {
		int arr[]  = {10, 3, 5, 6, 2};
		int prod[] = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			prod[i]= 1;
		}
		int temp=1;
		for(int i=0;i<arr.length;i++)
		{
			prod[i]=temp;
			temp*=arr[i];
		}
		 temp=1;
		for(int j=arr.length-1;j>=0;j--)
		{
			prod[j]*=temp;
			temp*=arr[j];
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(prod[i]);
		}
	}

}
