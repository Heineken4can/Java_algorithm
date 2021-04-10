import java.util.*;

public class Solution {
	String[] vowels = {"A", "E", "I", "O", "U"};
	ArrayList<String> words = new ArrayList<String>();
	public void create_words(int lev, String str) {
		words.add(str);
		for (int i = 0; i < 5; i++) {
			if (lev < 5) {
				create_words(lev + 1, str.concat(vowels[i]));
			}
		}
	}
	public int solution(String word) {
		int answer = 0;
		create_words(0, "");
		int words_n = words.size();
		for (int i = 0; i < words_n; i++) {
			if (word.equals(words.get(i))) {
				answer = i;
				break;
			}
		}
		return answer;
	}
}