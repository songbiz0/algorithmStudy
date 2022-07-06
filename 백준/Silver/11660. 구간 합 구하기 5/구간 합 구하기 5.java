import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] table = new int[N][N];
        for(int i=0; i<N; i++) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            table[i] = arr;
        }

        int[][] dp = new int[N][N];

        dp[0][0] = table[0][0];
        for(int i=1; i<N; i++) {
            dp[0][i] = dp[0][i-1] + table[0][i];
            dp[i][0] = dp[i-1][0] + table[i][0];
        }

        for(int i=1; i<N; i++) {
            for(int j=1; j<N; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + table[i][j];
            }
        }

        while(M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()) - 1;
            int y1 = Integer.parseInt(st.nextToken()) - 1;
            int x2 = Integer.parseInt(st.nextToken()) - 1;
            int y2 = Integer.parseInt(st.nextToken()) - 1;

            int sum = dp[x2][y2] - (x1 > 0 ? dp[x1-1][y2] : 0) -  (y1 > 0 ? dp[x2][y1-1] : 0) + (x1 > 0 && y1 > 0 ? dp[x1-1][y1-1] : 0);
            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}