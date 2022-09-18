import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = new int[]{-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = new int[]{-1, 0, 1, -1, 1, -1, 0, 1};
    static int[][] map;
    static int w;
    static int h;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) {
                System.out.println(sb);
                return;
            }

            map = new int[h][w];
            for(int i=0; i<h; i++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                for(int j=0; j<w; j++) {
                    map[i][j] = Integer.parseInt(st2.nextToken());
                }
            }

            int count = 0;

            for(int i=0; i<h; i++) {
                for(int j=0; j<w; j++) {
                    if(map[i][j] == 0) {
                        continue;
                    }
                    dfs(i, j);
                    count++;
                }
            }

            sb.append(count).append("\n");
        }
    }

    static void dfs(int n1, int n2) {
        map[n1][n2] = 0;
        for(int i=0; i<8; i++) {
            int nextN1 = n1 + dx[i];
            int nextN2 = n2 + dy[i];
            if(nextN1 >= 0 && nextN1 < h && nextN2 >= 0 && nextN2 < w && map[nextN1][nextN2] == 1) {
                dfs(nextN1, nextN2);
            }
        }
    }
}
