package basic.concept.util.Collection.opentutorial;
//set = 집합


import java.util.HashSet;
import java.util.Iterator;

/*
Set이 수학의 '집합'을 프로그래밍적으로 구현한 것이라고 언급했다. 
map은 수학의 '함수'를 프로그래밍화한 것이다. 
수학의 함수가 "정의역과 공역 원소들 사이의 단가 대응의 관계"라는 의미를 이해하고 있는 사람이라면 
Map의 key와 value의 관계가 함수의 정의역과 공역의 관계와 같다는 것을 이해할 수 있을 것이다. 
*/

public class SetDemo {
	   public static void main(String[] args) {
	        HashSet<Integer> A = new HashSet<Integer>();
	        A.add(1);
	        A.add(2);
	        A.add(3);
	         
	        HashSet<Integer> B = new HashSet<Integer>();
	        B.add(3);
	        B.add(4);
	        B.add(5);
	         
	        HashSet<Integer> C = new HashSet<Integer>();
	        C.add(1);
	        C.add(2);
	         	        
	        System.out.println("\n5 =======>");
	        Iterator hi = A.iterator();
	        while(hi.hasNext()){
	            System.out.println(hi.next());
	        }
	        
	        
	        System.out.println("\n1 =======>");
	        System.out.println(A.containsAll(B)); // false, B는 A의 부분집합이다 는 false
	        System.out.println(A.containsAll(C)); // true, C는 A의 부분집합이다 는 true
	         
	        //A.addAll(B);//합집합(=union)
	        System.out.println("\n2 =======>");
	        System.out.println(A);
	        System.out.println(A.addAll(B));
	        System.out.println(A);
	       
	        
	        //A.retainAll(B);//교집합(=intersect)
	        System.out.println("\n3 =======>");
	        System.out.println(A);
	        System.out.println(A.retainAll(B));
	        System.out.println(A);
	        
	        //A.removeAll(B);//차집합(=differenct)
	        System.out.println("\n4 =======>");
	        System.out.println(A);
	        System.out.println(A.removeAll(B));
	        System.out.println(A);
	    }//main
}
