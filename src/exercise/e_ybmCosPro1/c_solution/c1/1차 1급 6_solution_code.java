class Solution{
    public int func(int record){
        if(record == 0) return 1;
        else if(record == 1) return 2;
        return 0;
    }

    public int solution(int[] recordA, int[] recordB){
        int cnt = 0;
        for(int i = 0; i < recordA.length; i++){
            if(recordA[i] == recordB[i]) continue;
            else if(recordA[i] == func(recordB[i])) cnt += 3;
            else cnt = Math.max(0, cnt - 1);
        }
        return cnt;
    }
}

