package exercise.d_testForRamda256.d_routeTrace.BFS_DFS;
//https://kingpodo.tistory.com/46 --> dfs,bfs 기본 설명 
//https://leveloper.tistory.com/35
//dfs 인접행렬, 재귀
//bfs 인접행렬, 큐
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
입력값  
4 5 1
1 2
1 3
1 4
2 4
3 4

결과값 
1 2 4 3 
1 2 3 4 
 */
public class A2_BFS_DFS {
	private static int N, M, V;
	private static int[][] graph;
	private static boolean[] check;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();//4
		M = sc.nextInt();//5
		V = sc.nextInt();//1
		graph = new int[N + 1][N + 1];// == map 
		check = new boolean[N + 1];// == visit
		for (int i = 0; i < M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			graph[x][y] = 1;
			graph[y][x] = 1;
		}
		dfs(V);
		System.out.println();
		Arrays.fill(check, false); // check 배열 초기화 bfs(V); }
	}

	public static void dfs(int start) {
		check[start] = true;
		System.out.print(start + " ");
		for (int i = 1; i < N + 1; i++) {//N=5
			if (graph[start][i] == 1 && !check[i]) // 간선으로 연결되었으며 아직 방문하지 않은 정점
				dfs(i);
		}
	}

	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);//offer 나 add
		check[start] = true;
		while (!q.isEmpty()) {
			int vertex = q.poll();
			System.out.print(vertex + " ");
			for (int i = 1; i < N + 1; i++) {
				if (graph[vertex][i] == 1 && !check[i]) { // 간선으로 연결되었으며(1이며) 아직 방문하지 않은 정점
					q.offer(i);
					check[i] = true;
				}
			}
		}
	}

}
// class