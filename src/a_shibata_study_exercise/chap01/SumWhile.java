package a_shibata_study_exercise.chap01;
import java.util.Scanner;
// 1, 2, …, n의 합을 구합니다.
// 1-4
class SumWhile {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을구합니다.");
 		System.out.print("n의 값：");
		int n = stdIn.nextInt();
		
		int sum = 0; 
		int i = 1;
		
		while (i <=n ) {
			sum += i;
			i++;
		}
		
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}
}