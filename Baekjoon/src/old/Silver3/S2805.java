package old.Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long[] trees = new long[N];
        long max = 0;
        for(int i=0; i<N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            if(trees[i] > max) {
                max = trees[i];
            }
        }
        long high = max;
        long low = 0;
        while(low < high) {
            long mid = (high + low) / 2;
            long get = 0;
            for(int i=0; i<N; i++) {
                get += trees[i] < mid ? 0 : trees[i] - mid;
            }
            if(get >= M) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        System.out.println(high - 1);
    }
}
