package old.Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] prime = new boolean[10001];
        prime[0] = prime[1] = true;
        for(int i=2; i<Math.sqrt(10001); i++) {
            if(prime[i]) {
                continue;
            }
            for(int j=i*i; j<prime.length; j+=i) {
                prime[j] = true;
            }
        }

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int n = Integer.parseInt(br.readLine());
            int a = n/2;
            while(true) {
                int b = n - a;
                if(!prime[a] && !prime[b]) {
                    sb.append(a).append(" ").append(b).append("\n");
                    break;
                }
                a--;
            }
        }
        System.out.println(sb);
    }
}
