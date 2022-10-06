import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        sb = new StringBuilder();

        for(int i=1; i<=N; i++) {
            dfs(1, i, new int[M]);
        }
        System.out.println(sb);
    }

    public static void dfs(int depth, int val, int[] arr) {
        arr[depth - 1] = val;

        if(depth == M) {
            for(int val2 : arr) {
                sb.append(val2).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=1; i<=N; i++) {
            dfs(depth + 1, i, arr);
        }
    }
}
