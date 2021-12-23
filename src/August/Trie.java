package August;

import java.util.HashMap;

public class Trie {
	
	class Node{
		
		boolean isEnd;
		char c ;
		HashMap<Character,Node> map = null;
		String meaning =null;
		Node(char c)
		{
			this.c=c;
			map = new HashMap<>();
			isEnd=false;
		}
	}
	
	Node root = new Node('.');
	boolean insert(String key,String meaning)
	{
		Node crawl = root;
		for(int i=0;i<key.length();i++)
		{
			if(crawl.map.get(key.charAt(i))==null) 
				crawl.map.put(key.charAt(i), new Node(key.charAt(i)));
			
			crawl = crawl.map.get(key.charAt(i));
			if(i==key.length()-1)
			{
				crawl.meaning= meaning;
				crawl.isEnd=true;
			}			
		}
		return crawl.isEnd;
				
	}
	
	String search(String key)
	{
		Node crawl =root;
		for(int i=0;i<key.length();i++)
		{
			if(crawl.map.get(key.charAt(i))==null) return null;
			crawl = crawl.map.get(key.charAt(i));
			if(i==key.length()-1)
			{
				System.out.println(crawl.meaning);
				return crawl.meaning;
			}			
		}
		return null;
	}
	
	public static void main(String[] args)
	{
		String s = "absent";
		String m = "Not present";
		Trie t = new Trie();
		t.insert(s, m);
		System.out.println(t.root.map.get('a').map.get('b').map.get('s').map.get('e').map.get('n').map.get('t').meaning);
		System.out.println(t.search("absen"));
	}

}
