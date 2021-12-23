package DS;

import java.util.HashMap;

public class Trie {
	
	
	class TrieNode implements Comparable<TrieNode> {
		HashMap<Character,TrieNode> children ;
		boolean isEndOfWord;
		String content;
		Character character;

		 TrieNode(char character,Boolean isEndOfWord,String content)
		{
			this.character = character;
			this.children = new HashMap<Character,TrieNode>();
			if(isEndOfWord)
			{
				this.content=content;
			}	
		}
		public int hashCode()
		{
			return this.character.hashCode();
		}
		public boolean equals(Object node)
		{
			if(node instanceof TrieNode)
			{
				if( ((TrieNode)node).character == this.character  &&  ((TrieNode)node).content == this.content)
					return true;
			}
			return false;
		}
		@Override
		public int compareTo(TrieNode o) {
			return ((TrieNode)o).character.hashCode() - this.character.hashCode();
		}
	}
	
	TrieNode root = new TrieNode('.',false,null);
	
//	TrieNode addNode(char character,Boolean isEndOfWord,String content)
//	{ 
//		
//		TrieNode newNode = new TrieNode(character,isEndOfWord,content);
//		return newNode;
//	}
	
	TrieNode insertNode(String word,Boolean isEndOfWord,String meaning,TrieNode node)
	{
		TrieNode currentNode ;
		if(node == null)
			currentNode =root;
		else
			currentNode =node;
		TrieNode newNode =null;
		for(int i=0;i<word.length();i++)
		{
			if(currentNode.children.containsKey(word.charAt(i)))
				{
					newNode = currentNode.children.get(word.charAt(i));
					if(isEndOfWord)
					{
						newNode.content=meaning;
					}
					else
					{
						insertNode(word.substring(i+1,word.length()),i==word.length()-1 ? true:false,meaning,newNode);
					}
				}
			else if(!currentNode.children.containsKey(word.charAt(i)))
			{
				newNode = new TrieNode(word.charAt(i),i==word.length()-1 ? true:false,meaning);
				currentNode.children.put(word.charAt(i), newNode);
				newNode = insertNode(word.substring(i+1,word.length()),i==word.length()-1 ? true:false,meaning,newNode);
				return newNode;
			}
		}
		return currentNode;
	}
	
	public static void main(String[] args)
	{
		Trie trie = new Trie();
		TrieNode node = trie.insertNode("Hello", false, "Greetings in a casual way", null);
		System.out.println(node.content);
		System.out.println(node.character);
	}
	

}
