import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] map;
    static int N, M;
    static int[] dx, dy;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dx = new int[]{-1, 0, 1, 0};
        dy = new int[]{0, -1, 0, 1};
        max = 0;

        buildWall(0);
        System.out.println(max);
    }

    static void buildWall(int depth) {
        if(depth == 3) {
            spreadVirus();
            return;
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(map[i][j] == 0) {
                    map[i][j] = 1;
                    buildWall(depth + 1);
                    map[i][j] = 0;
                }
            }
        }
    }

    static void spreadVirus() {
        int[][] tempMap = new int[N][M];
        for(int i=0; i<N; i++) {
            tempMap[i] = map[i].clone();
        }

        Queue<int[]> q = new LinkedList<>();
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(tempMap[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }
            }
        }

        while(!q.isEmpty()) {
            int[] virus = q.poll();
            for(int i=0; i<4; i++) {
                int virusX = virus[0] + dx[i];
                int virusY = virus[1] + dy[i];

                if(virusX >= 0 && virusY >= 0 && virusX < N && virusY < M && tempMap[virusX][virusY] == 0) {
                    tempMap[virusX][virusY] = 2;
                    q.offer(new int[]{virusX, virusY});
                }
            }
        }

        safeCount(tempMap);
    }

    static void safeCount(int[][] tempMap) {
        int count = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(tempMap[i][j] == 0) {
                    count++;
                }
            }
        }
        max = Math.max(max, count);
    }
}