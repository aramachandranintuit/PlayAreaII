package NotClearFirstTime;

import java.util.Arrays;

public class CheckCoordinates {
	
	public static void main(String[] args)
	{
		int[][] a =new int[][] {{1,2},{2,3},{3,5}};
		System.out.println(checkStraightLine(a));
	}
	
	 public static boolean checkStraightLine(int[][] a) {
	        
	        if(a.length<=2)
	            return true;
	        int[] temp = new int[2];
	        temp[0]=a[1][0]-a[0][0];
	        temp[1]=a[1][1]-a[0][1];
	        System.out.println(Arrays.toString(temp));
	        
	        for(int i=0;i<a.length-1;i++)
	        {
	            int[] slope = new int[] {a[i+1][0] - a[i][0],a[i+1][1]-a[i][1]};
	            if(compare(slope,temp))
	                continue;
	            else 
	                return false;
	        }
	        return true;
	        
	    }
	    
	    private static boolean compare(int[] a, int[] b)
	    {
	        if(a[1]*b[0]==a[0]*b[1])
	            return true;
	        else
	            return false;
	    }

}
