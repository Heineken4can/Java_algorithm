package exercise.a_shibata.study_exercise.chap03;
import java.util.Arrays;
import java.util.Scanner;
// Arrays.binarySearch로 이진 검색

class BinarySearchTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("number : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 작성바람");
		
		System.out.print("x[0] : ");
		x[0] = stdIn.nextInt();
		
		for (int i = 1; i < num; i++) {
			do {
				x[i] = stdIn.nextInt();
			} while (x[i] < x[i - 1]); 
		}
		
		System.out.println("search : ");
		int ky = stdIn.nextInt();
		
		int idx = Arrays.binarySearch(x, ky);
		
		if (idx < 0)
			System.out.println("nono");
		else 
			System.out.println("idx : " + idx); 
		
	}
}