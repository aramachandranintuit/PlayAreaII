package feb;

public class MinimumWindowSize {
	
	public static void main(String[] args)
	{
		String s ="caacbabbbcacbabaabcbbbcbbcbbbbbbabbcacbbcbabccbabbc";
		String t ="bababbcabccccbabbacacb";
		String r = getWindow(s,t,"");
		System.out.println(r.length());
		System.out.println(s.length());
	}
	
	
	public static String getWindow(String s, String t,String previousWindow)
    {
        if(s.length()==0 || t.length()==0) return previousWindow;
        int[] set = new int[100];
        for(int i=0;i<s.length();i++)
        {
            set[Math.abs(s.charAt(i)-'a')]++;
        }
        
        for(int i=0;i<t.length();i++)
        {
            if(set[Math.abs(t.charAt(i)-'a')] <=0)
            {
                return previousWindow;
            }
            else
            {
                set[Math.abs(t.charAt(i)-'a')]--;
            }
        }
            
                String l1 =getWindow(s.substring(1,s.length()),t,s);
                String l2 =getWindow(s.substring(0,s.length()-1),t,s);
                 System.out.println(l1);
                 System.out.println(l2);
                if(l1.length()>l2.length()) return l2;
                else return l1;
        }

}
