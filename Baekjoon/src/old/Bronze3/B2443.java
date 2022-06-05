package old.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2443 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int size = N * 2 - 1;
        int blank = 0;
        for(int i=size; i>=1; i-=2) {
            for(int j=0; j<blank; j++) {
                sb.append(" ");
            }
            for(int j=0; j<i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        blank++;
        }
        System.out.println(sb);
    }
}
