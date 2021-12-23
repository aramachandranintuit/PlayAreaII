package myplayarea;

public class PermutationsOfAString {
	
	
	public static void main(String[] args)
	{
		permutate("","abc");
	}
	
	public static void permutate(String prefix,String str)
	{
		if (str.length()==0)
		{
			System.out.println(prefix);
		}
		
		for(int i=0;i<str.length();i++)
		{
			permutate(prefix+ str.charAt(i),str.substring(0, i) +str.substring(i+1,str.length()));
		}
	}

}
