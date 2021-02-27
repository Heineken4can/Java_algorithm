package exercise.a_shibata.study_exercise.chap02;
// 배열을 복제합니다.

class CloneArray {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = a.clone();
		
		b[3] = 7;
		
		System.out.print("a =");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]);
		}
		System.out.print("\nb =");
		for (int j = 0; j < b.length; j++) {
			System.out.print(" "+b[j]);
		}
	}
}