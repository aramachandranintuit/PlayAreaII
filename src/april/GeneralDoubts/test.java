package april.GeneralDoubts;

import java.util.TreeSet;

public class test {
	
	public static void main(String[] args)
	{
		int a= -1232112329;
		String ans="";
		String r = a+"";
		StringBuilder sb=null;
		String res = "";
		sb = new StringBuilder(r.substring(1,r.length()));
		res =  sb.reverse().toString();
		long result = Long.parseLong(sb.toString());
		if(a>0 &&  Integer.MAX_VALUE - result < 0) System.out.println(Integer.MAX_VALUE+"");
		else if(a <0 && Integer.MAX_VALUE - result < 0) System.out.println(Integer.MIN_VALUE+"");
		else System.out.println(r.charAt(0) +res);
	}

}
