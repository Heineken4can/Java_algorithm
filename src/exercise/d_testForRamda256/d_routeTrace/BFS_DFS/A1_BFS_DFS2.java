package exercise.d_testForRamda256.d_routeTrace.BFS_DFS;
//https://velog.io/@ming/DFS-vs-BFS-%ED%83%90%EC%83%89
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

/*
// 입력1      
4 5 1
1 2
1 3
1 4
2 4
3 4
// 출력1 
3 1 2 5 4 (DFS)
3 1 4 2 5 (BFS)
 */
public class A1_BFS_DFS2 {
	static int map[][];
	static ArrayList<TreeMap<Integer, Integer>> arrayList;
	static LinkedList<Integer>[] adjList;
	static boolean[] visited;
	static int n,m,v;
	static String answer = "";

//1.dfs:재귀,인접행렬
	public static void dfs_adjacency_matrix(int v) {
		visited[v] = true;
		answer += v + " ";
		System.out.println(answer);
		for (int i = 1; i < m; i++) {
			if(map[v][i] == 1 && visited[i] ==false) {
				dfs_adjacency_matrix(i);
			}
		}
	}
//2.dfs:재귀,인접리스트
	public static void dfs_adjacency_list(int v) {
		visited[v] = true;
		answer += v + " ";
		TreeMap<Integer, Integer> tmap = arrayList.get(v);
		for (int i : tmap.keySet()) {
			if (visited[i] == false) {
				dfs_adjacency_list(i);
			}
		}
		
	}
	
//3.dfs:스택,인접행렬
	public static void dfs_stack(int v) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(v);
		
		while (!stack.isEmpty()) {
			int vv = stack.pop();
			visited[vv] = true;
			answer += vv + " ";//어떤 경로를 거치나 
			for (int i = 1; i < n + 1; i++) {
				if (map[vv][i] == 1 && visited[i] == false) {
					stack.push(i);
					break;
				}
			}
		}
		
	}

//4. bfs
	public static void bfs_queue_adjacency_matrix(int v) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(v);
		visited[v] = true;
		
		while(!q.isEmpty()) {
			int vv = q.poll();
			answer += vv + " ";
			
			for (int i = 1; i < n + 1; i++) {
				if(map[vv][i] == 1 && !visited[i]) {
					q.offer(i);
					visited[i] = true;
				}
				
			}
		}
		
	}
	
//5. bfs, 인접리스트
	public static void bfs_queue_adjacency_list(int v) {
		Queue<Integer> q = new LinkedList<Integer>();
		visited[v] = true;
		q.add(v);
		
		while (!q.isEmpty()) {
			v = q.poll();
			answer += v + " ";
			
			Iterator<Integer> it = adjList[v].listIterator();
			while(it.hasNext()) {
				int w = it.next();
				if (!visited[w]) {
					visited[w] = true;
					q.add(w);
				}
				
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//class
