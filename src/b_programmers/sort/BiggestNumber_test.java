package b_programmers.sort;

import java.util.Arrays;
import java.util.Comparator;

public class BiggestNumber_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] numbers = { 6, 10, 2 }; //6210
		int[] numbers = { 3, 30, 34, 5, 9 }; // 9534330

		String result = solution1(numbers);
		System.out.println(result);

	}

	public static String solution1(int[] numbers) {
		String answer = "";
		String[] sNumbers = new String[numbers.length];
		
		for(int i = 0; i < numbers.length; i++) {
			sNumbers[i] = numbers[i] + "";
		}
		
		Arrays.sort(sNumbers, new Comparator<String>(){
			@Override
			public int compare(String n1, String n2) {
				return (n2 + n1).compareTo(n1 + n2);
			}
		});
		
		for(int i = 0; i < sNumbers.length; i++) {
			answer += sNumbers[i];
			System.out.println("11111");
			System.out.println(answer);
		}
		
		if(answer.startsWith("0")) {
			answer = "0";
		}
		
		
		
		
		return answer;

	}

}
