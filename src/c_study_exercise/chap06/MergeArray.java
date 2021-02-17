package c_study_exercise.chap06;
import java.util.Scanner;
// 정렬을 마친 배열의 병합

class MergeArray {
	
	static void merge(int[] a, int na, int[] b, int nb, int[] c) {
		int pa = 0;
		int pb = 0; 
		int pc = 0;
		
		while (pa < na && pb <nb)
			c[pc++] = (a[pa] <= b[pb]) ? a[pa++] : b[pb++];
		
		while (pa < na)
			c[pc++] = a[pa++];
		
		while (pb < nb)
			c[pc++] = b[pb++];
	}//merge
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] a = {2, 4, 6, 8, 11, 13}; 
		int[] b = {1, 2, 3, 4, 9, 16, 21};
		int[] c = new int[13];
		
		System.out.println("두 배열의 병합");
		
		merge(a, a.length, b, b.length, c);
		
		
		
		
	}//main
}//class 