package myplayarea;

public class Swap2CharactersToGetaString {
	
	public static void main(String[] args)
	{
		String str1 = "geeks";
		String str2 = "keegs";
//		check if the strings are of the same length.
		if(str1.length() == str2.length())
		{
			char[] a1 = str1.toCharArray();
			char[] a2 = str2.toCharArray();
		
			int diff =0;
			for(int i=0;i<a1.length;i++)
			{
				if(a1[i] != (a2[i]))
				{
					if(diff<2)
						{
							diff ++;	
						}
					else
					{
						System.out.println("The strings cannot be made equal with just 2 character swap");
						break;
					}
				}
			}
			
		}
		System.out.println("these are character rotated strings");
			
	}
	
	

}
