package leetcode;

public class easyProblems {
	
	public static void main(String[] args)
	{
		System.out.println(defangIPaddr("1.1.1.1"));
	}



public static String defangIPaddr(String address) {
    if(address!=null)
    {
        String[] str = address.split("\\.");
        String a="";
        for(int i=0;i<str.length-1;i++)
        {
            a= a + str[i]+"[.]";
        }
        return a+str[str.length-1];
    }
    return null;
    
}

}
