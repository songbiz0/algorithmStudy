package old.Silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1780 {
    static int[][] paper;
    static int m1;
    static int p1;
    static int zero;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        m1 = p1 = zero = 0;
        cut(0, 0, N);
        sb.append(m1).append("\n").append(zero).append("\n").append(p1);
        System.out.println(sb);
    }

    public static void cut(int x, int y, int size) {
        int val = paper[x][y];
        boolean isSame = true;
        for(int i=x; i<x+size; i++) {
            for(int j=y; j<y+size; j++) {
                if(paper[i][j] != val) {
                    isSame = false;
                    break;
                }
            }
            if(!isSame) {
                break;
            }
        }
        if(isSame) {
            switch (val) {
                case -1:
                    m1++;
                    break;
                case 0:
                    zero++;
                    break;
                case 1:
                    p1++;
            }
        } else {
            size /= 3;
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    int nextX = x + size * i;
                    int nextY = y + size * j;
                    cut(nextX, nextY, size);
                }
            }
        }
    }
}
