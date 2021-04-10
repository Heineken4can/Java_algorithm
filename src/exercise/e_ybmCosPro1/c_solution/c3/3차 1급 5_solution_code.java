class Solution {
    public String solution(String phrases, int second) {
        String answer = "";
        String display = "";
        display = "______________" + phrases;
        for(int i = 0; i < second; ++i) {
        	display = display + Character.toString(display.charAt(0));
        	display = display.substring(1);
        }
        answer = display.substring(0,14);
        return answer;
    }
}
