package old.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2446 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int size = N * 2 - 1;
        boolean check = false;
        for(int i=0; i<=size; i++) {
            int star = Math.abs(size - i * 2);
            if(star == 1) {
                if(!check) {
                    check = true;
                } else {
                    continue;
                }
            }
            int blank = (size - star) / 2;
            sb.append(" ".repeat(blank));
            sb.append("*".repeat(star));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}