package exercise.d_testForRamda256.a_callRecordSummary;
/*
1.문자열 뒤집기 (나동빈 11장 그리디)
문제 : https://www.acmicpc.net/problem/1439
답   : https://github.com/ndb796/python-for-coding-test/blob/master/11/3.java
*/

import java.util.Scanner;

public class A_stringReverse2 {

	public static String str;
	public static int count0 = 0; // 전부 0으로 바꾸는 경우
	public static int count1 = 0; // 전부 1로 바꾸는 경우

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s = sc.next();
		//str = sc.next();
		String s = "0001100101";
		//s = "0001100";
				
		String[] a = s.split("");
		int zero = 0, one = 0;
		
		if(a[0].equals("0"))
			zero++;
		else
			one++;
		
		for(int i = 1; i < a.length; i++) {
			if(!a[i-1].equals(a[i])) {
				if(a[i].equals("0"))
					zero++;
				else
					one++;
			}
		}
		//System.out.println(Math.min(zero, one));
		System.out.println(zero<one?zero:one);
	}
}
