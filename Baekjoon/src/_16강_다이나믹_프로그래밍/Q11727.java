package _16강_다이나믹_프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11727 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] dp = new long[1001];
        dp[1] = 1;
        dp[2] = 3;
        for(int i=3; i<dp.length; i++) {
            dp[i] = (dp[i-1] + dp[i-2]*2) % 10007;
        }
        System.out.println(dp[Integer.parseInt(br.readLine())]);
    }
}
