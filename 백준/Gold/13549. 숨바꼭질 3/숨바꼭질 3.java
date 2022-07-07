import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int minTime;
    static boolean[] visited;
    static int N, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        minTime = Integer.MAX_VALUE;
        visited = new boolean[100001];

        bfs();
        System.out.println(minTime);
    }

    static void bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{N, 0});
        while(!q.isEmpty()) {
            int[] arr = q.poll();
            int idx = arr[0];
            int time = arr[1];
            visited[idx] = true;
            if(idx == K) {
                minTime = Math.min(minTime, time);
            }

            if(idx * 2 <= 100000 && !visited[idx*2]) {
                q.offer(new int[]{idx * 2, time});
            }
            if(idx + 1 <= 100000 && !visited[idx+1]) {
                q.offer(new int[]{idx + 1, time + 1});
            }
            if(idx > 0 && !visited[idx-1]) {
                q.offer(new int[]{idx - 1, time + 1});
            }
        }
    }
}