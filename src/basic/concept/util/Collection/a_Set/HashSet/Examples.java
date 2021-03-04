package basic.concept.util.Collection.a_Set.HashSet;
//https://coding-factory.tistory.com/554

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Examples {

	public static void main(String[] args) {

		System.out.println("\n1 =========>");	
		//1. HashSet 선언
		/*
		 * HashSet<Integer> set1 = new HashSet<Integer>();//HashSet생성 HashSet<Integer>
		 * set2 = new HashSet<>();//new에서 타입 파라미터 생략가능 HashSet<Integer> set3 = new
		 * HashSet<Integer>(set1);//set1의 모든 값을 가진 HashSet생성 HashSet<Integer> set4 = new
		 * HashSet<Integer>(10);//초기 용량(capacity)지정 HashSet<Integer> set5 = new
		 * HashSet<Integer>(10, 0.7f);//초기 capacity,load factor지정 HashSet<Integer> set6
		 * = new HashSet<Integer>(Arrays.asList(1,2,3));//초기값 지정
		 */
		
		System.out.println("\n2 =========>");	
		//HashSet 값 추가
		HashSet<Integer> set2 = new HashSet<Integer>();//HashSet생성
		set2.add(1); //값 추가
		System.out.println(set2);
		
		set2.add(2);
		System.out.println(set2);
		
		set2.add(3);
		System.out.println(set2);
		
		
		
		System.out.println("\n3 =========>");	
		//HashSet 값 삭제
		HashSet<Integer> set3 = new HashSet<Integer>(Arrays.asList(1,2,3));//HashSet생성
		System.out.println(set3);
		
		set3.remove(2);//값 1 제거
		System.out.println(set3);
		
		set3.clear();//모든 값 제거
		System.out.println(set3);
		
		
		System.out.println("\n4 =========>");	
		//HashSet 크기 구하기
		HashSet<Integer> set4 = new HashSet<Integer>(Arrays.asList(1,2,3));//HashSet생성
		System.out.println(set4);
		System.out.println(set4.size());//set 크기 : 3
		
		
		
		System.out.println("\n5 =========>");	
		//HashSet 값 출력
		HashSet<Integer> set5 = new HashSet<Integer>(Arrays.asList(1,2,3));//HashSet생성
		System.out.println(set5); //전체출력 [1,2,3]
				
		Iterator iter = set5.iterator();	// Iterator 사용
		while(iter.hasNext()) {//값이 있으면 true 없으면 false
		    System.out.println(iter.next());
		}
		

		
		System.out.println("\n6 =========>");
		//HashSet 값 검색
		HashSet<Integer> set6 = new HashSet<Integer>(Arrays.asList(1,2,3));//HashSet생성
		System.out.println(set6.contains(1)); //set내부에 값 1이 있는지 check : true
		System.out.println(set6.contains(4));
		
		
		
	}
}
