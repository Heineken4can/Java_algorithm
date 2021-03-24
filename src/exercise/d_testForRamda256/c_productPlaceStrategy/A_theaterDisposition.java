package exercise.d_testForRamda256.c_productPlaceStrategy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
//https://godd.tistory.com/57

public class A_theaterDisposition {
	private static long[] D;
	private static int[] F;
	private static int[] FD;
	private static int N;
	private static int K;

	final private static int MAX = 40;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		F = new int[MAX + 1];
		FD = new int[MAX + 1];
		D = new long[MAX + 1];
		initF();
		initFD();
		initD();
		int L = K;
		int R = N - K;
		// 자유석 기준으로 왼쪽 오른쪽 분할해서 생각
		// 두가지 경우가 나오는데
		// 왼쪽에 자유석이 포함될 경우 => D[L] * F[R]
		// 오른쪽에 자유석이 포함될 경우 => D[R+1] * F[L-1]
		// 이 두가지 케이스 더해서 자유석에 아무도 앉지 않을 경우가 중복되므로 제외 => F[L-1] * F[R]

		long res = K == 1 || K == N ? D[N] : (D[L] * F[R] + D[R + 1] * F[L - 1] - F[L - 1] * F[R]);
		bw.write(String.valueOf(res));
		bw.flush();
		bw.close();
	}

	// 자유석이 없는 경우를 생각할 때
	// i 번을 지정석에 앉힐 경우의 수
	// i-1 번을 앞에 앉힐 경우의 수
	// 두 확률이 계속 더해지므로 피보나치 수열이 됨
	private static void initF() {
		F[0] = F[1] = 1;
		for (int i = 2; i <= MAX; i++) {
			F[i] = F[i - 1] + F[i - 2];
		}
	}

	private static void initFD() {
		FD[1] = 1; // FD[N] = 피보나치 N까지의 합
		for (int i = 2; i <= MAX; i++) {
			FD[i] = FD[i - 1] + F[i];
		}
	}

	private static void initD() {
		D[1] = 1;
		D[2] = 1 + 0 + 1;
		for (int i = 3; i <= MAX; i++) {
			D[i] = D[i - 1] + D[i - 2] + FD[i - 1];
		}
	}
}
