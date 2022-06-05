package old.Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = 665;

        while(N != 0) {
            ans++;
            if(String.valueOf(ans).contains("666")) {
                N--;
            }
        }

        System.out.println(ans);
    }
}
