package _09강_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1012 {
    static int[][] field;
    static int worm;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while(T-- > 0) {
            worm = 0;
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            field = new int[M][N];
            while(K-- > 0) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                field[x][y] = 1;
            }
            for(int i=0; i<M; i++) {
                for(int j=0; j<N; j++) {
                    if(fs(i, j, M, N)) {
                        worm++;
                    }
                }
            }
            sb.append(worm).append("\n");
        }
        System.out.println(sb);
    }

    public static boolean fs(int x, int y, int maxX, int maxY) {
        if(field[x][y] != 1) {
            return false;
        }
        field[x][y] = 0;
        if(x > 0) {
            fs(x-1, y, maxX, maxY);
        }
        if(y > 0) {
            fs(x, y-1, maxX, maxY);
        }
        if(x < maxX-1) {
            fs(x + 1, y, maxX, maxY);
        }
        if(y < maxY-1) {
            fs(x, y + 1, maxX, maxY);
        }
        return true;
    }
}
