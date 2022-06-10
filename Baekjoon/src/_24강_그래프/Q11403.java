package _24강_그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q11403 {
    static int[][] nodes;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        nodes = new int[N][N];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                nodes[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0; i<N; i++) {
            search(i);
        }
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                sb.append(nodes[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
    }

    public static void search(int a) {
        boolean[] visited = new boolean[N];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<N; i++) {
            if(nodes[a][i] == 1) {
                q.offer(i);
            }
        }
        while(!q.isEmpty()) {
            int next = q.poll();
            if(visited[next]) {
                continue;
            }
            visited[next] = true;
            for(int i=0; i<N; i++) {
                if(nodes[next][i] == 1 && !visited[i]) {
                    q.offer(i);
                    nodes[a][i] = 1;
                }
            }
        }
    }
}
