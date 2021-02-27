package exercise.a_shibata.study_exercise.chap05;
import java.util.Scanner;
// 팩토리얼을 재귀적으로 구현

class Factorial {
	// 양의 정수 n의 팩토리얼을 반환합니다.
	static int factorial(int n) {
		if (n > 0 )
			return n * factorial(n - 1);
		else 
			return 1;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 입력 하시오");
		int x = stdIn.nextInt();
		
		System.out.println("factori : " + factorial(x));
			
		
	}
	
	
}
