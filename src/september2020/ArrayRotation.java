package september2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ArrayRotation {
	
	public static void main(String[] args)
	{
		int[] nums = {1,2,3,4,5,6,7};
		int[][] a = {{1,2},{3,4}};
//		rotate(nums,3);
//		System.out.println(Arrays.toString(nums));
	}
	
	public static void rotate(int[] nums, int k) {
       int b[] =Arrays.copyOfRange(nums, nums.length-k, nums.length);
       int c[] = Arrays.copyOfRange(nums,0,nums.length-k);    	
       System.arraycopy(b,0,nums,0,b.length);
       System.arraycopy(c, 0, nums, k, c.length);
       
     }

}
