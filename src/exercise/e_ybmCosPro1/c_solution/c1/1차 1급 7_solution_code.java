class Solution{
    int solution(int[] prices){
        int inf = 1000000001;
        int mn = inf;
        int ans = -inf;
        for(int price : prices){
            if(mn != inf) ans = Math.max(ans, price - mn);
            mn = Math.min(mn, price);
        }
        return ans;
    }
}
