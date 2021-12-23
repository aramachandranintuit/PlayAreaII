package November;

public class BinaryToInt {
	
	public static void main(String[] args)
	{
//		String a = "110";
//		int val=0;
//		int j=0;
//		for(int i=a.length()-1;i>=0;i--,j++)
//		{
//			if(a.charAt(i)=='1')
//				val = val +(int)(Math.pow(2, j));
//					
//		}
//		System.out.println(val);
		
		int a =6;
		String val="";
		while(a>0)
		{
			val = val+a%2;
			a=a/2;
		}
		val = reverse(val);
		System.out.println(val);
	}
	
	public static String reverse(String str)
	{
		for(int i=0;i<str.length()/2;i++)
		{
			str = str.charAt(str.length()-1-i) + str.substring(i+1,str.length()-1-i) + str.charAt(i);
		}
		return str;
	}
	

}
