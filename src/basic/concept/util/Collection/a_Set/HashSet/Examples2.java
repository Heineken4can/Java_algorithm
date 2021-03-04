package basic.concept.util.Collection.a_Set.HashSet;
// https://codechacha.com/ko/java-collections-hashset/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Examples2 {

	public static void main(String[] args) {

		
		// 1. HashSet.add()
		System.out.println("\n1 =========>");
		Set<String> fruits = new HashSet<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("kiwi");
		System.out.println("fruits: " + fruits);

		
		
		// 2. HashSet.remove()
		System.out.println("\n2 =========>");
		Set<String> fruits2 = new HashSet<String>();
		fruits2.add("apple");//같은 값은 추가가 안되는 구나
		fruits2.add("banana");
		fruits2.add("kiwi");
		System.out.println("fruits: " + fruits2);

		fruits2.remove("apple");
		System.out.println("fruits: " + fruits2);

		
		
		// 3. HashSet.removeAll()
		System.out.println("\n3 =========>");
		Set<String> fruits3 = new HashSet<String>();
		fruits3.add("apple");
		fruits3.add("banana");
		fruits3.add("kiwi");
		System.out.println("fruits: " + fruits3);

		List<String> removed = new ArrayList<>();
		removed.add("apple");
		removed.add("kiwi");

		fruits3.removeAll(removed);
		System.out.println("fruits: " + fruits3);
		
		
		
		// 4. HashSet.clear()
		System.out.println("\n4 =========>");
		Set<String> fruits4 = new HashSet<String>();
		fruits4.add("apple");
		fruits4.add("banana");
		fruits4.add("kiwi");
		System.out.println("fruits: " + fruits4);

		fruits4.clear();
		System.out.println("fruits: " + fruits4);
		
		
		
		// 5. HashSet.contains()
		System.out.println("\n5 =========>");
		Set<String> fruits5 = new HashSet<String>();
		fruits5.add("apple");
		fruits5.add("banana");
		fruits5.add("kiwi");

		System.out.println("has apple? " + fruits5.contains("apple"));
		System.out.println("has grape? " + fruits5.contains("grape"));

		
		
		// 6. HashSet.iterator()
		System.out.println("\n6 =========>");
		Set<String> fruits6 = new HashSet<String>();
		fruits6.add("apple");
		fruits6.add("banana");
		fruits6.add("kiwi");

		Iterator<String> it = fruits6.iterator();
		while (it.hasNext()) { // 순서는 없나보네 
		    System.out.println("fruits: " + it.next());
		}
		
		
		
		// 7. for를 이용하여 아이템 접근
		System.out.println("\n7 =========>");
		Set<String> fruits7 = new HashSet<String>();
		fruits7.add("apple");
		fruits7.add("banana");
		fruits7.add("kiwi");

		for (String fruit : fruits7) {
		    System.out.println("fruits7: " + fruit);
		}

		

		// 8. HashSet.isEmpty()
		System.out.println("\n8 =========>");
		Set<String> fruits8 = new HashSet<String>();
		fruits8.add("apple");
		fruits8.add("banana");
		fruits8.add("kiwi");
		System.out.println("is empty? " + fruits8.isEmpty());
		fruits8.clear();
		System.out.println("is empty? " + fruits8.isEmpty());
		
		
		
		// 9. HashSet.size()
		System.out.println("\n9 =========>");
		Set<String> fruits9 = new HashSet<String>();
		fruits9.add("apple");
		System.out.println("size? " + fruits9.size());
		fruits9.add("banana");
		fruits9.add("kiwi");
		System.out.println("size? " + fruits9.size());
		
		
		
		// 10. 중복된 값과 null 저장, null은 저장되지만, 중복된 값은 1개만 저장됩니다.
		System.out.println("\n10 =========>");
		Set<String> fruits10 = new HashSet<String>();
		fruits10.add("apple");
		fruits10.add("banana");
		fruits10.add("kiwi");
		fruits10.add(null);
		fruits10.add("kiwi");
		System.out.println("fruits: " + fruits10);
		
		
	}//main
	
	
	
}
