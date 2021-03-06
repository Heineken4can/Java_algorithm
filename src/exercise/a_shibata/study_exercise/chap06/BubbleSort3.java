package exercise.a_shibata.study_exercise.chap06;
import java.util.Scanner;
// 버블 정렬(버전 3)

class BubbleSort3 {
	
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}//swap
	
	
	static void bubbleSort(int[] a, int n) {
		int k = 0;
		while (k < n - 1) {
			int last = n - 1; 
			for (int j = n - 1; j > k; j--) {
				if (a[j - 1] > a[j]) {
					swap(a, j-1, j);
					last = j;
				}
			}
			k = last;
		}
	}//sort
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("bubble sort 3");
		System.out.print("n : ");
		
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		bubbleSort(x, nx);
		
		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "] : " + x[i]);
		}
		
		
	}//main
	
	
}//class BubbleSort3