package old.Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S2178 {
    static int[][] maze;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        maze = new int[N][M];
        visited = new boolean[N][M];
        for(int i=0; i<N; i++) {
            String str = br.readLine();
            for(int j=0; j<M; j++) {
                maze[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }
        bfs(N, M);
        System.out.println(maze[N-1][M-1]);
    }

    public static void bfs(int N, int M) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        while(true) {
            int[] now = q.poll();
            int x = now[0];
            int y = now[1];
            if(visited[x][y]) {
                continue;
            }
            visited[x][y] = true;
            if(x == N-1 && y == M-1) {
                return;
            }
            visited[x][y] = true;
            if(x > 0 && !visited[x-1][y] && maze[x-1][y] > 0) {
                maze[x-1][y] = maze[x][y] + 1;
                q.offer(new int[]{x-1, y});
            }
            if(y > 0 && !visited[x][y-1] && maze[x][y-1] > 0) {
                maze[x][y-1] = maze[x][y] + 1;
                q.offer(new int[]{x, y-1});
            }
            if(x+1 < N && !visited[x+1][y] && maze[x+1][y] > 0) {
                maze[x+1][y] = maze[x][y] + 1;
                q.offer(new int[]{x+1, y});
            }
            if(y+1 < M && !visited[x][y+1] && maze[x][y+1] > 0) {
                maze[x][y+1] = maze[x][y] + 1;
                q.offer(new int[]{x, y+1});
            }
        }
    }
}
