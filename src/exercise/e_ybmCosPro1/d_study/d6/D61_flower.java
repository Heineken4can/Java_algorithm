package exercise.e_ybmCosPro1.d_study.d6;

import java.util.LinkedList;
import java.util.Queue;

public class D61_flower {

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		Solution sol = new Solution();
		int n1 = 3;
		int[][] garden1 = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		int ret1 = sol.solution(n1, garden1);
		System.out.println("11============>");
		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int n2 = 2;
		int[][] garden2 = { { 1, 1 }, { 1, 1 } };
		int ret2 = sol.solution(n2, garden2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

	}
}

class Flower {
	int x, y, day;

	Flower(int x, int y, int day) {
		this.x = x;
		this.y = y;
		this.day = day;
	}
}

class Solution {
	public int solution(int n, int[][] garden) {
		int answer = 0;

		int[] dx = { -1, 1, 0, 0 };
		int[] dy = { 0, 0, -1, 1 };

		Queue<Flower> q = new LinkedList<Flower>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (garden[i][j] == 1)
					q.offer(new Flower(i, j, 0));
			}
		}

		while (!q.isEmpty()) {
			Flower flower = q.peek();
			q.poll();

			for (int i = 0; i < 4; i++) {
				int nextX = flower.x + dx[i];
				int nextY = flower.y + dy[i];
				int nextDay = flower.day + 1;

				if ((0 <= nextX && nextX < n && 0 <= nextY && nextY < n) && garden[nextX][nextY] == 0) {
					garden[nextX][nextY] = 1;
					answer = nextDay;
					q.offer(new Flower(nextX, nextY, nextDay));
				}
			}
		}

		return answer;
	}
}