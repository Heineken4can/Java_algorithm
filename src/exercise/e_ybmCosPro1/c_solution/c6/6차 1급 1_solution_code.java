import java.util.LinkedList;
import java.util.Queue;

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

		Queue <Flower> q = new LinkedList <Flower>();

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(garden[i][j] == 1)
					q.offer(new Flower(i, j, 0));
			}
		}

		while(!q.isEmpty()) {
			Flower flower = q.peek();
			q.poll();

			for(int i = 0; i < 4; i++) {
				int nextX = flower.x + dx[i];
				int nextY = flower.y + dy[i];
				int nextDay = flower.day + 1;

				if((0 <= nextX && nextX < n && 0 <= nextY && nextY < n) && garden[nextX][nextY] == 0) {
					garden[nextX][nextY] = 1;
					answer = nextDay;
					q.offer(new Flower(nextX, nextY, nextDay));
				}
			}
		}

		return answer;
    }
}