package NotClearFirstTime;

public class EncodingDecoding {
	public static void main(String[] args)
	{
		String str ="1??0?101";
		getAllCombinations(str.toCharArray(),0);
		
	}
	
	public static void getAllCombinations(char[] str,int index)
	{
		if(index==str.length) 
		{
			print(str);
			return;			
		}
		if(str[index]=='?')
		{
			str[index]='1';
			getAllCombinations(str,index+1);
			
			str[index]='0';
			getAllCombinations(str,index+1);	
			 
			str[index] ='?';
		}
		else 
			getAllCombinations(str,index+1);
	}
	
	public static void print(char[] str)
	{
		String s = new String(str);
		System.out.println(s);
	}

}
