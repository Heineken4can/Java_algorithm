package exercise.d_testForRamda256.b_validationCheck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//1. stack 이용해서 풀기
/**
 * @author HunSeol
 * @see https://www.acmicpc.net/problem/9012
 */
/*
 * 6 (())()) (((()())() (()())((())) ((()()(()))(((())))() ()()()()(()()())()
 * (()((())()(
 */

public class B_validityCertification2 {
	// Testcase
	static int T;
	static Stack<Character> stack;

	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(bf.readLine());
		for (int i = 0; i < T; i++) {
			String Q = bf.readLine();
			stack = new Stack<>();
			System.out.println(solve(Q, stack));
		}
	}

	static String solve(String Q, Stack<Character> stack) {
		for (int i = 0; i < Q.length(); i++) {
			char q = Q.charAt(i);
			if (q == '(') {
				stack.add(q);
			} else {
				if (stack.isEmpty()) {
					return "NO";
				} else {
					stack.pop();
				}
			}
		}
		return stack.isEmpty() ? "YES" : "NO";
	}
}
