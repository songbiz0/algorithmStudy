package _16강_다이나믹_프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[] n = new int[T];
        int[] dp = new int[12];
        for(int i=0; i<T; i++) {
            n[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i=4; i<dp.length; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        for(int a : n) {
            sb.append(dp[a]).append("\n");
        }
        System.out.println(sb);
    }
}
