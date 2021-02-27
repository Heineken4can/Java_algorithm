package exercise.b_programmers.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Network_sol {
 
	
	 public static void main(String[] args) {
	        int n = 3;
	        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
	        nSolution2 s = new nSolution2();
	        System.out.println(s.solution(n, computers));
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


//https://hoho325.tistory.com/208
class nSolution2 {
   
    static boolean[] visited;
    public static int solution(int n, int[][] computers) {
        int ans = 0;

        visited = new boolean[computers.length];
        for(int i=0; i<n; i++){
            if(!visited[i]){
                bfs(i, computers);
                ans++;
            }
        }
        return ans;
    }

    public static void bfs(int a, int[][] computers){
        Queue<Integer> q = new LinkedList<>();
        q.offer(a);
        visited[a] = true;

        while(!q.isEmpty()){
            int x = q.poll();

            for(int i=0; i<computers.length; i++){
                // 방문하지 않았고 연결되어 있고 자기 자신이 아닌 경우
                if(!visited[i] && computers[x][i] == 1 && x != i){
                    visited[i] = true;
                    q.offer(i);
                }
            }
        }
    }
}


//https://chbuljumeok1997.tistory.com/61
class nSolution3 {
    public int dfs(int index, boolean[] visit, int[][] computers){
        visit[index]=true;
        for(int i=0;i<computers.length;i++){
            if(i!=index && (!visit[i])&& computers[index][i]==1){
                dfs(i, visit, computers);
            }
        }
        return 0;
    }
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean visit[]=new boolean[computers.length];
        
        for(int i=0;i<computers.length;i++){
            if(!visit[i]){
                dfs(i, visit, computers);
                answer++;
                }
        }
        return answer;
    }
}


//https://n1tjrgns.tistory.com/253

//https://geehye.github.io/programmers-dfs-bfs-02/#