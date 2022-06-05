package old.Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S15649 {
    static boolean[] vis;
    static int[] arr;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        vis = new boolean[N];
        dfs(N, M, 0);
        System.out.println(sb);
    }

    static void dfs(int N, int M, int depth) {
        if(depth == M) {
            for(int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=0; i<N; i++) {
            if(!vis[i]) {
                vis[i] = true;
                arr[depth] = i + 1;
                dfs(N, M, depth + 1);
                vis[i] = false;
            }
        }
    }
}
