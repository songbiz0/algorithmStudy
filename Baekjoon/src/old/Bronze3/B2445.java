package old.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int size = N * 2;
        for(int i=1; i<=N; i++) {
            sb.append("*".repeat(i));
            sb.append(" ".repeat(size - i * 2));
            sb.append("*".repeat(i));
            sb.append("\n");
        }
        for(int i=N-1; i>=1; i--) {
            sb.append("*".repeat(i));
            sb.append(" ".repeat(size - i * 2));
            sb.append("*".repeat(i));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
