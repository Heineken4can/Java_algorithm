class Solution {
    public int[] solution(String commands) {
        int[] currentPosition = {0, 0};
        for(int i = 0; i < commands.length(); ++i){
            if (commands.charAt(i) == 'L')
                currentPosition[0] -= 1;
            else if(commands.charAt(i) == 'R')
                currentPosition[0] += 1;
            else if(commands.charAt(i) == 'U')
                currentPosition[1] += 1;
            else if(commands.charAt(i) == 'D')
                currentPosition[1] -= 1;
        }
        return currentPosition;
    }
}