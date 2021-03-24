package exercise.d_testForRamda256.c_productPlaceStrategy;

//https://st-lab.tistory.com/137
//- 방법 4 : [BufferedReader + Bottom-Up],입력 방법만 Scanner 대신 BufferedReader 을 사용한 풀이방식이다.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.io.IOException;
import java.util.HashSet;
import java.util.StringTokenizer;

/*
테스트 예시
6
10 20 10 30 20 50
답 : 4
 */
public class B1_LIS2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] seq = new int[N];
		int[] dp = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < N; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < N; i++) {
			dp[i] = 1;

			for (int j = 0; j < i; j++) {
				if (seq[j] < seq[i] && dp[j] + 1 > dp[i]) {
					dp[i] = dp[j] + 1;
				}

			} // for j
		} // for i

		
		int max = -1;
		for (int i = 0; i < N; i++) {
			max = dp[i] > max ? dp[i] : max;
		}
		
	}

}
