package exercise.a_shibata.study_exercise.chap02;
import java.util.Scanner;
// 배열 요소에 값을 읽어 들여 역순으로 정렬합니다.
//test
class ReverseArray {
	// 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a) {
		for (int i = 0; i < a.length /2; i++) {
			swap(a, i, a.length - i -1);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수 ：");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		for (int i = 0; i < num ; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		reverse(x);
		
		System.out.println("reverse gogo");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		
		
	}
}