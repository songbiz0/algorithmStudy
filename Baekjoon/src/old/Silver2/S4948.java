package old.Silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class S4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        List<Integer> numbers = new ArrayList<>();
        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) {
                break;
            }
            if(n > max) {
                max = n;
            }
            numbers.add(n);
        }
        boolean[] prime = new boolean[max*2 + 1];
        prime[0] = prime[1] = true;
        for(int i=2; i<=Math.sqrt(max*2); i++) {
            if(prime[i]) {
                continue;
            }
            for(int j=i*i; j<prime.length; j+=i) {
                prime[j] = true;
            }
        }
        for(int i=0; i<numbers.size(); i++) {
            int count = 0;
            for(int j=numbers.get(i)+1; j<=numbers.get(i)*2; j++) {
                if(!prime[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
