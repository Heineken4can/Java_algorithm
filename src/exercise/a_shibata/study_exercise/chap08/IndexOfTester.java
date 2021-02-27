package exercise.a_shibata.study_exercise.chap08;
import java.util.Scanner;
// String.indexOf, String.lastIndexOf 메소드에 의한 문자열 검색합니다.

class IndexOfTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("텍스트：");
		String s1 = stdIn.next(); 					// 텍스트용 문자열 

		System.out.print("패턴：");
		String s2 = stdIn.next();					// 패턴용 문자열 

		int idx1 = s1.indexOf(s2);
		int idx2 = s1.indexOf(s2);
		
		
		if (idx1 == -1) {
			System.out.println("nono");
		} else {
			int len1 = 0;
			for (int i = 0; i < idx1; i++) {
				len1 += s1.substring(i, i + 1).getBytes().length;
			}
			len1 += s2.length();
			
			int len2 = 0; 
			for (int i = 0; i < idx2; i++) {
				len2 += s1.substring(i, i + 1).getBytes().length;
			}
			len2 += s2.length();
			
			System.out.printf(String.format("pattern : %%%ds\n", len1), s2);
			System.out.printf(String.format("pattern : %%%ds\n", len2), s2);
			
			
		}
		
		
		
		
	}
}
