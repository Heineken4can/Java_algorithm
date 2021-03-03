package basic.concept.lang.Object.Character;
//https://12216715011126.tistory.com/13

public class CharToInt {

	public static void main(String[] args) {

	

		System.out.println("\n1.  ============>");
		String num = "123123"; // 이렇게 num을 초기화까지 진행하고
		System.out.println(num.charAt(0));// 1
		// 1 같은 경우는 결과값이 1이 나오지만 사실 그 1은 '1'이에요. 즉 문자로서 출력된거에요~~
		
		System.out.println("\n2.  ============>");
		int a = num.charAt(0);
		System.out.println(a);// 49
		// 2 같은 경우는 문자 '1'이 int형 변수에 들어가서 문자'1'에 해당하는 아스키코드 49로 변환됩니다.
		
		System.out.println("\n3.  ============>");
		int b = num.charAt(0) - '0';//아스키코드 49 - 아스키코드 48 = 1 이 출렵됨.
		int c = '0';
		System.out.println(b);// 1
		System.out.println(c);// 49
		
		/*
		 * 1같은 경우는 결과값이 1이 나오지만 사실 그 1은 '1'이에요. 즉 문자로서 출력된거에요~~
		 * 2같은 경우는 문자 '1'이 int형 변수에 들어가서 문자'1'에 해당하는 아스키코드 49로 변환됩니다.

		 * 그러면, 코드 14번째 줄
		 * sum += str.charAt(i) - '0'; // 여기서 문자 '0'을 빼는 이유도 눈치 채셨나요?
		 * str.charAt(i)에서 나온 값은 문자입니다.
		 * 즉, '1'이였다면 49고, '2'였다면 50이겠네요.
		 * 여기서 '0' 즉 48을 뺀다면
		 * '1'은 숫자 1로서
		 * '2'는 숫자 2로서 역할을 수행할 수 있겠네요! 찡긋
		 */
	}
}