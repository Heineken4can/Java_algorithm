class Solution {
    public String solution(int number) {
        String answer = "";

        int[] numberCount = new int[10];
        while(number > 0) {
        	numberCount[number % 10]++;
        	number /= 10;
        }
        
        for(int i = 9; i >= 0; i--)
        	if(numberCount[i] != 0)
        		answer += (String.valueOf(i) + String.valueOf(numberCount[i]));
        
        return answer;
    }
}