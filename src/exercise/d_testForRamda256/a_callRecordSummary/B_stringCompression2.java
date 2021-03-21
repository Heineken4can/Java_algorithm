package exercise.d_testForRamda256.a_callRecordSummary;

/*
문제 : https://programmers.co.kr/learn/courses/30/lessons/60057
답 : https://github.com/ndb796/python-for-coding-test/blob/master/12/3.java

  s	              result
"aabbaccc"	        7
"ababcdcdababcdcd"	9
"abcabcdede"		8
"abcabcabcabcdededededede"	14
"xababcdcdababcdcd"	17
*/
import java.util.Scanner;

public class B_stringCompression2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resultCnt = 0;
		resultCnt = solution("ababcdcdababcdcd");
		System.out.println(resultCnt);

	}

	public static int solution(String s) {
		int answer = s.length();
		for (int step = 1; step < s.length() / 2 + 1; step++) {
			String compressed = "";
			String prev = s.substring(0, step);
			int cnt = 1;
			
			for (int j = step; j < s.length(); j += step) {
				
				String sub = "";
				for (int k = j; k < j + step; k++) {
					if (k < s.length()) sub += s.charAt(k);
				}//for3 k
				
				if (prev.equals(sub)) {
					cnt += 1;
				}else {
					compressed += (cnt >=2) ? cnt + prev : prev;
					sub = "";
					for ( int k = j; k < j + step; k++) {
						if (k < s.length()) sub += s.charAt(k);
					}//for3 k
					prev = sub;
					cnt = 1;
				}
			}//for2 j
			compressed += (cnt >= 2)? cnt + prev : prev;
			answer = Math.min(answer, compressed.length());
		}//for1 i
		return answer;
		
		

	}// solution
}
