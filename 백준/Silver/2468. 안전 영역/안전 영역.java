import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = new int[]{-1, 0, 1, 0};
    static int[] dy = new int[]{0, -1, 0, 1};
    static int[][] map;
    static boolean[][] visited;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                int height = Integer.parseInt(st.nextToken());
                map[i][j] = height;
                min = Math.min(min, height);
                max = Math.max(max, height);
            }
        }

        int result = 1;
        for(int i=min; i<=max; i++) {
            int count = 0;
            visited = new boolean[N][N];
            for(int j=0; j<N; j++) {
                for(int k=0; k<N; k++) {
                    if(visited[j][k] || map[j][k] <= i) {
                        continue;
                    }

                    dfs(i, j, k);
                    count++;
                }
            }
            result = Math.max(result, count);
        }

        System.out.println(result);
    }

    static void dfs(int depth, int x, int y) {
        visited[x][y] = true;
        for(int i=0; i<4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if(nextX >= 0 && nextX < N && nextY >= 0 && nextY < N && map[nextX][nextY] > depth && !visited[nextX][nextY]) {
                dfs(depth, nextX, nextY);
            }
        }
    }
}
