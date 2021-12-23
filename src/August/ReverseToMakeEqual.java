package August;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseToMakeEqual {
	
	public static void main(String[] args)
	{
		int [] A = {1, 2, 3, 4};
		int[] B = {1, 4, 3, 2};
		ReverseToMakeEqual rv = new ReverseToMakeEqual();
		System.out.println(rv.areTheyEqual(A, B));
//		System.arraycopy(src, srcPos, dest, destPos, length);
	}
	
	boolean areTheyEqual(int[] array_a, int[] array_b) {
	    // Write your code here
	    if(array_a.length!=array_b.length) return false;
	    List<Integer> list = new ArrayList<Integer>();
	    for(int i=0;i<array_a.length;i++)
	    {
	      if(array_a[i]==array_b[i]) continue;
	      else list.add(i);
	    }
	    
	    int[] temp =Arrays.copyOfRange(array_a, list.get(0), list.get(list.size()-1)+1); 
	    int j=list.get(0);
	    System.out.println(list);
	    System.out.println(Arrays.toString(temp));
	    for(int i=temp.length-1;i>=0;i--)
	    {
	      array_a[j]= temp[i];
	      j++;
	    }
	    
	    for(int i=0;i<array_a.length;i++)
	    {
	      
	      if(array_a[i]!=array_b[i]) return false;
	    }
	    return true;
	  }

}
