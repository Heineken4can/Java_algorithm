package exercise.a_shibata.study_exercise.chap03;
import java.util.Scanner;
// 이진 검색 

class BinSearch {
	// 요솟수가 n인 배열 a에서 key와 같은 요소를 이진 검색합니다.
	static int binSearch(int[] a, int n, int key) {
		int pl = 0; 
		int pr = n -1; 
		
		do {
			int pc = (pl + pr) / 2; 
			if (a[pc] == key)
				return pc; 
			else if (a[pc] < key)
				pl = pc + 1; 
			else 
				pr = pc - 1;
		} while (pl <= pr);
		return -1;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("number : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력해주세요");
		
		System.out.println("x[0] : ");
		x[0] = stdIn.nextInt();
		
		for (int i = 1; i < num; i++) {
			do {
				System.out.println("x[" + i + "] : ");
				x[i] = stdIn.nextInt();						
			} while (x[i] < x[i -1]);
		}
		
		System.out.println("search : ");
		int ky = stdIn.nextInt();
		
		int idx = binSearch(x, num, ky);
		
		if ( idx == -1)
			System.out.println("nono");
		else 
			System.out.println("idx : " + idx);
		
		
	}
}