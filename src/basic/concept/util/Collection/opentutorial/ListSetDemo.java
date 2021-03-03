package basic.concept.util.Collection.opentutorial;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.Iterator;

public class ListSetDemo {

	public static void main(String[] args) {

		// 1] ArrayList : List는 중복을 허용, 저장되는 순서가 유지
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("two");
		al.add("three");
		al.add("three");
		al.add("five");
		
		System.out.println("\n1-1] =====>");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		Iterator ai = al.iterator();//메소드 iterator는 인터페이스 Collection에 정의되어 있다. 
		System.out.println("\n1-2] =====>");
		while (ai.hasNext()) { //hasNext():반복할 데이터가 더 있으면 true, 더 이상 반복할 데이터가 없다면 false를 리턴한다.
			System.out.println(ai.next());//next():hasNext가 true라는 것은 next가 리턴할 데이터가 존재한다는 의미다. 
		}

		
		// 2] HashSet : Set는 중복을 미허용, 순서가 없음
		HashSet<String> hs = new HashSet<String>();
		hs.add("one");
		hs.add("two");
		hs.add("two");
		hs.add("three");
		hs.add("three");
		hs.add("five");
		Iterator hi = hs.iterator();
		System.out.println("\n2] =====>");
		while (hi.hasNext()) {
			System.out.println(hi.next());
		}
	}

}