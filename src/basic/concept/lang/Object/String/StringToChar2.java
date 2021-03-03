package basic.concept.lang.Object.String;
//https://java119.tistory.com/106


public class StringToChar2 {

	public static void main(String[] args) {

		// 1] 1.String to char (String -> char)
		System.out.println("1] ========================>");

		// 1-1.charAt() 이용하기
		System.out.println("\n1-1.charAt() 이용하기 ============>");
		System.out.println("1 ============>");
		String krstr = "안녕하세요";
		char c = krstr.charAt(0);
		System.out.println(c);

		System.out.println("\n2 ============>");
		String enstr = "abcdef";
		char c2 = enstr.charAt(3);
		System.out.println(c2);

		System.out.println("\n3 ============>");
		String input = "자바킹";
		for (int i = 0; i < input.length(); i++) {
			System.out.println(input.charAt(i));
		}

		// 1-2.toCharArray() 이용하기
		// ※ 공통 주의할 점
		// 1.특수문자, 공백도 인덱스에 포함된다는 점
		// 2.인덱스가 0부터 시작한다는 점
		System.out.println("\n1-2.toCharArray() 이용하기 ============>");
		String input2 = "안녕하세요";
		char[] arrCh = input.toCharArray();

		for (char c3 : arrCh) {
			System.out.println(c3);
		}

		// 2] char to String (char -> String)
		System.out.println("\n\n2] ========================>");

		// 2-1.valueOf() 이용하기
		System.out.println("\n2-1.valueOf() 이용하기 ============>");
		char[] arrCh2 = { 'a', 'b', 'c' };
		String str = String.valueOf(arrCh2);
		System.out.println(str);

		// 2-2.toString() 이용하기
		System.out.println("\n2-2.toString() 이용하기 ============>");
		char c4 = 'a';
		char[] arrCh4 = { 'a', 'b', 'c' };

		Character.toString(c4); // O
		// Character.toString(arrCh4) //X, Character.toString() 사용 시 char [] 배열은 변환이 불가
		System.out.println(c4);
		System.out.println(Character.toString(c4));

		// 2-3."" 이용하기 (야매식 변환)
		System.out.println("\n2-3.\"\" 이용하기 (야매식 변환) ============>");
		char c5 = 'a';
		String str5 = c5 + "";
		System.out.println(c5);
		System.out.println(str5);

		// 3] 실행 속도 비교 코드
		// [2-1.valueOf()] vs [2-3."" 이용하기]
		System.out.println("\n\n3] ========================>");
		char ch6 = 'a';

		long startNanoTime = System.nanoTime();

		int i = 100000000;
		while (i-- > 0) {
			String str6 = String.valueOf(ch6); // 2-1
			String str7 = ch6 + ""; // 2-3
			// 하나씩 넣고 컴파일을 진행하였습니다.
		}
		long secDiffTime = (System.nanoTime() - startNanoTime) / 1000000000;
		System.out.println(secDiffTime);

	}
}
