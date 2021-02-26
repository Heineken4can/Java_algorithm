package b_programmers.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Knumber_test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		String result = Arrays.toString(solution1(array, commands));
		System.out.println(result);
	}

	public static int[] solution1(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		ArrayList<Integer> arr = new ArrayList<>();
		
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
	
	
	
	
	
}
