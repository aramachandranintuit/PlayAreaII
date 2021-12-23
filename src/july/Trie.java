package july;

import java.util.HashMap;
import java.util.Map;

class TrieNode
{
	Character a;
	Map<Character,TrieNode> map = null;
	String meaning;
	boolean isEndOfWord;
	TrieNode(Character a ,boolean isEndOfWord,Map<Character,TrieNode> map )
	{
		this.a =a;
		this.map = map;
	}
}
public class Trie {
	
	TrieNode root = new TrieNode('.',false,null);
	
	void insert(TrieNode node ,String word , boolean isEndOfWord,String meaning,Map<Character,TrieNode> map)
	{
		TrieNode currentNode= null;
		if(node==null)
		{
			currentNode = root;
			
		}
		else
		{
			if(node.map.containsKey(word.charAt(0)))
			{
				currentNode = map.get(word.charAt(0));				
				if(word.substring(1,word.length()).length()==1)
				{
					isEndOfWord = true;
					insert(currentNode,word.substring(1,word.length()),isEndOfWord,meaning,currentNode.map);
				}
				if(word.substring(1,word.length()).length()==0)
				{
					currentNode.meaning = meaning;
				}
			}
			else
			{
				
			}
		}
		
	}

}
