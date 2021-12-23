package Test;

import java.util.HashMap;

class nics
{
	String name;
	String ipAddress;
	String status;
	boolean ipv6Status;
	
	nics(String name,String ipAddress,String status,boolean ipv6status)
	{
		this.name=name;
		this.ipAddress = ipAddress;
		this.status=status;
		this.ipv6Status = ipv6status;
	}
	
}
public class Test {
	
	static HashMap<String, nics> map = new HashMap<String,nics>();
	public static void main(String[] args)
	{
		nics n1 = new nics("eth0","1.1.1.1","up",true);
		map.put(n1.name,n1);
		System.out.println(getNic(n1.name).name);
		System.out.println(getNic(n1.name).ipAddress);
		System.out.println(getNic(n1.name).ipv6Status);
		System.out.println(getNic(n1.name).status);
		
	}
	
	private static nics getNic(String name)
	{
		if(map.containsKey(name))
		{
			return map.get(name);
		}
		return null;
	}

	
}