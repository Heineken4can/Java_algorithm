package basic.concept.lang.Object.Math;
//https://iamfreeman.tistory.com/entry/java-Math-%EC%82%AC%EC%9A%A9%EB%B2%95

import java.lang.Math;
public class Methods {
	

		public static void main(String[] args) {

		double result, result_sin, result_cos, result_tan;

		System.out.println("1) 기타 ============>");
		result = Math.abs(3.5);//① abs() : 인수의 절대값을 구해준다.
		System.out.println("Math.abs(3.5)  : " + result);

		result = Math.abs(-3.5);
		System.out.println("Math.abs(-3.5) : " + result);
		
		
		
		System.out.println("\n2) 올림/버림/반올림 ============>");
		//① ceil() : 인수로 들어온 숫자와 같거나 큰정수 중에서 가까운 정수를 구한다.
		result = Math.ceil(3.5);
		System.out.println("Math.ceil(3.5)   : " + result);
		result = Math.ceil(-3.5);
		System.out.println("Math.ceil(-3.5)  : " + result);

		//② floor() : 인수로 들어온 숫자와 같거나 작은 정수 중에서 가까운 정수를 구한다.(버림)
		result = Math.floor(3.5);
		System.out.println("Math.floor(3.5)  : " + result);
		result = Math.floor(-3.5);
		System.out.println("Math.floor(-3.5) : " + result);
		
		//③ round() : 인수로 들어온 숫자를 반올림한다.
		result = Math.round(3.5);
		System.out.println("Math.round(3.5)  : " + result);
		result = Math.round(-3.5);
		System.out.println("Math.round(-3.5) : " + result);

		

		System.out.println("\n3) 최대/최소 ============>");
	
		//② min() : 인수를 두 개를 받아 두 인수 중 작은 숫자를 구해준다.
		result = Math.min(-3.5, 3.5);
		System.out.println("Math.min(-3.5, 3.5) : " + result);

		//① max() : 인수를 두 개를 받아 두 인수 중 큰 숫자를 구해준다.
		result = Math.max(-3.5, 3.5);
		System.out.println("Math.max(-3.5, 3.5) : " + result);

		//제곱근
		result = Math.sqrt(25);
		System.out.println("Math.sqrt(25)       : " + result);

		
		
		System.out.println("\n4) 삼각 함수 ============>");
		//삼각함수 출력. 60도만 알아본다.
		//삼각함수 관련 메소드들은 인수로 라디안 값을 받기 때문에 각도를 toRadians() 를 이용해서 라디안 값으로 변환한뒤 메소드에 넘긴다.
		// "\t" 는 Tab 키를 말한다.

		result_sin = Math.sin(Math.toRadians(60.0));//① sin() : 인수의 사인값을 구해준다.
		result_cos = Math.cos(Math.toRadians(60.0));//② cos() : 인수의 코사인값을 구해준다.
		result_tan = Math.tan(Math.toRadians(60.0));//③ tan() : 인수의 탄젠트 값을 구해준다.
		System.out.println("PI : \t" + result_sin + "\t" + result_cos + "\t" + result_tan);

		}

}
