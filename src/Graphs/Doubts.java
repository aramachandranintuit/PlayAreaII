package Graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class N
{
	String label;
	List<N> children;
	N(String label,List<N> children)
	{
		this.label = label;
		this.children=children;
	}
	
	public static String encode(N node)
	{
		if(node==null) return "";
		List<String> label = new ArrayList<String>();
		label.add(node.label);	
		List<N> children = node.children;
		if(children==null) return "";
		for(N n : node.children)
		{
			label.add(encode(n));
			
		}
		Collections.sort(label);
		StringBuilder sb = new StringBuilder();
		for(String l:label)
			sb.append(l);
		return "(  " + sb.toString() + " )";
		
	}
		
}

public class Doubts {
	
	public static void main(String[] args)
	{
		N n1 = new N("a",null);
		N n2 = new N("b",null);
		N n3 = new N("c",null);
		N n4 = new N("d",null);
		N n5 = new N("e",null);
		List<N> n1List = new ArrayList<N>();
		n1List.add(n2);
		n1List.add(n3);
		n1.children = n1List;
		List<N> n2List = new ArrayList<N>();
		n2List.add(n4);
		n2List.add(n5);
		n2.children=n2List;
		System.out.println(N.encode(n1));
		
	}

}
