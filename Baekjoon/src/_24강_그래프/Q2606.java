package _24강_그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2606 {

    static boolean[] visited;
    static int[][] nodes;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computer = Integer.parseInt(br.readLine());
        int node = Integer.parseInt(br.readLine());
        visited = new boolean[computer+1];
        nodes = new int[computer+1][computer+1];
        StringTokenizer st;
        for(int i=0; i<node; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            nodes[a][b] = 1;
            nodes[b][a] = 1;
        }
        count = 0;
        dfs(1);
        System.out.println(count);
    }

    public static void dfs(int a) {
        visited[a] = true;
        for(int i=1; i<nodes.length; i++) {
            if(nodes[a][i] == 1 && !visited[i]) {
                count++;
                dfs(i);
            }
        }
    }
}
