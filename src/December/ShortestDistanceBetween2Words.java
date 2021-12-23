package December;

public class ShortestDistanceBetween2Words {
	public static void main(String[] args)
	{
		String[] str = {"practice", "makes", "perfect", "coding", "makes"}; 
		System.out.println(shortestDistance(str,"practice","coding"));
	}

	public static int shortestDistance(String[] words, String word1, String word2) {
		int m=0;
		int n= words.length-1;
		while(words[m]!=word1)
		{
			m++;
		}
		while(words[n]!=word2)
		{
			n--;
		}
		return Math.abs(m-n);
		
	}
}
