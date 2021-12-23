package DS;

public class strstr {
	
	public static void main(String[] args)
	{
		
		int index = new strstr().strStr("hello","ll",0,false);
		
		if(index>-1)
		{
			System.out.println(index-"ll".length());
		}
		else 
			System.out.println(index);
	}
	
	public int strStr(String  haystack, String needle,int haystackIndex,boolean flag)
	{
		int j=0;
		if(haystack.charAt(haystackIndex) == needle.charAt(j) && haystackIndex <haystack.length()-1 )
		{
			++haystackIndex;
			flag=true;
			if(j<needle.length()-1)
				needle =needle.substring(j+1);
			else
				return haystackIndex;
		}
		else if(haystack.charAt(haystackIndex) != needle.charAt(j) && haystackIndex <haystack.length()-1)
		{
			flag=false;
			++haystackIndex;
		}
		else if (haystackIndex==haystack.length()-1 && flag ==true)
		{
			return haystackIndex;
		}
		if(haystackIndex==haystack.length()-1  ||  haystackIndex ==haystack.length())
		{
			if(flag == false)
				return -1;
			else if(flag == true && needle.length()>0)
				return -1;
		}
		
			return strStr(haystack,needle,haystackIndex,flag);
	}

}
