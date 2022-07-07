import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        List<int[]> items = new ArrayList<>();
        items.add(new int[]{0, 0});
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            items.add(new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
        }

        int[][] dp = new int[K+1][N+1];
        for(int i=1; i<=K; i++) {
            for(int j=1; j<=N; j++) {
                int[] item = items.get(j);
                int weight = item[0];
                int value = item[1];

                int val = 0;
                if(weight > i) {
                    val = dp[i][j-1];
                } else {
                    val = Math.max(value + dp[i-weight][j-1], dp[i][j-1]);
                }
                dp[i][j] = val;
            }
        }

        System.out.println(dp[K][N]);
    }
}