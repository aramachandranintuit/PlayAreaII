package myplayarea;

public class RomanToNumbersConversion {
	static int value(char r) {
		if (r == 'I')
			return 1;
		if (r == 'V')
			return 5;
		if (r == 'X')
			return 10;
		if (r == 'L')
			return 50;
		if (r == 'C')
			return 100;
		if (r == 'D')
			return 500;
		if (r == 'M')
			return 1000;
		return -1;
	}

	public static void main(String[] args) {
		String str = "MCMIV";
		char[] roman = str.toCharArray();
		int finalValue = 0;
		for (int i = 0; i < roman.length; i++) 
		{	
			int s1 = value(roman[i]);
			if (s1 <= (value(roman[i + 1]))) 
			{
				if (i + 1 < roman.length) 
				{
					finalValue += value(roman[i + 1]) - s1;
					i++;
				}
			} else 
			{
				finalValue += value(roman[i]) ;
			}
		}

		System.out.println(finalValue);
	}

}
