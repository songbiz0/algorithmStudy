package _09강_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10026 {
    static boolean[][] vis;
    static char[][] paint;
    static byte[] dx = {0, -1, 0, +1};
    static byte[] dy = {-1, 0, +1, 0};
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        paint = new char[N][N];
        for(int i=0; i<N; i++) {
            paint[i] = br.readLine().toCharArray();
        }
        vis = new boolean[N][N];

        int count = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(!vis[i][j]) {
                    dfs(i, j, paint[i][j]);
                    count++;
                }
            }
        }
        sb.append(count).append(" ");

        vis = new boolean[N][N];
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(paint[i][j] == 'R') {
                    paint[i][j] = 'G';
                }
            }
        }

        count = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(!vis[i][j]) {
                    dfs(i, j, paint[i][j]);
                    count++;
                }
            }
        }
        sb.append(count);
        System.out.println(sb);
    }

    public static void dfs(int x, int y, char color) {
        if(paint[x][y] != color) {
            return;
        }
        vis[x][y] = true;
        for(int i=0; i<4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(newX < 0 || newY < 0 || newX >= N || newY >= N || vis[newX][newY]) {
                continue;
            }
            dfs(newX, newY, color);
        }
    }
}
