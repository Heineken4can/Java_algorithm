package basic.concept.util.Collection.c_Queue.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Examples3 {

	public static void main(String[] args) {
		LinkedList<String> qu = new LinkedList<String>(); // 큐의 생성
		Deque<String> qu2 = new ArrayDeque<String>(); 
		//LinkedLIst나 Queue나 동일한 메소드 사용하는구나. 차이가 머지?? 거의 동일하게 작동하는듯
		

		System.out.println("\n1.  ============>");
		// add() 메소드를 이용한 요소의 저장
		qu.add("넷");
		qu.add("둘");
		qu.add("셋");
		qu.add("하나");		 

		// peek() 메소드를 이용한 요소의 반환
		System.out.println(qu.peek());
		System.out.println(qu);

		
		
		System.out.println("\n2.  ============>");
		// poll() 메소드를 이용한 요소의 반환 및 제거
		System.out.println(qu.poll());
		System.out.println(qu);

		
		 
		System.out.println("\n3.  ============>");
		// remove() 메소드를 이용한 요소의 제거
		System.out.println(qu.remove("하나"));//true
		System.out.println(qu.remove("다섯"));//false
		System.out.println(qu);
		
		
	}
}
