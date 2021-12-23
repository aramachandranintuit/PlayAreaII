package myplayarea;


public class MathFunctions {
public static void addToInt(int x, int amountToAdd) {
x = x + amountToAdd;


 }
public static void main(String[] args) {
 int a = 15;
 int b = 10;
 MathFunctions.addToInt(a, b);
 System.out.println(a); } }


class WaterBottle {
	private String brand;
	private boolean empty;
	
	

	public static void main(String[] args) {
		WaterBottle wb = new WaterBottle();
		System.out.print("Empty = " + wb.empty);
		System.out.print(", Brand = " + wb.brand );
		
	}
}