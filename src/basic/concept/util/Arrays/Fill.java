package basic.concept.util.Arrays;

import java.util.Arrays;

public class Fill {

	public static void main(String[] args) {

		int ar[] = { 2, 2, 1, 8, 3, 2, 2, 4, 2 };
		Arrays.fill(ar, 10);
		System.out.println("Array completely filled" + " with 10\n" + Arrays.toString(ar));

		
		
		
		int[] a = new int[5];
		Arrays.fill(a, 100);

		for (int i : a) {
			System.out.print(i + " ");
		}

		
		
		int[][] b = new int[5][5];
		for (int i = 0; i < b.length; i++) {
			Arrays.fill(b[i], 100);
		}
		// 출력
		for (int[] i : b) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}// main

}
