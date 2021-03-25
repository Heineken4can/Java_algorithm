package exercise.d_testForRamda256.c_productPlaceStrategy;
//https://blog.naver.com/occidere/220854811310

import java.util.Scanner;

public class A_theaterDisposition2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, t, n = sc.nextInt(), m = sc.nextInt(), cur = 0, ans = 1;
		int []d = new int[n+1]; fib(d, n);
		for(i=0;i<m;i++){
			t = sc.nextInt();
			ans*=d[t - cur - 1];
			cur = t;
		}
		ans*=d[n-cur];
		System.out.print(ans);
		sc.close();
	}
	private static void fib(int []d, int n){
		d[0] = 1; d[1] = 1;
		for(int i=2;i<=n;i++) d[i] = d[i-1]+d[i-2];
	}
}
