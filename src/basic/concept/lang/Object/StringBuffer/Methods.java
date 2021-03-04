package basic.concept.lang.Object.StringBuffer;
//https://wakestand.tistory.com/245

public class Methods {
	public static void main(String[] args) {

		System.out.println("\n1 =========>");
		String s = new String("s");
		System.out.println(s);
		s = s.concat(" 붙이기");
		System.out.println(s);
		s = s + " 붙이기";
		System.out.println(s);
		// String은 불변(immutable)하기 때문에
		// 기존 것을 버리고 새로 할당하는 식으로 사용

		
		
		System.out.println("\n2 =========>");
		StringBuffer sbuffer = new StringBuffer("SB");
		System.out.println(sbuffer);
		
		sbuffer.append(" 붙이기");
		System.out.println(sbuffer);
		
		

		System.out.println("\n3 =========>");
		StringBuilder sbuilder = new StringBuilder("SB");
		System.out.println(sbuilder);
		sbuilder.append(" 붙이기");
		System.out.println(sbuilder);
		// StringBuffer, StringBuilder는 변하기(mutable)하기 때문에
		// 기존 것에서 append를 사용해서 값 변경 가능

		
		
		System.out.println("\n4 =========>");
		sbuilder.append("붙이기"); // 삽입
		System.out.println("1 : " + sbuilder);
		
		sbuilder.insert(0, "ASDASD"); // 중간에 삽입
		System.out.println("2 : " + sbuilder);
		
		sbuilder.delete(3, 7); // 자르기
		System.out.println("3 : " + sbuilder);
		
		sbuilder.indexOf("ASDB"); // index 확인
		System.out.println("4 : " + sbuilder.indexOf("ASDB"));
		
		sbuilder.substring(0, 4); // 자르기
		System.out.println("5 : " + sbuilder.substring(0, 4));
		
		sbuilder.length(); // 길이 확인
		System.out.println("6 : " + sbuilder.length());
		
		sbuilder.replace(0, 4, "CCCC"); // 글자 바꾸기(0부터 4번째 글자를 날리고 CCCC로 변경)
		System.out.println("7 : " + sbuilder);
		
		
		
		System.out.println("\n5 =========>");
		System.out.println(sbuilder);
		System.out.println(sbuilder.indexOf("붙이기붙이기"));
		System.out.println(sbuilder.substring(0, 4)); // substring 예제
		System.out.println(sbuilder.reverse()); // 순서 뒤집기
		System.out.println(sbuilder.reverse().toString()); // 순서 뒤집기
		System.out.println(sbuilder.length()); // length 예제

	}
}
