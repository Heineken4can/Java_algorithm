package basic.concept.lang.Object.String;
//https://codechacha.com/ko/java-substring-or-split/

import java.util.Arrays;

//import com.sun.tools.javac.util.StringUtils;

public class Split_Substring {

	public static void main(String[] args) {

		// 1] split()을 사용하여 문자열을 자르기
		System.out.println("1] split =====================>");

		// 1. split()을 사용하여 문자열을 자르기
		System.out.println("\n1. split()을 사용하여 문자열을 자르기 ============>");
		String str = "Hi guys This is split example";
		String[] result1 = str.split(" ");
		String[] result11 = str.split(" ", 2); // 2개로 자르기
		String[] result111 = str.split(" ", 3);// 3개로 자르기

		System.out.println(Arrays.toString(result1));
		System.out.println(Arrays.toString(result11));
		System.out.println(Arrays.toString(result111));
		
		
		// 2. 개행 문자 \n로 문자열을 자르기
		System.out.println("\n2. 개행 문자 \\n로 문자열을 자르기 ============>");
		String str2 = "Hi guys\n" +
		        "This is split example\n" +
		        "I'll show you how to use split method";
		String[] result2 = str2.split("\n");

		System.out.println(Arrays.toString(result2));
		
		
		// 3. 정규표현식(regex)과 split으로 문자열 자르기
		System.out.println("\n3. 정규표현식(regex)과 split으로 문자열 자르기 ============>");
		String str3 = "This island is beautiful";
		String[] result3 = str3.split("is");
		String[] result33 = str3.split("\\bis\\b");// '\\b'는 빈칸을 의미 하는가 보네 

		System.out.println(Arrays.toString(result3));
		System.out.println(Arrays.toString(result33));
		
		
		// 2] String.substring()으로 문자열 자르기
		System.out.println("\n\n2] substring =====================>");
		
		System.out.println("\n4. String.substring()으로 문자열 자르기 ============>");
		String str4 = "Hi guys. This is split example";
		String result4 = str4.substring(17);
		String result44 = str4.substring(17, 25);

		System.out.println(result4);
		System.out.println(result44);
		
		for (int i = 0; i < str4.length(); i ++) {
			System.out.println(i + ":" + str4.charAt(i));
		}
		
		// 5. indexOf()로 어떤 문자의 index를 찾고 그 index로 substring()에 전달
		System.out.println("\n5. indexOf()로 어떤 문자의 index를 찾고 그 index로 substring()에 전달 ============>");
		String str5 = "This island is beautiful";
		int beginIndex = str5.indexOf("is");
		int endIndex = str5.length();
		String result5 = str5.substring(beginIndex, endIndex);

		System.out.println(beginIndex);
		System.out.println(endIndex);
		System.out.println(result5);
		System.out.println("\n55. ============>");
		for (int i = 0; i < str5.length(); i ++) {
			System.out.println(i + ":" + str5.charAt(i));
		}
		
		// 6. lastIndexOf()와 substring()을 사용하여 문자열을 자르는 예제
		System.out.println("\n6. lastIndexOf()와 substring()을 사용하여 문자열을 자르는 예제 ============>");
		String str6 = "This island is beautiful";
		int beginIndex6 = str6.lastIndexOf("is");//12
		int endIndex6 = str6.length();//24
		String result6 = str6.substring(beginIndex6, endIndex6);

		System.out.println(beginIndex6);
		System.out.println(endIndex6);
		System.out.println(result6);
		
		
		
		// 3] StringUtils으로 문자열 자르기 --> StringUtils이 import가 안 되네. jar 파일 가져와야 하나보네
		System.out.println("\n\n3] StringUtils으로 문자열 자르기 =====================>");
		
		System.out.println("\n7. lastIndexOf()와 substring()을 사용하여 문자열을 자르는 예제 ============>");
		String str7 = "This island is beautiful!";
		//String result7 = StringUtils.substringBetween(str7, "This ","!");
		//System.out.println(result7);
		
		
	}
}
