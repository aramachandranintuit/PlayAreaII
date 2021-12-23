package November;

public class singleton {
	
	private singleton()
	{
	}
	
	public static singleton getInstance()
	{
		return singleton.singletonHolder.instance;
	}


	private static  class singletonHolder
	{
		public static final  singleton instance = new singleton();
		
	}
	

}

class Driver
{
	public static void main(String[] args)
	{
		singleton instance = singleton.getInstance();
	}
}
