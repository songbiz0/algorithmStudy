package class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Q15654 {
    static int[] arr;
    static List<Integer> list;
    static boolean[] vis;
    static int N;
    static int M;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        list.sort(Comparator.comparingInt(o -> o));
        vis = new boolean[N];

        dfs(0);
        System.out.println(sb);
    }

    static void dfs(int depth) {
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
                arr[depth] = list.get(i);
                dfs(depth + 1);
                vis[i] = false;
            }
        }
    }
}
