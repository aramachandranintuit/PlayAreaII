package September;

public class AddBinary {

	public static void main(String[] args)
	{
		String a="11";
		String b="1";
//		public String addBinary(String a, String b) {
	        int i= a.length()-1;
			int carry=0;
			int j=b.length()-1;
			StringBuilder str= new StringBuilder();
			while(i>=0 && j>=0)
			{
				if(a.charAt(i)=='1' && b.charAt(j)=='1' )
				{
					if(carry==0)
					{
						str.append('0');
						carry=1;
					}
					else if(carry==1)
					{
						str.append('1');
						carry=1;
					}
				}
				else if(a.charAt(i)=='1' && b.charAt(j)=='0' || a.charAt(i)=='0' && b.charAt(j)=='1')
				{
					if(carry==0)
					{
						str.append('1');
						carry=0;
					}
					else if(carry==1)
					{
						str.append('0');
						carry=1;
					}
				}
				else if(a.charAt(i)=='0' && b.charAt(j)=='0')
				{
					if(carry==0)
					{
						str.append('0');
						carry=0;
					}
					else if(carry==1)
					{
						str.append('1');
						carry=0;
					}
					
				}
				i--;
				j--;
			}
	        
	        while(i>=0)
			{
				if(a.charAt(i)=='1')
				{
					if(carry==0)
					{
						str.append('1');
						carry=0;
					}
					else
					{
						str.append('0');
						carry=1;
					}
				}
				else if(a.charAt(i)=='0')
				{
					if(carry==0)
					{
						str.append('0');
						carry=0;
					}
					else
					{
						str.append('1');
						carry=0;
					}
					
				}
				i--;
			}
			
			while(j>=0)
			{
				if(b.charAt(j)=='1')
				{
					if(carry==0)
					{
						str.append('1');
						carry=0;
					}
					else
					{
						str.append('0');
						carry=1;
					}
				}
				else if(b.charAt(j)=='0')
				{
					if(carry==0)
					{
						str.append('0');
						carry=0;
					}
					else
					{
						str.append('1');
						carry=0;
					}
					
				}
				j--;
			}
			
			if(carry==1)str.append('1');
		System.out.println( str.reverse().toString());
	        
	    }
		
//	}
}
