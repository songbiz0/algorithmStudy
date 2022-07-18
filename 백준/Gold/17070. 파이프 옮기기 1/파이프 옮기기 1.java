import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] map;
    static int n;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        answer = 0;
        dfs(0, 1, 0);
        System.out.println(answer);
    }

    static void dfs(int x, int y, int way) {
        if(x == n - 1 && y == n - 1) {
            answer++;
            return;
        }

        switch (way) {
            case 0:
                if(isIn(x, y+1) && map[x][y+1] != 1) {
                    dfs(x, y+1, 0);
                }
                if(isIn(x+1, y+1) && map[x+1][y+1] != 1 && map[x][y+1] != 1 && map[x+1][y] != 1) {
                    dfs(x+1, y+1, 1);
                }
                break;
            case 1:
                if(isIn(x, y+1) && map[x][y+1] != 1) {
                    dfs(x, y+1, 0);
                }
                if(isIn(x+1, y+1) && map[x+1][y+1] != 1 && map[x][y+1] != 1 && map[x+1][y] != 1) {
                    dfs(x+1, y+1, 1);
                }
                if(isIn(x+1, y) && map[x+1][y] != 1) {
                    dfs(x+1, y, 2);
                }
                break;
            case 2:
                if(isIn(x+1, y+1) && map[x+1][y+1] != 1 && map[x][y+1] != 1 && map[x+1][y] != 1) {
                    dfs(x+1, y+1, 1);
                }
                if(isIn(x+1, y) && map[x+1][y] != 1) {
                    dfs(x+1, y, 2);
                }
        }
    }

    static boolean isIn(int x, int y) {
        return x >= 0 && y >= 0 && x < n && y < n;
    }
}