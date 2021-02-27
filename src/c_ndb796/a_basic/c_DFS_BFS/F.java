package c_ndb796.a_basic.c_DFS_BFS;

public class F {
	   public static final int INF = 999999999;
	    
	    // 2차원 리스트를 이용해 인접 행렬 표현
	    public static int[][] graph = {
	        {0, 7, 5},
	        {7, 0, INF},
	        {5, INF, 0}
	    };

	    public static void main(String[] args) {
	        // 그래프 출력
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(graph[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
