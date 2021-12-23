package June;

import java.util.HashMap;

 class TrieNode
 {
	Character c;
	HashMap<Character,TrieNode> map = null;
	boolean isEndOfWord;
    String meaning;
    TrieNode(Character c  , boolean isEndOfWord, String meaning)
    {
    		this.c=c;
    		this.map=new HashMap<Character,TrieNode>();
    		if(isEndOfWord)
    		{
    			this.isEndOfWord=true;
    			this.meaning =meaning;
    		}
    }
    
 }
public class Trie 
{
	
	TrieNode root= new TrieNode('.',null)
	public static void main(String[] args)
	{
		
	}

}
