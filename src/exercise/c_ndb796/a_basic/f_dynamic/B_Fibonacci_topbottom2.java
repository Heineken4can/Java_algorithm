package exercise.c_ndb796.a_basic.f_dynamic;

public class B_Fibonacci_topbottom2 {
	   // 한 번 계산된 결과를 메모이제이션(Memoization)하기 위한 배열 초기화
    public static long[] d = new long[100];

    // 피보나치 함수(Fibonacci Function)를 재귀함수로 구현 (탑다운 다이나믹 프로그래밍)
    public static long fibo(int x) {
        // 종료 조건(1 혹은 2일 때 1을 반환)
    	if (x == 1 || x == 2) {
    		return 1;
    	}
    	
    	if (d[x] != 0) {
    		return d[x];
    	}
    	
    	d[x] = fibo(x - 1) + fibo(x - 2);
    	return d[x];
    	
    	
    }

    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
}
