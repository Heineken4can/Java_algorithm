package basic.concept.util.Map.HashMap;
//https://codechacha.com/ko/java-map-hashmap/

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. put()
		System.out.println("\n1.  ============>");
		Map<String, Integer> fruits = new HashMap<>();
		fruits.put("apple", 1);
		fruits.put("banana", 2);
		fruits.put("kiwi", 3);
		fruits.put(null, 4);
		fruits.put("kiwi", 5);
		System.out.println("fruits: " + fruits);

		
		
		// 2. putAll()
		System.out.println("\n2.  ============>");
		Map<String, Integer> fruits2 = new HashMap<>();
		fruits2.put("apple", 1);
		fruits2.put("banana", 2);
		fruits2.put("kiwi", 3);

		Map<String, Integer> food = new HashMap<>();
		food.put("coffee", 1);
		food.put("hamburger", 2);
		food.put("sandwich", 3);

		food.putAll(fruits2);
		System.out.println("food: " + food);

		
		
		// 3. get()
		System.out.println("\n3.  ============>");
		Map<String, Integer> fruits3 = new HashMap<>();
		fruits3.put("apple", 1);
		fruits3.put("banana", 2);
		fruits3.put("kiwi", 3);

		System.out.println("get(apple): " + fruits3.get("apple"));
		System.out.println("get(kiwi): " + fruits3.get("kiwi"));
		System.out.println("get(undefined): " + fruits3.get("undefined"));

		
		
		// 4. remove()
		System.out.println("\n4.  ============>");
		Map<String, Integer> fruits4 = new HashMap<>();
		fruits4.put("apple", 1);
		fruits4.put("banana", 2);
		fruits4.put("kiwi", 3);

		System.out.println("remove(apple): " + fruits4.remove("apple"));
		System.out.println("remove(kiwi): " + fruits4.remove("kiwi"));
		System.out.println("remove(undefined): " + fruits4.remove("undefined"));
		System.out.println("fruits: " + fruits4);

		
		
		// 5. clear(), isEmpty()
		System.out.println("\n5.  ============>");	
		Map<String, Integer> fruits5 = new HashMap<>();
		fruits5.put("apple", 1);
		fruits5.put("banana", 2);
		fruits5.put("kiwi", 3);
		System.out.println("fruits: " + fruits5);
		System.out.println("is empty? " + fruits5.isEmpty());

		fruits5.clear();
		System.out.println("fruits: " + fruits5);
		System.out.println("is empty? " + fruits5.isEmpty());

		
		
		// 6. keySet(), values()
		System.out.println("\n6.  ============>");
		Map<String, Integer> fruits6 = new HashMap<>();
		fruits6.put("apple", 1);
		fruits6.put("banana", 2);
		fruits6.put("kiwi", 3);
		System.out.println("keySet(): " + fruits6.keySet());//[banana, apple, kiwi]
		System.out.println("values(): " + fruits6.values());//[2, 1, 3]

		//Map에서 key들을 추출해서 Set에 넣는거야??
		Set<String> keys = fruits6.keySet();//[banana, apple, kiwi]
		for (String key : keys) {
			System.out.println("key: " + key);
		}

		Collection<Integer> values = fruits6.values();
		//Set<Integer> values = (Set<Integer>) fruits6.values();//이건 런타임 오류남,컴파일은 되네
		for (Integer value : values) {
			System.out.println("value: " + value);
		}

		
		
		// 7. containsKey(), containsValue()
		System.out.println("\n7.  ============>");	
		Map<String, Integer> fruits7 = new HashMap<>();
		fruits7.put("apple", 1);
		fruits7.put("banana", 2);
		fruits7.put("kiwi", 3);

		System.out.println("containsKey(apple): " + fruits7.containsKey("apple"));
		System.out.println("containsKey(undefined): " + fruits7.containsKey("undefined"));
		System.out.println("containsValue(1): " + fruits7.containsValue(1));
		System.out.println("containsValue(0): " + fruits7.containsValue(0));
 
		
		
		// 8. replace()
		System.out.println("\n8.  ============>");
		Map<String, Integer> fruits8 = new HashMap<>();
		fruits8.put("apple", 1);
		fruits8.put("banana", 2);
		fruits8.put("kiwi", 3);
		System.out.println("fruits8: " + fruits8);

		System.out.println("replace(apple, 10): "  + fruits8.replace("apple", 10));
		System.out.println("replace(undefined, 10): "  + fruits8.replace("undefined", 10));
		System.out.println("fruits8: " + fruits8);
	}// main

}
