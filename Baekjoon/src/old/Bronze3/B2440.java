package old.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine()) + 1;
        while(N-- > 0) {
            int n = N;
            while(n-- > 0) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
