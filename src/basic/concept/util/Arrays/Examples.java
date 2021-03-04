package basic.concept.util.Arrays;

import java.util.Arrays;

public class Examples {

	public static void main(String[] args) {
		
		// package basic.concept.lang.Object.String;

		// 1. split()을 사용하여 문자열을 자르기
		System.out.println("\n1. split()을 사용하여 문자열을 자르기 ============>");
		String str = "Hi guys This is split example";
		String[] result1 = str.split(" ");
		System.out.println(Arrays.toString(result1));

	}
}