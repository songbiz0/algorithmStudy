package old.Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1074 {
    static int[][] array;
    static int count;
    static long result;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int powN = (int)Math.pow(2, N);
        array = new int[powN][powN];
        count = 0;
        result = 0;
        z(0, 0, powN);
        System.out.println(result);
    }

    public static void z(int x, int y, int size) {
        if(size > 0) {
            long last = (long) Math.pow(4, N - 1);
            size /= 2;
            N--;
            int newX;
            int newY;
            if (x < size && y < size) {
                //2사분면
                newX = x;
                newY = y;
            } else if (x < size) {
                //1사분면;
                result += last;
                newX = x;
                newY = y - size;
            } else if (y < size) {
                //3사분면
                result += last * 2;
                newX = x - size;
                newY = y;
            } else {
                //4사분면
                result += last * 3;
                newX = x - size;
                newY = y - size;
            }
            System.out.println(last);
            z(newX, newY, size);
        }
    }
}
