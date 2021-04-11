package exercise.e_ybmCosPro1.d_study.d6;
//다음과 같이 import를 사용할 수 있습니다.

//https://drcode-devblog.tistory.com/128 
//ybm에서 제공해 주는 답은 없고 개인블로그에만 있네.

import java.util.*;

public class D62_words {

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		Solution2 sol2 = new Solution2();
		System.out.println("22============>");
		int K = 10;
		String[] words = { new String("nice"), new String("happy"), new String("hello"), new String("world"),
				new String("hi") };
		int ret = sol2.solution(K, words);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution2 메소의 반환 값은 " + ret + " 입니다.");
	}// main

}

class Solution2 {
	public int solution(int K, String[] words) {
		int answer = 0;

		String str = "";
		int i = 0;
		do {
			if (str.length() % K < K - 1) {
				if ((str.length() + words[i].length()) % K < K - 1) {
					str += words[i];
					i++;
				} else {
					str += "_";
				}
			}

			if (str.length() % K == 0 || i == words.length)
				answer++;
		} while (i < words.length);

		return answer;
	}
}
