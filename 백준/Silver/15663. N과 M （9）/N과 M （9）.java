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
    static boolean[] visited;
    static StringBuilder sb;
    static LinkedHashSet<String> answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N];
        answer = new LinkedHashSet<>();

        arr = new int[N];
        seq = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        for(int i=0; i<N; i++) {
            visited[i] = true;
            dfs(0, i);
            visited[i] = false;
        }

        sb = new StringBuilder();
        for(String str : answer) {
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }

    static void dfs(int depth, int idx) {
        seq[depth] = arr[idx];

        if(depth + 1 == M) {
            sb = new StringBuilder();
            for(int num : seq) {
                sb.append(num).append(" ");
            }
            answer.add(sb.toString());
            return;
        }

        for(int i=0; i<N; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(depth + 1, i);
                visited[i] = false;
            }
        }
    }
}
