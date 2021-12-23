package Test;

public class Strstr {
	

	
	public static void main(String[] args)
	{
		String needle ="la";
		String hayStack ="hello";
		int index = new Strstr().needleInHayStack(hayStack, needle);
		int k=0;
		for(int i=index;i<index+needle.length();i++)
		{
			if(needle.charAt(k)==hayStack.charAt(i))
			{
				k++;
			}
			
		}
		if(k==needle.length())
			System.out.println(k);
		else
			System.out.println(-1);
		
	}
	
	private int needleInHayStack(String hayStack,String needle)
	{
	 for(int i=0;i<hayStack.length();i++)
	 {
		 if(needle.length()==0)
			 return 0;
		 if(hayStack.charAt(i) == needle.charAt(0))
		 {
			 return i;
		 }
	 }
	 return -1;
		
	}

}
