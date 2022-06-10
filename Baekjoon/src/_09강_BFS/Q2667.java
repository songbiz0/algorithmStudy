package _09강_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2667 {
    static byte[][] apart;
    static boolean[][] visited;
    static int[] dx;
    static int[] dy;
    static int N;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        apart = new byte[N][N];
        visited = new boolean[N][N];
        dx = new int[]{-1, 0, +1, 0};
        dy = new int[]{0, -1, 0, +1};
        for(int i=0; i<N; i++) {
            String str = br.readLine();
            for(int j=0; j<N; j++) {
                apart[i][j] = Byte.parseByte(String.valueOf(str.charAt(j)));
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(apart[i][j] == 1 && !visited[i][j]) {
                    count = 0;
                    dfs(new int[]{i, j});
                    list.add(count);
                }
            }
        }
        Collections.sort(list);
        sb.append(list.size() + "\n");
        for(int a : list) {
            sb.append(a + "\n");
        }
        System.out.println(sb);
    }

    public static void dfs(int[] start) {
        int x = start[0];
        int y = start[1];
        if(visited[x][y]) {
            return;
        }
        visited[x][y] = true;
        count++;
        for(int i=0; i<4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if(newX < 0 || newX >= N || newY < 0 || newY >= N || visited[newX][newY] || apart[newX][newY] == 0) {
                continue;
            }
            dfs(new int[]{newX, newY});
        }
    }
}
