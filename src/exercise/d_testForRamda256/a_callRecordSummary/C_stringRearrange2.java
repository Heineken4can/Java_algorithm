package exercise.d_testForRamda256.a_callRecordSummary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C_stringRearrange2 {

	public static ArrayList<Character> arrList1 = new ArrayList<Character>();
	public static String str;
	public static int num1 = 0;

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		str = "AJKDLSI412K4JSJ9D";

		for (int i = 0; i < str.length(); i ++) {
			if (Character.isDigit(str.charAt(i))) {
				num1 += str.charAt(i) - '0';
			} else {
				arrList1.add(str.charAt(i));
			}
		}
		
		Collections.sort(arrList1);
		
		for (int i = 0 ; i < arrList1.size(); i++) {
			System.out.print(arrList1.get(i));
		}
		
		if (num1 != 0) System.out.print(num1);
		
		System.out.println();
		
	}
}
