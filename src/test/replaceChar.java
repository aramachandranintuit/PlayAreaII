package test;

public class replaceChar {
	
	public static void main(String[] args)
	{
		String str="gbc";
		int k=2;
		encode(str,k);
		
	}
	
	static void encode(String s, int k) {
		 
        // changed string
        String newS = "";
 
        // iterate for every characters
        for (int i = 0; i < s.length(); ++i) {
            // ASCII value
            int val = s.charAt(i);
            // store the duplicate
            int dup = k;
 
            // if k-th ahead character exceed 'z'
            if (val + k > 122) {
                k =k-(122 - val);
                k = k % 26;
                 
                newS += (char)(96 + k);
            } else {
                newS += (char)(val + k);
            }
 
            k = dup;
        }
 
        // print the new string
        System.out.println(newS);
    }

}
