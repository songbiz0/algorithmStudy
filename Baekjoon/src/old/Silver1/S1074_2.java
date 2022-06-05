package old.Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1074_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        long result = z(c, r, N);
        System.out.println(result);
    }

    public static long z(int x, int y, int N) {
        int length = (int)Math.pow(2, N);
        if(length < 2) {
            return 0;
        }
        long difference = (long)Math.pow(4, N-1);
        int half = length / 2;
        long result;
        if(x < half && y < half) {
            result = 0;
        } else if(y < half) {
            result = difference;
            x -= half;
        } else if(x < half) {
            result = difference * 2;
            y -= half;
        } else {
            result = difference * 3;
            x -= half;
            y -= half;
        }
        return z(x, y, N-1) + result;
    }
}
