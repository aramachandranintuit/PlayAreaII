package DS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ShortestPathFirst {
	
	class Graph
	{
		List<Vertex> vertices;
		List<Edge> edges;
		
		public Graph(List<Vertex> vertices, List<Edge> edges)
		{
			this.vertices =vertices;
			this.edges=edges;
		}
	}
	class Vertex
	{
		final String name;
		final String id;
		public String getName() {
			return name;
		}
		public String getId() {
			return id;
		}
		Vertex(String id ,String name)
		{
			this.id= id;
			this.name=name;	
		}
		public int hashCode()
		{
			return (this.name.hashCode()^this.id.hashCode());
		}
		
		public boolean equals(Object o)
		{
			if(o!=null && o instanceof Vertex)
			{
				if(((Vertex)o).id == this.id && ((Vertex)o).name == this.name)
					return true;
			}
			return false;
			
		}
		
	}
	class Edge
	{
		final Vertex source;
		final Vertex destination;
		final int weight;
		final int id;
		
		public Vertex getSource() {
			return source;
		}
		public Vertex getDestination() {
			return destination;
		}
		public int getWeight() {
			return weight;
		}
		public int getId() {
			return id;
		}
		public Edge(Vertex source , Vertex destination,int weight,int id)
		{
			this.source=source;
			this.destination=destination;
			this.weight=weight;
			this.id=id;
		}
		
	}
	Map<Vertex,Integer> distance ;
	Set<Vertex> settledNodes;
	Set<Vertex> unsettledNodes;
	Map<Vertex,Vertex> predecessor;
	ShortestPathFirst()
	{
		distance = new HashMap<Vertex,Integer>();
	}
		void execute(Vertex source)
		{
//			set distance.put(source,0);
//			add source to unsettledNodes set
//			getshortestdistance vertex 
//			add source to settled list
//			remove source from unsettled list
//			a
//			
		}
	}

