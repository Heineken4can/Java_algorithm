package exercise.d_testForRamda256.d_routeTrace.BFS_DFS;

//https://m.blog.naver.com/lm040466/221787478911
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
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A2_BFS_DFS2 {

	static int[][] check;// 간선 연결 상태
	static boolean[] checked;// 확인 여부
	static int n;// 정점개수
	static int m;// 간선 개수
	static int start;// 시작 정점

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		start = sc.nextInt();

		check = new int[1001][1001];
		checked = new boolean[1001];// 초기값 false

		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			check[x][y] = check[y][x] = 1;
		}

		dfs(start);
		checked = new boolean[1001];
		bfs();
	}// main

	// 시작점을 변수로 받아 확인, 출력 후 다음 연결점을 찾아 시작점을 변경하여 재호출
	public static void dfs(int i) {
		checked[i] = true;
		for (int j = 1; j <= n; j++) {
			if (check[i][j] == 1 && checked[j] == false) {
				dfs(j);
			}
		}
	}// dfs

	public static void bfs() {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(start);
		checked[start] = true;

		while (!queue.isEmpty()) {
			int temp = queue.poll();

			for (int j = 1; j <= n; j++) {
				if (check[temp][j] == 1 && checked[j] == false) {
					queue.offer(j);
					checked[j] = true;
				}
			}
		}

	}// bfs
}
