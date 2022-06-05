package old.Gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class G16236 {
    static int[][] sharks;
    static boolean[][] vis;
    static byte[] dx = {0, -1, 1, 0};
    static byte[] dy = {-1, 0, 0, 1};
    static int N;
    static int y;
    static int x;
    static int size;
    static int[][] count;
    static int eat;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        sharks = new int[N][N];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                int val = Integer.parseInt(st.nextToken());
                if(val == 9) {
                    y = i;
                    x = j;
                }
                sharks[i][j] = val;
            }
        }
        size = 2;
        int time = 0;
        eat = 0;
        while(true) {
            int result = bfs(y, x);
            if(result == -1) {
                break;
            }
            time += result;
        }
        System.out.println(time);
    }

    public static int bfs(int yy, int xx) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{yy, xx});
        vis = new boolean[N][N];
        vis[yy][xx] = true;
        count = new int[N][N];
        int minY = Integer.MAX_VALUE;
        int minX = Integer.MAX_VALUE;
        int minDistance = Integer.MAX_VALUE;
        while(!q.isEmpty()) {
            int[] now = q.poll();
            int nowY = now[0];
            int nowX = now[1];
            if(sharks[nowY][nowX] != 0 && sharks[nowY][nowX] < size) {
                if(count[nowY][nowX] < minDistance) {
                    minDistance = count[nowY][nowX];
                    minY = nowY;
                    minX = nowX;
                } else if(count[nowY][nowX] == minDistance && nowY < minY) {
                    minY = nowY;
                    minX = nowX;
                } else if(count[nowY][nowX] == minDistance && nowY == minY && nowX < minX) {
                    minX = nowX;
                }
            }
            for(int i=0; i<4; i++) {
                int nextY = nowY + dy[i];
                int nextX = nowX + dx[i];
                if(nextY < 0 || nextX < 0 || nextY >= N || nextX >= N || sharks[nextY][nextX] > size || vis[nextY][nextX]) {
                    continue;
                }
                vis[nextY][nextX] = true;
                int[] next = {nextY, nextX};
                count[nextY][nextX] = count[nowY][nowX] + 1;
                q.offer(next);
            }
        }
        if(minDistance == Integer.MAX_VALUE) {
            return -1;
        }
        sharks[minY][minX] = 9;
        sharks[yy][xx] = 0;
        eat++;
        y = minY;
        x = minX;
        if(eat >= size) {
            size++;
            eat = 0;
        }
        return minDistance;
    }
}
