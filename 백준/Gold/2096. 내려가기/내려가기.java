import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] minDp = new int[3];
        int[] maxDp = new int[3];

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int val1 = Integer.parseInt(st.nextToken());
            int val2 = Integer.parseInt(st.nextToken());
            int val3 = Integer.parseInt(st.nextToken());

            if(i == 0) {
                minDp[0] = maxDp[0] = val1;
                minDp[1] = maxDp[1] = val2;
                minDp[2] = maxDp[2] = val3;
                continue;
            }

            int beforeMin1 = minDp[0];
            int beforeMin2 = minDp[2];
            int beforeMax1 = maxDp[0];
            int beforeMax2 = maxDp[2];

            minDp[0] = Math.min(minDp[0], minDp[1]) + val1;
            minDp[2] = Math.min(minDp[1], minDp[2]) + val3;
            minDp[1] = Math.min(Math.min(beforeMin1, beforeMin2), minDp[1]) + val2;

            maxDp[0] = Math.max(maxDp[0], maxDp[1]) + val1;
            maxDp[2] = Math.max(maxDp[1], maxDp[2]) + val3;
            maxDp[1] = Math.max(Math.max(beforeMax1, beforeMax2), maxDp[1]) + val2;
        }

        int max = Math.max(Math.max(maxDp[0], maxDp[1]), maxDp[2]);
        int min = Math.min(Math.min(minDp[0], minDp[1]), minDp[2]);
        System.out.println(max + " " + min);
    }
}