package basic.concept.lang.Object.Character;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://codechacha.com/ko/java-convert-chararray-to-string/

public class CharToString {

	public static void main(String[] args) {

		// 1. String 생성자
		System.out.println("\n1.  ============>");
		char[] charArray1 = { 'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd' };
		String str1 = new String(charArray1);
		System.out.println(str1);


		
		// 2. String.valueOf()
		System.out.println("\n2.  ============>");
	    char[] charArray2 = { 'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd' };
	    String str2 = String.valueOf(charArray2);
	    System.out.println(str2);
	    

	    
	    // 3. StringBuilder, StringBuffer
		System.out.println("\n3.  ============>");
	    char[] charArray3 = { 'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd' };
	    StringBuilder sb3 = new StringBuilder();
	    for (char ch : charArray3) {
	        sb3.append(ch);
	    }
	    String str3 = sb3.toString();
	    System.out.println(str3);
	    
	    StringBuffer sb33 = new StringBuffer();
	    for (char ch : charArray3) {
	    	sb33.append(ch);
	    }
	    String str33 = sb33.toString();
	    System.out.println(str33);
	    
	   
	    
	    // 4. Stream
		System.out.println("\n4.  ============>");
	    Character[] charArray4 = { 'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd' };
	    Stream<Character> charStream = Arrays.stream(charArray4);
	    String str4 = charStream.map(String::valueOf).collect(Collectors.joining());
	    System.out.println(str4);
	    
	     
	}//main
}