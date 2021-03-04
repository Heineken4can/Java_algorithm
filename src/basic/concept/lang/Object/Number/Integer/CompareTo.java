package basic.concept.lang.Object.Number.Integer;
//출처: https://mine-it-record.tistory.com/133 [나만의 기록들]

public class CompareTo {
	public static void main(String... args) {
		
		
		
		// 1. 문자열 비교
		System.out.println("1]  =====================>");
        String str = "abcd";

        // 1) 비교대상에 문자열이 포함되어있을 경우
        System.out.println("\n1 =========>");
        System.out.println( str.compareTo("abcd") ); // 0 (같은 경우는 숫자나 문자나 0을 리턴)
        System.out.println( str.compareTo("ab") );   // 2,"abcd" 에 "ab" 가 포함되어있으면 즉, 기준값에 비교대상이 포함되어있을 경우서로의 '문자열 길이의 차이값'을 리턴
        System.out.println( str.compareTo("a") );  	 // 3
        
        System.out.println( str.compareTo("c") );    
        // -2,comparTo는 같은 위치의 문자만 비교하기 때문에 맨 앞에서 틀렸기 때문에 바로 아스키값으로 비교처리를 한다.       
        //이둘의 아스키코드의 차이값은 a = 97 / c = 99 이기 때문에 순서에 따라 -2값이 리턴되

        System.out.println( "".compareTo(str) );     // -4 

        // 2) 비교대상과 전혀 다른 문자열인 경우
        System.out.println("\n2 =========>");
        System.out.println( str.compareTo("zefd") );  // -25, a = 97 / z = 122 
        System.out.println( str.compareTo("zEFd") );  // -25
        System.out.println( str.compareTo("ABCD") );  //  32, a = 97 / A = 65,  compareTo의 경우 대소문자를 구분


        // 2. 숫자형 비교
        System.out.println("\n\n2]  =====================>");
        
        System.out.println("\n1 =========>");
        Integer x = 3;
        Integer y = 4;
        Double z = 1.0;

        System.out.println( x.compareTo(y) );  // -1
        System.out.println( x.compareTo(3) );  //  0
        System.out.println( x.compareTo(2) );  //  1
        System.out.println( z.compareTo(2.7) );  //  -1

        
		//[ 기준값.compareTo( 비교대상 ) ],  int 로 선언하고 비교하는 방법
        System.out.println("\n2 =========>");
        int x2 = 4;  int y2 = 5;
        System.out.println(Integer.compare(x2,y2));
        System.out.println(Integer.compare(x2,4));
        System.out.println(Integer.compare(x2,3));
        System.out.println(Integer.compare(x2,2));
        
        
        // 3. 숫자 비교
        System.out.println("\n3 =========>");
        Integer x3 = 3;
        Integer y3 = 3;
        Integer z3 = 1;
        
        System.out.println(x3.compareTo(1));     
        System.out.println(Integer.compare(x3,y3)); //같아야 0
        System.out.println(Integer.compare(x3,z3));
        System.out.println(x3.compareTo(y3)); 
        System.out.println(x3.compareTo(z3)); 
        System.out.println(z3.compareTo(x3));//빼기를 하는구나 
        //*사실상 그냥 빼기,//*int 안됨. Integer 같은 자료형만 가능.
	
	
	}//main
}
