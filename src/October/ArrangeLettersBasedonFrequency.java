package October;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;


class Node
{
	char c;
	int f;
	Node(char c,int f)
	{
		this.c=c;
		this.f=f;
	}
}
public class ArrangeLettersBasedonFrequency {
	public static void main(String[] args)
	{
		String str = "tree";
		HashMap<Character,Node> map = new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			if(map.containsKey(str.charAt(i)))
			{
				Node n = map.get(str.charAt(i));
				n.f++;
				map.put(str.charAt(i), n);
			}
			else map.put(str.charAt(i), new Node(str.charAt(i),1));
		}
		PriorityQueue<Node> q = new PriorityQueue<Node>(new Comparator<Node>(){			
					@Override
					public int compare(Node a , Node b)
					{
						return b.f - a.f;
					}				
				}); 
		q.addAll(map.values());
		StringBuilder sb = new StringBuilder();
		while(!q.isEmpty())
		{
			Node n =q.poll();
			for(int i=0;i<n.f;i++)
			{
				sb.append(n.c);
			}
			
		}
		System.out.println(sb.toString());
	}

}
