package DS;

import java.util.HashMap;

public class EditAtoB {
	
	public static void main(String[] args)
	{
		int a = getDiff("Anshuman","Antihuman","Anshuman".length(),"Antihuman".length());
		System.out.println(a);
	
		
	}
	
	private static int getDiff(String a , String b, int aIndex ,int bIndex)
	{
		if(aIndex ==0 || bIndex==0)
		{
			return 0;
		}
		if(a.charAt(aIndex-1) == b.charAt(bIndex-1))
			{
				
				return 1+getDiff(a,b,aIndex-1,bIndex-1);
			}
		else
		{
				return Math.max(getDiff(a,b,aIndex-1,bIndex),getDiff(a,b,aIndex,bIndex-1));
		}

	}
}
