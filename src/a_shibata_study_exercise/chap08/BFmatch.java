package a_shibata_study_exercise.chap08;
import java.util.Scanner;
// 브루트-포스법으로 문자열을 검색하는 프로그램

class BFmatch {
	// 브루트-포스법으로 문자열을 검색하는 메서드 
	static int bfMatch(String txt, String pat) {
		int pt = 0; 
		int pp = 0;
		
		while (pt != txt.length() && pp != pat.length()) {
			if (txt.charAt(pt) == pat.charAt(pp)) {
				pt++;
				pp++;
			} else {
				pt = pt - pp + 1;
				pp = 0;
			}
		}//while
		if (pp == pat.length())
			return pt - pp;
		return -1;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("텍스트11：");
		String s1 = stdIn.next(); 					// 텍스트용 문자열 

		System.out.print("패턴：");
		String s2 = stdIn.next();					// 패턴용 문자열 
	
		int idx = bfMatch(s1, s2);
		
		if (idx == -1)
			System.out.println("nono pattern");
		else {
			
			int len = 0; 
			for (int i = 0; i < idx; i++) {
				len =+ s1.substring(i, i + 1).getBytes().length;
			}
			len += s2.length();
		System.out.printf(String.format("%%%ds\n", len), s2);
		}
		
		
		
	}
}