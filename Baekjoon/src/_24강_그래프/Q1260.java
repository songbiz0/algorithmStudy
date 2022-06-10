package _24강_그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1260 {
    static ArrayList<ArrayList<Integer>> node;
    static boolean[] visitedD;
    static boolean[] visitedB;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        node = new ArrayList<>();
        visitedD = new boolean[N+1];
        visitedB = new boolean[N+1];
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
        sb = new StringBuilder();
        dfs(V, N);
        System.out.println(sb);
        sb = new StringBuilder();
        bfs(V, N);
        System.out.println(sb);
    }

    public static void dfs(int a, int max) {
        if(visitedD[a]) {
            return;
        }
        visitedD[a] = true;
        sb.append(a).append(" ");
        for(int i=1; i<=max; i++) {
            if(node.get(a).contains(i) && !visitedD[i]) {
                dfs(i, max);
            }
        }
    }

    public static void bfs(int a, int max) {
        if(visitedB[a]) {
            return;
        }
        visitedB[a] = true;
        Queue<Integer> q = new LinkedList<>();
        q.offer(a);
        while(!q.isEmpty()) {
            int b = q.poll();
            sb.append(b).append(" ");
            for(int i=0; i<=max; i++) {
                if(node.get(b).contains(i) && !visitedB[i]) {
                    q.offer(i);
                    visitedB[i] = true;
                }
            }
        }
    }
}
