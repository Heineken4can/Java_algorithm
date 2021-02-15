package a_study_exercise.chap02;
import java.util.Scanner;	
// 두 배열이 같은가를 판단

class ArrayEqual {
	// 두 배열 a, b의 모든 요소가 같은가?
	static boolean equals(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a 요소수");
		int na = stdIn.nextInt();
		
		int[] a = new int[na];
		for (int i = 0; i < na; i++) {
			System.out.println(i);
			a[i] = stdIn.nextInt();
		}
		
		
		System.out.println("b 요소수");
		int nb = stdIn.nextInt();
		
		int[] b = new int[nb];
		for (int i = 0; i < nb; i++) {
			System.out.println(i);
			b[i] = stdIn.nextInt();
		}
		
		System.out.println("a and b is "+(equals(a, b)? "true":"false"));
		
		
	}
}