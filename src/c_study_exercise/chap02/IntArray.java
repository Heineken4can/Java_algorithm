package c_study_exercise.chap02;
// 구성 요소의 자료형이 int형인 배열 (구성 요솟수는  5 : new에 의해  본체를 생성）

class IntArray {
	public static void main(String[] args) {
		int[] arrayNum = new int[5];
		
		arrayNum[0] = 5;
		arrayNum[1] = 7;
		arrayNum[2] = 11;
		arrayNum[4] = arrayNum[2]*2;
		
		for(int i = 0; i<arrayNum.length; i++) {
			System.out.println(arrayNum[i]);
		}
	}
}