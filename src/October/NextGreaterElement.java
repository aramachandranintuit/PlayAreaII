package October;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/*
 * The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
Example 1:

Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
 * 
 */
public class NextGreaterElement {
	public static void main(String[] args)
	{
		int []nums1 = {4,1,2}, nums2 = {1,3,4,2};
		int[] res = nextGreaterElement(nums1,nums2);
		System.out.println(Arrays.toString(res));
		Set<Integer> set = new HashSet<Integer>();
		Iterator<Integer> itr = set.iterator();
	}
	
	public static int[] nextGreaterElement(int[]num1,int[]num2)
	{
		Stack<Integer> stack = new Stack<>();
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<num2.length;i++)
		{
			while(!stack.isEmpty() && stack.peek()<num2[i]) map.put(stack.pop(), num2[i]);
			stack.push(num2[i]);
		}
		int[] res = new int[num1.length];
		for(int i=0;i<res.length;i++)
		{
			res[i]= map.getOrDefault(num1[i],-1);
		}
		return res;
	}

}
