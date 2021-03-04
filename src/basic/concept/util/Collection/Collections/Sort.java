package basic.concept.util.Collection.Collections;
//https://devlog-wjdrbs96.tistory.com/68

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sort {
	public static void main(String[] args) {

		System.out.println("\n1 =========>");
		String[] str = { "1", "a", "3", "나", "A" };

		for (String s : str) {
			System.out.print(s + " ");
		}

		System.out.println();

		Arrays.sort(str);
		// 정렬이 되는 기준은 오름차순으로 숫자 > 대문자 > 소문자 > 한글순 으로 정렬이 된다.

		for (String s : str) {
			System.out.print(s + " ");
		}

		System.out.println("\n\n2 =========>");
		// 내림차순
		String[] str2 = { "5", "4", "3", "2", "1" };
		for (String s : str2) {
			System.out.print(s + " ");
		}

		System.out.println();
		Arrays.sort(str2);
		for (String s : str2) {
			System.out.print(s + " ");
		}

		System.out.println();
		// 내림차순
		Arrays.sort(str2, Collections.reverseOrder());
		for (String s : str2) {
			System.out.print(s + " ");
		}

		System.out.println("\n\n3 =========>");
		ArrayList<String> list = new ArrayList<String>();
		list.add("5");
		list.add("A");
		list.add("가");
		list.add("3");
		list.add("b");
		
		for ( int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		Collections.sort(list);
		for ( int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		Collections.reverse(list);
		for ( int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		
		
		
		
		
		
	}// main
}
