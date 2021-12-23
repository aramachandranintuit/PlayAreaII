package march;

public class MaxSumOfBinaryString {
	
	public static void main(String[] args)
	{
		System.out.println(maxScore("011101"));
	}
	
	public static int maxScore(String s) {
		int sum=0;
		int max=Integer.MIN_VALUE;
       if(s.charAt(0)=='0') sum++;
       for(int i=1;i<s.length();i++)
       {
    	   	if(s.charAt(i)=='1') sum++;
       }
       max = sum;
       sum=0;
       for(int i=1;i<s.length()-1;i++)
       {
	    	   if(s.charAt(i)=='0') sum++;
	    	   else sum--;
	    	   max = Math.max(max,sum);
       }
       return max;
       
    }

}
