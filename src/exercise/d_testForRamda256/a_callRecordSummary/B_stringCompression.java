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

public class B_stringCompression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resultCnt = 0; 
		resultCnt = solution("ababcdcdababcdcd");
		System.out.println(resultCnt);
		
	}
	 public static int solution(String s) {
	        int answer = s.length();
	        // 1개 단위(step)부터 압축 단위를 늘려가며 확인
	        for (int step = 1; step < s.length() / 2 + 1; step++) {
	            String compressed = "";
	            String prev = s.substring(0, step); // 앞에서부터 step만큼의 문자열 추출
	            int cnt = 1;
	            // 단위(step) 크기만큼 증가시키며 이전 문자열과 비교
	            for (int j = step; j < s.length(); j += step) {
	                // 이전 상태와 동일하다면 압축 횟수(count) 증가
	                String sub = "";
	                for (int k = j; k < j + step; k++) {
	                    if (k < s.length()) sub += s.charAt(k);
	                }
	                if (prev.equals(sub)) cnt += 1;
	                // 다른 문자열이 나왔다면(더 이상 압축하지 못하는 경우라면)
	                else {
	                    compressed += (cnt >= 2)? cnt + prev : prev;
	                    sub = "";
	                    for (int k = j; k < j + step; k++) {
	                        if (k < s.length()) sub += s.charAt(k);
	                    }//for3 k
	                    prev = sub; // 다시 상태 초기화
	                    cnt = 1;
	                }
	            }//for2 j
	            // 남아있는 문자열에 대해서 처리
	            compressed += (cnt >= 2)? cnt + prev : prev;
	            // 만들어지는 압축 문자열이 가장 짧은 것이 정답
	            answer = Math.min(answer, compressed.length());
	        }//for1 i
	        return answer;
	    } 
}
