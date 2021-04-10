import java.util.Scanner;
import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int i, j, k;
        ArrayList<Integer> prime = new ArrayList<Integer>();
        prime.add(2);
        for (i = 3; i <= n; i += 2) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == i) {
                prime.add(i);
            }
        }
        int prime_n = prime.size();
        for (i = 0; i < prime_n - 2; i++) {
            for (j = i + 1; j < prime_n - 1; j++) {
                for (k = j + 1; k < prime_n; k++) {
                    if (prime.get(i) + prime.get(j) + prime.get(k) == n) {
                        answer += 1;
                    }
                }
            }
        }
        return answer;
    }    
}