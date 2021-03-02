package basic.concept.wrapperClass;


//http://dkgka.egloos.com/285183
public class Test1 {
	public static void main(String[] args) {
		Integer i = new Integer(10);
		char c = '4';
		Double d = new Double(3.1234566);
		// System.out.println(Character.toLowerCase('A')); //대문자 'A'를 소문자로 변환
		
		 if(Character.isDigit(c)); //문자 c가 숫자를 나타내면 true
		 System.out.println("1 : "+Character.isDigit(c)); //true
		 System.out.println("1 : "+Character.isDigit(1)); //false
		 System.out.println("1 : "+Character.isDigit('1')); //true
		 System.out.println("1 : "+Character.isDigit('d')); //false
		 System.out.println(); 
		 
		 System.out.println("2 : "+Character.getNumericValue(c)); //문자를 숫자로 변환
		 System.out.println(); 
		 
		 System.out.println("3 : "+Integer.parseInt("-123")); //문자열을 정수로 변환
		 System.out.println("4 : "+Integer.parseInt("1", 16)); //16진수 문자열을 정수로 변환
		 System.out.println("4 : "+Integer.parseInt("10", 16)); //16진수 문자열을 정수로 변환
		 System.out.println("4 : "+Integer.parseInt("11", 16)); //16진수 문자열을 정수로 변환
		 System.out.println("4 : "+Integer.parseInt("17", 16)); //16진수 문자열을 정수로 변환
		 System.out.println("4 : "+Integer.parseInt("17", 15)); //16진수 문자열을 정수로 변환
		 System.out.println();
		 
		 System.out.println("5 : "+Integer.toBinaryString(28)); //2진수로 표현된 문자열로 변환
		 System.out.println("6 : "+Integer.bitCount(28)); //2진수에서 1의 개수 출력
		 System.out.println("7 : "+Integer.toHexString(28)); //16진수 문자열로 변환
		 System.out.println("8 : "+i.doubleValue()); //정수를 double로 변환
		 System.out.println("9 : "+d.toString()); //Double을 문자열로 변환
		 System.out.println("10 : "+Double.parseDouble("44.13e-6")); //문자열을 double로 변환
		


	}// main

}
