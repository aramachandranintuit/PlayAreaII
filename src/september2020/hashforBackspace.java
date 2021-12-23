package september2020;

public class hashforBackspace {
	
	public static void main(String[] args)
	{
		String str1 ="c#a#bc##dd";
		String str2 ="#b#dd";	
		System.out.println(compare(str1,str2,str1.length()-1,str2.length()-1));
	}
	
	public static boolean compare(String str1,String str2,int m , int n)
	{
		boolean flag=false;
		while(m>0 && n>0)
		{	
			str1=pruneBackSpaces(str1,m);
			str2=pruneBackSpaces(str2,n);
			m=str1.length()-1;
			n=str2.length()-1;
			if(str1.length()>0 && str2.length()>0)
			{
				if(str1.charAt(m) == str2.charAt(n) )
				{
					m--;
					n--;
					flag=true;
				}
			}
		}
			while(str1.contains("#"))
			{
				str1=pruneBackSpaces(str1,str1.length()-1);
			}
			while(str2.contains("#"))
			{
				str2=pruneBackSpaces(str2,str2.length()-1);
			}
			if(str1.length()>0 || str2.length()>0)
				flag=false;
		return flag;
	}
	
	public static String pruneBackSpaces(String str1 ,int m)
	{
		int counter=0;
		while(str1.charAt(m) =='#')
		{
			counter++;
			m--;
			if(m<0)
			{
				m=0;
				break;
			}
				
		}
		m=m-counter;
		return str1.substring(0,m+1);
	}

}
