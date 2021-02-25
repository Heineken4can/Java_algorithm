package programmers.dfs_bfs;


public class Network_sol {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numbers = "011";
		// int numbers = 11112;
		/* bSolution1 s = new bSolution1(); */
		//System.out.println(s.solution(numbers));
	}
}


//https://codevang.tistory.com/303
class nSolution1 {
    
    private int count;

	public int solution(int n, int[][] computers) {

		boolean[] visit = new boolean[n];

		// 전체 컴퓨터 방문
		for (int i = 0; i < n; i++) {

			// 이미 방문 도장이 찍혀있으면 가지 않음 
			if (!visit[i]) {
				
				// 첫 노드부터 재귀함수 시작
				dfs(n, i, computers, visit);
				count++;
			}
		}

		return count;
	}

	private void dfs(int n, int index, int[][] computers, boolean[] visit) {

		// 방문확인
		visit[index] = true;

		// 노드 방문
		for (int i = 0; i < n; i++) {

			// 연결된 노드, 자신 제외, 아직 방문기록이 없는 노드
			if (computers[index][i] == 1 && i != index && !visit[i]) {
				dfs(n, i, computers, visit);
			}
		}
	}
}