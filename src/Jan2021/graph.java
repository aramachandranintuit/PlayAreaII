	package Jan2021;
	
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
	
	 class edge implements Comparable<edge>
	{
		vertex sVertex;
		vertex dVertex;
		int weight;
		edge(vertex sVertex, vertex dVertex,int weight)
		{
			this.sVertex=sVertex;
			this.dVertex=dVertex;
			this.weight=weight;
		}
		@Override
		public int hashCode()
		{
			return this.sVertex.hashCode() ^ this.dVertex.hashCode();
		}
		
		@Override
		public boolean equals(Object o)
		{
			if(!(o instanceof edge))
			{
				return false;
			}
			else 
			{
				if(((edge)o).sVertex.equals(this.sVertex) && ((edge)o).dVertex.equals(this.dVertex) && ((edge)o).weight==(this.weight))
				{
					return true;
				}			
			}
			return false;
		}
		
		@Override
		public int compareTo(edge e)
		{
			return this.weight - e.weight;
		}
	}
		class vertex
		{
			String name;
			vertex(String name)
			{
				this.name=name;
			}
		}
		public class graph 
		{
			List<edge> edges ;
			List<vertex> vertices ;
			graph(List<edge> edges, List<vertex> vertices)
			{
				this.edges=edges;
				this.vertices=vertices;
			}
			public boolean hasLoop(List<edge> edges)
			{
				HashMap<vertex,Boolean> map = new HashMap<vertex,Boolean>();
				for(int i=0;i<edges.size();i++)
				{
					if(map.containsKey(edges.get(i).dVertex))
						return true;
					else
					{
						map.put(edges.get(i).sVertex,true);
					}
				}
				return false;
			}
			
			public List<edge> findMST(List<edge> e,vertex v,int n)
			{
				List<edge> es = e;
				Collections.sort(es);
				int i=0;
				List<edge> eMST = new ArrayList<edge>();
				HashMap<vertex,Boolean> map = new HashMap<vertex,Boolean>();
				vertex sVertex = v;
				while(i<n)
				{
//					get the lowest edge for a vertex and add it to eMSt
					edge e1 = getEdgeforASourceVertex(es,sVertex.name);
							if(e1!=null)
							{
								eMST.add(e1);
							}	
//		check for loop
							if(hasLoop(eMST))
							{
								eMST.remove(i);
								es.remove(e1);
							}
//		get the dVertex and repeat 
							sVertex = e1.dVertex;
// 					increment i
					 i++;
				}
				return eMST;
			}
			
			public edge getEdgeforASourceVertex(List<edge> e,String vName)
			{
				for(int i=0;i<e.size();i++)
				{
					if(e.get(i).sVertex.name.equals(vName))
						return e.get(i);
				}
				return null;
			}
			
			public static void main(String[] args)
			{
				List<edge> e = new ArrayList<edge>();
				List<vertex> v = new ArrayList<vertex>();
				vertex v1= new vertex("v1");
				vertex v2= new vertex("v2");
				vertex v3= new vertex("v3");
				vertex v4= new vertex("v4");
				v.add(v1);
				v.add(v2);
				v.add(v3);
				v.add(v4);
				edge e1= new edge(v1,v2,1);
				edge e2= new edge(v2,v3,2);
				edge e3= new edge(v3,v4,3);
				edge e4= new edge(v4,v2,3);	
				e.add(e1);
				e.add(e2);
				e.add(e3);
				e.add(e4);
				graph g = new graph(e,v);
				System.out.println(g.hasLoop(e));
				System.out.println(g.findMST(e,v.get(0),4).get(0));
			}
		}
