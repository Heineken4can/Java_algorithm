package exercise.d_testForRamda256.c_productPlaceStrategy;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

//https://andonekwon.tistory.com/27



public class B2_soldierDeploy {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] soldiers =new int[N];
        int[] dp = new int[N+1];

        Arrays.fill(dp,1);
        String temp = br.readLine();
        StringTokenizer st = new StringTokenizer(temp);
        int k = 0;
        while (st.hasMoreTokens()){
            soldiers[k++]=Integer.parseInt(st.nextToken());
        }

        for(int i=1;i<N;i++){
            for(int j=0;j<=i;j++){
                if(soldiers[i]<soldiers[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int max = 0;
        Arrays.sort(dp);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString(N-dp[N]));
        bw.flush();
        bw.close();
    }
}
