package basic.concept.lang.Object.Number.Int;

public class Examples {

	//10억 표시 
	public static final int INF = (int) 1e9; // 무한을 의미하는 값으로 10억을 설정
	public static final int aa = (int) 1e9;
	
	public static void main(String[] args) {

		//System.out.println("1]  =====================>");
		System.out.println("\n1.  ============>");			
		System.out.println(INF);
		System.out.println(aa);
		
		
		//int형 숫자의 자리수 구하기
		System.out.println("\n2.  ============>");	
		int num = 3648;
		int length = (int)(Math.log10(num)+1);
		System.out.println("길이 : " + length);
	

		
	}
}
