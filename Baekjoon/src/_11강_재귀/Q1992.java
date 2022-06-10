package _11강_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1992 {
    static byte[][] video;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        video = new byte[N][N];
        for(int i=0; i<N; i++) {
            String str = br.readLine();
            for(int j=0; j<N; j++) {
                video[j][i] = Byte.parseByte(String.valueOf(str.charAt(j)));
            }
        }
        compress(0, 0, N);
        System.out.println(sb);
    }

    public static void compress(int x, int y, int size) {
        if(videoCheck(x, y, size)) {
            sb.append(video[x][y]);
        } else {
            int newSize = size / 2;
            sb.append("(");
            compress(x, y, newSize);
            compress(x + newSize, y, newSize);
            compress(x, y + newSize, newSize);
            compress(x + newSize, y + newSize, newSize);
            sb.append(")");
        }
    }

    public static boolean videoCheck(int x, int y, int size) {
        byte first = video[x][y];
        for(int i=x; i<x+size; i++) {
            for(int j=y; j<y+size; j++) {
                if(video[i][j] != first) {
                    return false;
                }
            }
        }
        return true;
    }
}
