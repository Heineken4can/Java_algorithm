package exercise.a_shibata.study_exercise.chap05;
import java.util.Scanner;

class RecurX1 {
	
	static void recur(int n) {
		while (n > 0) {
			recur(n - 1);
			System.out.println(n);
			n = n - 2;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int x = stdIn.nextInt();
		
		recur(x);
	}
	
	
	
}
