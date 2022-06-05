package old.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int oddSum = 0;
        int oddMin = Integer.MAX_VALUE;
        int t = 7;
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if(n % 2 != 0) {
                oddSum += n;
                oddMin = Math.min(oddMin, n);
            }
        }
        if(oddSum == 0) {
            System.out.println(-1);
            return;
        }
        sb.append(oddSum).append("\n").append(oddMin);
        System.out.println(sb);
    }
}
