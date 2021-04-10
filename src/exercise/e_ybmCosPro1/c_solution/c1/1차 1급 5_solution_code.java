class Solution {
    public int[] solution(int N, int[] votes) {
        int vote_counter[] = new int[11];
        for (int i = 0; i < votes.length; ++i) {
            vote_counter[votes[i]] += 1;
        }
        int max_val = 0;
        int cnt = 0;
        for (int i = 1; i <= N; ++i) {
            if (max_val < vote_counter[i]) {
                max_val = vote_counter[i];
                cnt = 1;
            }
            else if(max_val == vote_counter[i]){
                cnt += 1;
            }
        }
        int answer[] = new int[cnt];
        for (int i = 1, idx = 0; i <= N; ++i){
            if (vote_counter[i] == max_val) {
                answer[idx] = i;
                idx += 1;
            }
        }
        return answer;
    }
}