package old.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2442 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int size = N * 2 - 1;
        for(int i=1; i<=size; i+=2) {
            int blank = (size - i) / 2;
            for(int j=0; j<blank; j++) {
                sb.append(" ");
            }
            for(int j=0; j<i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
