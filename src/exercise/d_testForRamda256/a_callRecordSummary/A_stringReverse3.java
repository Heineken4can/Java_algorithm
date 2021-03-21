package exercise.d_testForRamda256.a_callRecordSummary;
/*
1.문자열 뒤집기 (나동빈 11장 그리디)
문제 : https://www.acmicpc.net/problem/1439
답   : https://github.com/ndb796/python-for-coding-test/blob/master/11/3.java
*/

import java.util.Scanner;

public class A_stringReverse3 {

	public static String str;
	public static int count0 = 0;
	public static int count1 = 0;

	public static void main(String[] args) {
		str = "000110010111";

		// 첫 번째 원소 처리
		if (str.charAt(0) == '1') {
			count0 += 1;// 전부 0으로 바꾸는 경우, 1이 나오면 바꾸어 줌.
		} else {// 처음 시작이 0 이면, 0을 1로 바꾸기
			count1 += 1;// 전부 1로 바꾸는 경우
		}

		// 두 번째 원소부터 확인
		for (int i = 0; i < str.length() - 1; i++) {
			// 다음 글자와 같지 않으면.
			if (str.charAt(i) != str.charAt(i + 1)) {
				if (str.charAt(i + 1) == '1') {
					count0 += 1;
				} else {
					count1 += 1;
				}
			// 같으면 다음 문자로 넘어감.
			} else {

			}
		}//for i 

		int result = Math.min(count1, count0);
		System.out.println(count0);
		System.out.println(count1);
		System.out.println(result);
	}// main
}
