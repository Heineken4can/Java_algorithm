package exercise.d_testForRamda256.d_routeTrace.BFS_DFS;

//https://www.acmicpc.net/problem/11403
//https://sustainable-dev.tistory.com/47
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class B_pathFind {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken()); // n개의 줄

		int[][] a = new int[n][n]; // 입력값 받기

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		bfs(a, n);// 입력값 : 인접행렬과 행렬의 크기

		// 결과 print
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

	// bfs로 풀기 - queue
	private static void bfs(int[][] a, int n) {
		for (int i = 0; i < n; i++) {
			Queue<Integer> q = new LinkedList<>();
			boolean[] c = new boolean[n];
			q.add(i);

			while (!q.isEmpty()) {
				int v = q.poll();

				for (int j = 0; j < n; j++) {
					if (a[v][j] == 1 && !c[j]) {
						c[j] = true;
						a[i][j] = 1;
						q.add(j);
					}
				}
			}

		}
	}

	// dfs로 풀기 - stack
	private static void dfs(int[][] a, int n) {
		for (int i = 0; i < n; i++) {
			Stack<Integer> stack = new Stack<>();
			boolean[] c = new boolean[n];
			boolean flag = false;

			stack.push(i);

			while (!stack.isEmpty()) {
				int v = stack.peek();

				flag = false;

				for (int j = 0; j < n; j++) {
					if (a[v][j] == 1 && !c[j]) {
						stack.push(j);
						c[j] = true;
						a[i][j] = 1;
						flag = true;
						break;
					}
				}

				if (!flag)
					stack.pop();
			}
		}

	}
}