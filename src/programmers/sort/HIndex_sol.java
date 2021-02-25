package programmers.sort;

import java.util.Arrays;
import java.util.Collections;

public class HIndex_sol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// citations return [3, 0, 6, 1, 5] 3
		int[] citations = { 3, 0, 6, 1, 5 };
		int result = solution1(citations);

		System.out.println(result);
	}

	//h번 이상 인용된 논문이 h편 이상인 h의 최댓값을 구하면 된다. 
	// https://developerdk.tistory.com/27
	public static int solution1(int[] citations) {
		Integer[] cArr = new Integer[citations.length];
		for (int i = 0; i < citations.length; i++) {
			cArr[i] = citations[i];
		}
		Arrays.sort(cArr, Collections.reverseOrder());
		for (int i = 0; i < citations.length; i++) {
			if (cArr[i] < i + 1) {
				return i;
			}
		}
		return citations.length;
		
		//이 메소드를 활용하는 게 더 효괒거일 수도 있음
		//Collections.sort(citations);
		//Collections.reverse(citations);
	}

	// https://ju-nam2.tistory.com/74
	public int solution2(int[] citations) {
		int answer = 0;
		Arrays.sort(citations);

		for (int i = 0; i < citations.length; i++) {
			int h = citations.length - i;

			if (citations[i] >= h) {
				answer = h;
				break;
			}
		}

		return answer;
	}

	// https://jar100.tistory.com/22
	public int solution3(int[] citations) {
		int answer = 0;
		int length = citations.length;
		int h = 0;
		int k = 0;
		Arrays.sort(citations);

		for (int i = 0; i < citations.length; i++) {
			h = citations[i];
			k = citations.length - i;
			if (k <= h) {
				answer = k;
				break;
			}
		}
		return answer;
	}

	// https://velog.io/@peppermint100/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-H-Index-in-Java
	public int solution4(int[] citations) {
		int[] sorted = Arrays.stream(citations).sorted().toArray();
		int answer = 0;
		for (int i = sorted.length - 1; i >= 0; i--) {
			if (sorted[i] > answer) {
				answer++;
			} else {
				break;
			}
		}
		return answer;
	}

	// https://codevang.tistory.com/295
	public int solution5(int[] citations) {

		Arrays.sort(citations);
		int count = citations.length;

		for (int i = citations.length - 1; i >= 0; i--) {

			int remain = citations.length - i;
			if (citations[i] <= remain) {

				// 남은 갯수와 값이 같다면 해당 값을 리턴
				// 남은 갯수보다 값이 작다면 해당 값을 제외하고 남은 갯수를 리턴
				count = citations[i] == remain ? citations[i] : remain - 1;
				break;
			}
		}
		return count;
	}

}

/*
 * H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다. 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다.
 * 위키백과1에 따르면, H-Index는 다음과 같이 구합니다.
 * 
 * 어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이
 * 과학자의 H-Index입니다.
 * 
 * 어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때, 이 과학자의 H-Index를 return
 * 하도록 solution 함수를 작성해주세요.
 * 
 * 
 * 제한사항 과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다. 논문별 인용 횟수는 0회 이상 10,000회 이하입니다.
 * 
 * 
 * 입출력 예 citations return [3, 0, 6, 1, 5] 3
 * 
 * 입출력 예 설명 이 과학자가 발표한 논문의 수는 5편이고, 그중 3편의 논문은 3회 이상 인용되었습니다. 그리고 나머지 2편의 논문은 3회
 * 이하 인용되었기 때문에 이 과학자의 H-Index는 3입니다.
 * 
 * ※ 공지 - 2019년 2월 28일 테스트 케이스가 추가되었습니다.
 * 
 * 
 * 
 */