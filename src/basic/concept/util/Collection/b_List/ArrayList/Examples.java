package basic.concept.util.Collection.b_List.ArrayList;
//https://programmers.co.kr/learn/courses/17/lessons/805

import java.util.ArrayList;
import java.util.Iterator;

public class Examples {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println("\n1. add(값)");
		System.out.println(numbers);

		numbers.add(1, 50);
		System.out.println("\n2. add(인덱스, 값)");
		System.out.println(numbers);

		numbers.remove(2);
		System.out.println("\n3. remove(인덱스)");
		System.out.println(numbers);

		System.out.println("\n4. get(인덱스)");
		System.out.println(numbers.get(2));

		System.out.println("\n5. size()");
		System.out.println(numbers.size());

		System.out.println("\n6. indexOf()");
		System.out.println(numbers.indexOf(30));

		Iterator it = numbers.iterator();
		System.out.println("\n7. iterator");
		while (it.hasNext()) {
			int value = (int) it.next();
			if (value == 30) {
				it.remove();
			}
			System.out.println(value);
		}
		System.out.println(numbers);

		System.out.println("\n8. for each");
		for (int value : numbers) {
			System.out.println(value);
		}
		System.out.println("\n9. for");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
	}// main
}
