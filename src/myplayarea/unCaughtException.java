package myplayarea;

public class unCaughtException {
	
	public static void main(String[] args)
	{
		 System.out.print("a");
		  try {	
		 System.out.print("b");
		 throw new IllegalArgumentException();
		 } 
		  catch (RuntimeException e) {  //run time exception is the super class of all unchecked exceptions that can be thrown at run time.
		  System.out.print("c");
		  System.exit(1);
		 } 
		  finally {
		  System.out.print("d");
		 }
		 System.out.print("e");
	}

}
