package exercise.d_testForRamda256.a_callRecordSummary;
/*
1.문자열 뒤집기 (나동빈 11장 그리디)
문제 : https://www.acmicpc.net/problem/1439
답   : https://github.com/ndb796/python-for-coding-test/blob/master/11/3.java
*/

import java.util.Scanner;

public class A_stringReverse4 {

	public static String str;
	public static int count0 = 0;
	public static int count1 = 0;

	public static void main(String[] args) {
		String str2;
		str2 = "001100010";
		str2 = "110001010";

		// 문제를 바꿔서 0을 뒤집을 때의 경우 구하기, 연속된 것만 뒤집을 수 있음.
		String[] arrStr1 = str2.split("");
		int cntNum0 = 0;// 0을 바꾸는 경우 (0 -> 1)

		if (arrStr1[0].equals("0")) {
			cntNum0++;
		}
		// 0이 연속된 경우의 수 구하기
		for (int i = 0; i < arrStr1.length - 1; i++) {
			if (!arrStr1[i].equals(arrStr1[i + 1])) {
				if (arrStr1[i+1].equals("0")) {
					cntNum0++;
				}
			} else {//같을 경우에는 카운트 하지 않음.

			}
		}

	System.out.println("11:"+cntNum0);
	}// main
}
