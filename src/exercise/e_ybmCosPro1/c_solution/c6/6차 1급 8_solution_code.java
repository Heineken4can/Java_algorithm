class Solution {
    final int INC = 0;
    final int DEC = 1;
    int[] func_a(int[] arr){
        int length = arr.length;
        int[] ret = new int[length];
        ret[0] = 1;
        for(int i = 1; i < length; i++){
            if(arr[i] != arr[i-1])
                ret[i] = ret[i-1] + 1;
            else
                ret[i] = 2;
        }
        return ret;
    }
    
    int[] func_b(int[] arr){
        int length = arr.length;
        int[] ret = new int[length];
        ret[0] = -1;
        for(int i = 1; i < length; i++){
            if(arr[i] > arr[i-1])
                ret[i] = INC;
            else if(arr[i] < arr[i-1])
                ret[i] = DEC;
        }
        return ret;
    }
    int func_c(int[] arr){
        int length = arr.length;
        int ret = 0;
        for(int i = 0; i < length; i++)
            if(ret < arr[i])
                ret = arr[i];
        if(ret == 2)
            return 0;
        return ret;
    }
    
    public int solution(int[] S) {
        int[] check = func_b(S);
        int[] dp = func_a(check);
        int answer = func_c(dp);
        return answer;
    }
}