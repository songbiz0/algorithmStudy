import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];
        boolean[][] isWall = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                int stat = Integer.parseInt(String.valueOf(str.charAt(j)));
                if(stat == 1) {
                    isWall[i][j] = true;
                }
            }
        }
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0, 0, 1});
        boolean[][][] visited = new boolean[N][M][2];
        visited[0][0][0] = true;

        boolean isFound = false;
        while(!q.isEmpty()) {
            int[] current = q.poll();
            int currentX = current[0];
            int currentY = current[1];
            int destroyed = current[2];
            int distance = current[3];

            if(currentX == N - 1 && currentY == M - 1) {
                System.out.println(distance);
                return;
            }

            for(int i=0; i<4; i++) {
                int nextX = currentX + dx[i];
                int nextY = currentY + dy[i];
                if(nextX >= 0 && nextX < N && nextY >= 0 && nextY < M) {
                    if(destroyed == 0) {
                        if(isWall[currentX][currentY] && !visited[nextX][nextY][1]) {
                            visited[nextX][nextY][1] = true;
                            q.offer(new int[]{nextX, nextY, 1, distance + 1});
                        } else if(!isWall[currentX][currentY] && !visited[nextX][nextY][0]) {
                            visited[nextX][nextY][0] = true;
                            q.offer(new int[]{nextX, nextY, 0, distance + 1});
                        }
                    } else {
                        if(!isWall[currentX][currentY] && !visited[nextX][nextY][1]) {
                            visited[nextX][nextY][1] = true;
                            q.offer(new int[]{nextX, nextY, 1, distance + 1});
                        }
                    }
                }
            }
        }
        System.out.println(-1);
    }
}