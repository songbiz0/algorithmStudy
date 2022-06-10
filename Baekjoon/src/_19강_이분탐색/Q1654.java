package _19강_이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] lan = new int[K];
        long max = 0;
        for(int i=0; i<K; i++) {
            int val = Integer.parseInt(br.readLine());
            lan[i] = val;
            if(val>max) {
                max = val;
            }
        }
        max ++;
        long min = 0;
        while(min < max) {
            long mid = (min + max) / 2;
            int line = 0;
            for(int i=0; i<K; i++) {
                line += lan[i] / mid;
            }
            if(line < N) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        System.out.print(max - 1);
    }
}
