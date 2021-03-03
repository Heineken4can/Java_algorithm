package basic.concept.lang.Object.String;

public class StringToInt2 {

	public static void main(String[] args) {

		// 1]  문자 -> 숫자 
		System.out.println("1]  문자 -> 숫자  ============================>");
		//1. String to Int
		System.out.println("\n1. String to Int ============>");
		String s_num = "10";
		int i_num = Integer.parseInt(s_num); // String -> Int 1번방식
		int i_num2 = Integer.valueOf(s_num); // String -> Int 2번방식
		System.out.println(s_num);
		System.out.println(i_num);
		System.out.println(i_num2);

		
		// 2. String to Double, Float
		System.out.println("\n2. String to Double, Float ============>");
		String s_num2 = "12";
		double d_num2 = Double.valueOf(s_num2); // String -> Double
		float f_num2 = Float.valueOf(s_num2); // String -> Float
		System.out.println(s_num2);
		System.out.println(d_num2);
		System.out.println(f_num2);
		
		
		
		// 3. String to Long, Short 
		System.out.println("\n3. String to Long, Short  ============>");
		String s_num3 = "13";
		long l_num3 = Long.parseLong(s_num3); //String -> Long
		short sh_num3 = Short.parseShort(s_num3); //String -> Short
		System.out.println(s_num3);
		System.out.println(l_num3);
		System.out.println(sh_num3);
		
	
		
		//2]   숫자 -> 문자
		System.out.println("\n\n2]   숫자 -> 문자   ============================>");
		
		// 1. Int to String
		System.out.println("\n1. Int to String  ============>");
		int i_num21 = 21;
		String s_num21 = String.valueOf(i_num21); //문자 -> 숫자 1번방식
		String s_num211 = Integer.toString(i_num21); //문자 -> 숫자 2번방식
		String s_num2111 = ""+i_num21; //문자 -> 숫자 3번방식
		System.out.println(i_num21);
		System.out.println(s_num21);
		System.out.println(s_num211);
		System.out.println(s_num2111);
		
		
		// 2. Double Float to String
		System.out.println("\n2. Double Float to String  ============>");
		float f_num = (float)10.10;
		double d_num = 10.10;		

		String s_num22 = String.valueOf(f_num); //Float -> String 1번방식
		String s_num222 = Float.toString(f_num); //Float -> String 2번방식
				
		String s_num2222 = String.valueOf(d_num); //Double -> String 1번방식
		String s_num22222 = Double.toString(d_num); //Double -> String 2번방식
		System.out.println(s_num22);
		System.out.println(s_num222);
		System.out.println(s_num2222);
		System.out.println(s_num22222);
		
		
		
		
		// 3]  정수 <--> 실수
		System.out.println("\n\n3]  정수 <--> 실수   ============================>");
		
		// 1. Double,Float to Int
		System.out.println("\n1. Double,Float to Int  ============>");
		//(int)실수값
		double d_num31 = 10.101010;
		float f_num31 = (float)10.1010;

		int i_num31 = (int)d_num31; //Double-> Int, (Int)캐스팅 방식으로 변환시킬 수 있는데 이때 실수형의 소수점아래자리는 버려집니다.
		int i_num311 = (int)f_num31; //Float -> Int
		System.out.println(d_num31);
		System.out.println(f_num31);
		System.out.println(i_num31);
		System.out.println(i_num311);

		

		// 2. Int to Double,Float
		System.out.println("\n2. Int to Double,Float  ============>");
		//(int)실수값
		int i_num32 = 10;
			
		double d_num32 = (double)i_num32; //Int -> Double
		float f_num322 = (float)i_num32; //Int -> Float
		System.out.println(i_num32);
		System.out.println(d_num32);
		System.out.println(f_num322);
		
		
		
	}
}
