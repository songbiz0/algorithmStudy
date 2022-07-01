import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {

    static int[] arr;
    static int[] seq;
    static int N, M;
    static StringBuilder sb;
    static LinkedHashSet<String> answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        answer = new LinkedHashSet<>();

        arr = new int[N];
        seq = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        dfs(0);

        sb = new StringBuilder();
        for (String str : answer) {
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }

    static void dfs(int depth) {
        if (depth == M) {
            sb = new StringBuilder();
            for (int num : seq) {
                sb.append(num).append(" ");
            }
            answer.add(sb.toString());
            return;
        }

        for (int i = 0; i < N; i++) {
            if(depth > 0 && arr[i] < seq[depth-1]) {
                continue;
            }

            seq[depth] = arr[i];
            dfs(depth + 1);
        }
    }
}
