package old.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int a = 2;
        while(N != 1) {
            if(N % a == 0) {
                sb.append(a).append("\n");
                N = N / a;
            } else {
                a++;
            }
        }
        System.out.println(sb);
    }
}
