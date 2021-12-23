package mock;

import java.util.Arrays;

public class isLongPressesName {
	
	public static void main(String[] args)
	{
//		"dfuyalc"
//		"fuuyallc"
//		System.out.println(isLongPressedName("dfuyalc","fuuyallc"));
//		isSame("dfuyalc","fuuyyyallc");
		String s ="  ";
		System.out.println(s.trim().length());
	}
	
	public static void isSame(String name,String typed)
	{
		char[] c = typed.toCharArray();
		int j=0;
		for(int i=0;i<c.length-1;i++)
		{
			
			if(c[i]!=c[i+1])
				c[j++]=c[i];
//			j=j+1;
		}
		c[j]=c[c.length-1];
		System.out.println(Arrays.copyOfRange(c,0,j+1));
		
	}
	public static boolean isLongPressedName(String name, String typed) {
	       if(name==null || typed==null)
	            return false;
	        if(name.length()==1 && typed.length()==1)
	        {
	            if(name.charAt(0)!=typed.charAt(0))
	                return false;
	        }
	        int i=0;
	        int j=0;
	        while(i<name.length() && j< typed.length())
	        {
	            if(name.charAt(i)==typed.charAt(j))
	            {
	                i++;
	                j++;
	            }
	         if(i<name.length() && j< typed.length() && name.charAt(i)!=typed.charAt(j))
	            {
	                if(j>0)
	                {
	                    if(typed.charAt(j-1)!=typed.charAt(j))
	                    {
	                        return false;
	                    }
	                    else
	                    {
	                        while(typed.charAt(j-1)==typed.charAt(j))
	                        {
	                            j++;
	                        }
	                    }
	                }
	                else
	                {
	                	return false;
	                }
	            }
	        
	        }
	        while(j<typed.length())
	        {
	            if(typed.charAt(j)!=typed.charAt(j-1))
	                return false;
	            else
	                j++;
	        }
	        while(i<typed.length())
	        {
	            if(typed.charAt(j)!=typed.charAt(j-1))
	                return false;
	            else
	                j++;
	        }
	        
	        return true;
	    }

}
