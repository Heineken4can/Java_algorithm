package exercise.a_shibata.study_exercise.chap03;
import java.util.Scanner;
// 선형 검색

class SeqSearch {
	// 배열 a의 앞쪽 n개의 요소에서 key와 같은 요소를 선형 검색 
	static int seqSearch(int[] a, int n, int key) {
		int i = 0; 
		while(true) {
			if(i == n) {
				return -1;
			}
			if (a[i] == key)
				return i;
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요소수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.println("search gogo : ");
		int key = stdIn.nextInt();
		
		int idx = seqSearch(x, num, key);
		
		if (idx == -1)
			System.out.println("nono");
		else
			System.out.println("idx:" + idx);
		
	}
}
