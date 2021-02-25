package programmers.exhauxtiveSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Moigosa_sol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] answers = { 1, 2, 3, 4, 5 };
		int[] answers = {1,3,2,4,2};
		int[] result = solution1(answers);
		System.out.println(Arrays.toString(result));
	}

	// https://binghedev.tistory.com/74
	public static int[] solution1(int[] answers) {
		// 수포자들 찍는 패턴
		int[] person1 = { 1, 2, 3, 4, 5 };
		int[] person2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] person3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int[] score = { 0, 0, 0 };

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == person1[i % 5])
				score[0]++;
			if (answers[i] == person2[i % 8])
				score[1]++;
			if (answers[i] == person3[i % 10])
				score[2]++;
		}

		// 최대값 찾기
		int max = 0;
		for (int i = 0; i < 3; i++) {
			if (score[i] > max)
				max = score[i];
		}

		// 최대값과 같은 수포자 찾기
		ArrayList<Integer> tmp = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			if (score[i] == max) {
				tmp.add(i + 1);
			}
		}

		// 최대값과 같은 수포자 answer에 넣기.
		int[] answer = new int[tmp.size()];
		for (int i = 0; i < tmp.size(); i++)
			answer[i] = tmp.get(i);

		return answer;
	}

//https://sas-study.tistory.com/240
	public int[] solution2(int[] answers) {
		int[] answer = {};
		int[] person1 = { 1, 2, 3, 4, 5 }; // 이만큼씩 반복
		int[] person2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] person3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int answer1 = 0, answer2 = 0, answer3 = 0;

		for (int i = 0; i < answers.length; i++) {
			if (person1[i % person1.length] == answers[i])
				answer1++;
			if (person2[i % person2.length] == answers[i])
				answer2++;
			if (person3[i % person3.length] == answers[i])
				answer3++;
		}
		int max = Math.max(Math.max(answer1, answer2), answer3); // max값 구하기
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (max == answer1)
			list.add(1); // max값이랑 같으면 넣는다.
		if (max == answer2)
			list.add(2);
		if (max == answer3)
			list.add(3);

		answer = new int[list.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}

//https://wooaoe.tistory.com/42
	public int[] solution3(int[] answers) {
		int[] answer = {};

		int first[] = { 1, 2, 3, 4, 5 }; // 규칙 반복(이하 동일)
		int second[] = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int third[] = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int all[] = new int[3]; // 3명 비교

		for (int i = 0; i < answers.length; i++) { // 정답과 비교하여 맞은 것이 있다면 ++
			if (answers[i] == first[i % first.length]) {
				all[0]++;
			}
			if (answers[i] == second[i % second.length]) {
				all[1]++;
			}
			if (answers[i] == third[i % third.length]) {
				all[2]++;
			}
		}

		List<Integer> clearPerson = new ArrayList<Integer>(); // List만들어주고 최대값 비교
		int max = Math.max(Math.max(all[0], all[1]), all[2]);

		if (max == all[0]) {
			clearPerson.add(1);
		}
		if (max == all[1]) {
			clearPerson.add(2);
		}
		if (max == all[2]) {
			clearPerson.add(3);
		}

		Collections.sort(clearPerson); // 가장 높은 점수를 받은 사람이 여러명일 경우 오름차순

		answer = new int[clearPerson.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = clearPerson.get(i);
		}

		return answer;
	}

	// https://velog.io/@sonjisu/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4Lv.1-%EB%AA%A8%EC%9D%98%EA%B3%A0%EC%82%ACJAVA
	public int[] solution4(int[] answers) {
		int[] point = { 0, 0, 0 }; // 점수표
		int[] pointCopy = {}; // 점수표 정렬
		int max = 0; // 점수 최대값
		List<Integer> list = new ArrayList(); // 정답자 넣기

		int[][] spzPatterns = { { 1, 2, 3, 4, 5 }, // 수포자들의 패턴
				{ 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };

		// [1] 채점하기
		for (int i = 0; i < answers.length; i++) {
			if (spzPatterns[0][i % 5] == answers[i]) {
				point[0]++;
			}

			if (spzPatterns[1][i % 8] == answers[i]) {
				point[1]++;
			}

			if (spzPatterns[2][i % 10] == answers[i]) {
				point[2]++;
			}
		}

		// [2] 점수표 정렬해서 가장 큰 값 찾기
		pointCopy = point.clone();
		Arrays.sort(pointCopy);
		max = pointCopy[2];

		for (int i = 0; i < point.length; i++) {
			if (point[i] == max) {
				list.add(i + 1);
			}
		}

		// [3] 가장 큰 값을 가진 학생 번호 구하기
		int[] answer = new int[list.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}

}

/*
 * 수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막
 * 문제까지 다음과 같이 찍습니다.
 * 
 * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ... 2번 수포자가 찍는 방식: 2, 1, 2, 3,
 * 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ... 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4,
 * 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
 * 
 * 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에
 * 담아 return 하도록 solution 함수를 작성해주세요.
 * 
 * 제한 조건 시험은 최대 10,000 문제로 구성되어있습니다. 문제의 정답은 1, 2, 3, 4, 5중 하나입니다. 가장 높은 점수를 받은
 * 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요. 입출력 예 answers return [1,2,3,4,5] [1]
 * [1,3,2,4,2] [1,2,3] 입출력 예 설명 입출력 예 #1
 * 
 * 수포자 1은 모든 문제를 맞혔습니다. 수포자 2는 모든 문제를 틀렸습니다. 수포자 3은 모든 문제를 틀렸습니다. 따라서 가장 문제를 많이
 * 맞힌 사람은 수포자 1입니다.
 * 
 * 입출력 예 #2
 * 
 * 모든 사람이 2문제씩을 맞췄습니다.
 * 
 */