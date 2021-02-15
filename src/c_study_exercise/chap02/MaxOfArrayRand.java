package c_study_exercise.chap02;
import java.util.Random;
import java.util.Scanner;
// 배열 요소의 최댓값을 나타냅니다(값을 난수로 생성).

class MaxOfArrayRand {
	// 배열 a의 최댓값을 구하여 반환합니다.
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if ( max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		
		int num = sc.nextInt();
		System.out.println("키 값은 아래와 같습니다.");
		int[] height = new int[num];
		for (int i = 0; i < height.length; i++) {
			height[i] = 100 + rand.nextInt(50);
			System.out.println(height[i]);
		}
		
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
		
	}
}