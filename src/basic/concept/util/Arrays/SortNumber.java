package basic.concept.util.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortNumber {
	public static void main(String[] args) {

		System.out.println("\n1 =========>");	
		int[] numbers = {5,2,8,10,6,9};
		System.out.println(Arrays.toString(numbers));
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		
		
		System.out.println("\n2 =========>");	
		// Wrapper 클래스를 활용하여 선언
		Integer[] numbers2 = {5,2,8,10,6,9};
		System.out.println(Arrays.toString(numbers2));
		
		Arrays.sort(numbers2, Collections.reverseOrder());
		System.out.println(Arrays.toString(numbers2));
		//내림차순 정렬을 위해서는 primitive type이 아니라 
		//Wrapper 클래스로 선언해야 한다. 그 이유는 Collections에 도움을 받아야 하기 때문이다. Collections.reverseOrder()을 추가 인자로 넣으면 된다.
		
		
		
		System.out.println("\n3 =========>");
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(5); nums.add(2); nums.add(8);
		nums.add(10); nums.add(6); nums.add(9);
		System.out.println(nums);
		
		Collections.sort(nums);
		System.out.println(nums);
		
		Collections.reverse(nums);
		System.out.println(nums);
		//Collections.sort(nums, Collections.reverseOrder());
		
		
		
	}//main
}
