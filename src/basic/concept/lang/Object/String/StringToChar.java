package basic.concept.lang.Object.String;

//https://kutar37.tistory.com/entry/%EC%9E%90%EB%B0%94-String%EC%9D%84-Char%EB%A1%9C-Char%EB%A5%BC-String%EC%9C%BC%EB%A1%9C-%EB%B3%80%ED%99%98%ED%95%98%EA%B8%B0

import java.util.Arrays;
public class StringToChar {

	public static void main(String[] args) {
		
		// 1]. String --> char[] : CHAR형 ARRAY를 하나씩 꺼내 CHARACTER.TOSTRING으로 변환
		System.out.println("1] ============>");
		
		System.out.println("1 ============>");
		// 1. String --> char[]
		String temp = "캐릭터 변환하기";
		char[] array = temp.toCharArray();
		String change = "";
		
		//System.out.println(temp);
		System.out.println(array);
		//System.out.println(change);
		
		System.out.println("\n2 ============> : " + array.length);
		// 2. char[] --> String 
		for (int j = 0; j < array.length; j++) {
			//System.out.println("\n"+j);
			//System.out.println(array[j]);//char 타입
			//System.out.println(Character.toString(array[j]));//String 타입
			//System.out.println(change);
		    change+= Character.toString(array[j]);
		}
		
		System.out.println("\n3 ============>");
		System.out.println(change);
		
		
		
		//2]. char[] --> String : 캐릭터형 배열 CHAR[] 를 바로 STRING으로 변환
		System.out.println("\n\n2] ============>");
		System.out.println("1 ============>");
		char[] ary = {'a','b','c','d','e'};
		//Arrays.sort(ary); //테스트삼아 작성해봄. char배열도 sort 되는구나
		String arrayString = String.valueOf(ary);
		System.out.println("char[] ary         : " + ary);
		System.out.println("String arrayString : " + arrayString);
		
		
		//3].  char[] --> String : STRING 클래스의 생성자 이용하기.
		System.out.println("\n\n3] ============>");
		change = new String(array, 2, 5);//index 2부터 5개의 글자 : 터 변환하
		System.out.println(change);
		
		
		
		//4]. char[] --> String : 한 글자일때 
		System.out.println("\n\n4] ============>");
		//String change1 = "";
		char cr ='A';

		String change1  = Character.toString(cr);
		String change2  = String.valueOf(cr);		
		String change3  = new Character(cr).toString();
		System.out.println(change1);
		System.out.println(change2);
		System.out.println(change3);
		
				
	}
}
