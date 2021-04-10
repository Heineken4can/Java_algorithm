package exercise.d_testForRamda256.a_callRecordSummary;

/*
문제 : https://programmers.co.kr/learn/courses/30/lessons/60057
답 : https://cheonjoosung.github.io/blog/pg-compress

  s	              result
"aabbaccc"	        7
"ababcdcdababcdcd"	9
"abcabcdede"		8
"abcabcabcabcdededededede"	14
"xababcdcdababcdcd"	17
*/
import java.util.Scanner;

//import com.sun.tools.javac.util.Assert;

public class B_stringCompression9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resultCnt = 0;
		resultCnt = solution("ababcdcdababcdcd");
		System.out.println(resultCnt);

	}

	public static int solution(String argStr) {
		int answer = argStr.length();

		for (int inxWidth = 1; inxWidth < argStr.length() / 2; inxWidth++) {
			StringBuilder compressSb = new StringBuilder();

			for (int j = 0; j < argStr.length(); j += inxWidth) {
				String nowWord = "";

				if (j + inxWidth >= argStr.length()) {// 마지막 글자면
					nowWord = argStr.substring(j, argStr.length());
				} else {
					nowWord = argStr.substring(j, j + inxWidth);
				}

				int compressCnt = 1;// 압축된 횟수
				StringBuffer tmpSb = new StringBuffer();

				for (int k = j + inxWidth; k < argStr.length(); k += inxWidth) {
					String nextWord = "";

					if (k + inxWidth > argStr.length()) {
						nextWord = argStr.substring(k, argStr.length());
					} else {
						nextWord = argStr.substring(k, k + inxWidth);
					}

					if (nowWord.equals(nextWord)) {
						compressCnt++;
						j = k;
					} else {
						break;
					}
				} // for k

				if (compressCnt == 1) {
					tmpSb.append(nowWord);
				} else {
					tmpSb.append(compressCnt).append(nowWord);
				}
				 
				compressSb.append(tmpSb);
				
			} // for j
			
			answer = Math.min(answer, compressSb.toString().length());
		} // for inxWidth

		return answer;
	}

	/*
	 * //@Test public void sol() { Assert.assertEquals(7, solution("aabbaccc"));
	 * Assert.assertEquals(9, solution("ababcdcdababcdcd")); Assert.assertEquals(8,
	 * solution("abcabcdede")); Assert.assertEquals(14,
	 * solution("abcabcabcabcdededededede")); Assert.assertEquals(17,
	 * solution("xababcdcdababcdcd")); }
	 */
}
