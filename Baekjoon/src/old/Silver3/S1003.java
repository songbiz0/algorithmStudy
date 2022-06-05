package old.Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[] zero = new int[41];
        int[] one = new int[41];
        zero[0] = one[1] = 1;
        zero[1] = one[0] = 0;
        for(int i=2; i<41; i++) {
            zero[i] = zero[i-1] + zero[i-2];
            one[i] = one[i-1] + one[i-2];
        }
        while(T-- > 0) {
            int val = Integer.parseInt(br.readLine());
            sb.append(zero[val]).append(" ").append(one[val]).append("\n");
        }
        System.out.println(sb);
    }
}
