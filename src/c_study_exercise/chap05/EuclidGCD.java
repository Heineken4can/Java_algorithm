package c_study_exercise.chap05;
import java.util.Scanner;


class EuclidGCD {
	
	static int gcd(int x, int y) {
		if (y == 0)
			return x;
		else 
			return gcd(y, x % y);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("최대 공약수 구하기");
		
		System.out.println("정수입력 : " ); 
		int x = stdIn.nextInt();
		System.out.println("정수입력 : ");
		int y = stdIn.nextInt();
		
		System.out.println("최대 공약수 : " + gcd(x,y));
		
		
	}
}