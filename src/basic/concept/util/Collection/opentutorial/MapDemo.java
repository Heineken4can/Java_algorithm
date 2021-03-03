package basic.concept.util.Collection.opentutorial;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Set이 수학의 집합을 프로그래밍적으로 구현한 것이라고 언급했다. 
map은 수학의 함수를 프로그래밍화한 것이다. 
수학의 함수가 "정의역과 공역 원소들 사이의 단가 대응의 관계"라는 의미를 이해하고 있는 사람이라면 
Map의 key와 value의 관계가 함수의 정의역과 공역의 관계와 같다는 것을 이해할 수 있을 것이다. 
*/

public class MapDemo {
 
    public static void main(String[] args) {
        HashMap<String, Integer> a = new HashMap<String, Integer>();
        //Integer라는 wrapper class를 사용하는 이유구나. int를 hashmap에 넣을 순 없으니.

        a.put("one", 1);
        a.put("two", 2);
        a.put("three", 3);
        a.put("four", 4);
        System.out.println("\n1 =======>");
        System.out.println(a.get("one"));
        System.out.println(a.get("two"));
        System.out.println(a.get("three"));
        
        for (int i = 0 ; i < a.size(); i++) {
        	System.out.println(a.get(i));//hashmap의 key를 몰라서 이렇게 출력 못하는구나;;
        }
        
        
        System.out.println("\n2 =======>");
        iteratorUsingForEach(a);
        
        
        System.out.println("\n3 =======>");
        iteratorUsingIterator(a);
    }
    
    static void iteratorUsingForEach(HashMap map){
    	System.out.println("\n4 =======>");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        
        //map은 {}괄호로 출력, entri는 []로 출력, list는 []로 출력,
        System.out.println("1 : "+ map);//1 : {four=4, one=1, two=2, three=3}
        System.out.println("1 : "+ map.entrySet());//1 : [four=4, one=1, two=2, three=3]
        System.out.println("2 : "+ entries);//2 : [four=4, one=1, two=2, three=3]
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
     
    static void iteratorUsingIterator(HashMap map){
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> i = entries.iterator();
        while(i.hasNext()){
            Map.Entry<String, Integer> entry = i.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
 
}