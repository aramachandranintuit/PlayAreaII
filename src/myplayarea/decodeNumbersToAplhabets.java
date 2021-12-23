package myplayarea;

import java.util.HashMap;

public class decodeNumbersToAplhabets {
	
	public static void main(String[] args)
	{
//		HashMap<Integer,String> map = new HashMap<Integer,String>();
//		map.put(0,"A");
//		map.put(1,"B");
//		map.put(2,"C");
//		map.put(3,"D");
//		map.put(4,"E");
//		map.put(5,"F");
//		map.put(6,"G");
//		map.put(7,"H");
//		map.put(8,"I");
//		map.put(9,"J");
//		map.put(10,"K");
//		map.put(11,"L");
//		map.put(12,"M");
//		map.put(13,"N");
//		map.put(14,"O");
//		map.put(15,"P");
//		map.put(16,"Q");
//		map.put(17,"R");
//		map.put(18,"S");
//		map.put(19,"T");
//		map.put(20,"U");
//		map.put(21,"V");
//		map.put(22,"W");
//		map.put(23,"X");
//		map.put(24,"Y");
//		map.put(25,"Z");
	
		String nos = "1234";	
		System.out.println(getCount(nos.toCharArray(),0,2));
		
	}
	
	private static int getCount(char[] nos,int startIndex,int endIndex)
	{
		int count=0;;
		if(startIndex < endIndex)
		{
			if((nos[startIndex] == '2' || nos[startIndex] == '1' ) && (endIndex - startIndex >=2))
			{
				count = 2 + getCount(nos,startIndex+1,endIndex) + getCount(nos,startIndex+2,endIndex);
			}
			else
			{
				
				count = 1 + getCount(nos,++startIndex,endIndex);
			}
				
		}
		return count;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
