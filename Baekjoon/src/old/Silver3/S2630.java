package old.Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2630 {
    static int white;
    static int blue;
    static int[][] paper;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];
        StringTokenizer st;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        divide(0, 0, N);
        System.out.println(white + "\n" + blue);
    }

    public static void divide(int startX, int startY, int end) {
        if(check(startX, startY, end)) {
            if(paper[startX][startY] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }
        int newEnd = end/2;
        divide(startX, startY, newEnd);
        divide(startX + newEnd, startY, newEnd);
        divide(startX, startY + newEnd, newEnd);
        divide(startX + newEnd, startY + newEnd, newEnd);
    }

    public static boolean check(int X, int Y, int end) {
        int color = paper[X][Y];
        for(int i=X; i<X+end; i++) {
            for(int j=Y; j<Y+end; j++) {
                if(paper[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}
