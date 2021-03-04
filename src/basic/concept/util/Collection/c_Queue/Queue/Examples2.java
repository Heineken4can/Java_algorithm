package basic.concept.util.Collection.c_Queue.Queue;
//https://wakestand.tistory.com/198

import java.util.LinkedList;
import java.util.Queue;

public class Examples2 {

	public static void main(String[] args) {
		Queue<String> que = new LinkedList<String>();
		
		que.offer("김철수");
		que.add("이영희"); //Queue의 마지막에 값 추가, 리턴값은 true/false
		que.offer("김영수"); // Queue의 마지막에 에 값 추가
		
		// Queue에 김영수 들어있는지 확인
		System.out.println("1 Queue 값 포함 여부 :" + que.contains("김영수"));
		
		// Queue에 다음에 나올 값 확인
		System.out.println("2 Queue 다음 출력값 확인 : " + que.peek());
		
		// Queue 크기 확인
		System.out.println("3 Queue 크기 확인 : " + que.size());
		
		System.out.println("4 Queue 비었는지 여부 1: " + que.isEmpty());
		for(int i = 0; i<que.size();) {
			// Queue 안의 값 꺼내기
			System.out.println(que.poll());
		}
		System.out.println("4 Queue 비었는지 여부 2: " + que.isEmpty());
		// Queue 비우기
		que.clear();
		// Queue 비었는지 확인
		System.out.println("4 Queue 비었는지 여부 3: " + que.isEmpty());
		
	}
}
