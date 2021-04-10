class Solution {
    public int[] solution(int k) {
        int[] kaprekarArr = new int[k];
        int count = 0;
        for (int i = 1; i <= k; i++) {
        	long squareNum = i * i;
        	long divisor = 1;
        	while (squareNum / divisor != 0) {
        		long front = squareNum / divisor;
        		long back = squareNum % divisor;
        		divisor *= 10;
        		if (back != 0 && front != 0)
        			if (front + back == i) {
        				kaprekarArr[count] = i;
        				count++;
        			}
        	}
        }
        int[] answer = new int[count];
        for (int i = 0; i < count; i++) 
        	answer[i] = kaprekarArr[i];
        return answer;
    }
}