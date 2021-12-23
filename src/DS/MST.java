package DS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Edge implements Comparable<Edge>
{
	Vertex sVertex;
	Vertex dVertex;
	int weight;	
	
	Edge(Vertex sVertex ,Vertex dVertex ,int weight)
	{
		this.sVertex = sVertex;
		this.dVertex = dVertex;
		this.weight = weight;
	}
	
	public int compareTo(Edge edge)
	{
		return this.weight - edge.weight;
		
	}
}

	class Vertex
	{
		String name;
		
		Vertex(String name)
		{
			this.name =name;
		}
		
	}
	public class MST {
	
		List<Vertex> vertices;
		List<Edge> edges;
		
		MST(List<Vertex> vertices,List<Edge> edges)
		{
			this.vertices = vertices;
			this.edges=edges;
		}
		
		private List<Edge> sortbasedOnWeight()
		{
			 Collections.sort(this.edges);
			 return this.edges;
		}
		
		private boolean checkForLoop(List<Edge> edges)
		{
			HashMap<Vertex,Boolean> map = new HashMap<>();
			for(Edge edge : edges)
			{
				if(!map.get(edge.dVertex))
				{
					return true;
				}
				else
					map.put(edge.sVertex, true);
			}
			return false;
		}
		
		public static void main(String[] args)
		{
/*   (3)
 * 	1----2
 *  | (2) | (4)
*(2)|   \ |
 *  3-----4
 *     (1)
 */
			Vertex one = new Vertex("one");
			Vertex two = new Vertex("two");
			Vertex three = new Vertex("three");
			Vertex four = new Vertex("four");
			List<Vertex> vertices = new ArrayList<Vertex>();
			vertices.add(one);
			vertices.add(two);
			vertices.add(three);
			vertices.add(four);
			
			
			Edge oneTwo = new Edge(one ,two,3);
			Edge oneThree = new Edge(one ,three,2);
			Edge oneFour = new Edge(one ,four,2);
			Edge threeFour = new Edge(three ,four,1);
			Edge twoFour = new Edge(two ,four,4);
			List<Edge> edge = new ArrayList<Edge>();
			edge.add(oneTwo);
			edge.add(oneThree);
			edge.add(oneFour);
			edge.add(oneTwo);
			edge.add(twoFour);
			
			MST tree = new MST(vertices,edge);
			edge = tree.sortbasedOnWeight();
			for(int i=0;i<edge.size();i++)
			{
				System.out.println(edge.get(i).weight);
			}
			
			
		}

}
