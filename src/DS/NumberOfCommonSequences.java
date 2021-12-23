package DS;

public class NumberOfCommonSequences {
	
	public static void main(String[] args)
	{
		String a = "rabbit";
		String b = "rabbbit";
		int counter=0;
		for(int i=0;i<b.length();i++)
		{
			if(a.equals( b.substring(0,i) + b.substring(i+1,b.length()) ))
			{
				counter++;
			}
		}
		
		System.out.println(counter);
	}

}
