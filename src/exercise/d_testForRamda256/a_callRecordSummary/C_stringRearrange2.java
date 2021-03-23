package exercise.d_testForRamda256.a_callRecordSummary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class C_stringRearrange2 {

	public static String testStr;
	public static ArrayList<Character> arrLiResult = new ArrayList<Character>();
	public static int numResult = 0;
	
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		
		testStr = "AJKDLSI412K4JSJ8D";//
		//ADDIJJJKKLSS19
		//ADDIJJJKKLSS
		
		StringBuilder sbResult = new StringBuilder();
		for ( int i = 0; i < testStr.length(); i++) {
			if (Character.isLetter(testStr.charAt(i))) {
				sbResult.append(testStr.charAt(i));				
			} else {
				numResult += testStr.charAt(i) - '0';
			}
		}
		char[] chResult = sbResult.toString().toCharArray();
		//Character.
		System.out.println("1: " + chResult.toString());
		Arrays.sort(chResult);
		System.out.println("2: " + chResult.toString());
		
		for ( int i = 0; i < chResult.length; i++) {
			System.out.print(chResult[i]);
		}
	}
}
