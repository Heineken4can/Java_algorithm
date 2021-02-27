package exercise.b_programmers.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Knumber_sol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		String result = Arrays.toString(solution1(array, commands));
		System.out.println(result);//[5, 6, 3]
	}

	//https://sas-study.tistory.com/3
	public static int[] solution1(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
			Arrays.sort(temp);
			answer[i] = temp[commands[i][2] - 1];
		}
		return answer;
	}

	public static int[] solution2(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int index = 0;

		for (int i = 0; i < commands.length; i++) {
			int start = commands[i][0];
			int end = commands[i][1];
			int k = commands[i][2];

			int[] tmp = new int[end - start + 1];

			int a = 0;
			for (int j = start - 1; j < end; j++)
				tmp[a++] = array[j];

			Arrays.sort(tmp);
			answer[index++] = tmp[k - 1];
		}
		return answer;
	}
	
	//https://hidelookit.tistory.com/7
	public int[] solution4(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int[] result = new int[commands[i][1] - (commands[i][0] - 1)];

			for (int j = 0; j < result.length; j++) {
				result[j] = array[j + commands[i][0] - 1];
			}
			Arrays.sort(result);
			answer[i] = result[commands[i][2] - 1];
		}

		return answer;
	}
	
	
	// https://velog.io/@qweadzs/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-K%EB%B2%88%EC%A7%B8%EC%88%98-java
	public int[] solution3(int[] array, int[][] commands) {
		ArrayList<Integer> arr = new ArrayList();
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {

			for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
				arr.add(array[j]);
			}
			Collections.sort(arr);
			answer[i] = arr.get(commands[i][2] - 1);
			arr.clear();
		}
		return answer;
	}
	
	
	//https://developerdk.tistory.com/23
	public int[] solution5(int[] array, int[][] commands) {
        //정답용 배열 생성
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            //자른 배열 저장용 tmpArr 생성
            int[] tmpArr = new int[commands[i][1]-commands[i][0]+1];
            //tmpArr에 array 잘라서 저장
            int idx = 0;
            for (int j = commands[i][0]-1; j < commands[i][1]; j++) {
                tmpArr[idx] = array[j];
                idx++;
            }
            //자른 배열 정렬
            Arrays.sort(tmpArr);
            //정답 삽입
            answer[i] = tmpArr[commands[i][2]-1];
        }
        return answer;
    }
	
	
	
}
/*
 * 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
 * 
 * 예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
 * 
 * array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다. 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다. 2에서
 * 나온 배열의 3번째 숫자는 5입니다. 배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질
 * 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution
 * 함수를 작성해주세요.
 * 
 * 제한사항 array의 길이는 1 이상 100 이하입니다. array의 각 원소는 1 이상 100 이하입니다. commands의 길이는 1
 * 이상 50 이하입니다. commands의 각 원소는 길이가 3입니다.
 * 
 * 
 * 입출력 예 array commands return [1, 5, 2, 6, 3, 7, 4] [[2, 5, 3], [4, 4, 1], [1,
 * 7, 3]] [5, 6, 3]
 * 
 * 입출력 예 설명 [1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째
 * 숫자는 5입니다. [1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.
 * [1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는
 * 3입니다.
 * 
 * 출처
 * 
 */