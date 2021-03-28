package exercise.d_testForRamda256.a_callRecordSummary;
/*
1.문자열 뒤집기 (나동빈 11장 그리디)
문제 : https://www.acmicpc.net/problem/1439
답   : https://github.com/ndb796/python-for-coding-test/blob/master/11/3.java
*/

import java.util.Scanner;

public class A_stringReverse9 {

	public static String str;
	public static int count0 = 0;
	public static int count1 = 0;

	public static void main(String[] args) {
		String str2;
		str2 = "01100010";
		 str2 = "11000101110101011";

		// 문제를 바꿔서 0을 뒤집을 때의 경우 구하기, 연속된 것만 뒤집을 수 있음.
		String[] arrStr1 = str2.split("");
		char[] arrCh1 = str2.toCharArray();
		char tmpCh1 = str2.charAt(0);

		int cntNum0 = 0;// 0을 바꾸는 경우 (0 -> 1)
		int cntNum1 = 0;

		if (str2.charAt(0) == '0') {
			cntNum0++;
		} else {
			cntNum1++;
		}

		for (int i = 0; i < str2.length() - 1; i++) {
			if (str2.charAt(i) != str2.charAt(i + 1)) {
				if(str2.charAt(i) == '0') {
					cntNum0++;
				}else {
					cntNum1++;
				}
			} else {
				//아무것도 하지 않음.
			}
		}

		System.out.println("1:" + cntNum0);
		System.out.println("2:" + cntNum1);
		// 3. 더 작은 수
		int result = Math.min(cntNum0, cntNum1);

		System.out.println("11:" + result);
	}// main
}
