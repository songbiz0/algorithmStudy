package old.Silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S11724 {
    static ArrayList<ArrayList<Integer>> node;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        node = new ArrayList<>();
        visited = new boolean[N+1];
        for(int i=0; i<=N; i++) {
            node.add(new ArrayList<>());
        }
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            node.get(a).add(b);
            node.get(b).add(a);
        }
        int count = 0;
        for(int i=1; i<=N; i++) {
            if(!visited[i]) {
                dfs(i, N);
                count++;
            }
        }
        System.out.println(count);
    }

    public static void dfs(int a, int N) {
        visited[a] = true;
        for(int i=1; i<=N; i++) {
            if(node.get(a).contains(i) && !visited[i]) {
                dfs(i, N);
            }
        }
    }
}
