package exercise.d_testForRamda256.b_validationCheck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2. String 이용해서 풀기
/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/9012
 */
/*
 * 6 (())()) (((()())() (()())((())) ((()()(()))(((())))() ()()()()(()()())()
 * (()((())()(
 */

public class B_validityCertification {
	// Testcase
	static int T;

	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(bf.readLine());
		for (int i = 0; i < T; i++) {
			String Q = bf.readLine();
			System.out.println(solve(Q));
		}
	}

	static String solve(String q) {
		if (q.contains("()")) {
			q = q.replace("()", "");
			return solve(q);
		}
		System.out.println("q length:"+q.length());
		return q.length() > 0 ? "NO" : "YES";
	}
}
