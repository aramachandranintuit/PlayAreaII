package myplayarea;

import java.util.Comparator;


public class _C  {
	private static int _$;
	float i =0.9f;
	double a =0.0;
	private static int no;
	private static boolean ready;
	
	private static class innerClass extends Thread {
		public void run()
		{
			while(!ready)
			{
				Thread.yield();	
				
				System.out.println("########3");
			}
			System.out.println(no);
		}
	}

	public static void main(String[] main) {
		
		new innerClass().start();
		ready=false;
		no=40;
//		String a_b = null;
//		System.out.print(_$);
//		System.out.print(a_b);
	}
}
