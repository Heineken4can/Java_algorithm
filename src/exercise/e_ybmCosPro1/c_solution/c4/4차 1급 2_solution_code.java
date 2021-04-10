class Solution {
	String small_letters = "abcdefghijklmnopqrstuvwxyz";
	String big_letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String numbers = "0123456789";
	public char convert_small(char alphabet) {
		for (int i = 0; i < 26; i++) {
			if (big_letters.charAt(i) == alphabet) {
				return small_letters.charAt(i);
			}
		}
		return alphabet;
	}
	public char int_to_string(int val) {
		return numbers.charAt(val);
	}
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        char boss;
        int cnt = 1;
        boss = convert_small(s.charAt(0));
        for (int i = 1; i < len; i++) {
        	if (convert_small(s.charAt(i)) == boss) {
        		cnt += 1;
        	}
        	else {
        		answer += boss;
        		answer += int_to_string(cnt);
        		boss = convert_small(s.charAt(i));
        		cnt = 1;
        	}
        }
		answer += boss;
		answer += int_to_string(cnt);
		return answer;
    }
}