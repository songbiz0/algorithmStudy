package old.Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S7569 {
    static int[][][] tomato;
    static boolean[][][] visited;
    static byte[] dx = new byte[] {1, 0, 0, -1, 0, 0};
    static byte[] dy = new byte[] {0, 1, 0, 0, -1, 0};
    static byte[] dz = new byte[] {0, 0, 1, 0, 0, -1};
    static int M;
    static int N;
    static int H;
    static int day;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        tomato = new int[H][N][M];
        visited = new boolean[H][N][M];
        for(int i=0; i<H; i++) {
            for(int j=0; j<N; j++) {
                st = new StringTokenizer(br.readLine());
                for(int k=0; k<M; k++) {
                    tomato[i][j][k] = Integer.parseInt(st.nextToken());
                }
            }
        }
        day = 0;
        List<int[]> list = new ArrayList<>();
        for(int i=0; i<H; i++) {
            for(int j=0; j<N; j++) {
                for(int k=0; k<M; k++) {
                    if(tomato[i][j][k] > 0 && !visited[i][j][k]) {
                        list.add(new int[]{k, j, i});
                    }
                }
            }
        }
        ripen(list);
        System.out.println(check() ? day : -1);
    }

    public static void ripen(List<int[]> list) {
        Queue<int[]> q = new LinkedList<>();
        for(int[] arr : list) {
            q.offer(arr);
        }
        while(!q.isEmpty()) {
            int[] next = q.poll();
            if(visited[next[2]][next[1]][next[0]]) {
                continue;
            }
            visited[next[2]][next[1]][next[0]] = true;
            for(int i=0; i<6; i++) {
                int newX = next[0] + dx[i];
                int newY = next[1] + dy[i];
                int newZ = next[2] + dz[i];
                if(newX < 0 || newY < 0 || newZ < 0 || newX >= M || newY >= N || newZ >= H) {
                    continue;
                } else if(visited[newZ][newY][newX] || tomato[newZ][newY][newX] != 0) {
                    continue;
                }
                tomato[newZ][newY][newX] = tomato[next[2]][next[1]][next[0]] + 1;
                q.offer(new int[]{newX, newY, newZ});
                day = Math.max(day, tomato[newZ][newY][newX] - 1);
            }
        }
    }

    public static boolean check() {
        for(int i=0; i<H; i++) {
            for(int j=0; j<N; j++) {
                for(int k=0; k<M; k++) {
                    if(tomato[i][j][k] == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
