package old.Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] scores = new int[n];
        for(int i=0; i<n; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }
        int[] oneStep = new int[n];
        int[] twoStep = new int[n];
        oneStep[0] = twoStep[0] = scores[0];
        if(n > 1) {
            oneStep[1] = scores[0] + scores[1];
            twoStep[1] = scores[1];
        }
        for(int i=2; i<n; i++) {
            oneStep[i] = twoStep[i-1] + scores[i];
            twoStep[i] = Math.max(oneStep[i-2], twoStep[i-2]) + scores[i];
        }
        System.out.println(Math.max(oneStep[n-1], twoStep[n-1]));
    }
}
