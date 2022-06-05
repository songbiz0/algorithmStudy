package old.Silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] coins = new int[N];
        for(int i=0; i<N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        for(int i=coins.length-1; i>=0; i--) {
            if(K >= coins[i]) {
                count += K / coins[i];
                K %= coins[i];
                if(K == 0) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
