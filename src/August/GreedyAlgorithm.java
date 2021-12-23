package August;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

public class GreedyAlgorithm {
	
	
	public static void main(String[] args)
	{
		GreedyAlgorithm ga = new GreedyAlgorithm();
		System.out.println(ga.getTotalTime(new Integer[] {4, 2, 1, 3}));
	}
	
	int getTotalTime(Integer[] arr) {
	    // Write your code here
	    if(arr.length==1) return arr[0];
	    if(arr.length==2) return arr[0]+arr[1];
	    Arrays.sort(arr);
	    
	    Stack<Integer> stack  = new Stack<Integer>();
	    int res=0;
	    for(int i=0;i<arr.length;i++)
	    {
	      stack.push(arr[i]);
	    }
	    while(stack.size()>=2)
	    {
	      int a =stack.pop();
	      int b = stack.pop();
	      res+=a+b;
	      stack.push(a+b);
	      System.out.println(stack);
	      System.out.println(res);
	    }
//	    System.out.println(stack);
//	    if(stack.size()<2) res+=stack.pop();
//	    System.out.println(res);
	    return res;
	  }

}
