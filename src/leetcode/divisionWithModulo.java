package leetcode;

public class divisionWithModulo {
	
	public static void main(String[] args)
	{
		System.out.println(new divisionWithModulo().new Solution().divide(-2147483648,2));
	}
	
	class Solution {
	    public int divide(int dividend, int divisor) {
	    	if (divisor == -1 && dividend == Integer.MIN_VALUE)
	            return Integer.MAX_VALUE;
	        long a =0;  
	        long Divisor = Math.abs(divisor);
	        long temp = Divisor;
	        long Divident = Math.abs(dividend);
	        if(Divident < 0)
	        {
	        		Divident = Divident * -1;
	        }
	        if(Divisor < 0)
	        {
	        		Divisor = Divisor * -1;
	        }
	        if(Divisor <= Divident)
	        {
	            a=1;
	        }
	        else
	            return (int)a;
	        
	        while(Divident - Divisor >=temp)
	        {
	            Divisor = Divisor + temp;
	            a++;
//	            System.out.println(a);
	        }
	        
	        if(divisor < 0 && dividend <0 )
	        {	      
	            return (int)a;
	        }
	        if(divisor > 0 && dividend >0 )
	        {
	                  return (int)a;
	        }
	        else
	              return (-1 *((int)a));
	        
	    }
	}

}
