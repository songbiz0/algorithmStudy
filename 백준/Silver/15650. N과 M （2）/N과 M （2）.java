import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] arr;
    static boolean[] vis;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        vis = new boolean[N + 1];

        dfs(0, 0);
        System.out.println(sb);
    }

    static void dfs(int depth, int num) {
        if(depth == M) {
            for(int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=num + 1; i<vis.length; i++) {
            if(!vis[i]) {
                vis[i] = true;
                arr[depth] = i;
                dfs(depth + 1, i);
                vis[i] = false;
            }
        }
    }
}