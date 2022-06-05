package old.Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int min = 256;
        int max = 0;
        int idx = 0;
        int[] list = new int[N*M];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                int val = Integer.parseInt(st.nextToken());
                list[idx++] = val;
                min = Math.min(val, min);
                max = Math.max(val, max);
            }
        }
        int minTime = Integer.MAX_VALUE;
        int minHeight = 0;
        for(int i=min; i<=max; i++) {
            if(buildUp(list, B, i) <= minTime) {
                minTime = buildUp(list, B, i);
                minHeight = i;
            }
        }
        System.out.printf("%d %d", minTime, minHeight);
    }

    public static int buildUp(int[] ground, int inventory, int standard) {
        int spentTime = 0;
        for(int height : ground) {
            int need = standard - height;
            if(need > 0) {
                spentTime += need;
                inventory -= need;
            } else {
                spentTime += -need * 2;
                inventory += -need;
            }
        }
        if(inventory < 0) {
            return Integer.MAX_VALUE;
        } else {
            return spentTime;
        }
    }
}
