package exercise.c_ndb796.a_basic.d_sort;

public class D_quick_sort2 {
	public static void quickSort(int[] arr, int start, int end) {
		if (start >= end)
			return;
		int pivot = start;
		int left = start + 1;
		int right = end;
		
		while (left <= right) {
			while (left <= end && arr[left] <= arr[pivot])
				left++;
			while (right > start && arr[right] >= arr[pivot])
				right--;
			
			if (left > right) {
				int tmep = arr[pivot];
				arr[pivot] = arr[right];
				arr[right] = tmep;
				
			} else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}//while
		
		quickSort(arr, start, right - 1);
		quickSort(arr, right + 1, end);
		
	}

	public static void main(String[] args) {
		int n = 10;
		int[] arr = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 };

		quickSort(arr, 0, n - 1);

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
