package basic.concept.lang.Object.String;
//https://lnsideout.tistory.com/entry/JAVA-%EC%9E%90%EB%B0%94-%EB%AC%B8%EC%9E%90%EC%97%B4-%EC%B9%98%ED%99%98-%EB%B0%A9%EB%B2%95-raplace-replaceAll-%EC%B0%A8%EC%9D%B4%EC%A0%90

public class Replace_ReplaceAll {
	 public static void main(String[] args) {

			System.out.println("1]  =====================>");

			// 1. String replace(CharSequence target, CharSequence replacement)
			//replace(찾을문자열, 바꿀문자열) 
			System.out.println("\n1.  ============>");			
	        
			String str = "I have a pen. I have an apple. I have pineapple";
			System.out.println("1 : " + str);
	        str = str.replace("I", "You"); // I 문자를 YOU로 변경
	        System.out.println("2 : " + str);// 결과 : You have a pen. You have an apple. You have pineapple

	        
	        // 2. String replaceAll(String regex, String replacement)
	        //replaceAll(정규식 또는 기존문자, 대체문자)
	        System.out.println("\n2.  ============>");			
	        String  str2 = "자동차 가격은 300,000,000원 입니다.";
	        System.out.println("1 : " + str2);
	        str2 = str2.replaceAll("[0-9]", "A");
	        System.out.println("2 : " + str2); // 결과 : 자동차 가격은 AAA,AAA,AAA원 입니다.

	        String str22 = "자동차 가격은 300,000,000원 입니다.";
	        System.out.println("3 : " + str22);
	        str22 = str22.replaceAll("자동차", "CAR");
	        System.out.println("4 : " + str22); // 결과 : CAR 가격은 300,000,000원 입니다.
	        
	        
	        
	        // 3. replace와 replaceAll의 차이점을 한곳에서 비교해보겠습니다
	        System.out.println("\n3.  ============>");
	        String  str3 = "안녕하세요. 반가워요. 또 놀러오세요.";
	        System.out.println("1 : " + str3);
	        str3 = str3.replace(".", "^^");// replace는 .(점)을 문자로 인식하여 점 세개를 ^^ 웃는모양으로 치환하였습니다.
	        System.out.println("2 : " + str3); 

	        String str33 = "안녕하세요. 반가워요. 또 놀러오세요.";
	        System.out.println("3 : " + str33);
	        str33 = str33.replaceAll(".", "^^"); //replaceAll은 .(점)을 정규식으로 인식하여 .(점)은 정규식으로 모든문자를 표현합니다.
	        System.out.println("4 : " + str33); 
	        
	        
	        // 4. replaceFirst(String regex, String replacement)
	        System.out.println("\n4.  ============>");
	        String  str4 = "사과. 사과. 포도.";
	        str4 = str4.replaceFirst("사과", "수박");
	        System.out.println(str4); // 결과 : 수박. 사과. 포도

	        
	        // 5. 괄호 [ ] 로 특수문자로 인식해주는 방법입니다.
	        System.out.println("\n5.  ============>");
	        String  str5 = "안녕하세요? * + $ | 입니다.";
	        System.out.println(str5.replaceAll("[*]", "A"));// 안녕하세요? A + $ | 입니다.
	        System.out.println(str5.replaceAll("[+]", "A"));// 안녕하세요? * A $ | 입니다.
	        System.out.println(str5.replaceAll("[$]", "A"));// 안녕하세요? * + A | 입니다.
	        System.out.println(str5.replaceAll("[|]", "A"));//안녕하세요? * + $ A 입니다.
	        
	        
	        //6. \\를 붙여줘야 하는 특수문자입니다.
	        System.out.println("\n6.  ============>");
	        String  str6 = "이것은 컴퓨터 (computer) 입니다..";
	        System.out.println(str6.replaceAll("\\(", "★"));
	        // 이것은 컴퓨터 ★computer) 입니다..

	        /*
	         \\를 붙여줘야 하는 특수문자입니다.
	        (   \\(
	        ) ⇒ \\)
	        { ⇒ \\{
	        } ⇒ \\}
	        ^ ⇒ \\^
	        [ ⇒ \\[
	        ] ⇒ \\]
	        */
	    }//main
}
