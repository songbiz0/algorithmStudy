package old.Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S15650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        for(int i=1; i<=M; i++) {
            arr[i] = new int[N];
            for(int j=1; j<=N; j++) {
                arr[i][j] = j;
            }
        }

        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    static void bt(int num) {

    }
}
