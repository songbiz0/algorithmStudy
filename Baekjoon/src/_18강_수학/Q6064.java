package _18강_수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6064 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            boolean isFound = false;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            int t = gcd(M, N);
            for(int i=x; i<=t; i+=M) {
                if(i % N == y) {
                    sb.append(i + 1 + "\n");
                    isFound = true;
                    break;
                }
            }
            if(!isFound) {
                sb.append("-1\n");
            }
        }
        System.out.println(sb.toString().trim());
    }

    public static int gcd(int a, int b) {
        int A = a;
        int B = b;
        while(B != 0) {
            int r = A % B;
            A = B;
            B = r;
        }
        return a * b / A;
    }
}
