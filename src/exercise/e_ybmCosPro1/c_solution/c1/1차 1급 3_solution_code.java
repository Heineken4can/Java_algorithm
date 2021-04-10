class Solution {
    public int solution(String pos) {
    	int dx[] = {1,1,-1,-1,2,2,-2,-2};
    	int dy[] = {2,-2,-2,2,1,-1,-1,1};
    	int cx = pos.charAt(0) - 'A';
    	int cy = pos.charAt(1) - '0' - 1;
    	int ans = 0;
    	for (int i = 0; i < 8; ++i) {
    		int nx = cx + dx[i];
    		int ny = cy + dy[i];
    		if (nx >= 0 && nx < 8 && ny >= 0 && ny < 8)
    			ans++;
    	}
    	return ans;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 함수입니다.
    public static void main(String[] args) {
    	Solution sol = new Solution();
	    String ex0_pos = "A7";
	    int ex0_ret = sol.solution(ex0_pos);
    	
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.printf("첫 번째 예제의 답은 %d 입니다.\n", 3);
        System.out.printf("solution 함수의 반환 값은 %d 입니다.\n", ex0_ret);
    }
}