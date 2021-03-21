package exercise.d_testForRamda256.a_callRecordSummary;
/*
1.문자열 뒤집기 (나동빈 11장 그리디)
문제 : https://www.acmicpc.net/problem/1439
답   : https://github.com/ndb796/python-for-coding-test/blob/master/11/3.java
*/
//https://maivve.tistory.com/120

import java.util.Scanner;

public class A_stringReverse3 {

	public static String str;
	public static int count0 = 0;
	public static int count1 = 0;

	public static void main(String[] args) {
		str = "00011001011101";
		//str = "1101";
		// 첫 번째 원소 처리

		char[] chars = str.toCharArray();
		int n = chars.length;
		int ascii = 48;
		int[] count = new int[2]; // 0: zeroCount, 1: oneCount
		char lastCh = chars[0]; // 임시 시작 문자 -> 안쓰는 9로 설정

		for (int i = 1; i < n; i++) {
			if (lastCh != chars[i]) {
				count[lastCh - ascii]++;
				lastCh = chars[i];
			}
		}

		// 연속된 문자의 끝을 파악해서 count + 1 해야 함
		count[lastCh - ascii]++;

		System.out.println(Math.min(count[0], count[1]));

	}// main
}
