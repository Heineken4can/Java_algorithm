class Solution {
    public int solution(int n, int mix, int k) {
        int answer = 0;

        int[] card = new int[n];
        for(int i = 0; i < n; i++)
        	card[i] = i+1;

        while((mix--) != 0) {
        	int[] card_a = new int[n/2];
        	int[] card_b = new int[n/2];

        	for(int i = 0; i < n; i++) {
        		if(i < n/2)
        			cardA[i] = card[i];
        		else
        			cardB[i-n/2] = card[i];
        	}

        	for(int i = 0; i < n; i++) {
        		if(i % 2 == 0)
        			card[i] = cardA[i/2];
        		else
        			card[i] = cardB[i/2];
        	}
        }

        answer = card[k-1];

        return answer;
    }
}