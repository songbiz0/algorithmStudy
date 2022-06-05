package old.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int size = 2 * N - 1;
        int blank = N - 1;
        for(int i=1; i<=size; i+=2) {
            sb.append(" ".repeat(blank));
            sb.append("*".repeat(i));
            sb.append("\n");
            blank--;
        }
        blank = 1;
        for(int i=size-2; i>=1; i-=2) {
            sb.append(" ".repeat(blank));
            sb.append("*".repeat(i));
            sb.append("\n");
            blank++;
        }
        System.out.println(sb);
    }
}
