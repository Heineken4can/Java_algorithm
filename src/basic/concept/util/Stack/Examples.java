package basic.concept.util.Stack;
//https://118k.tistory.com/265

import java.util.Stack;

public class Examples {
	public static void main(String[] args) {
	
		System.out.println("\n1. ============>");
		Stack<Integer> stack = new Stack<>();
	       
        // 데이터 입력
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
       
        // 데이터 출력
        System.out.println("마지막에 넣은 데이터부터 출력");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
       
        // 에러 발생
        //System.out.println(stack.pop());
       
        System.out.println("\n2. ============>");
       
        // 데이터 입력
        stack.push(5);
        stack.push(4);
        stack.push(3);
       
        System.out.println(stack.contains(5)); // stack에 5이 있는지 check (있다면 true)
        System.out.println(stack.contains(1)); // stack에 1이 있는지 check (있다면 true)
        System.out.println(stack.size());    // 사이즈 확인
        System.out.println(stack.peek());    // 데이터를 빼지 않고 현재 가장 위에 위치하는 데이터 확인
        System.out.println(stack.size());    // 사이즈 확인
        System.out.println(stack.pop());
        System.out.println(stack.size());    // 사이즈 확인
        
        
        System.out.println("\n3. ============>");
        System.out.println(stack.empty());     // stack이 비어있는제 check (비어있다면 true)
        stack.clear();     // stack의 전체 값 제거 (초기화)
        System.out.println(stack.size()); 
        System.out.println(stack.empty());
	}
}
