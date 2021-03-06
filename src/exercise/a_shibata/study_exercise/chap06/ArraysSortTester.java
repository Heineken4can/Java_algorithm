package exercise.a_shibata.study_exercise.chap06;
import java.util.Arrays;
import java.util.Scanner;
// Arrays.sort 메서드를 사용하여 정렬합니다(퀵 정렬).

class ArraysSortTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수1：");
		int num = stdIn.nextInt();
		int[] x = new int[num];		// 배열의 크기는 num입니다.

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < num; i++)
			System.out.println("x[" + i + "]＝" + x[i]);
		Arrays.sort(x);
		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < num; i++)
			System.out.println("x[" + i + "]＝" + x[i]);
	}
}