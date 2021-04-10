class Solution{
    int[][] pane;
    int dx[] = {0, 1, 0, -1};
    int dy[] = {1, 0, -1, 0};
    boolean inRange(int i, int j, int n){
        return 0 <= i && i < n && 0 <= j && j < n;
    }
    public int solution(int n){
        pane = new int[n][n];
        int ci = 0;
        int cj = 0;
        int num = 1;
        while(inRange(ci, cj, n) && pane[ci][cj] == 0){
            for(int k = 0; k < 4; k++){
                if(!inRange(ci, cj, n) || pane[ci][cj] != 0) break;
                while(true){
                    pane[ci][cj] = num++;
                    int ni = ci + dy[k];
                    int nj = cj + dx[k];
                    if(!inRange(ni, nj, n) || pane[ni][nj] != 0){
                        ci += dy[(k + 1) % 4];
                        cj += dx[(k + 1) % 4];
                        break;
                    }
                    ci = ni;
                    cj = nj;
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++) ans += pane[i][i];
        return ans;
    }
}
