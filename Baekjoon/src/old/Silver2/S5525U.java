package old.Silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S5525U {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        char[] S = br.readLine().toCharArray();
        int[] memo = new int[M];
        int count = 0;
        for(int i=1; i<M-1; i++) {
            if(S[i] == 'O' && S[i+1] == 'I') {
                memo[i+1] = memo[i-1] + 1;
                if(memo[i+1] >= N && S[i + 1 - N * 2] == 'I') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
