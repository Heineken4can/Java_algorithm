package basic.concept.util.Arrays;
//출처: https://taeil00.tistory.com/193 [EO's Blog]

import java.util.Arrays;

public class Copy {
	public static void main(String[] args) {

		System.out.println("\n\n1 =========>");
		int[] array1 = { 1, 2, 3, 4, 5 };
		for (int i : array1) {
			System.out.print(i + " ");
		}

		System.out.println("\n\n2 =========>");
		int[] array2 = Arrays.copyOf(array1, 3); // Arrays.copyOf
		for (int i : array2) {
			System.out.print(i + " ");
		}

		System.out.println("\n\n3 =========>");
		int[] array3 = Arrays.copyOfRange(array1, 3, 4);
		for (int i : array3) {
			System.out.print(i + " ");
		}

		System.out.println("\n\n4 =========>");
		int arr1[] = { 0, 1, 2, 3, 4, 5 };
		int arr2[] = { 5, 10, 20, 30, 40, 50 };
		// copies an array from the specified source array
		System.arraycopy(arr1, 0, arr2, 0, 2);
		for (int i : arr2) {
			System.out.print(i + " ");
		}
	}// main

}
