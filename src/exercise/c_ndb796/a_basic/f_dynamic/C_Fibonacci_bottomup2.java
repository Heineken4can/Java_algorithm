package exercise.c_ndb796.a_basic.f_dynamic;

public class C_Fibonacci_bottomup2 {
	 public static long[] d = new long[100];

	    public static void main(String[] args) {
	        // 첫 번째 피보나치 수와 두 번째 피보나치 수는 1

	    	d[1] = 1;
	    	d[2] = 2;
	    	int n = 50;
	    	
	    	for (int i = 3; i <= n; i++) {
	    		d[i] = d[i - 1] + d[i -2];
	    	}
	    	
	    	
	        System.out.println(d[n]);
	    }
}
