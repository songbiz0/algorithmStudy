package old.Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S16928 {
    static List<List<Integer>> nodes;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        nodes = new LinkedList<>();
        nodes.add(new LinkedList<>());
        for(int i=1; i<100; i++) {
            nodes.add(new LinkedList<>());
            for(int j=1; j<=6; j++) {
                int val = i+j;
                if(val > 100) {
                    continue;
                }
                nodes.get(i).add(val);
            }
        }
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for(int i=0; i<N+M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            nodes.set(from, new LinkedList<>());
            int startIdx = Math.max(0, from-6);
            for(int j=startIdx; j<from; j++) {
                nodes.get(j).add(to);
            }
        }
        count = 0;
        bfs();
        System.out.println(count);
    }

    public static void bfs() {
        boolean[] visited = new boolean[101];
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        while(true) {
            int t = q.size();
            for(int i=0; i<t; i++) {
                int next = q.poll();
                if(visited[next]) {
                    continue;
                }
                if(next == 100) {
                    return;
                }
                visited[next] = true;
                for(int a : nodes.get(next)) {
                    if(!visited[a]) {
                        q.offer(a);
                    }
                }
            }
            count++;
        }
    }
}
