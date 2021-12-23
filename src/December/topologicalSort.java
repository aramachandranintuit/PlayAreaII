package December;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/*
 * 210. Course Schedule II
Medium

5568

213

Add to List

Share
There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
Return the ordering of courses you should take to finish all courses. If there are many valid answers, return any of them. If it is impossible to finish all courses, return an empty array.

 

Example 1:

Input: numCourses = 2, prerequisites = [[1,0]]
Output: [0,1]
Explanation: There are a total of 2 courses to take. To take course 1 you should have finished course 0. So the correct course order is [0,1].
Example 2:

Input: numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
Output: [0,2,1,3]
Explanation: There are a total of 4 courses to take. To take course 3 you should have finished both courses 1 and 2. Both courses 1 and 2 should be taken after you finished course 0.
So one correct course order is [0,1,2,3]. Another correct ordering is [0,2,1,3].
Example 3:

Input: numCourses = 1, prerequisites = []
Output: [0]
 

Constraints:

1 <= numCourses <= 2000
0 <= prerequisites.length <= numCourses * (numCourses - 1)
prerequisites[i].length == 2
0 <= ai, bi < numCourses
ai != bi
All the pairs [ai, bi] are distinct.
 * 
 */

	public class topologicalSort {
		public static void main(String[] args)
		{
			int v=4;
			int[][] g = {{1,0},{2,0},{3,1},{3,2}};
			Map<Integer,List<Integer>> map = new HashMap();
			boolean[] visited = new boolean[v];
			boolean[] cycle = new boolean[v];
			Stack<Integer> stack = new Stack<>();
			for(int i=0;i<v;i++)
			{
				map.put(i,new ArrayList<Integer>());
			}
			for(int [] a: g)
			{
				map.get(a[0]).add(a[1]);
			}
			for(int i=0;i<v;i++)
			{
				if(!topologicalSort(i,visited,cycle,map,stack)) System.out.println(Arrays.toString(new int[] {}));
			}
			
//			System.out.println(stack);
			while(!stack.isEmpty()) System.out.println(stack.pop());
			
		}
		
		private static boolean topologicalSort(int src ,boolean[] cycle,boolean[] visited,Map<Integer,List<Integer>> map , Stack<Integer> stack)
		{
			if(cycle[src]) return false;
			if(visited[src]) return true;
			
			cycle[src]=true;
			for(int a : map.get(src))
				if(!topologicalSort(a,cycle,visited,map,stack)) return false;
			cycle[src]=false;
			visited[src]=true;
			stack.push(src);
			return true;
			
		}
	}
