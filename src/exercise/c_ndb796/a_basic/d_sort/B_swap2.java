package exercise.c_ndb796.a_basic.d_sort;

public class B_swap2 {
	public static void main(String[] args) {

		int[] arr = { 3, 5 };

		// 스와프(Swap)
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;

		System.out.println(arr[0] + " " + arr[1]);
	}
}
