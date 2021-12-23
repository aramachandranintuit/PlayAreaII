package april.GeneralDoubts;

/*
 * Give a binary string s, return the number of non-empty substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.

Substrings that occur multiple times are counted the number of times they occur.

 

Example 1:

Input: s = "00110011"
Output: 6
Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".
Notice that some of these substrings repeat and are counted the number of times they occur.
Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.
 * 
 */
public class CountBinaryStrings {
	
	/*
	 * the idea is to maintain 2 counts , 1 for elapsed chars and 1 for the currentchars ,
	 *  if elapse > current then we have found our string
	 * 
	 * 
	 */
	
	public static void main(String[] args)
	{
//		System.out.println(countBStrings("00110011"));
		System.out.println(count1s(125));
	}
	
	public static int countBStrings(String s)
	{
		int currentLen=1;
		int prevLen=0;
		int res=0;
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)==s.charAt(i-1)) currentLen++;
			else
			{
				prevLen=currentLen;
				currentLen=1;
			}
			if(prevLen >= currentLen) res++;
		}
		return res;
	}
	
	private static int count1s(int r)
	{
		int c=0;
		while(r>0)
		{
			r = r & (r-1);
			c++;
		}
		return c;
	}

}
