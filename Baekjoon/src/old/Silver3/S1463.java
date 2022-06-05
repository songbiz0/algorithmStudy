package old.Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        dp[1] = 0;
        for(int i=2; i<dp.length; i++) {
            int count = Integer.MAX_VALUE;
            if(i % 3 == 0) {
                count = Math.min(count, dp[i/3]+1);
            }
            if(i % 2 == 0) {
                count = Math.min(count, dp[i/2]+1);
            }
            count = Math.min(count, dp[i-1]+1);
            dp[i] = count;
        }
        System.out.println(dp[N]);
    }
}
