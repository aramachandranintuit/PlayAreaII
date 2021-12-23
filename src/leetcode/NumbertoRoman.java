package leetcode;

import java.util.HashMap;
import java.util.Map;

public class NumbertoRoman {
	
	public static void main(String[] args)
	{
		int no = 3499;
		System.out.println(getRomanInt(3549));
		
	}
	
	private static String getRomanInt(int a)
	{
		String str="";
		if(a>0)
		{
			while(a >=1000)
			{
				
				str=str+getIntForRomanNumerals(1000,a/1000);
				a= a-1000;
			}
			if(a>=900 && a<1000)
			{
				str=str+getIntForRomanNumerals(900,a/900);
				a= a-900;
			}
			while(a>=500)
			{
				
				str=str+getIntForRomanNumerals(500,a/500);
				a= a-500;
			}
			if(a>=400 && a<500)
			{
				str=str+getIntForRomanNumerals(400,a/400);
				a= a-400;
			}
			
			while(a>=100)
			{
				str=str+getIntForRomanNumerals(100,a/100);
				a= a-100;	
			}
			if(a>=90 && a<100)
			{
				str=str+getIntForRomanNumerals(90);
				a= a-90;
			}
			while(a>=50)
			{
				
			}
				else
					{
					str=str+getIntForRomanNumerals(500,a/500);
					a= a%500;
					}
			}
			else if(a>100 && a<500)
			{
				if(a>=400 && a<500)
				{
					str=str+getIntForRomanNumerals(400,a/400);
					a= a%400;
				}
				else
					{
					str=str+getIntForRomanNumerals(100,a/100);
					a= a%100;
					}
				
			}
			else if(a>50 && a<100)
			{
				if(a>=90 && a<100)
				{
					str=str+getIntForRomanNumerals(90,a/90);
					a= a%90;
				}
				else
					{str=str+getIntForRomanNumerals(50,a/50);
					a= a%50;
					}
			}
			else if(a>10 && a<50)
			{
				if(a>=40 && a<50)
				{
					str=str+getIntForRomanNumerals(40,a/40);
					a= a%40;
				}
				else
					{
					str=str+getIntForRomanNumerals(10,a/10);
					a= a%10;
					}
				
			}
			else if(a>5 && a<10)
			{
				
				if(a>=9 && a<10)
				{
					str=str+getIntForRomanNumerals(9,a/9);
					a= a%9;
				}
				else 
				{
					str=str+getIntForRomanNumerals(5,a/5);
					a= a%5;
				}
			}
			else if(a>1 && a<5)
			{
				if(a>=4 && a<5)
				{
					str=str+getIntForRomanNumerals(4,a/4);
					a= a%4;
				}
				else
					{
					str=str+getIntForRomanNumerals(1,a/1);
					a= a%1;
					}
			}
		}
		
		return str;
		
	}
	
	private static int getDenominator(int c)
	{
		int n=10;
		for(int i=0;i<c-1;i++)
		{
			n=n*n;
		}
		return n;
		
	}
	
	private static String getIntForRomanNumerals(Integer c, int count)
	{
		String str="";
		Map<Integer, String> romanIntMap = new HashMap<Integer,String>();
		romanIntMap.put(1,"I");
		romanIntMap.put(4,"IV");
		romanIntMap.put(5,"V");
		romanIntMap.put(40,"XL");
		romanIntMap.put(50,"L");
		romanIntMap.put(90,"XC");
		romanIntMap.put(10,"X");
		romanIntMap.put(9,"IX");
		romanIntMap.put(100,"C");
		romanIntMap.put(500,"D");
		romanIntMap.put(400,"CD");
		romanIntMap.put(900,"CM");
		romanIntMap.put(1000,"M");
		for(int i=0;i<count;i++) {
			str=str+romanIntMap.get(c);
			};
		return str;
		
	}

}
