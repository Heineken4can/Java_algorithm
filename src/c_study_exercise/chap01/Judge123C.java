package c_study_exercise.chap01;
import java.util.Scanner;
// 입력 받은 정숫값의 양수/음수/0을 판단

class Judge123C {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수를 입력하세요.：");
		int n = stdIn.nextInt();

		if (n == 1)
			System.out.println("이 수는 1입니다.");
		else if (n == 2)
			System.out.println("이 수는 2입니다.");
		else if (n == 3)
			System.out.println("이 수는 3입니다.");
		else
			;			// 공백문(실제로 아무것도 하지 않는 문장)
	}
}
