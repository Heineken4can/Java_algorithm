package exercise.d_testForRamda256.a_callRecordSummary;

/*
문제 : https://programmers.co.kr/learn/courses/30/lessons/60057
답 : https://velog.io/@ajufresh/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EB%AC%B8%EC%9E%90%EC%97%B4-%EC%95%95%EC%B6%95-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-Java

  s	              result
"aabbaccc"	        7
"ababcdcdababcdcd"	9
"abcabcdede"		8
"abcabcabcabcdededededede"	14
"xababcdcdababcdcd"	17
*/
import java.util.Scanner;

//import com.sun.tools.javac.util.Assert;

public class B_stringCompression3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resultCnt = 0;
		resultCnt = solution("ababcdcdababcdcd");
		System.out.println(resultCnt);

	}

	public static int solution(String s) {
		int min = s.length();
		for (int i = 1; i < s.length() / 2; i++) {// i는 몇글자씩 자를지 결정.
			int compLeng = compression(s, i).length();
			min = Math.min(min, compLeng);
		}
		return min;
	}

	private static String compression(String str, int i) {
		int count = 1;
		String compression = "";
		String pattern = "";

		for (int j = 0; j < str.length() + i; j += i) {
			String nowStr;
			
			if (j >= str.length()) {
				nowStr = "";
			} else if (str.length() < j + i) {
				nowStr = str.substring(j);
			} else {
				nowStr = str.substring(j, j + i);
			}

			if ( j != 0 ) {
				if (nowStr.equals(pattern)) {
					count++;
				} else if (count >= 2) {
					compression += count + pattern;
				} else {
					compression += pattern;
				}				
			}
			
			pattern = nowStr;
		}//for j
		
		return compression;
	}

	/*
	 * //@Test public void sol() { Assert.assertEquals(7, solution("aabbaccc"));
	 * Assert.assertEquals(9, solution("ababcdcdababcdcd")); Assert.assertEquals(8,
	 * solution("abcabcdede")); Assert.assertEquals(14,
	 * solution("abcabcabcabcdededededede")); Assert.assertEquals(17,
	 * solution("xababcdcdababcdcd")); }
	 */
}
