package programmers.sort;

import java.util.Arrays;
import java.util.Collections;

public class HIndex_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		// citations return [3, 0, 6, 1, 5] 3
		int[] citations = { 3, 0, 6, 1, 5 };
		int result = solution1(citations);

		System.out.println(result);
	}

	public static int solution1(int[] citations) {
		//int[] sorted = Arrays.stream(citations).sorted().toArray();
		Arrays.sort(citations);
		int answer = citations.length;
		
		for (int i = citations.length - 1; i >= 0; i--) {
			int remain = citations.length - i;
			if (citations[i] <= remain) {
				answer = citations[i] == remain ? citations[i] : remain - 1;
				break;
			}
			
		}
		
		
		return answer;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
