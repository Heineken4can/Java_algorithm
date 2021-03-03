package basic.concept.lang.Object.String;
//https://sophia2730.tistory.com/entry/JAVA-int-char-String-%ED%98%95%EB%B3%80%ED%99%98-%EC%A0%95%EB%A6%AC

import java.util.Arrays;

public class String_char_int {

	public static void main(String[] args) {

		//System.out.println("1]  =====================>");

		System.out.println("\n1.  ============>");
		int a = 65;
		System.out.println("Integer to Character : " + (char) a); // A
		System.out.println("Integer to String : " + String.valueOf(a)); // 65

		System.out.println("\n2.  ============>");
		char ch = '3';
		char[] ch2 = { 'a', 'b' };
		System.out.println("Character to Integer : " + ((int) ch - '0')); // 3, char - '0'을 이용하면 아스키코드값을 알 필요없이 int형으로 변환 가능
		System.out.println("Character to String : " + String.valueOf(ch)); // 3
		System.out.println("Character to String : " + String.valueOf(ch2)); // ab
		 
		System.out.println("\n3.  ============>");
		String s = "9";
		String s2 = "123";
		
		System.out.println("String to Integer : " + Integer.parseInt(s)); // 9
		System.out.println("String to Integer : " + Character.getNumericValue(s.charAt(0)));
		System.out.println("String to Character : " + s.charAt(0)); // 9
		System.out.println("String to Character : " + Arrays.toString(s2.toCharArray())); // [1, 2, 3]
		
	}
}

/*
 * < 유의 사항 >
 * 
 * char to int에서 숫자를 넘기는 경우 '0'을 해야 한다. (아스키코드값을 넘기기 때문)
 * 
 * char to string에서 char배열인 경우 String.valueOf를 사용하면 char배열 글자가 서로 붙어서 문자열로 넘어간다.
 * 
 * String to char에서 문자 길이가 1이라면 charAt으로 넘기면 된다.
 * 
 * String to char에서 문자 길이가 2이상이라면 toCharArray를 이용해 char배열로 넘긴다.
 */