package old.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long A = Math.min(a, b);
        long B = Math.max(a, b);
        sb.append(A == B ? 0 : B - A - 1).append("\n");
        while(A < B - 1) {
            sb.append(++A).append(" ");
        }
        System.out.println(sb);
    }
}
