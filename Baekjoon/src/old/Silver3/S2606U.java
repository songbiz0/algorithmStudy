package old.Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S2606U {

    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> nodes;
    static int count;
    static Queue<Integer> q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computer = Integer.parseInt(br.readLine());
        int node = Integer.parseInt(br.readLine());
        visited = new boolean[computer+1];
        nodes = new ArrayList<>();
        for(int i=0; i<=computer; i++) {
            nodes.add(new ArrayList<>());
        }
        StringTokenizer st;
        for(int i=0; i<node; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            nodes.get(a).add(b);
            nodes.get(b).add(a);
        }
        count = 0;
        q = new LinkedList<>();
        visited[1] = true;
        bfs(1);
        System.out.println(count);
    }

    public static void bfs(int a) {
        q.offer(a);
        while(!q.isEmpty()) {
            int b = q.poll();
            for (int i = 1; i < nodes.size(); i++) {
                if(nodes.get(b).contains(i) && !visited[i]) {
                    q.offer(i);
                    visited[i] = true;
                    count++;
                }
            }
        }
    }
}
