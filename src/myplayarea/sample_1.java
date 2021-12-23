package myplayarea;

public class sample_1 {
	
	public static void main(String[] args)
	{
		String s1 = "Java";
		String s2 = "Java";
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Ja").append("va");
		System.out.println(s1 == s2); // true  string literals are always printed from the string pool.
		System.out.println(s1.equals(s2)); // true
		System.out.println(sb1.toString() == s1); //false
		System.out.println(sb1.toString().equals(s1)); //true
	}

}


interface HasTail { 
	 int getTailLength();
	}
abstract class Puma implements HasTail {
	protected int getTailLength() {return 4;}
	}
public class Cougar extends Puma {
	public static void main(String[] args) {
		Puma puma = new Puma();
		System.out.println(puma.getTailLength());
}
public int getTailLength(int length) {return 2;}
}
