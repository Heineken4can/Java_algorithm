package a_shibata_study_exercise.chap05;
import java.util.Scanner;



class Recur {
	
	static void recur(int n) {
		if (n > 0) {
			recur(n - 1);
			System.out.println(n);
			recur(n - 2);
		}
	}
	
	public static void main(String[] args) {
		Scanner sdtIn = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int x = sdtIn.nextInt();
		
		recur(x);
	}
	
	
}