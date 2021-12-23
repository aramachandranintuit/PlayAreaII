package October;

import java.util.ArrayList;
import java.util.List;

/*
 * [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]]
"ABCCED"
[["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]]
"SEE"
[["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]]
"ABCB"
 * 
 */
public class wordSearch {
	public static void main(String[] args)
	{
		String[][] m= {{"A","B","C","E"},
						{"S","F","C","S"},
						{"A","D","E","E"}};
		List<String> list = new ArrayList<String>();
		String key ="SEE";
		boolean[][] visited = new boolean[m.length][m[0].length];
		wordSearch o = new wordSearch();
		StringBuilder sb =new StringBuilder();
		boolean flag=false;
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				sb =new StringBuilder();
				sb.append(m[i][j]);
				visited[i][j]=true;
				flag = o.DFS(m,visited,list,i,j,sb,key);
				if(flag==true) {
					System.out.println(flag);
					return;
				}
				visited[i][j]=false;
			}
		}
	}
	
	public boolean DFS(String[][] m,boolean[][] visited ,List<String> list ,int r,int c ,StringBuilder sb,String key)
	{
		if(sb.length()>=key.length()) 
		{
			System.out.println(sb.toString());
			return key.contentEquals(sb.toString());
		}
		if(sb.length()>key.length()) return false;
		boolean flag=false;
		int[][]dir = {{0,1},{1,0},{-1,0},{0,-1}};
		for(int []a : dir)
		{
			int nextRow =a[0]+r;
			int nextCol=a[1]+c;
			if(nextRow >=m.length || nextCol >=m[0].length) continue;
			if(nextRow<0 || nextCol<0) continue;
			if(visited[nextRow][nextCol]) continue;
			sb.append(m[nextRow][nextCol]);
			visited[nextRow][nextCol]=true;
			flag = DFS(m,visited,list,nextRow,nextCol,sb,key);
			if(flag==true) return flag;
			visited[nextRow][nextCol]=false;
			sb.deleteCharAt(sb.length()-1);
		}
		return flag;
	}

}
