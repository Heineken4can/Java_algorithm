package exercise.d_testForRamda256.b_validationCheck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * 6 (())()) (((()())() (()())((())) ((()()(()))(((())))() ()()()()(()()())()
 * (()((())()(
 */

public class B_validityCertification3 {
	static int testCnt;
	static Stack<Character> stack1;

	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		testCnt = Integer.valueOf(bf.readLine());
		for (int i = 0; i < testCnt; i++) {
			String str1 = bf.readLine();
			//stack1 = new Stack<>();

			System.out.println(solve(str1));
		}

	}// main

	// (())())
	static String solve(String argStr1) {
		Stack<Character> stack1 = new Stack<Character>();
		for (int i = 0; i < argStr1.length(); i++) {
			//char chr1 = argStr1.charAt(i);
			if (argStr1.charAt(i) == '(') {
				stack1.push(argStr1.charAt(i));
			} else {
				if (stack1.isEmpty()) {
					return "NO";
				} else {
					stack1.pop();
				}
				
			}
			
		}//for

		//return q.length() > 0 ? "no" : "yes";
		return stack1.isEmpty() ? "YES" : "NO";	
	}
}
