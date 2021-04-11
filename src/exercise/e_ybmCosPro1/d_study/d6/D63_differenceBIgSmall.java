package exercise.e_ybmCosPro1.d_study.d6;
//https://drcode-devblog.tistory.com/m/129?category=955537
//ybm 답은 없고, 개인블로그에 답이 있네

import java.util.*;

class D63_differenceBIgSmall {

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		int[] arr = { 9, 11, 9, 6, 4, 19 };
		int K = 4;
		int ret = sol.solution(arr, K);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution3 메소드의 반환 값은 " + ret + "입니다.");
	}
}

class Solution3 {
	public int solution(int[] arr, int K) {
		Arrays.sort(arr);//4 6 9 9 11 19
		int answer = arr[3] - arr[0];
		//여기에서 더 조건을 추가해줘야 할 듯.
		//순서대로 정렬
		//k(여기선 4개)씩 뽑아서 차이를 구한다음에, 모든 범위를 검색해 볼 것.
		
		return answer;
	}

}