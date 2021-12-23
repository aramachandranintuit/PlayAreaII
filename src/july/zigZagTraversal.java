package july;

public class zigZagTraversal {
	public static void main(String[] args)
	{
		System.out.println(convert("PAYPALISHIRING",4));
	}
//	public static String convert(String s, int numRows) {
//
//        if (numRows == 1) return s;
//
//        StringBuilder ret = new StringBuilder();
//        int n = s.length();
//        int cycleLen = 2 * numRows - 2;
//
//        for (int i = 0; i < numRows; i++) {
//            for (int j = 0; j + i < n; j += cycleLen) {
//                ret.append(s.charAt(j + i));
//                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
//                    ret.append(s.charAt(j + cycleLen - i));
//            }
//        }
//        return ret.toString();
//    }
	
	public static String convert(String s, int nRows) {
	    char[] c = s.toCharArray();
	    int len = c.length;
	    StringBuffer[] sb = new StringBuffer[nRows];
	    for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();
	    
	    int i = 0;
	    while (i < len) {
	        for (int idx = 0; idx < nRows && i < len; idx++) // vertically down
	            sb[idx].append(c[i++]);
	        for (int idx = nRows-2; idx >= 1 && i < len; idx--) // obliquely up
	            sb[idx].append(c[i++]);
	    }
	    for (int idx = 1; idx < sb.length; idx++)
	        sb[0].append(sb[idx]);
	    return sb[0].toString();
	}

}
