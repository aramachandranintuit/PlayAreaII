package feb;

public class timeToType {
	
	public static void main(String[] args)
	{
		String str ="cba";
		 str = "a"+str;
		 int r=0;
		 for(int i=1;i<str.length();i++)
		 {
			 r+=Math.abs(((int)str.charAt(i) - (int)str.charAt(i-1)));
		 }
		 
		 System.out.println(r);
			 
		
	}

}
