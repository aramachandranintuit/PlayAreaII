package april;

public class Bitwisehacks {
	public static void main(String[] args)
	{
		//odd or even
//		System.out.println(3 & 1);

		//counting number of bits set is 1 or 0;
		int num=7;
		int c=0;
		while (num >0)
		{
			num=num &(num-1);
			c++;
		}
//		System.out.println(c);
		
		//To count trailing zeros
		/*
		 * i.e 100000
		 * 
		 */
		 num =4;
		 c=0;
		 while((num & 1) ==0)
		 {
			 c++;
			 num=num >> 1 ;
		 }
		 System.out.println(c);
//		 division
//		 System.out.println(4 >> 1);
////		 multiplication
//		 System.out.println(4 << 1);
		
	}

}
