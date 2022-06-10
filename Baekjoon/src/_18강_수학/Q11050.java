package _18강_수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(binom(a, b));
    }

    public static int binom(int a, int b) {
        if(b == 0 || b == a) {
            return 1;
        }
        return binom(a-1, b) + binom(a-1, b-1);
    }
}
