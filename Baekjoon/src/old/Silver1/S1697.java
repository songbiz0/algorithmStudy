package old.Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S1697 {
    static int count;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        count = 0;
        visited = new boolean[100001];
        bfs(N, K);
        System.out.println(count);
    }

    public static void bfs(int start, int target) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        while(true) {
            int t = q.size();
            for(int i=0; i<t; i++) {
                int next = q.poll();
                if(next == target) {
                    return;
                }
                if(visited[next]) {
                    continue;
                }
                visited[next] = true;
                if(next > 0) {
                    q.offer(next - 1);
                }
                if(next < target) {
                    q.offer(next + 1);
                    if(next < 50001) {
                        q.offer(next * 2);
                    }
                }
            }
            count++;
        }
    }
}
