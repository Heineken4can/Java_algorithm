package exercise.b_programmers.exhauxtiveSearch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrimeNumber_sol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numbers = "011";
		// int numbers = 11112;
		Solution2 s = new Solution2();
		System.out.println(s.solution(numbers));
	}

}

//https://iamheesoo.github.io/blog/algo-prog42839
class Solution1 {
	public int solution(String numbers) {
		int answer = 0;
		// 문자열을 숫자열로 만들기
		String[] strArr = numbers.split("");
		int[] numArr = new int[strArr.length];
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = Integer.parseInt(strArr[i]);
		}
		Set<Integer> set = new HashSet<>();
		// 1부터 만들 수 있는 최대 길이까지 숫자 조합
		for (int i = 1; i <= numArr.length; i++) {
			perm(strArr, 0, i, set);
		}
		answer = set.size();
		return answer;
	}

	public void perm(String[] arr, int depth, int k, Set set) {// 숫자 조합
		if (depth == k) {// 원하는 k개의 숫자가 세팅됐으므로 더이상 순열생성X
			print(arr, k, set);
			return;
		} else {
			for (int i = depth; i < arr.length; i++) {
				swap(arr, i, depth);
				perm(arr, depth + 1, k, set);
				swap(arr, i, depth);
			}
		}
	}

	public void swap(String[] arr, int i, int j) {
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public void print(String[] arr, int k, Set set) {// 숫자 연결
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < k; i++) {
			// System.out.print(arr[i]);
			s.append(arr[i]);// 숫자연결하기
		}
		// System.out.println();
		primeNumber(set, s);
	}

	public void primeNumber(Set set, StringBuilder s) {// 소수 체크
		int num = Integer.parseInt(String.valueOf(s));
		boolean prime = true;
		if (num <= 1) {
			return;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime) {
			set.add(num);
		}
	}
}

//https://codevang.tistory.com/299
class Solution2 {

	private TreeSet<String> set = new TreeSet<>();
	private int count;

	public int solution(String numbers) {

		int size = numbers.length();

		// 리스트에 담아줌
		List<Character> arr = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			arr.add(numbers.charAt(i));
		}

		// 결과를 저장할 리스트
		List<Character> result = new ArrayList<>();

		// nPr에서 r을 계속 늘리면서 순열 알고리즘 수행
		for (int i = 0; i < size; i++) {
			permutation(arr, result, size, i + 1);
		}

		return count;
	}

	private boolean isPrime(int n) {

		int i;
		int sqrt = (int) Math.sqrt(n);

		// 2는 유일한 짝수 소수
		if (n == 2)
			return true;

		// 짝수와 1은 소수가 아님
		if (n % 2 == 0 || n == 1)
			return false;

		// 제곱근까지만 홀수로 나눠보면 됨
		for (i = 3; i <= sqrt; i += 2) {
			if (n % i == 0)
				return false;
		}

		return true;
	}

//	 * 순열 알고리즘
	public void permutation(List<Character> arr, List<Character> result, int n, int r) {

		if (r == 0) {

			// 0으로 시작하는 부분집합은 제외
			if (result.get(0) != '0') {

				String str = "";
				int size = result.size();
				for (int i = 0; i < size; i++) {
					str += result.get(i);
				}

				int num = 0;

				// 이미 나온 숫자 조합이 아닐 경우
				if (!set.contains(str)) {
					num = Integer.parseInt(str);
					set.add(str);

					// 소수 판별
					if (isPrime(num)) {
						System.out.println(num);
						count++;
					}
				}
			}

			return;
		}

		for (int i = 0; i < n; i++) {

			result.add(arr.remove(i));
			permutation(arr, result, n - 1, r - 1);
			arr.add(i, result.remove(result.size() - 1));
		}

	}
}

//https://hidelookit.tistory.com/67
class Solution3 {
	private static int cnt = 0;
	private static String[] map;
	private static String[] result;
	private static boolean[] visit;
	private static HashSet<Integer> list;

	public int solution(String numbers) {
		int answer = 0;

		visit = new boolean[numbers.length()];
		map = new String[numbers.length()];
		map = numbers.split("");

		list = new HashSet();

		for (int i = 1; i <= numbers.length(); i++) {
			result = new String[i];
			cycle(0, i, numbers.length());
		}

		return list.size();
	}

	public void cycle(int start, int end, int length) {

		if (start == end) {
			findPrime();
		} else {

			for (int i = 0; i < length; i++) {
				if (!visit[i]) {
					visit[i] = true;
					result[start] = map[i];
					cycle(start + 1, end, length);
					visit[i] = false;
				}
			}

		}

	}

	public void findPrime() {

		// 숫자로 변환
		String str = "";
		for (int i = 0; i < result.length; i++)
			str += result[i];
		int num = Integer.parseInt(str);

		// 예외 처리
		if (num == 1 || num == 0)
			return;

		// 소수 인지 검사
		boolean flag = false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				flag = true;
		}

		if (!flag)
			list.add(num);
	}
}

/*
 * 한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.
 * 
 * 각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록
 * solution 함수를 완성해주세요.
 * 
 * 제한사항 numbers는 길이 1 이상 7 이하인 문자열입니다. numbers는 0~9까지 숫자만으로 이루어져 있습니다. 013은 0,
 * 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다. 입출력 예 numbers return 17 3 011 2 입출력 예 설명 예제
 * #1 [1, 7]으로는 소수 [7, 17, 71]를 만들 수 있습니다.
 * 
 * 예제 #2 [0, 1, 1]으로는 소수 [11, 101]를 만들 수 있습니다.
 * 
 * 11과 011은 같은 숫자로 취급합니다.
 */