import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static int[] valArr;
    static int N, M;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        valArr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            valArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(valArr);

        dfs(0, 0);
        System.out.println(sb);
    }

    static void dfs(int depth, int index) {
        if(depth == M) {
            for(int i=0; i<M; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=index; i<N; i++) {
            arr[depth] = valArr[i];
            dfs(depth + 1, i);
        }
    }
}